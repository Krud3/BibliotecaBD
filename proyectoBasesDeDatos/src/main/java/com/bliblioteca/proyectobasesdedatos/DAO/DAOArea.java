package com.bliblioteca.proyectobasesdedatos.DAO;


import com.bliblioteca.proyectobasesdedatos.logica.Area;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.bliblioteca.proyectobasesdedatos.Util.Constantes.*;

public class DAOArea {

    public static int guardarArea(Area area){
        String sql_guardar;
        sql_guardar="INSERT INTO area (codigo_area, nombre_area, descripcion_area, nombre_area_hija)" +
                "VALUES (?, ?, ?, ?)";

        int filasAfectadas = 0;

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();
        if (connection != null) {
            try(PreparedStatement statement = connection.prepareStatement(sql_guardar)){
                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, area.getCodigoArea());
                statement.setString(2, area.getNombreArea());
                statement.setString(3, area.getDescripcionArea());
                statement.setString(4, area.getNombreAreaHija());

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

    public static Area obtenerAreaPorID(String codigoArea){
          Area area = new Area();
        String sql_consulta = "SELECT * FROM area WHERE codigo_area = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_consulta)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoArea);

                // Ejecutar la consulta
                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    // Obtener los valores de las columnas y asignarlos al objeto Area
                    area.setCodigoArea(resultSet.getString("codigo_area"));
                    area.setNombreArea(resultSet.getString("nombre_area"));
                    area.setDescripcionArea(resultSet.getString("descripcion_area"));
                    area.setNombreAreaHija(resultSet.getString("nombre_area_hija"));
                }

                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return area;
    }

    public static ArrayList<Area> obtenerTodasLasAreas(){
        ArrayList<Area> areas = new ArrayList<>();
        String sql_consulta = "SELECT * FROM area GROUP BY codigo_area";

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
                    Area area = new Area();
                    // Obtener los valores de las columnas y asignarlos al objeto Area
                    area.setCodigoArea(resultSet.getString("codigo_area"));
                    area.setNombreArea(resultSet.getString("nombre_area"));
                    area.setDescripcionArea(resultSet.getString("descripcion_area"));
                    area.setNombreAreaHija(resultSet.getString("nombre_area_hija"));
                    areas.add(area);
                }
                resultSet.close();
            } catch (SQLException e) {
                System.err.println(ERROR_DE_CONSULTA + e.getMessage());
            } finally {
                // Cerrar la conexión
                conexion.closeConnection();
            }
        }
        return areas;
    }

    //Actualiza el area, retorna true si actualizo correctamente de lo contrario retorna false
    public static boolean actualizarArea(Area areaModificada) {
        boolean isUpdated = false;

        // Sentencia SQL para actualizar el área
        String sql_actualizar = "UPDATE area SET nombre_area = ?, descripcion_area = ?, nombre_area_hija = ? WHERE codigo_area = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_actualizar)) {
                // Obtener los nuevos valores del área que se actualizarán
                String codigoArea = areaModificada.getCodigoArea();
                String nuevoNombreArea = areaModificada.getNombreArea();
                String nuevaDescripcionArea = areaModificada.getDescripcionArea();
                String nuevoNombreAreaHija = areaModificada.getNombreAreaHija();

                // Establecer los valores de los parámetros en la sentencia SQL
                statement.setString(1, nuevoNombreArea);
                statement.setString(2, nuevaDescripcionArea);
                statement.setString(3, nuevoNombreAreaHija);
                statement.setString(4, codigoArea);

                // Ejecutar la actualización
                int filasActualizadas = statement.executeUpdate();

                if (filasActualizadas > 0) {
                    isUpdated = true;
                   // System.out.println("El área con código " + codigoArea + " ha sido actualizada correctamente.");
                } else {
                    System.out.println("No se encontró el área con código " + codigoArea + " en la base de datos.");
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

    //elimina el area, retorna true si elimino correctamente de lo contrario retorna false
    public static boolean eliminarArea(String codigoArea) {
        boolean isDeleted = false;

        // Sentencia SQL para eliminar el área
        String sql_eliminar = "DELETE FROM area WHERE codigo_area = ?";

        // Obtener la conexión
        ConexionBD conexion = new ConexionBD();
        conexion.openConnection();
        Connection connection = conexion.getConnection();

        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(sql_eliminar)) {
                // Establecer el valor del parámetro en la sentencia SQL
                statement.setString(1, codigoArea);

                // Ejecutar la eliminación
                int filasEliminadas = statement.executeUpdate();

                if (filasEliminadas > 0) {
                    isDeleted = true;
                    //System.out.println("El área con código " + codigoArea + " ha sido eliminada correctamente.");
                } else {
                    System.out.println("No se encontró el área con código " + codigoArea + " en la base de datos.");
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
