package com.bliblioteca.proyectobasesdedatos.DAO;

import com.bliblioteca.proyectobasesdedatos.logica.Ejemplar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;


public class DAOEjemplar {

       public static int guardarEjemplar(Ejemplar ejemplar){
        String sql_guardar;
        sql_guardar="INSERT INTO ejemplar (ISBN, numero, n_cajon, n_pasillo, nom_sala, estante, estado)" +
                "VALUES (?, ?, ?, ?, ? , ? , ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, ejemplar.getISBN());
                statement.setString(2, ejemplar.getNumero());
                statement.setString(3, ejemplar.getnCajon());
                statement.setString(4, ejemplar.getnPasillo());
                statement.setString(5, ejemplar.getNomSala());
                statement.setString(6, ejemplar.getEstante());
                statement.setString(7, ejemplar.getEstado());

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
       
       public static Ejemplar obtenerEjemplarPorID(String ISBN){
          Ejemplar ejemplar = new Ejemplar();
        String sql_consulta = "SELECT * FROM ejemplar WHERE ISBN = ?";

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
                    // Obtener los valores de las columnas y asignarlos al objeto Ejemplar
                    ejemplar.setISBN(resultSet.getString("ISBN"));
                    ejemplar.setNumero(resultSet.getString("numero"));
                    ejemplar.setnCajon(resultSet.getString("n_cajon"));
                    ejemplar.setnPasillo(resultSet.getString("n_pasillo"));
                    ejemplar.setNomSala(resultSet.getString("nom_sala"));
                    ejemplar.setEstante(resultSet.getString("estante"));
                    ejemplar.setEstado(resultSet.getString("estado"));

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return ejemplar;
    }

       public static boolean actualizarEjemplar(Ejemplar ejemplarModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
            String sql_actualizar = "UPDATE ejemplar SET numero = ?, n_cajon = ?, n_pasillo = ?, nom_sala = ?, estante = ?, estado = ? WHERE ISBN = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String ISBN = ejemplarModificado.getISBN();
                String nuevoNumero = ejemplarModificado.getNumero();
                String nuevoNCajon = ejemplarModificado.getnCajon();
                String nuevoNpasillo = ejemplarModificado.getnPasillo();
                String nuevoNomSala = ejemplarModificado.getNomSala();
                String nuevoEstante = ejemplarModificado.getEstante();
                String nuevoEstado = ejemplarModificado.getEstado();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoNumero);
                statement.setString(2, nuevoNCajon);
                statement.setString(3, nuevoNpasillo);
                statement.setString(4, nuevoNomSala);
                statement.setString(5, nuevoEstante);
                statement.setString(6, nuevoEstado);
                statement.setString(7, ISBN);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El Ejemplar con ISBN " + ISBN + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el Ejemplar con ISBN " + ISBN + " en la base de datos.");
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
    
       public static boolean eliminarEjemplar(String ISBN) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM ejemplar WHERE ISBN = ?";

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
                    //System.out.println("El ejemplar con ISBN " + ISBN + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el ejemplar con ISBN " + ISBN + " en la base de datos.");
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
