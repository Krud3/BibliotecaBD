/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;


/**
 *
 * @author juanm
 */
public class Usuario {
    private  String idUsuario;
    private  String passwordUsuario;
    private  String nombreUsuario;
    private  String telUsuario;
    private  String dirUsuario;
    private  String emailUsuario;

    public Usuario(String idUsuario, String passwordUsuario, String nombreUsuario, String telUsuario, String dirUsuario, String emailUsuario) {
        this.idUsuario = idUsuario;
        this.passwordUsuario = passwordUsuario;
        this.nombreUsuario = nombreUsuario;
        this.telUsuario = telUsuario;
        this.dirUsuario = dirUsuario;
        this.emailUsuario = emailUsuario;
    }
    
    public Usuario() {
        this.idUsuario = "";
        this.passwordUsuario = "";
        this.nombreUsuario = "";
        this.telUsuario = "";
        this.dirUsuario = "";
        this.emailUsuario = "";
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public void setDirUsuario(String dirUsuario) {
        this.dirUsuario = dirUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }


    public  String getIdUsuario() {
        return idUsuario;
    }

    public  String getPasswordUsuario() {
        return passwordUsuario;
    }


    public  String getNombreUsuario() {
        return nombreUsuario;
    }


    public  String getTelUsuario() {
        return telUsuario;
    }



    public  String getDirUsuario() {
        return dirUsuario;
    }


    public  String getEmailUsuario() {
        return emailUsuario;
    }

}
