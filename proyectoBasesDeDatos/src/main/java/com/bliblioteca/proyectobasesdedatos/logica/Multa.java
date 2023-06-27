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
    private  String nMulta;
    private  int valor;
    private  Date fecha;
    private  String descripcion;
    private  String ISBN;
    private  String numero;

    public Multa(String nMulta, int valor, Date fecha, String descripcion, String ISBN, String numero, String idUsuario) {
        this.nMulta = nMulta;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.ISBN = ISBN;
        this.numero = numero;
        this.idUsuario = idUsuario;
    }
    
    public Multa() {
        this.nMulta = "";
        this.valor = -1;
        this.fecha = null;
        this.descripcion = "";
        this.ISBN = "";
        this.numero = "";
        this.idUsuario = "";
    }

    public void setnMulta(String nMulta) {
        this.nMulta = nMulta;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public  String getNumero() {
        return numero;
    }

    private  String idUsuario;

    public  String getnMulta() {
        return nMulta;
    }

    public  int getValor() {
        return valor;
    }


    public  Date getFecha() {
        return fecha;
    }


    public  String getDescripcion() {
        return descripcion;
    }


    public  String getISBN() {
        return ISBN;
    }


    public  String getIdUsuario() {
        return idUsuario;
    }

}
