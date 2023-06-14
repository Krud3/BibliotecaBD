/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Escrito {
    private static String ISBN;
    private static String codigoAutor;

    public static String getISBN() {
        return ISBN;
    }

    public static void setISBN(String ISBN) {
        Escrito.ISBN = ISBN;
    }

    public static String getCodigoAutor() {
        return codigoAutor;
    }

    public static void setCodigoAutor(String codigoAutor) {
        Escrito.codigoAutor = codigoAutor;
    }
}
