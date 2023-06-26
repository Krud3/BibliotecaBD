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
public class Multa {
    private static String nMulta;
    private static int valor;
    private static Date fecha;
    private static String descripcion;
    private static String ISBN;
    private static String idUsuario;

    public static String getnMulta() {
        return nMulta;
    }

    public static void setnMulta(String nMulta) {
        Multa.nMulta = nMulta;
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        Multa.valor = valor;
    }

    public static Date getFecha() {
        return fecha;
    }

    public static void setFecha(Date fecha) {
        Multa.fecha = fecha;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(String descripcion) {
        Multa.descripcion = descripcion;
    }

    public static String getISBN() {
        return ISBN;
    }

    public static void setISBN(String ISBN) {
        Multa.ISBN = ISBN;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        Multa.idUsuario = idUsuario;
    }
}
