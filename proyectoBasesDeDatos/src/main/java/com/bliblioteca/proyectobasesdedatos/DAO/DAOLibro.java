package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;


public class DAOLibro {

       public static int guardarLibro(Libro libro){
        String sql_guardar;
        sql_guardar="INSERT INTO libro (ISBN, codigo_area, codigo_editorial, id_empleado, titulo, anio_publicacion, numero_paginas, idioma)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, libro.getISBN());
                statement.setString(2, libro.getCodArea());
                statement.setString(3, libro.getCodigoEditorial());
                statement.setString(4, libro.getIdEmpleado());
                statement.setString(5, libro.getTituloLibro());
                statement.setInt(6, libro.getAnioPublicacion());
                statement.setInt(7, libro.getNumeroPaginas());
                statement.setString(8, libro.getIdioma());

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
       
       public static Libro obtenerLibroPorID(String ISBN){
          Libro libro = new Libro();
        String sql_consulta = "SELECT * FROM libro WHERE ISBN = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto Libro
                    libro.setISBN(resultSet.getString("ISBN"));
                    libro.setCodArea(resultSet.getString("codigo_area"));
                    libro.setCodigoEditorial(resultSet.getString("codigo_editorial"));
                    libro.setIdEmpleado(resultSet.getString("id_empleado"));
                    libro.setTituloLibro(resultSet.getString("titulo"));
                    libro.setAnioPublicacion(resultSet.getInt("anio_publicacion"));
                    libro.setNumeroPaginas(resultSet.getInt("numero_paginas"));
                    libro.setIdioma(resultSet.getString("idioma"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return libro;
    }

       public static ArrayList<Libro> obtenerTodosLosLibros(){
        ArrayList libros = new ArrayList<>();
        String sql_consulta = "SELECT * FROM libro GROUP BY ISBN";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Libro
                    Libro libro = new Libro();

                    libro.setISBN(resultSet.getString("ISBN"));
                    libro.setCodArea(resultSet.getString("codigo_area"));
                    libro.setCodigoEditorial(resultSet.getString("codigo_editorial"));
                    libro.setIdEmpleado(resultSet.getString("id_empleado"));
                    libro.setTituloLibro(resultSet.getString("titulo"));
                    libro.setAnioPublicacion(resultSet.getInt("anio_publicacion"));
                    libro.setNumeroPaginas(resultSet.getInt("numero_paginas"));
                    libro.setIdioma(resultSet.getString("idioma"));

                    libros.add(libro);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return libros;
    }

       public static ArrayList<Libro> obtenerLibroPorCualquierCampo(Object value, String nombreCampo){

        ArrayList<Libro> libros = new ArrayList<>();

        String sql_consulta = "SELECT * FROM libro WHERE "+nombreCampo+" = ?";

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
                }else if (value instanceof Integer){
                    int intValue = (int) value;
                    statement.setInt(1, intValue);
                }
                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                // agrega un libro a la lista de libros en cada iteracion
                while (resultSet.next()) {
                    Libro libro = new Libro();

                    // Obtener los valores de las columnas y asignarlos al objeto Libro
                    libro.setISBN(resultSet.getString("ISBN"));
                    libro.setCodArea(resultSet.getString("codigo_area"));
                    libro.setCodigoEditorial(resultSet.getString("codigo_editorial"));
                    libro.setIdEmpleado(resultSet.getString("id_empleado"));
                    libro.setTituloLibro(resultSet.getString("titulo"));
                    libro.setAnioPublicacion(resultSet.getInt("anio_publicacion"));
                    libro.setNumeroPaginas(resultSet.getInt("numero_paginas"));
                    libro.setIdioma(resultSet.getString("idioma"));
                    libros.add(libro);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return libros;
    }

       public static boolean actualizarLibro(Libro libroModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE libro SET codigo_area = ?, codigo_editorial = ?, id_empleado = ?, titulo = ?, anio_publicacion = ?, numero_paginas = ?, idioma = ? WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String ISBN = libroModificado.getISBN();
                String nuevoCodArea = libroModificado.getCodArea();
                String nuevoCodigoEditorial = libroModificado.getCodigoEditorial();
                String nuevoIdEmpleado = libroModificado.getIdEmpleado();
                String nuevoTituloLibro = libroModificado.getTituloLibro();
                int nuevoAnioPublicacion = libroModificado.getAnioPublicacion();
                int nuevoNumeroPaginas = libroModificado.getNumeroPaginas();
                String nuevoIdioma = libroModificado.getIdioma();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoCodArea);
                statement.setString(2, nuevoCodigoEditorial);
                statement.setString(3, nuevoIdEmpleado);
                statement.setString(4, nuevoTituloLibro);
                statement.setInt(5, nuevoAnioPublicacion);
                statement.setInt(6, nuevoNumeroPaginas);
                statement.setString(7, nuevoIdioma);
                statement.setString(8, ISBN);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Libro con ISBN " + ISBN + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Libro con ISBN " + ISBN + " en la base de datos.");
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
    
       public static boolean eliminarLibro(String ISBN) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM libro WHERE ISBN = ?";

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
                    //System.out.println("El libro con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el libro con ISBN " + ISBN + " en la base de datos.");
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
