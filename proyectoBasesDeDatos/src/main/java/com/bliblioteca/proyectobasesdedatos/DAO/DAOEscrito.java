package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Escrito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;


public class DAOEscrito {

       public static int guardarEscrito(Escrito escrito){
        String sql_guardar;
        sql_guardar="INSERT INTO escrito (ISBN, codigo_escrito)" +
                "VALUES (?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, escrito.getISBN());
                statement.setString(2, escrito.getCodigoAutor());
                
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
       
       public static Escrito obtenerEscritoPorID(String ISBN){
          Escrito escrito = new Escrito();
        String sql_consulta = "SELECT * FROM escrito WHERE ISBN = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto Escrito
                    escrito.setISBN(resultSet.getString("ISBN"));
                    escrito.setCodigoAutor(resultSet.getString("codigo_autor"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return escrito;
    }

       public static ArrayList<Escrito> obtenerTodosLosEscritos(){
        ArrayList escritos = new ArrayList<>();
        String sql_consulta = "SELECT * FROM escrito GROUP BY ISBN";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Escrito
                    Escrito escrito = new Escrito();
                    escrito.setISBN(resultSet.getString("ISBN"));
                    escrito.setCodigoAutor(resultSet.getString("codigo_autor"));

                    escritos.add(escrito);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return escritos;
    }

       public static boolean actualizarEscrito(Escrito escritoModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE escrito SET codigo_autor = ? WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String ISBN = escritoModificado.getISBN();
                String nuevoCodigoAutor = escritoModificado.getCodigoAutor();


                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoCodigoAutor);
                statement.setString(2, ISBN);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Escrito con ISBN " + ISBN + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Escrito con ISBN " + ISBN + " en la base de datos.");
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
    
       public static boolean eliminarEscrito(String ISBN) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM escrito WHERE ISBN = ?";

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
                    //System.out.println("El escrito con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el escrito con ISBN " + ISBN + " en la base de datos.");
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
    
    public static ArrayList<Escrito> obtenerEscritoPorCualquierCampo(Object value, String nombreCampo){

        ArrayList<Escrito> escritos = new ArrayList<>();

        String sql_consulta = "SELECT * FROM escrito WHERE "+nombreCampo+" LIKE CONCAT ('%',?,'%')";

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

                // agrega un escrito a la lista de escritos en cada iteracion
                while (resultSet.next()) {
                    Escrito escrito = new Escrito();

                    // Obtener los valores de las columnas y asignarlos al objeto Escrito
                    escrito.setISBN(resultSet.getString("ISBN"));
                    escrito.setCodigoAutor(resultSet.getString("codigo_autor"));

                    escritos.add(escrito);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return escritos;
    }


}
