/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Area {
    private  String codigoArea;
    private  String nombreArea;
    private  String descripcionArea;
    private  String nombreAreaHija;

    public Area(String codigoArea, String nombreArea, String descripcionArea, String nombreAreaHija) {
        this.codigoArea = codigoArea;
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
        this.nombreAreaHija = nombreAreaHija;
    }
    
    public Area() {
        this.codigoArea = "";
        this.nombreArea = "";
        this.descripcionArea = "";
        this.nombreAreaHija = "";
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public void setNombreAreaHija(String nombreAreaHija) {
        this.nombreAreaHija = nombreAreaHija;
    }

    public  String getCodigoArea() {
        return codigoArea;
    }

    public  String getNombreArea() {
        return nombreArea;
    }

    public  String getDescripcionArea() {
        return descripcionArea;
    }

    public  String getNombreAreaHija() {
        return nombreAreaHija;
    }
    
}
