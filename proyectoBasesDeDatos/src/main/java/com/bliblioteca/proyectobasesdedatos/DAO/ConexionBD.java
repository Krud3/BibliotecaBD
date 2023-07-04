/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.DAO;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author juanm
 */
public class ConexionBD {
    private Connection connection;
    private final String url = "jdbc:postgresql://localhost:5432/BIBLIOTECA";
    private final String username = "postgres";
    private final String password = "123456";

    public void openConnection() {
        try {
            // Carga el controlador JDBC de PostgreSQL
            Class.forName("org.postgresql.Driver"); // importa el driver para poder conectarse a la bd

            // Establece la conexión con la base de datos
            connection = DriverManager.getConnection(url, username, password);
            
            

        } catch (ClassNotFoundException e) {
            System.err.println(ERROR_CARGA_CONTROLADOR_JDBC + e.getMessage());
        } catch (SQLException e) {
            System.err.println(ERROR_DE_CONEXION + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println(ERROR_DE_CIERRE_DE_CONEXION + e.getMessage());
        }
    }
}
