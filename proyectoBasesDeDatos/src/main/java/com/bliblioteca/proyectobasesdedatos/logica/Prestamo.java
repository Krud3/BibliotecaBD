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
public class Prestamo {
    private  String nPrestamo;
    private  Date fechaR;
    private  Date fechaD;
    private  String idUsuario;
    private  String idEmpleado;
    private  String ISBN;
    private  String numero;

    public Prestamo(String nPrestamo, Date fechaR, Date fechaD, String idUsuario, String idEmpleado, String ISBN, String numero) {
        this.nPrestamo = nPrestamo;
        this.fechaR = fechaR;
        this.fechaD = fechaD;
        this.idUsuario = idUsuario;
        this.idEmpleado = idEmpleado;
        this.ISBN = ISBN;
        this.numero = numero;
    }

    public Prestamo() {
        this.nPrestamo = "";
        this.fechaR = null;
        this.fechaD = null;
        this.idUsuario = "";
        this.idEmpleado = "";
        this.ISBN = "";
        this.numero = "";
    }
    public void setnPrestamo(String nPrestamo) {
        this.nPrestamo = nPrestamo;
    }

    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }

    public void setFechaD(Date fechaD) {
        this.fechaD = fechaD;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public  String getNumero() {
        return numero;
    }

    public  String getnPrestamo() {
        return nPrestamo;
    }

    public  Date getFechaR() {
        return fechaR;
    }

    public  Date getFechaD() {
        return fechaD;
    }


    public  String getIdUsuario() {
        return idUsuario;
    }

    public  String getIdEmpleado() {
        return idEmpleado;
    }

    public  String getISBN() {
        return ISBN;
    }

}
