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
    private static String codigoArea;
    private static String nombreArea;
    private static String descripcionArea;
    private static String nombreAreaHija;

    public static String getCodigoArea() {
        return codigoArea;
    }

    public static void setCodigoArea(String codigoArea) {
        Area.codigoArea = codigoArea;
    }

    public static String getNombreArea() {
        return nombreArea;
    }

    public static void setNombreArea(String nombreArea) {
        Area.nombreArea = nombreArea;
    }

    public static String getDescripcionArea() {
        return descripcionArea;
    }

    public static void setDescripcionArea(String descripcionArea) {
        Area.descripcionArea = descripcionArea;
    }

    public static String getNombreAreaHija() {
        return nombreAreaHija;
    }

    public static void setNombreAreaHija(String nombreAreaHija) {
        Area.nombreAreaHija = nombreAreaHija;
    }
    
}
