package com.bliblioteca.proyectobasesdedatos.logica;

public class Profesor {

    private  String idUsuario;
    private  String titulo;
    private  String dependencia;

    public Profesor(String idUsuario, String titulo, String dependencia) {
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.dependencia = dependencia;
    }
    
    public Profesor() {
        this.idUsuario = "";
        this.titulo = "";
        this.dependencia = "";
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public  String getIdUsuario() {
        return idUsuario;
    }

    public  String getTitulo() {
        return titulo;
    }

    public  String getDependencia() {
        return dependencia;
    }

}
