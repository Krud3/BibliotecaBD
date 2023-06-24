package com.bliblioteca.proyectobasesdedatos.DAO;


import com.bliblioteca.proyectobasesdedatos.logica.Multa;

import java.sql.*;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

public class DAOMulta {

    public static int guardarMulta(Multa multa){
        String sql_guardar;
        sql_guardar="INSERT INTO multa (n_multa, valor, fecha, descripcion, ISBN, numero, id_usuario)" +
                "VALUES (?, ?, ?, ?, ? ,? ,?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, multa.getnMulta());
                statement.setInt(2, multa.getValor());
                statement.setDate(3, (Date) multa.getFecha());
                statement.setString(4, multa.getDescripcion());
                statement.setString(5, multa.getISBN());
                statement.setString(6, multa.getNumero());
                statement.setString(7, multa.getIdUsuario());

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

    public static Multa obtenerMultaPorID(String numeroMulta){
          Multa multa = new Multa();
        String sql_consulta = "SELECT * FROM multa WHERE n_multa = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroMulta);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Multa
                    multa.setnMulta(resultSet.getString("n_multa"));
                    multa.setValor(resultSet.getInt("valor"));
                    multa.setFecha(resultSet.getDate("fecha"));
                    multa.setDescripcion(resultSet.getString("descripcion"));
                    multa.setISBN(resultSet.getString("ISBN"));
                    multa.setNumero(resultSet.getString("numero"));
                    multa.setIdUsuario(resultSet.getString("id_usuario"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return multa;
    }

    public static ArrayList<Multa> obtenerTodasLasMultas(){
        ArrayList<Multa> multas = new ArrayList<>();
        String sql_consulta = "SELECT * FROM multa GROUP BY n_multa";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Multa multa = new Multa();
                    // Obtener los valores de las columnas y asignarlos al objeto Multa
                    multa.setnMulta(resultSet.getString("n_multa"));
                    multa.setValor(resultSet.getInt("valor"));
                    multa.setFecha(resultSet.getDate("fecha"));
                    multa.setDescripcion(resultSet.getString("descripcion"));
                    multa.setISBN(resultSet.getString("ISBN"));
                    multa.setNumero(resultSet.getString("numero"));
                    multa.setIdUsuario(resultSet.getString("id_usuario"));

                    multas.add(multa);
                }
                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return multas;
    }

    //Actualiza la multa, retorna true si actualizo correctamente de lo contrario retorna false
    public static boolean actualizarMulta(Multa multaModificada) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar la multa
        String sql_actualizar = "UPDATE multa SET valor = ?, fecha = ?, descripcion = ?, ISBN = ?, numero = ? , id_usuario =?  WHERE n_multa = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores dla multa que se actualizarán
                String numeroMulta = multaModificada.getnMulta();
                int nuevoValor = multaModificada.getValor();
                Date nuevaFecha = (Date) multaModificada.getFecha();
                String nuevaDescripcion = multaModificada.getDescripcion();
                String nuevoISBN = multaModificada.getISBN();
                String nuevoNumero = multaModificada.getNumero();
                String nuevoIdUsuario = multaModificada.getIdUsuario();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setInt(1, nuevoValor);
                statement.setDate(2, nuevaFecha);
                statement.setString(3, nuevaDescripcion);
                statement.setString(4, nuevoISBN);
                statement.setString(5, nuevoNumero);
                statement.setString(6, nuevoIdUsuario);
                statement.setString(7, numeroMulta);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El multa con código " + numeroMulta + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró la multa con código " + numeroMulta + " en la base de datos.");
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

    //elimina la multa, retorna true si elimino correctamente de lo contrario retorna false
    public static boolean eliminarMulta(String numeroMulta) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar la multa
        String sql_eliminar = "DELETE FROM multa WHERE n_multa = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, numeroMulta);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El multa con código " + numeroMulta + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró la multa con código " + numeroMulta + " en la base de datos.");
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
