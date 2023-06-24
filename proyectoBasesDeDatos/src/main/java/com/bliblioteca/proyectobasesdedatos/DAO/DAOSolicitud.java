package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Solicitud;

import java.sql.*;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

public class DAOSolicitud {

    public static int guardarSolicitud(Solicitud solicitud){
        String sql_guardar;
        sql_guardar="INSERT INTO solicitud (n_solicitud, titulo_libro, fecha, descripcion, ISBN_solicitud, id_empleado, id_usuario)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, solicitud.getNumeroSolicitud());
                statement.setString(2, solicitud.getTituloLibro());
                statement.setDate(3, (Date) solicitud.getFecha());
                statement.setString(4, solicitud.getDescripcion());
                statement.setString(5, solicitud.getISBNSolicitud());
                statement.setString(6, solicitud.getIdEmpleado());
                statement.setString(7, solicitud.getIdUsuario());

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

    public static Solicitud obtenerSolicitudPorID(String numeroSolicitud){
        Solicitud solicitud = new Solicitud();
        String sql_consulta = "SELECT * FROM solicitud WHERE n_solicitud = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroSolicitud);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Solicitud
                    solicitud.setNumeroSolicitud(resultSet.getString("n_solicitud"));
                    solicitud.setTituloLibro(resultSet.getString("titulo_libro"));
                    solicitud.setFecha(resultSet.getDate("fecha"));
                    solicitud.setDescripcion(resultSet.getString("descripcion"));
                    solicitud.setISBNSolicitud(resultSet.getString("ISBN_solicitud"));
                    solicitud.setISBNSolicitud(resultSet.getString("id_empleado"));
                    solicitud.setISBNSolicitud(resultSet.getString("id_usuario"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return solicitud;
    }

    public static ArrayList<Solicitud> obtenerTodasLasSolicitudes(){
        ArrayList solicitudes = new ArrayList<>();
        String sql_consulta = "SELECT * FROM solicitud GROUP BY n_solicitud";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {


                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Solicitud solicitud = new Solicitud();

                    // Obtener los valores de las columnas y asignarlos al objeto Solicitud
                    solicitud.setNumeroSolicitud(resultSet.getString("n_solicitud"));
                    solicitud.setTituloLibro(resultSet.getString("titulo_libro"));
                    solicitud.setFecha(resultSet.getDate("fecha"));
                    solicitud.setDescripcion(resultSet.getString("descripcion"));
                    solicitud.setISBNSolicitud(resultSet.getString("ISBN_solicitud"));
                    solicitud.setISBNSolicitud(resultSet.getString("id_empleado"));
                    solicitud.setISBNSolicitud(resultSet.getString("id_usuario"));

                    solicitudes.add(solicitud);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return solicitudes;
    }

    public static boolean actualizarSolicitud(Solicitud solicitudModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE solicitud SET titulo_libro = ?, fecha = ?, descripcion = ?, ISBN_solicitud = ? WHERE n_solicitud = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String numeroSolicitud = solicitudModificado.getNumeroSolicitud();
                String nuevoTituloLibro = solicitudModificado.getTituloLibro();
                Date nuevaFecha = (Date) solicitudModificado.getFecha();
                String nuevaDescripcion = solicitudModificado.getDescripcion();
                String nuevoISBNSolicitud = solicitudModificado.getISBNSolicitud();
                String nuevoIdEmpleado = solicitudModificado.getIdEmpleado();
                String nuevoIdUsuario = solicitudModificado.getIdUsuario();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoTituloLibro);
                statement.setDate(2, nuevaFecha);
                statement.setString(3, nuevaDescripcion);
                statement.setString(4, nuevoISBNSolicitud);
                statement.setString(5, numeroSolicitud);
                statement.setString(6, nuevoIdEmpleado);
                statement.setString(7, nuevoIdUsuario);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                    // System.out.println("El Solicitud con número " + numeroSolicitud + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Solicitud con número " + numeroSolicitud + " en la base de datos.");
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

    public static boolean eliminarSolicitud(String numeroSolicitud) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM solicitud WHERE n_solicitud = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroSolicitud);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("La solicitud con número " + numeroSolicitud + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el solicitud con número " + numeroSolicitud + " en la base de datos.");
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
