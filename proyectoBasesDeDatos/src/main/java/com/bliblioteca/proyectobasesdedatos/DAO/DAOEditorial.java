package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Editorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;


public class DAOEditorial {

       public static int guardarEditorial(Editorial editorial){
        String sql_guardar;
        sql_guardar="INSERT INTO editorial (codigo_editorial, nombre_editorial, pagina_web, pais_origen)" +
                "VALUES (?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, editorial.getCodigoEditorial());
                statement.setString(2, editorial.getNombreEditorial());
                statement.setString(3, editorial.getPaginaWebEditorial());
                statement.setString(4, editorial.getPaisEditorial());

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
       
       public static Editorial obtenerEditorialPorID(String codigoEditorial){
          Editorial editorial = new Editorial();
        String sql_consulta = "SELECT * FROM editorial WHERE codigo_editorial = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoEditorial);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Editorial
                    editorial.setCodigoEditorial(resultSet.getString("codigo_editorial"));
                    editorial.setNombreEditorial(resultSet.getString("nombre_editorial"));
                    editorial.setPaginaWebEditorial(resultSet.getString("pagina_web"));
                    editorial.setPaisEditorial(resultSet.getString("pais_origen"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return editorial;
    }

       public static ArrayList<Editorial> obtenerTodasLasEditoriales(){
        ArrayList editoriales = new ArrayList<>();
        String sql_consulta = "SELECT * FROM editorial GROUP BY codigo_editorial";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Editorial editorial = new Editorial();
                    // Obtener los valores de las columnas y asignarlos al objeto Editorial
                    editorial.setCodigoEditorial(resultSet.getString("codigo_editorial"));
                    editorial.setNombreEditorial(resultSet.getString("nombre_editorial"));
                    editorial.setPaginaWebEditorial(resultSet.getString("pagina_web"));
                    editorial.setPaisEditorial(resultSet.getString("pais_origen"));

                    editoriales.add(editorial);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return editoriales;
    }

       public static boolean actualizarEditorial(Editorial editorialModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE editorial SET nombre_editorial = ?, pagina_web = ?, pais_origen = ? WHERE codigo_editorial = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String codigoEditorial = editorialModificado.getCodigoEditorial();
                String nuevoNombreEditorial = editorialModificado.getNombreEditorial();
                String nuevoPaginaWebEditorial = editorialModificado.getPaginaWebEditorial();
                String nuevoPaisOrigenEditorial = editorialModificado.getPaisEditorial();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoNombreEditorial);
                statement.setString(2, nuevoPaginaWebEditorial);
                statement.setString(3, nuevoPaisOrigenEditorial);
                statement.setString(4, codigoEditorial);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Editorial con código " + codigoEditorial + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Editorial con código " + codigoEditorial + " en la base de datos.");
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
    
       public static boolean eliminarEditorial(String codigoEditorial) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM editorial WHERE codigo_editorial = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoEditorial);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El editorial con código " + codigoEditorial + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el editorial con código " + codigoEditorial + " en la base de datos.");
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
