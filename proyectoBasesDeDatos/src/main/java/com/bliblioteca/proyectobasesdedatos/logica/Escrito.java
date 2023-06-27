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
    private  String ISBN;
    private  String codigoAutor;

    public Escrito(String ISBN, String codigoAutor) {
        this.ISBN = ISBN;
        this.codigoAutor = codigoAutor;
    }
    
    public Escrito() {
        this.ISBN = "";
        this.codigoAutor = "";
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public  String getISBN() {
        return ISBN;
    }


    public  String getCodigoAutor() {
        return codigoAutor;
    }

}
