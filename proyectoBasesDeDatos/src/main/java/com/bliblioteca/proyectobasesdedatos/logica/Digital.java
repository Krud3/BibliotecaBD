/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Digital {
    private static String ISBN;
    private static String url;
    private static String formato;
    private static String tamanio;

    public static String getISBN() {
        return ISBN;
    }

    public static void setISBN(String ISBN) {
        Digital.ISBN = ISBN;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Digital.url = url;
    }

    public static String getFormato() {
        return formato;
    }

    public static void setFormato(String formato) {
        Digital.formato = formato;
    }

    public static String getTamanio() {
        return tamanio;
    }

    public static void setTamanio(String tamanio) {
        Digital.tamanio = tamanio;
    }
}
