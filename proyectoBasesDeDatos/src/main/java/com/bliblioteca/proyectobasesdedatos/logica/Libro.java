/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Libro {
    private  String ISBN;
    private  String codArea;
    private  String codigoEditorial;
    private  String idEmpleado;
    private  String tituloLibro;
    private  int anioPublicacion;
    private  int numeroPaginas;
    private  String idioma;

    public  String getISBN() {
        return ISBN;
    }

    public Libro(String ISBN, String codArea, String codigoEditorial, String idEmpleado, String tituloLibro, int anioPublicacion, int numeroPaginas, String idioma) {
        this.ISBN = ISBN;
        this.codArea = codArea;
        this.codigoEditorial = codigoEditorial;
        this.idEmpleado = idEmpleado;
        this.tituloLibro = tituloLibro;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
    }
    
    public Libro() {
        this.ISBN = "";
        this.codArea = "";
        this.codigoEditorial = "";
        this.idEmpleado = "";
        this.tituloLibro = "";
        this.anioPublicacion = -1;
        this.numeroPaginas = -1;
        this.idioma = "";
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public void setCodigoEditorial(String codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }


    public  String getCodArea() {
        return codArea;
    }

    public  String getCodigoEditorial() {
        return codigoEditorial;
    }


    public  String getIdEmpleado() {
        return idEmpleado;
    }

    public  String getTituloLibro() {
        return tituloLibro;
    }


    public  int getAnioPublicacion() {
        return anioPublicacion;
    }

    public  int getNumeroPaginas() {
        return numeroPaginas;
    }


    public  String getIdioma() {
        return idioma;
    }

}
