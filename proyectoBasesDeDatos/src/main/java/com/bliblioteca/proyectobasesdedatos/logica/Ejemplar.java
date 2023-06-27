/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Ejemplar {
     private  String ISBN;
    private  String numero;
    private  String nCajon;
    private  String nPasillo;
    private  String nomSala;
    private  String estante;
    private  String estado;

    public Ejemplar(String ISBN, String numero, String nCajon, String nPasillo, String nomSala, String estante, String estado) {
        this.ISBN = ISBN;
        this.numero = numero;
        this.nCajon = nCajon;
        this.nPasillo = nPasillo;
        this.nomSala = nomSala;
        this.estante = estante;
        this.estado = estado;
    }
    
    public Ejemplar() {
        this.ISBN = "";
        this.numero = "";
        this.nCajon = "";
        this.nPasillo = "";
        this.nomSala = "";
        this.estante = "";
        this.estado = "";
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setnCajon(String nCajon) {
        this.nCajon = nCajon;
    }

    public void setnPasillo(String nPasillo) {
        this.nPasillo = nPasillo;
    }

    public void setNomSala(String nomSala) {
        this.nomSala = nomSala;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public  String getISBN() {
        return ISBN;
    }

    public  String getNumero() {
        return numero;
    }

    public  String getnCajon() {
        return nCajon;
    }

    public  String getnPasillo() {
        return nPasillo;
    }


    public  String getNomSala() {
        return nomSala;
    }


    public  String getEstante() {
        return estante;
    }


    public  String getEstado() {
        return estado;
    }

}
