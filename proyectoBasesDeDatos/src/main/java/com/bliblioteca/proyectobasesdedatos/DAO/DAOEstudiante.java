package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Estudiante;
import com.bliblioteca.proyectobasesdedatos.logica.Estudiante;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

import java.sql.*;

public class DAOEstudiante {

    public static int guardarEstudiante(Estudiante estudiante){
        String sql_guardar;
        sql_guardar="INSERT INTO estudiante (id_usuario, carrera_estudiante, universidad_estudiante)" +
                "VALUES (?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, estudiante.getIdUsuario());
                statement.setString(2, estudiante.getCarreraEstudiante());
                statement.setString(3, estudiante.getUniversidadEstudiante());

                // Ejecutar la sentencia SQL
                filasAfectadas = statement.executeUpdate();
            }
            catch (SQLException e){System.err.println(ERROR_SENTENCIA_SQL + e.getMessage());}
            catch(Exception e){ System.out.println(e); }
            finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return filasAfectadas;
    }

    public static Estudiante obtenerEstudiantePorID(String idUsuario){
        Estudiante estudiante = new Estudiante();
        String sql_consulta = "SELECT * FROM estudiante WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Estudiante
                    estudiante.setIdUsuario(resultSet.getString("id_usuario"));
                    estudiante.setCarreraEstudiante(resultSet.getString("carrera_estudiante"));
                    estudiante.setUniversidadEstudiante(resultSet.getString("universidad_estudiante"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return estudiante;
    }

    public static boolean actualizarEstudiante(Estudiante estudianteModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el estudiante
        String sql_actualizar = "UPDATE estudiante SET id_usuario = ?, carrera_estudiante = ?, universidad_estudiante = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del estudiante que se actualizarán
                String nuevoIdEstudiante = estudianteModificado.getIdUsuario();
                String nuevaCarreraEstudiante = estudianteModificado.getCarreraEstudiante();
                String nuevaUniversidadEstudiante = estudianteModificado.getUniversidadEstudiante();


                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoIdEstudiante);
                statement.setString(2, nuevaCarreraEstudiante);
                statement.setString(3, nuevaUniversidadEstudiante);


                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                    // System.out.println("El Estudiante con Id_usiario " + Id_usuario + " ha sido actualizado correctamente.");
                } else {
                    System.out.println("No se encontró el Estdudiante con Id_usiario "  + nuevoIdEstudiante+ " en la base de datos.");
                }
            } catch (SQLException e) {
                System.err.println(ERROR_ACTUALIZACION + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return isUpdated;
    }

    public static boolean eliminarEstudiante(String Id_usiario) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el estudiante
        String sql_eliminar = "DELETE FROM estudiante WHERE Id_usiario= ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, Id_usiario);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El estudiante con Id_usiario " + Id_usiario + " ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se encontró el estudiante con Id_usiario " + Id_usiario + " en la base de datos.");
                }
            } catch (SQLException e) {
                System.err.println(ERROR_ELIMINACION + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return isDeleted;
    }

}
