/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.DAO;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;
import com.bliblioteca.proyectobasesdedatos.logica.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author juanm
 */
public class DAOEmpleado {
    
        public static int guardarEmpleado(Empleado empleado){
        String sql_guardar;
        sql_guardar="INSERT INTO " +
                "empleado (id_empleado, password_empleado, nombre_empleado, cargo_empleado) " +
                "VALUES (?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, empleado.getIdEmpleado());
                statement.setString(2, empleado.getPasswordEmpleado());
                statement.setString(3, empleado.getNombreEmpleado());
                statement.setString(4, empleado.getCargoEmpleado());


                // Ejecutar la sentencia SQL
                filasAfectadas = statement.executeUpdate();

                System.out.println("Filas afectadas: " + filasAfectadas);
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

        public static String obtenerNombreEmpleadoPorID(String idEmpleado) {
        String nombreEmpleado = null;
        String sql_consulta = "SELECT nombre_empleado FROM empleado WHERE id_empleado = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idEmpleado);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener el valor del campo "nombre_empleado"
                    nombreEmpleado = resultSet.getString("nombre_empleado");
                } else {
                    System.out.println(NO_SE_ENCONTRO_EMPLEADO+ idEmpleado);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return nombreEmpleado;
    }

        public static Boolean existeEmpleado(String idEmpleado) {
        Boolean existe = false;
        String sql_consulta = "SELECT COUNT(*) AS total FROM empleado WHERE id_empleado = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idEmpleado);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener el valor del campo "total"
                    int total = resultSet.getInt("total");

                    // Verificar si existe el empleado
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

        public static Empleado obtenerEmpleadoPorID(String idEmpleado) {
        Empleado empleado = new Empleado();
        String sql_consulta = "SELECT * FROM empleado WHERE id_empleado = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, idEmpleado);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Empleado
                    empleado.setIdEmpleado(resultSet.getString("id_empleado"));
                    empleado.setPasswordEmpleado(resultSet.getString("password_empleado"));
                    empleado.setNombreEmpleado(resultSet.getString("nombre_empleado"));
                    empleado.setCargoEmpleado(resultSet.getString("cargo_empleado"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return empleado;
    }

        public static ArrayList<Empleado> obtenerTodosLosEmpleados() {
        ArrayList empleados = new ArrayList<>();
        String sql_consulta = "SELECT * FROM empleado GROUP BY id_empleado";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Empleado empleado = new Empleado();

                    // Obtener los valores de las columnas y asignarlos al objeto Empleado
                    empleado.setIdEmpleado(resultSet.getString("id_empleado"));
                    empleado.setPasswordEmpleado(resultSet.getString("password_empleado"));
                    empleado.setNombreEmpleado(resultSet.getString("nombre_empleado"));
                    empleado.setCargoEmpleado(resultSet.getString("cargo_empleado"));

                    empleados.add(empleado);
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }

        return empleados;
    }
        
        
        public static ArrayList<Empleado> obtenerEmpleadoPorCualquierCampo(Object value, String nombreCampo){

        ArrayList<Empleado> empleados = new ArrayList<>();

        String sql_consulta = "SELECT * FROM empleado WHERE "+nombreCampo+" LIKE CONCAT ('%',?,'%')";

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

                // agrega un empleado a la lista de empleados en cada iteracion
                while (resultSet.next()) {
                    Empleado empleado = new Empleado();

                    // Obtener los valores de las columnas y asignarlos al objeto Empleado
                    empleado.setIdEmpleado(resultSet.getString("id_empleado"));
                    empleado.setPasswordEmpleado(resultSet.getString("password_empleado"));
                    empleado.setNombreEmpleado(resultSet.getString("nombre_empleado"));
                    empleado.setCargoEmpleado(resultSet.getString("cargo_empleado"));
                    empleados.add(empleado);

                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return empleados;
    }

}
