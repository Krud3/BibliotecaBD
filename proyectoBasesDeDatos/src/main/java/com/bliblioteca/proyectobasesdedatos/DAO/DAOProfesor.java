package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Profesor;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

import java.sql.*;

public class DAOProfesor {

    public static int guardarProfesor(Profesor profesor){
        String sql_guardar;
        sql_guardar="INSERT INTO profesor (id_usuario, titulo_profesor, dependencia_profesor)" +
                "VALUES (?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, profesor.getIdUsuario());
                statement.setString(2, profesor.getTitulo());
                statement.setString(3, profesor.getDependencia());

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

    public static Profesor obtenerProfesorPorID(String idUsuario){
        Profesor profesor = new Profesor();
        String sql_consulta = "SELECT * FROM profesor WHERE id_usuario = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto Profesor
                    profesor.setIdUsuario(resultSet.getString("id_usuario"));
                    profesor.setTitulo(resultSet.getString("titulo_profesor"));
                    profesor.setDependencia(resultSet.getString("dependencia_profesor"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return profesor;
    }

    public static boolean actualizarProfesor(Profesor profesorModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el profesor
        String sql_actualizar = "UPDATE profesor SET id_usuario = ?, titulo_profesor = ?, dependencia_profesor = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del profesor que se actualizarán
                String nuevoIdProfesor = profesorModificado.getIdUsuario();
                String nuevoTituloProfesor = profesorModificado.getTitulo();
                String nuevaDependenciaProfesor = profesorModificado.getDependencia();


                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoIdProfesor);
                statement.setString(2, nuevoTituloProfesor);
                statement.setString(3, nuevaDependenciaProfesor);


                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                    // System.out.println("El Profesor con Id_usiario " + Id_usuario + " ha sido actualizado correctamente.");
                } else {
                    System.out.println("No se encontró el Profesor con Id_usiario "  + nuevoIdProfesor + " en la base de datos.");
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

    public static boolean eliminarProfesor(String Id_usiario) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el profesor
        String sql_eliminar = "DELETE FROM profesor WHERE Id_usiario= ?";

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
                    //System.out.println("El profesor con Id_usiario " + Id_usiario + " ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se encontró el Profesor con Id_usiario " + Id_usiario + " en la base de datos.");
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