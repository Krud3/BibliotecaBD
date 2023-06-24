package com.bliblioteca.proyectobasesdedatos.logica;

import java.util.Date;

public class Solicitud {
    private static String numeroSolicitud;
    private static String tituloLibro;
    private static Date fecha;
    private static String descripcion;
    private static String ISBNSolicitud;
    private static String idEmpleado;
    private static String idUsuario;

    public static String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public static void setNumeroSolicitud(String numeroSolicitud) {
        Solicitud.numeroSolicitud = numeroSolicitud;
    }

    public static String getTituloLibro() {
        return tituloLibro;
    }

    public static void setTituloLibro(String tituloLibro) {
        Solicitud.tituloLibro = tituloLibro;
    }

    public static Date getFecha() {
        return fecha;
    }

    public static void setFecha(Date fecha) {
        Solicitud.fecha = fecha;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(String descripcion) {
        Solicitud.descripcion = descripcion;
    }

    public static String getISBNSolicitud() {
        return ISBNSolicitud;
    }

    public static void setISBNSolicitud(String ISBNSolicitud) {
        Solicitud.ISBNSolicitud = ISBNSolicitud;
    }

    public static String getIdEmpleado() {
        return idEmpleado;
    }

    public static void setIdEmpleado(String idEmpleado) {
        Solicitud.idEmpleado = idEmpleado;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(String idUsuario) {
        Solicitud.idUsuario = idUsuario;
    }
}
