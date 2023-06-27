package com.bliblioteca.proyectobasesdedatos.logica;

import java.util.Date;

public class Solicitud {
    private  String numeroSolicitud;
    private  String tituloLibro;
    private  Date fecha;
    private  String descripcion;
    private  String ISBNSolicitud;
    private  String idEmpleado;
    private  String idUsuario;

    public Solicitud(String numeroSolicitud, String tituloLibro, Date fecha, String descripcion, String ISBNSolicitud, String idEmpleado, String idUsuario) {
        this.numeroSolicitud = numeroSolicitud;
        this.tituloLibro = tituloLibro;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.ISBNSolicitud = ISBNSolicitud;
        this.idEmpleado = idEmpleado;
        this.idUsuario = idUsuario;
    }
    
    public Solicitud() {
        this.numeroSolicitud = "";
        this.tituloLibro = "";
        this.fecha = null;
        this.descripcion = "";
        this.ISBNSolicitud = "";
        this.idEmpleado = "";
        this.idUsuario = "";
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setISBNSolicitud(String ISBNSolicitud) {
        this.ISBNSolicitud = ISBNSolicitud;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public  String getNumeroSolicitud() {
        return numeroSolicitud;
    }



    public  String getTituloLibro() {
        return tituloLibro;
    }



    public  Date getFecha() {
        return fecha;
    }



    public  String getDescripcion() {
        return descripcion;
    }



    public  String getISBNSolicitud() {
        return ISBNSolicitud;
    }



    public  String getIdEmpleado() {
        return idEmpleado;
    }



    public  String getIdUsuario() {
        return idUsuario;
    }


}
