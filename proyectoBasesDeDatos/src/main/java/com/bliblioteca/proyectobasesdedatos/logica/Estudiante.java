/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Estudiante {
    private static String idUsuario;
    private static String carreraEstudiante;
    private static String universidadEstudiante;

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        Estudiante.idUsuario = idUsuario;
    }

    public static String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    public static void setCarreraEstudiante(String carreraEstudiante) {
        Estudiante.carreraEstudiante = carreraEstudiante;
    }

    public static String getUniversidadEstudiante() {
        return universidadEstudiante;
    }

    public static void setUniversidadEstudiante(String universidadEstudiante) {
        Estudiante.universidadEstudiante = universidadEstudiante;
    }
}
