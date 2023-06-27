/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.logica;

/**
 *
 * @author juanm
 */
public class Empleado {
    private  String idEmpleado;
    private  String passwordEmpleado;
    private  String nombreEmpleado;
    private  String cargoEmpleado;

    public Empleado(String idEmpleado, String passwordEmpleado, String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.passwordEmpleado = passwordEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public Empleado() {
        this.idEmpleado = "";
        this.passwordEmpleado = "";
        this.nombreEmpleado = "";
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setPasswordEmpleado(String passwordEmpleado) {
        this.passwordEmpleado = passwordEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public  String getIdEmpleado() {
        return idEmpleado;
    }


    public  String getPasswordEmpleado() {
        return passwordEmpleado;
    }


    public  String getNombreEmpleado() {
        return nombreEmpleado;
    }


    public  String getCargoEmpleado() {
        return cargoEmpleado;
    }

}
