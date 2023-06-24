package com.bliblioteca.proyectobasesdedatos.logica;

public class Profesor {

    private static String idUsuario;
    private static String titulo;
    private static String dependencia;

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        Profesor.idUsuario = idUsuario;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static void setTitulo(String titulo) {
        Profesor.titulo = titulo;
    }

    public static String getDependencia() {
        return dependencia;
    }

    public static void setDependencia(String dependencia) {
        Profesor.dependencia = dependencia;
    }
}
