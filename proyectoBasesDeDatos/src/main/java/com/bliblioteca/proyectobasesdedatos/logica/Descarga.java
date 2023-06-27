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
public class Descarga {
    private  String ISBN;
    private  String idUsuario;
    private  String ipComputadoraDescarga;
    private  Date fechaDescarga;
    private  String horarioDescarga;

    public Descarga(String ISBN, String idUsuario, String ipComputadoraDescarga, Date fechaDescarga, String horarioDescarga) {
        this.ISBN = ISBN;
        this.idUsuario = idUsuario;
        this.ipComputadoraDescarga = ipComputadoraDescarga;
        this.fechaDescarga = fechaDescarga;
        this.horarioDescarga = horarioDescarga;
    }
    
    public Descarga() {
        this.ISBN = "";
        this.idUsuario = "";
        this.ipComputadoraDescarga = "";
        this.fechaDescarga = null;
        this.horarioDescarga = "";
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIpComputadoraDescarga(String ipComputadoraDescarga) {
        this.ipComputadoraDescarga = ipComputadoraDescarga;
    }

    public void setFechaDescarga(Date fechaDescarga) {
        this.fechaDescarga = fechaDescarga;
    }

    public void setHorarioDescarga(String horarioDescarga) {
        this.horarioDescarga = horarioDescarga;
    }

    public  String getISBN() {
        return ISBN;
    }

    public  String getIdUsuario() {
        return idUsuario;
    }


    public  String getIpComputadoraDescarga() {
        return ipComputadoraDescarga;
    }


    public  Date getFechaDescarga() {
        return fechaDescarga;
    }

    public  String getHorarioDescarga() {
        return horarioDescarga;
    }

}
