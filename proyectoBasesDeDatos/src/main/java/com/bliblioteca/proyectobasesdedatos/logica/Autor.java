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
    private  String codigoAutor;
    private  String primerNombreAutor;
    private  String segundoNombreAutor;
    private  String primerApelldoAutor;
    private  String segundoApelldoAutor;

    public Autor(String codigoAutor, String primerNombreAutor, String segundoNombreAutor, String primerApelldoAutor, String segundoApelldoAutor) {
        this.codigoAutor = codigoAutor;
        this.primerNombreAutor = primerNombreAutor;
        this.segundoNombreAutor = segundoNombreAutor;
        this.primerApelldoAutor = primerApelldoAutor;
        this.segundoApelldoAutor = segundoApelldoAutor;
    }
    
    public Autor() {
        this.codigoAutor = "";
        this.primerNombreAutor = "";
        this.segundoNombreAutor = "";
        this.primerApelldoAutor = "";
        this.segundoApelldoAutor = "";
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public void setPrimerNombreAutor(String primerNombreAutor) {
        this.primerNombreAutor = primerNombreAutor;
    }

    public void setSegundoNombreAutor(String segundoNombreAutor) {
        this.segundoNombreAutor = segundoNombreAutor;
    }

    public void setPrimerApelldoAutor(String primerApelldoAutor) {
        this.primerApelldoAutor = primerApelldoAutor;
    }

    public void setSegundoApelldoAutor(String segundoApelldoAutor) {
        this.segundoApelldoAutor = segundoApelldoAutor;
    }

    public  String getCodigoAutor() {
        return codigoAutor;
    }


    public  String getPrimerNombreAutor() {
        return primerNombreAutor;
    }


    public  String getSegundoNombreAutor() {
        return segundoNombreAutor;
    }


    public  String getPrimerApellidoAutor() {
        return primerApelldoAutor;
    }


    public  String getSegundoApellidoAutor() {
        return segundoApelldoAutor;
    }

}
