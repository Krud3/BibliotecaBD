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
    private  String ISBN;
    private  String url;
    private  String formato;
    private  String tamanio;

    public Digital(String ISBN, String url, String formato, String tamanio) {
        this.ISBN = ISBN;
        this.url = url;
        this.formato = formato;
        this.tamanio = tamanio;
    }

    public Digital() {
        this.ISBN = "";
        this.url = "";
        this.formato = "";
        this.tamanio = "";
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public  String getISBN() {
        return ISBN;
    }


    public  String getUrl() {
        return url;
    }


    public  String getFormato() {
        return formato;
    }


    public  String getTamanio() {
        return tamanio;
    }

}
