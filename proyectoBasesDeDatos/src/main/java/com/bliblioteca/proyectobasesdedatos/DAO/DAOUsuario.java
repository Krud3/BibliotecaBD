/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.DAO;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;
import com.bliblioteca.proyectobasesdedatos.logica.Usuario;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author juanm
 */
public class DAOUsuario {
    
    public static ArrayList<Usuario> obtenerTodosLosUsuarios() {
        ArrayList usuarios = new ArrayList<>();
        String sql_consulta = "SELECT * FROM usuario GROUP BY id_usuario";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Usuario usuario = new Usuario();

                    // Obtener los valores de las columnas y asignarlos al objeto Usuario
                    usuario.setIdUsuario(resultSet.getString("id_usuario"));
                    usuario.setPasswordUsuario(resultSet.getString("password_usuario"));
                    usuario.setNombreUsuario(resultSet.getString("nombre_usuario"));
                    usuario.setTelUsuario(resultSet.getString("tel_usuario"));
                    usuario.setDirUsuario(resultSet.getString("dir_usuario"));
                    usuario.setEmailUsuario(resultSet.getString("email_usuario"));

                    usuarios.add(usuario);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return usuarios;
    }
    
 
    public static boolean actualizarUsuario(Usuario usuarioModificado) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el estudiante
                                                    
        String sql_actualizar = "UPDATE usuario SET id_usuario = ?, password_usuario = ?, nombre_usuario= ?, tel_usuario= ?, dir_usuario= ?, email_usuario= ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del estudiante que se actualizarán
                String id_usuario = usuarioModificado.getIdUsuario();
                String pass = usuarioModificado.getPasswordUsuario();
                String nombre = usuarioModificado.getNombreUsuario();
                String tel = usuarioModificado.getTelUsuario();
                String dir = usuarioModificado.getDirUsuario();
                String email = usuarioModificado.getEmailUsuario();


                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1,id_usuario);
                statement.setString(2,pass);
                statement.setString(3,nombre);
                statement.setString(4, tel);
                statement.setString(5,dir);
                statement.setString(6,email);


                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                    // System.out.println("El Estudiante con Id_usiario " + Id_usuario + " ha sido actualizado correctamente.");
                } else {
                    System.out.println("No se encontró el Estdudiante con Id_usiario "  + id_usuario+ " en la base de datos.");
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
    public static int guardarUsuario(Usuario usuario){
        String sql_guardar;
        sql_guardar="INSERT INTO " +
                "usuario (id_usuario, password_usuario, nombre_usuario, tel_usuario, dir_usuario, email_usuario) " +
                "VALUES (?, ?, ?, ?, ?, ?)";;

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, usuario.getIdUsuario());
                statement.setString(2, usuario.getPasswordUsuario());
                statement.setString(3, usuario.getNombreUsuario());
                statement.setString(4, usuario.getTelUsuario());
                statement.setString(5, usuario.getDirUsuario());
                statement.setString(6, usuario.getEmailUsuario());

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

    public static String obtenerNombreUsuarioPorID(String idUsuario) {
        String nombreUsuario = null;
        String sql_consulta = "SELECT nombre_usuario FROM usuario WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener el valor del campo "nombre_usuario"
                    nombreUsuario = resultSet.getString("nombre_usuario");
                } else {
                    System.out.println(NO_SE_ENCONTRO_USUARIO + idUsuario);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return nombreUsuario;
    }

    public static Boolean existeUsuario(String idUsuario) {
        Boolean existe = false;
        String sql_consulta = "SELECT COUNT(*) AS total FROM usuario WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener el valor del campo "total"
                    int total = resultSet.getInt("total");

                    // Verificar si existe el usuario
                    if (total > 0) {
                        existe = true;
                    }
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return existe;
    }

     public Usuario obtenerUsuarioPorID(String idUsuario) {
        Usuario usuario = new Usuario();
        String sql_consulta = "SELECT * FROM usuario WHERE id_usuario = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Usuario
                    usuario.setIdUsuario(resultSet.getString("id_usuario"));
                    usuario.setPasswordUsuario(resultSet.getString("password_usuario"));
                    usuario.setNombreUsuario(resultSet.getString("nombre_usuario"));
                    usuario.setTelUsuario(resultSet.getString("tel_usuario"));
                    usuario.setDirUsuario(resultSet.getString("dir_usuario"));
                    usuario.setEmailUsuario(resultSet.getString("email_usuario"));

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return usuario;
    }
    
    public static boolean eliminarUsuario(String Id_usiario) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el estudiante
        String sql_eliminar = "DELETE FROM usuario WHERE id_usiario= ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, Id_usiario);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El estudiante con Id_usiario " + Id_usiario + " ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se encontró el usuario con Id_usiario " + Id_usiario + " en la base de datos.");
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

    // si es profesor es false si es estudiante es true
    public Boolean verificarTipoUsuario(String idUsuario){
        Usuario usuario = new Usuario();
        Boolean tipoUsuario = false;

        String sql_consulta_usuario_Estudiante = "SELECT * FROM usuario, estudiante WHERE usuario.id_usuario = estudiante.id_usuario" +
                "and usuario.id_usuario = ? ";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta_usuario_Estudiante)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idUsuario);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    tipoUsuario = true;
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return tipoUsuario;
    }
}
