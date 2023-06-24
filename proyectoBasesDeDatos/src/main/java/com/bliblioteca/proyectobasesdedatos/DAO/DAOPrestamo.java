package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Prestamo;

import java.sql.*;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

public class DAOPrestamo {

    public static int guardarPrestamo(Prestamo prestamo){
        String sql_guardar;
        sql_guardar="INSERT INTO prestamo (n_prestamo, fecha_R, fecha_D, id_usuario, id_empleado, ISBN, numero)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, prestamo.getnPrestamo());
                statement.setDate(2, (Date) prestamo.getFechaR());
                statement.setDate(3, (Date) prestamo.getFechaD());
                statement.setString(4, prestamo.getIdUsuario());
                statement.setString(5, prestamo.getIdEmpleado());
                statement.setString(6, prestamo.getISBN());
                statement.setString(7, prestamo.getNumero());

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

    public static Prestamo obtenerPrestamoPorID(String numeroPrestamo){
        Prestamo prestamo = new Prestamo();
        String sql_consulta = "SELECT * FROM prestamo WHERE n_prestamo = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroPrestamo);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Prestamo
                    prestamo.setnPrestamo(resultSet.getString("n_prestamo"));
                    prestamo.setFechaR(resultSet.getDate("fecha_R"));
                    prestamo.setFechaD(resultSet.getDate("fecha_D"));
                    prestamo.setIdUsuario(resultSet.getString("id_usuario"));
                    prestamo.setIdEmpleado(resultSet.getString("id_empleado"));
                    prestamo.setISBN(resultSet.getString("ISBN"));
                    prestamo.setNumero(resultSet.getString("numero"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return prestamo;
    }

    public static boolean actualizarPrestamo(Prestamo prestamoModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE prestamo SET fecha_R = ?, fecha_D = ?, id_usuario = ?, id_empleado = ?, ISBN = ?, numero = ? WHERE n_prestamo = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String numeroPrestamo = prestamoModificado.getnPrestamo();
                Date nuevoFechaR = (Date) prestamoModificado.getFechaR();
                Date nuevaFechaD = (Date) prestamoModificado.getFechaD();
                String nuevoIdUsuario = prestamoModificado.getIdUsuario();
                String nuevoIdEmpleado = prestamoModificado.getIdEmpleado();
                String nuevoISBN = prestamoModificado.getISBN();
                String nuevoNumero = prestamoModificado.getNumero();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setDate(1, nuevoFechaR);
                statement.setDate(2, nuevaFechaD);
                statement.setString(3, nuevoIdUsuario);
                statement.setString(4, nuevoIdEmpleado);
                statement.setString(5, nuevoISBN);
                statement.setString(6, nuevoNumero);
                statement.setString(7, numeroPrestamo);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                    // System.out.println("El Prestamo con número " + numeroPrestamo + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Prestamo con número " + numeroPrestamo + " en la base de datos.");
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

    public static boolean eliminarPrestamo(String numeroPrestamo) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM prestamo WHERE n_prestamo = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroPrestamo);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("La prestamo con número " + numeroPrestamo + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el prestamo con número " + numeroPrestamo + " en la base de datos.");
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
