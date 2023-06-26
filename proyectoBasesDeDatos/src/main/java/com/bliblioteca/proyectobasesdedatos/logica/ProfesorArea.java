/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class ProfesorArea {
    private  String idUsuario;
    private  String codigoArea;

    public ProfesorArea(String idUsuario, String codigoArea) {
        this.idUsuario = idUsuario;
        this.codigoArea = codigoArea;
    }

    public ProfesorArea() {
        this.idUsuario = "";
        this.codigoArea = "";
    }
    public  String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public  String getCodigoArea() {
        return codigoArea;
    }

}
