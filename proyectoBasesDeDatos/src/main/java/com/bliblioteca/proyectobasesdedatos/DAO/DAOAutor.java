package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Autor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

public class DAOAutor {

    public static int guardarAutor(Autor autor){
        String sql_guardar;
        sql_guardar="INSERT INTO autor (codigo_autor, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido)" +
                "VALUES (?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, autor.getCodigoAutor());
                statement.setString(2, autor.getPrimerNombreAutor());
                statement.setString(3, autor.getSegundoNombreAutor());
                statement.setString(4, autor.getPrimerApellidoAutor());
                statement.setString(5, autor.getSegundoApellidoAutor());
                
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
       
    public static Autor obtenerAutorPorID(String codigoAutor){
          Autor autor = new Autor();
        String sql_consulta = "SELECT * FROM autor WHERE codigo_autor = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoAutor);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Autor
                    autor.setCodigoAutor(resultSet.getString("codigo_autor"));
                    autor.setPrimerNombreAutor(resultSet.getString("primer_nombre"));
                    autor.setSegundoNombreAutor(resultSet.getString("segundo_nombre"));
                    autor.setPrimerApelldoAutor(resultSet.getString("primer_apellido"));
                    autor.setSegundoApelldoAutor(resultSet.getString("segundo_apellido"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return autor;
    }

    public static ArrayList<Autor> obtenerTodosLosAutores(){
        ArrayList autores = new ArrayList<>();

        String sql_consulta = "SELECT * FROM autor GROUP BY codigo_autor";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Autor autor = new Autor();

                    // Obtener los valores de las columnas y asignarlos al objeto Autor
                    autor.setCodigoAutor(resultSet.getString("codigo_autor"));
                    autor.setPrimerNombreAutor(resultSet.getString("primer_nombre"));
                    autor.setSegundoNombreAutor(resultSet.getString("segundo_nombre"));
                    autor.setPrimerApelldoAutor(resultSet.getString("primer_apellido"));
                    autor.setSegundoApelldoAutor(resultSet.getString("segundo_apellido"));

                    autores.add(autor);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return autores;
    }

    public static boolean actualizarAutor(Autor autorModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE autor SET primer_nombre = ?, segundo_nombre = ?, primer_apellido = ?, segundo_apellido = ? WHERE codigo_autor = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String codigoAutor = autorModificado.getCodigoAutor();
                String nuevoPrimerNombreAutor = autorModificado.getPrimerNombreAutor();
                String nuevoSegundoNombreAutor = autorModificado.getSegundoNombreAutor();
                String nuevoPrimerApellidoAutor = autorModificado.getPrimerApellidoAutor();
                String nuevoSegundoApellidoAutor = autorModificado.getSegundoApellidoAutor();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoPrimerNombreAutor);
                statement.setString(2, nuevoSegundoNombreAutor);
                statement.setString(3, nuevoPrimerApellidoAutor);
                statement.setString(4, nuevoSegundoApellidoAutor);
                statement.setString(5, codigoAutor);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Autor con código " + codigoAutor + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Autor con código " + codigoAutor + " en la base de datos.");
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
    
    public static boolean eliminarAutor(String codigoAutor) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM autor WHERE codigo_autor = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoAutor);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El autor con código " + codigoAutor + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el autor con código " + codigoAutor + " en la base de datos.");
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
        public static ArrayList<Autor> obtenerAutorPorCualquierCampo(Object value, String nombreCampo){

        ArrayList<Autor> autores = new ArrayList<>();

        String sql_consulta = "SELECT * FROM autor WHERE "+nombreCampo+" LIKE CONCAT ('%',?,'%')";

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

                // agrega un autor a la lista de autores en cada iteracion
                while (resultSet.next()) {
                    Autor autor = new Autor();

                    // Obtener los valores de las columnas y asignarlos al objeto Autor
                    autor.setCodigoAutor(resultSet.getString("codigo_autor"));
                    autor.setPrimerNombreAutor(resultSet.getString("primer_nombre"));
                    autor.setSegundoNombreAutor(resultSet.getString("segundo_nombre"));
                    autor.setPrimerApelldoAutor(resultSet.getString("primer_apellido"));
                    autor.setSegundoApelldoAutor(resultSet.getString("segundo_apellido"));
                    autores.add(autor);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return autores;
    }


}
