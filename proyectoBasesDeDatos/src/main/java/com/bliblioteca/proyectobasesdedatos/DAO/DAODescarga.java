package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Descarga;
import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

import java.sql.*;
import java.util.ArrayList;

public class DAODescarga {
    
    public static int guardarDescarga(Descarga descarga){
        String sql_guardar;
        sql_guardar="INSERT INTO descarga (ISBN, id_usuario, ip_computadora_descarga, fecha_descarga, horario_descarga)" +
                "VALUES (?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, descarga.getISBN());
                statement.setString(2, descarga.getIdUsuario());
                statement.setString(3, descarga.getIpComputadoraDescarga());
                statement.setDate(4, (Date) descarga.getFechaDescarga());
                statement.setString(5, descarga.getHorarioDescarga());
                
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
    
    public static Descarga obtenerDescargaPorID(String ISBN){
          Descarga descarga = new Descarga();
        String sql_consulta = "SELECT * FROM descarga WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, ISBN);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Descarga
                    descarga.setISBN(resultSet.getString("ISBN"));
                    descarga.setIdUsuario(resultSet.getString("id_usuario"));
                    descarga.setIpComputadoraDescarga(resultSet.getString("ip_computadora_descarga"));
                    descarga.setFechaDescarga(resultSet.getDate("fecha_descarga"));
                    descarga.setHorarioDescarga(resultSet.getString("horario_descarga"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return descarga;
    }

    public static ArrayList<Descarga> obtenerTodasLasDescargas(){
        ArrayList descargas = new ArrayList<>();
        String sql_consulta = "SELECT * FROM descarga GROUP BY ISBN";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Descarga descarga = new Descarga();

                    // Obtener los valores de las columnas y asignarlos al objeto Descarga
                    descarga.setISBN(resultSet.getString("ISBN"));
                    descarga.setIdUsuario(resultSet.getString("id_usuario"));
                    descarga.setIpComputadoraDescarga(resultSet.getString("ip_computadora_descarga"));
                    descarga.setFechaDescarga(resultSet.getDate("fecha_descarga"));
                    descarga.setHorarioDescarga(resultSet.getString("horario_descarga"));
                    descargas.add(descarga);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return descargas;
    }

    public static boolean actualizarDescarga(Descarga descargaModificada) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar la descarga
        String sql_actualizar = "UPDATE descarga SET id_usuario = ?, ip_computadora_descarga = ?, fecha_descarga = ?, horario_descarga = ? WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores de la descarga que se actualizarán
                String ISBN = descargaModificada.getISBN();
                String nuevoIdUsuarioDescarga = descargaModificada.getIdUsuario();
                String nuevaIpComputadoraDescarga = descargaModificada.getIpComputadoraDescarga();
                Date nuevaFechaDescarga = (Date) descargaModificada.getFechaDescarga();
                String nuevoHorarioDescarga = descargaModificada.getHorarioDescarga();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoIdUsuarioDescarga);
                statement.setString(2, nuevaIpComputadoraDescarga);
                statement.setDate(3, nuevaFechaDescarga);
                statement.setString(4, nuevoHorarioDescarga);
                statement.setString(5, ISBN);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("La Descarga con ISBN " + ISBN + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Descarga con ISBN " + ISBN + " en la base de datos.");
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
    
    public static boolean eliminarDescarga(String id_usuario) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el descarga
        String sql_eliminar = "DELETE FROM descarga WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, id_usuario);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("La descarga con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el descarga con ISBN " + id_usuario + " en la base de datos.");
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
    
    public static boolean eliminarDescargaISBN(String ISBN) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el descarga
        String sql_eliminar = "DELETE FROM descarga WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, ISBN);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("La descarga con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el descarga con ISBN " + ISBN + " en la base de datos.");
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
