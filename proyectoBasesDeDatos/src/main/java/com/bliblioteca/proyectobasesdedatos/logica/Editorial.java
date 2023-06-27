/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Editorial {
     private  String codigoEditorial;
    private  String nombreEditorial;
    private  String paginaWebEditorial;
    private  String paisEditorial;

    public Editorial(String codigoEditorial, String nombreEditorial, String paginaWebEditorial, String paisEditorial) {
        this.codigoEditorial = codigoEditorial;
        this.nombreEditorial = nombreEditorial;
        this.paginaWebEditorial = paginaWebEditorial;
        this.paisEditorial = paisEditorial;
    }
    
    public Editorial() {
        this.codigoEditorial = "";
        this.nombreEditorial = "";
        this.paginaWebEditorial = "";
        this.paisEditorial = "";
    }

    public void setCodigoEditorial(String codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public void setPaginaWebEditorial(String paginaWebEditorial) {
        this.paginaWebEditorial = paginaWebEditorial;
    }

    public void setPaisEditorial(String paisEditorial) {
        this.paisEditorial = paisEditorial;
    }

    public  String getCodigoEditorial() {
        return codigoEditorial;
    }


    public  String getNombreEditorial() {
        return nombreEditorial;
    }


    public  String getPaginaWebEditorial() {
        return paginaWebEditorial;
    }


    public  String getPaisEditorial() {
        return paisEditorial;
    }

}
