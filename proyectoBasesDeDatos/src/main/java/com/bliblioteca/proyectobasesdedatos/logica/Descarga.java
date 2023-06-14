/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

import java.util.Date;

/**
 *
 * @author juanm
 */
public class Descarga {
     private static String ISBN;
    private static String idUsuario;
    private static String ipComputadoraDescarga;
    private static Date fechaDescarga;
    private static String horarioDescarga;

    public static String getISBN() {
        return ISBN;
    }

    public static void setISBN(String ISBN) {
        Descarga.ISBN = ISBN;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        Descarga.idUsuario = idUsuario;
    }

    public static String getIpComputadoraDescarga() {
        return ipComputadoraDescarga;
    }

    public static void setIpComputadoraDescarga(String ipComputadoraDescarga) {
        Descarga.ipComputadoraDescarga = ipComputadoraDescarga;
    }

    public static Date getFechaDescarga() {
        return fechaDescarga;
    }

    public static void setFechaDescarga(Date fechaDescarga) {
        Descarga.fechaDescarga = fechaDescarga;
    }

    public static String getHorarioDescarga() {
        return horarioDescarga;
    }

    public static void setHorarioDescarga(String horarioDescarga) {
        Descarga.horarioDescarga = horarioDescarga;
    }
}
