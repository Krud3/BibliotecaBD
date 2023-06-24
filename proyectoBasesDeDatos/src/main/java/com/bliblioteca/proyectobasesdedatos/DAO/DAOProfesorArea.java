package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.ProfesorArea;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;


public class DAOProfesorArea {

       public static int guardarProfesorArea(ProfesorArea profesorArea){
        String sql_guardar;
        sql_guardar="INSERT INTO profesor_area (id_usuario, codigo_area)" +
                "VALUES (?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, profesorArea.getIdUsuario());
                statement.setString(2, profesorArea.getCodigoArea());
                
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
       
       public static ProfesorArea obtenerProfesorAreaPorID(String idUsuario){
          ProfesorArea profesorArea = new ProfesorArea();
        String sql_consulta = "SELECT * FROM profesor_area WHERE id_usuario = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto ProfesorArea
                    profesorArea.setIdUsuario(resultSet.getString("id_usuario"));
                    profesorArea.setCodigoArea(resultSet.getString("codigo_area"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return profesorArea;
    }

       public static ArrayList<ProfesorArea> obtenerTodosLosProfesorAreas(){
        ArrayList profesorAreas = new ArrayList<>();
        String sql_consulta = "SELECT * FROM profesor_area GROUP BY id_usuario";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto ProfesorArea
                    ProfesorArea profesorArea = new ProfesorArea();
                    profesorArea.setIdUsuario(resultSet.getString("id_usuario"));
                    profesorArea.setCodigoArea(resultSet.getString("codigo_area"));

                    profesorAreas.add(profesorArea);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return profesorAreas;
    }

       public static boolean actualizarProfesorArea(ProfesorArea profesorAreaModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE profesorArea SET codigo_area = ? WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String idUsuario = profesorAreaModificado.getIdUsuario();
                String nuevoCodigoArea = profesorAreaModificado.getCodigoArea();


                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoCodigoArea);
                statement.setString(2, idUsuario);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El ProfesorArea con id_usuario " + id_usuario + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el ProfesorArea con id_usuario " + idUsuario + " en la base de datos.");
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
    
       public static boolean eliminarProfesorArea(String idUsuario) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM profesor_area WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El profesorArea con id_usuario " + id_usuario + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el profesorArea con id_usuario " + idUsuario + " en la base de datos.");
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
