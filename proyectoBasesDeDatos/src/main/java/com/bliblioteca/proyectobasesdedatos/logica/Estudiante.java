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
    private  String idUsuario;
    private  String carreraEstudiante;
    private  String universidadEstudiante;

    public Estudiante(String idUsuario, String carreraEstudiante, String universidadEstudiante) {
        this.idUsuario = idUsuario;
        this.carreraEstudiante = carreraEstudiante;
        this.universidadEstudiante = universidadEstudiante;
    }
    
    public Estudiante() {
        this.idUsuario = "";
        this.carreraEstudiante = "";
        this.universidadEstudiante = "";
    }

    public  String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }

    public void setUniversidadEstudiante(String universidadEstudiante) {
        this.universidadEstudiante = universidadEstudiante;
    }


    public  String getCarreraEstudiante() {
        return carreraEstudiante;
    }


    public  String getUniversidadEstudiante() {
        return universidadEstudiante;
    }

}
