package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Digital;
import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

import java.sql.*;
import java.util.ArrayList;

public class DAODigital {
    
    public static int guardarDigital(Digital digital){
        String sql_guardar;
        sql_guardar="INSERT INTO digital (ISBN, url, formato, fecha_digital, tamanio)" +
                "VALUES (?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, digital.getISBN());
                statement.setString(2, digital.getUrl());
                statement.setString(3, digital.getFormato());
                statement.setString(4, digital.getTamanio());
                
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
    
    public static Digital obtenerDigitalPorID(String ISBN){
          Digital digital = new Digital();
        String sql_consulta = "SELECT * FROM digital WHERE ISBN = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto Digital
                    digital.setISBN(resultSet.getString("ISBN"));
                    digital.setUrl(resultSet.getString("url"));
                    digital.setFormato(resultSet.getString("formato"));
                    digital.setTamanio(resultSet.getString("tamanio"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return digital;
    }

    public static ArrayList<Digital> obtenerTodosLosDigitales(){
        ArrayList digitales = new ArrayList<>();
        String sql_consulta = "SELECT * FROM digital GROUP BY ISBN";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while(resultSet.next()) {
                    Digital digital = new Digital();

                    // Obtener los valores de las columnas y asignarlos al objeto Digital
                    digital.setISBN(resultSet.getString("ISBN"));
                    digital.setUrl(resultSet.getString("url"));
                    digital.setFormato(resultSet.getString("formato"));
                    digital.setTamanio(resultSet.getString("tamanio"));

                    digitales.add(digital);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return digitales;
    }

    public static boolean actualizarDigital(Digital digitalModificada) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE digital SET url = ?, formato = ?, fecha_digital = ?, tamanio = ? WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String ISBN = digitalModificada.getISBN();
                String nuevoUrlDigital = digitalModificada.getUrl();
                String nuevaFormatoDigital = digitalModificada.getFormato();
                String nuevoTamanioDigital = digitalModificada.getTamanio();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoUrlDigital);
                statement.setString(2, nuevaFormatoDigital);
                statement.setString(3, nuevoTamanioDigital);
                statement.setString(4, ISBN);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Digital con ISBN " + ISBN + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Digital con ISBN " + ISBN + " en la base de datos.");
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
    
    public static boolean eliminarDigital(String ISBN) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM digital WHERE ISBN = ?";

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
                    //System.out.println("El digital con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el digital con ISBN " + ISBN + " en la base de datos.");
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
        public static ArrayList<Digital> obtenerDigitalPorCualquierCampo(Object value, String nombreCampo){

        ArrayList<Digital> digitales = new ArrayList<>();

        String sql_consulta = "SELECT * FROM digital WHERE "+nombreCampo+" LIKE CONCAT ('%',?,'%')";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                if (value instanceof String) {
                    String stringValue = (String) value;
                    statement.setString(1, stringValue);
                }
                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                // agrega un digital a la lista de digitales en cada iteracion
                while (resultSet.next()) {
                    Digital digital = new Digital();

                    // Obtener los valores de las columnas y asignarlos al objeto Digital
                    digital.setISBN(resultSet.getString("ISBN"));
                    digital.setUrl(resultSet.getString("url"));
                    digital.setFormato(resultSet.getString("formato"));
                    digital.setTamanio(resultSet.getString("tamanio"));
                    digitales.add(digital);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return digitales;
    }

}
