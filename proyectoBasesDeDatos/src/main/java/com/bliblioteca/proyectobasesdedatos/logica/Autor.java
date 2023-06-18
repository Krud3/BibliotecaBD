/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Autor {
    private static String codigoAutor;
    private static String primerNombreAutor;
    private static String segundoNombreAutor;
    private static String primerApelldoAutor;
    private static String segundoApelldoAutor;

    public static String getCodigoAutor() {
        return codigoAutor;
    }

    public static void setCodigoAutor(String codigoAutor) {
        Autor.codigoAutor = codigoAutor;
    }

    public static String getPrimerNombreAutor() {
        return primerNombreAutor;
    }

    public static void setPrimerNombreAutor(String primerNombreAutor) {
        Autor.primerNombreAutor = primerNombreAutor;
    }

    public static String getSegundoNombreAutor() {
        return segundoNombreAutor;
    }

    public static void setSegundoNombreAutor(String segundoNombreAutor) {
        Autor.segundoNombreAutor = segundoNombreAutor;
    }

    public static String getPrimerApellidoAutor() {
        return primerApelldoAutor;
    }

    public static void setPrimerApellidoAutor(String primerApelldoAutor) {
        Autor.primerApelldoAutor = primerApelldoAutor;
    }

    public static String getSegundoApellidoAutor() {
        return segundoApelldoAutor;
    }

    public static void setSegundoApellidoAutor(String segundoApelldoAutor) {
        Autor.segundoApelldoAutor = segundoApelldoAutor;
    }
}
