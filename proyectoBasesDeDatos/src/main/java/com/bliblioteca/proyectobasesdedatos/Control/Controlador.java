/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.Control;

import com.bliblioteca.proyectobasesdedatos.DAO.*;
import com.bliblioteca.proyectobasesdedatos.logica.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JSMC
 */
public class Controlador {
    
    
    public Controlador(){
    
    }
    public void llenarTablaBuscarLibro(String valor, String campo, DefaultTableModel table){
        Object[] filas = new Object[8];
        table.setRowCount(0);
        
        ArrayList<Libro> losLibros = DAOLibro.obtenerLibroPorCualquierCampo(valor, campo);
        for(Libro elLibro : losLibros){
            filas[0] = elLibro.getISBN();
            filas[1] = elLibro.getCodArea();
            filas[2] = elLibro.getCodigoEditorial();
            filas[3] = elLibro.getIdEmpleado();
            filas[4] = elLibro.getTituloLibro();
            filas[5] = elLibro.getAnioPublicacion();
            filas[6] = elLibro.getNumeroPaginas();
            filas[7] = elLibro.getIdioma();
            table.addRow(filas);
        }
    }
    public void llenarTablaBuscarMulta(DefaultTableModel table){
        Object[] filas = new Object[7];
        table.setRowCount(0);
                
        ArrayList<Multa> losLibros = DAOMulta.obtenerTodasLasMultas();
        for(Multa elLibro : losLibros){
            filas[0] = elLibro.getnMulta();
            filas[1] = elLibro.getValor();
            long millis = elLibro.getFecha().getTime();
            Date fecha = new Date(millis);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaString = sdf.format(fecha);
            filas[2] = fechaString;
            filas[3] = elLibro.getDescripcion();
            filas[4] = elLibro.getISBN();
            filas[5] = elLibro.getNumero();
            filas[6] = elLibro.getIdUsuario();
           
            table.addRow(filas);
        }
    }
    public void llenarTablaBuscarPrestamo(DefaultTableModel table){
        Object[] filas = new Object[7];
        table.setRowCount(0);
                
        ArrayList<Prestamo> losLibros = DAOPrestamo.obtenerTodosLosPrestamos();
        for(Prestamo elLibro : losLibros){
            filas[0] = elLibro.getnPrestamo();
            
            long millis  = elLibro.getFechaR().getTime();
            Date fecha = new Date(millis);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaStringR = sdf.format(fecha);
            filas[1] = fechaStringR;
            long millis2 = elLibro.getFechaD().getTime();
            Date fecha2 = new Date(millis2);            
            String fechaStringD = sdf.format(fecha2);
            filas[2] = fechaStringD;
            filas[3] = elLibro.getIdUsuario();
            filas[4] = elLibro.getIdEmpleado();
            filas[5] = elLibro.getISBN();
            filas[6] = elLibro.getNumero();
           
            table.addRow(filas);
        }
    }
    public void llenarTablaBuscarSolicitud(DefaultTableModel table){
        Object[] filas = new Object[7];
        table.setRowCount(0);
                
        ArrayList<Solicitud> losLibros = DAOSolicitud.obtenerTodasLasSolicitudes();
        for(Solicitud elLibro : losLibros){
            filas[0] = elLibro.getNumeroSolicitud();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            filas[1] = elLibro.getTituloLibro();
            long millis2 = elLibro.getFecha().getTime();
            Date fecha2 = new Date(millis2);            
            String fechaStringD = sdf.format(fecha2);
            filas[2] = fechaStringD;
            filas[3] = elLibro.getDescripcion();
            filas[4] = elLibro.getISBNSolicitud();
            filas[5] = elLibro.getIdEmpleado();
            filas[6] = elLibro.getIdUsuario();
           
            table.addRow(filas);
        }
    }
    public void llenarTablaBuscarUsuario(DefaultTableModel table){
        Object[] filas = new Object[5];
        table.setRowCount(0);
                
        ArrayList<Usuario> losLibros = DAOUsuario.obtenerTodosLosUsuarios();
        for(Usuario elLibro : losLibros){
            filas[0] = elLibro.getIdUsuario();
            filas[1] = elLibro.getNombreUsuario();
            filas[2] = elLibro.getTelUsuario();
            filas[3] = elLibro.getDirUsuario();
            filas[4] = elLibro.getEmailUsuario();
           
            table.addRow(filas);
        }
    }
    public void llenarComboBoxBuscarUsuario(DefaultComboBoxModel model){
        Set<String> id_multa = new HashSet<>();
        ArrayList<Usuario> lasMultas = DAOUsuario.obtenerTodosLosUsuarios();
        for(Usuario laMulta : lasMultas){
            id_multa.add(laMulta.getIdUsuario());
        }
        model.addElement("Seleccione un ID usuario");
        
        for(String value : id_multa){
            model.addElement(value);
        }
    }
    public void llenarComboBoxBuscarSolicitud(DefaultComboBoxModel model){
        Set<String> id_multa = new HashSet<>();
        ArrayList<Solicitud> lasMultas = DAOSolicitud.obtenerTodasLasSolicitudes();
        for(Solicitud laMulta : lasMultas){
            id_multa.add(laMulta.getNumeroSolicitud());
        }
        model.addElement("Seleccione un N solicitud");
        
        for(String value : id_multa){
            model.addElement(value);
        }
    }
    public void llenarComboBoxBuscarMulta(DefaultComboBoxModel model){
        Set<String> id_multa = new HashSet<>();
        ArrayList<Multa> lasMultas = DAOMulta.obtenerTodasLasMultas();
        for(Multa laMulta : lasMultas){
            id_multa.add(laMulta.getnMulta());
        }
        model.addElement("Seleccione un N multa");
        
        for(String value : id_multa){
            model.addElement(value);
        }
    }
    public void llenarComboBoxBuscarPrestamo(DefaultComboBoxModel model){
        Set<String> id_multa = new HashSet<>();
        ArrayList<Prestamo> lasMultas = DAOPrestamo.obtenerTodosLosPrestamos();
        for(Prestamo laMulta : lasMultas){
            id_multa.add(laMulta.getnPrestamo());
        }
        model.addElement("Seleccione un N prestamo");
        
        for(String value : id_multa){
            model.addElement(value);
        }
    }
    public boolean validarPasswordEmpleado(String idEmpleado, String pass){
        boolean result = false;
        DAOEmpleado daoEmpleado = new DAOEmpleado();
        Empleado empleado = daoEmpleado.obtenerEmpleadoPorID(idEmpleado);
        String password = empleado.getPasswordEmpleado();
        if (pass.equals(password)){
            result = true;
        }
        return result;
    }
    public void llenarComboBoxAgregarSolicitud(DefaultComboBoxModel model){
        Set<String> id_usuario = new HashSet<>();
        
        ArrayList<Usuario> losUsuarios = DAOUsuario.obtenerTodosLosUsuarios();
        
        for(Usuario elUsuario : losUsuarios){
            id_usuario.add(elUsuario.getIdUsuario());
        }
        model.addElement("Seleccione un id de usuario");
        
        for(String value : id_usuario){
            model.addElement(value);
        }
        
    }
    
    public void llenarComboBoxAgregarPrestamo(DefaultComboBoxModel model, boolean val){
        Set<String> id_usuario = new HashSet<>();
        Set<String> id_empleados = new HashSet<>();
        
        ArrayList<Usuario> losUsuarios = DAOUsuario.obtenerTodosLosUsuarios();
        ArrayList<Ejemplar> losEmpleados = DAOEjemplar.obtenerTodosLosEjemplares();
        
        for(Usuario elUsuario : losUsuarios){
            id_usuario.add(elUsuario.getIdUsuario());
        }
        for(Ejemplar elEmpleado : losEmpleados){
            id_empleados.add(elEmpleado.getISBN());
        }
        
        if(val){
            model.addElement("Seleccione un id de usuario");
            for(String value : id_usuario){
                model.addElement(value);
            }
        }
        else{
            model.addElement("Seleccione un ISBN");
            for(String value : id_empleados){
                
                model.addElement(value);
            }
        } 
    }
    public void llenarComboBoxAgregarMulta(DefaultComboBoxModel model, boolean val){
        Set<String> id_usuario = new HashSet<>();
        Set<String> ISBN_ejemplar = new HashSet<>();
        
        ArrayList<Usuario> losUsuarios = DAOUsuario.obtenerTodosLosUsuarios();
        ArrayList<Ejemplar> losEjemplares = DAOEjemplar.obtenerTodosLosEjemplares();
        
        for(Usuario elUsuario : losUsuarios){
            id_usuario.add(elUsuario.getIdUsuario());
        }
        for(Ejemplar elEjemplar : losEjemplares){
            ISBN_ejemplar.add(elEjemplar.getISBN());
        }
        
        if(val){
            model.addElement("Seleccione un id de usuario");
            for(String value : id_usuario){
                model.addElement(value);
            }
        }
        else{
            model.addElement("Seleccione un ISBN");
            for(String value : ISBN_ejemplar){
                
                model.addElement(value);
            }
        } 
    }
    
    public void llenarComboBoxAgregarLibro(DefaultComboBoxModel model, int val){
        Set<String> id_empleado = new HashSet<>();
        Set<String> cod_areas = new HashSet<>();
        Set<String> cod_editorial = new HashSet<>();
        
        ArrayList<Empleado> losEmpleados = DAOEmpleado.obtenerTodosLosEmpleados();
        ArrayList<Area> lasAreas = DAOArea.obtenerTodasLasAreas();
        ArrayList<Editorial> losEditoriales = DAOEditorial.obtenerTodasLasEditoriales();
        
        for(Empleado elEmpleado : losEmpleados){
            id_empleado.add(elEmpleado.getIdEmpleado());
        }
        for(Area elArea : lasAreas){
            cod_areas.add(elArea.getCodigoArea());
        }
        for(Editorial elEditorial : losEditoriales){
            cod_editorial.add(elEditorial.getCodigoEditorial());
        }
        
        if(val == -1){
            model.addElement("Seleccione un id de empleado");
            for(String value : id_empleado){
                model.addElement(value);
            }
        }
        else if(val == 0){
            model.addElement("Seleccione un codigo de area");
            for(String value : cod_areas){
                model.addElement(value);
            }
        }
        else{
            model.addElement("Seleccione un codigo editorial");
            for(String value : cod_editorial){
                
                model.addElement(value);
            }
        } 
    }
    public void agregarEstudiante(Usuario usuario, String universidad, String carrera){
        String id_usuario = usuario.getIdUsuario();
        Estudiante estudiante = new Estudiante();
        estudiante.setIdUsuario(id_usuario);
        estudiante.setUniversidadEstudiante(universidad);
        estudiante.setCarreraEstudiante(carrera);
        DAOEstudiante.guardarEstudiante(estudiante);
    }
    
    public void agregarProfesor(Usuario usuario, String titulo, String dependencia){
        String id_usuario = usuario.getIdUsuario();
        Profesor estudiante = new Profesor();
        estudiante.setIdUsuario(id_usuario);
        estudiante.setDependencia(dependencia);
        DAOProfesor.guardarProfesor(estudiante);
    }
    public <V> void agregarObjeto(V objeto){
        
        if(objeto == null){
            throw new UnsupportedOperationException("El objeto a agregar es nulo");
        }
        
        switch (objeto.getClass().getSimpleName()) {
            case "Usuario":
                Usuario usuario = (Usuario) objeto;
                DAOUsuario.guardarUsuario(usuario);
                break;
            case "Libro":
                Libro libro = (Libro) objeto;
                DAOLibro.guardarLibro(libro);
                break;
            case "Multa":
                Multa multa = (Multa) objeto;
                DAOMulta.guardarMulta(multa);
                break;
            case "Prestamo":
                Prestamo prestamo = (Prestamo) objeto;
                DAOPrestamo.guardarPrestamo(prestamo);
                break;
            case "Solicitud":
                Solicitud solicitud = (Solicitud) objeto;
                DAOSolicitud.guardarSolicitud(solicitud);
                break;
            
            default:
                throw new AssertionError();
        }
    }
    
    public <V> void eliminarObjeto(V objeto){
        
        if(objeto == null){
            throw new UnsupportedOperationException("El objeto a eliminar es nulo");
        }
        
        switch (objeto.getClass().getSimpleName()) {
            case "Usuario":
                Usuario usuario = (Usuario) objeto;
                eliminarUsuario(usuario);
                break;
            case "Libro":
                Libro libro = (Libro) objeto;
                eliminarLibro(libro);
                break;
            case "Multa":
                Multa multa = (Multa) objeto;
                eliminarMulta(multa);
                break;
            case "Prestamo":
                Prestamo prestamo = (Prestamo) objeto;
                eliminarPrestamo(prestamo);
                break;
            case "Solicitud":
                Solicitud solicitud = (Solicitud) objeto;
                eliminarSolicitud(solicitud);
                break;
            
            default:
                throw new AssertionError();
        }
    }
    public <V> void editarObjeto(V objeto, Ejemplar ejemplar, Digital digital,Estudiante estudiante, Profesor profesor){
        
        if(objeto == null){
            throw new UnsupportedOperationException("El objeto a editar es nulo");
        }
        
        switch (objeto.getClass().getSimpleName()) {
            case "Usuario":
                Usuario usuario = (Usuario) objeto;
                editarUsuario(usuario, estudiante, profesor);
                break;
            case "Libro":
                Libro libro = (Libro) objeto;
                editarLibro(libro, ejemplar, digital);
                break;
            case "Multa":
                Multa multa = (Multa) objeto;
                editarMulta(multa);
                break;
            case "Prestamo":
                Prestamo prestamo = (Prestamo) objeto;
                editarPrestamo(prestamo);
                break;
            case "Solicitud":
                Solicitud solicitud = (Solicitud) objeto;
                editarSolicitud(solicitud);
                break;
            
            default:
                throw new AssertionError();
        }
    }
    
     public void editarSolicitud(Solicitud solicitud){
        DAOSolicitud.actualizarSolicitud(solicitud);
    }
    public void editarPrestamo(Prestamo prestamo){
        DAOPrestamo.actualizarPrestamo(prestamo);
    }
    public void editarMulta(Multa multa){
        DAOMulta.actualizarMulta(multa);
    }
    public void editarLibro(Libro libro, Ejemplar ejemplar, Digital digital){
        
        ArrayList<Ejemplar> losEjemplares = DAOEjemplar.obtenerTodosLosEjemplares();
        for(Ejemplar elEjemplar : losEjemplares){
            ArrayList<Multa> lasMultas = DAOMulta.obtenerTodasLasMultas();
            for(Multa laMulta : lasMultas){
                if(laMulta.getISBN().equals(elEjemplar.getISBN())){
                    throw new UnsupportedOperationException("Multa asociada al libro no permite editar");
                }
            }
            ArrayList<Prestamo> losPrestamos = DAOPrestamo.obtenerTodosLosPrestamos();
            for(Prestamo elPrestamo : losPrestamos){
                if(elPrestamo.getISBN().equals(elEjemplar.getISBN())){
                    throw new UnsupportedOperationException("Prestamo asociado a libro no permite editar");
                }
            }
            DAOEjemplar.actualizarEjemplar(ejemplar);           
            
        }
        
        ArrayList<Digital> losDigitales = DAODigital.obtenerTodosLosDigitales();
        for(Digital elDigital : losDigitales){
            if(elDigital.getISBN().equals(libro.getISBN())){
                
                DAODigital.actualizarDigital(digital);
            }
        }
        DAOLibro.actualizarLibro(libro);
        
    }
    public void editarUsuario(Usuario usuario, Estudiante estudiante, Profesor profesor){
    
                ArrayList<Prestamo> losPrestamos = DAOPrestamo.obtenerTodosLosPrestamos();
                for(Prestamo elPrestamo : losPrestamos){
                    if(elPrestamo.getIdEmpleado().equals(usuario.getIdUsuario()) ){
                        throw new UnsupportedOperationException("Prestamo asociado a usuario no permite editar");
                    }                
                }
                ArrayList<Multa> lasMultas = DAOMulta.obtenerTodasLasMultas();
                for(Multa laMulta : lasMultas){
                    if(laMulta.getIdUsuario().equals(usuario.getIdUsuario())){
                        throw new UnsupportedOperationException("Multa asociada a usuario no permite editar");
                    }
                }
                
                
                ArrayList<Estudiante> losEstudiantes = DAOEstudiante.obtenerTodosLosEstudiantes();
                for(Estudiante elEstudiante : losEstudiantes){
                    if(elEstudiante.getIdUsuario().equals(usuario.getIdUsuario())){
                        
                        
                        DAOEstudiante.actualizarEstudiante(estudiante);
                        DAOUsuario.actualizarUsuario(usuario);
                        //throw new UnsupportedOperationException("Estudiante asociado a usuario no permite eliminar");
                    }
                }
                ArrayList<Profesor> losProfesores = DAOProfesor.obtenerTodosLosProfesores();
                for(Profesor elProfesor : losProfesores){
                    if(elProfesor.getIdUsuario().equals(usuario.getIdUsuario())){
                        
                        DAOProfesor.actualizarProfesor(elProfesor);
                        DAOUsuario.actualizarUsuario(usuario);
                        
                    }
                }
    }

    public void eliminarSolicitud(Solicitud solicitud){
        DAOSolicitud.eliminarSolicitud(solicitud.getNumeroSolicitud());
    }
    public void eliminarPrestamo(Prestamo prestamo){
        DAOPrestamo.eliminarPrestamo(prestamo.getnPrestamo());
    }
    public void eliminarMulta(Multa multa){
        DAOMulta.eliminarMulta(multa.getnMulta());
    }
    public void eliminarLibro(Libro libro){
        
        ArrayList<Ejemplar> losEjemplares = DAOEjemplar.obtenerTodosLosEjemplares();
        for(Ejemplar elEjemplar : losEjemplares){
            ArrayList<Multa> lasMultas = DAOMulta.obtenerTodasLasMultas();
            for(Multa laMulta : lasMultas){
                if(laMulta.getISBN().equals(elEjemplar.getISBN())){
                    throw new UnsupportedOperationException("Multa asociada al libro no permite eliminar");
                }
            }
            ArrayList<Prestamo> losPrestamos = DAOPrestamo.obtenerTodosLosPrestamos();
            for(Prestamo elPrestamo : losPrestamos){
                if(elPrestamo.getISBN().equals(elEjemplar.getISBN())){
                    throw new UnsupportedOperationException("Prestamo asociado a libro no permite eliminar");
                }
            }
            DAOEjemplar.eliminarEjemplar(libro.getISBN());
            
            
        }
        ArrayList<Escrito> losEscritos = DAOEscrito.obtenerTodosLosEscritos();
        for(Escrito elEscrito : losEscritos){
            if(elEscrito.getISBN().equals(libro.getISBN())){
                DAOEscrito.eliminarEscrito(libro.getISBN());
            }
        }
        
        ArrayList<Digital> losDigitales = DAODigital.obtenerTodosLosDigitales();
        for(Digital elDigital : losDigitales){
            if(elDigital.getISBN().equals(libro.getISBN())){
                ArrayList<Descarga> lasDescargas = DAODescarga.obtenerTodasLasDescargas();
                for(Descarga laDescarga : lasDescargas){
                    if(laDescarga.getISBN().equals(libro.getISBN())){
                        DAODescarga.eliminarDescargaISBN(libro.getISBN());
                    }
                }
                DAODigital.eliminarDigital(libro.getISBN());
            }
        }
        DAOLibro.eliminarLibro(libro.getISBN());
        
    }
    public void eliminarUsuario(Usuario usuario){
    
                ArrayList<Prestamo> losPrestamos = DAOPrestamo.obtenerTodosLosPrestamos();
                for(Prestamo elPrestamo : losPrestamos){
                    if(elPrestamo.getIdEmpleado().equals(usuario.getIdUsuario()) ){
                        throw new UnsupportedOperationException("Prestamo asociado a usuario no permite eliminar");
                    }                
                }
                ArrayList<Multa> lasMultas = DAOMulta.obtenerTodasLasMultas();
                for(Multa laMulta : lasMultas){
                    if(laMulta.getIdUsuario().equals(usuario.getIdUsuario())){
                        throw new UnsupportedOperationException("Multa asociada a usuario no permite eliminar");
                    }
                }
                ArrayList<Solicitud> lasSolicitudes = DAOSolicitud.obtenerTodasLasSolicitudes();
                for(Solicitud laSolicitud : lasSolicitudes){
                    if(laSolicitud.getIdUsuario().equals(usuario.getIdUsuario())){
                        throw new UnsupportedOperationException("Solicitud asociada a usuario no permite eliminar");
                    }
                }
                
                ArrayList<Estudiante> losEstudiantes = DAOEstudiante.obtenerTodosLosEstudiantes();
                for(Estudiante elEstudiante : losEstudiantes){
                    if(elEstudiante.getIdUsuario().equals(usuario.getIdUsuario())){
                        
                        // Se elimina primero el estudiante y  luego el usuario
                        
                        ArrayList<Descarga> lasDescargas = DAODescarga.obtenerTodasLasDescargas();
                        for(Descarga laDescarga : lasDescargas){
                            if(laDescarga.getIdUsuario().equals(usuario.getIdUsuario())){
                                DAODescarga.eliminarDescarga(usuario.getIdUsuario());
                            }
                        }
                        DAOEstudiante.eliminarEstudiante(elEstudiante.getIdUsuario());
                        DAOUsuario.eliminarUsuario(usuario.getIdUsuario());
                        //throw new UnsupportedOperationException("Estudiante asociado a usuario no permite eliminar");
                    }
                }
                ArrayList<Profesor> losProfesores = DAOProfesor.obtenerTodosLosProfesores();
                for(Profesor elProfesor : losProfesores){
                    if(elProfesor.getIdUsuario().equals(usuario.getIdUsuario())){
                        ArrayList<ProfesorArea> lasAreas = DAOProfesorArea.obtenerTodosLosProfesorAreas();
                        //Primero se elimina el el area asociada al profesor
                        //luego al profesor
                        for(ProfesorArea elArea : lasAreas){
                            if(elArea.getIdUsuario().equals(elProfesor.getIdUsuario())){
                                DAOProfesorArea.eliminarProfesorArea(elArea.getIdUsuario());
                            }
                        }
                        ArrayList<Descarga> lasDescargas = DAODescarga.obtenerTodasLasDescargas();
                        for(Descarga laDescarga : lasDescargas){
                            if(laDescarga.getIdUsuario().equals(usuario.getIdUsuario())){
                                DAODescarga.eliminarDescarga(usuario.getIdUsuario());
                            }
                        }
                        DAOProfesor.eliminarProfesor(elProfesor.getIdUsuario());
                        DAOUsuario.eliminarUsuario(usuario.getIdUsuario());
                        
                    }
                }
    }
}
