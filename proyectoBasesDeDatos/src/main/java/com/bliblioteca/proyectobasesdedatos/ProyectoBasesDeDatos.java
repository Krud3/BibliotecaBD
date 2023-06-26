/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bliblioteca.proyectobasesdedatos;

import com.bliblioteca.proyectobasesdedatos.DAO.DAOArea;
import com.bliblioteca.proyectobasesdedatos.DAO.DAOLibro;
import com.bliblioteca.proyectobasesdedatos.logica.Area;
import com.bliblioteca.proyectobasesdedatos.logica.Ejemplar;
import com.bliblioteca.proyectobasesdedatos.logica.Libro;

import static com.bliblioteca.proyectobasesdedatos.DAO.DAOEjemplar.obtenerEjemplarPorID;

/**
 *
 * @author juanm
 */
public class ProyectoBasesDeDatos {

    public static void main(String[] args) {
        System.out.println("Hello World!");

       Libro miLibroLunaDePluton = new Libro();
/*
       miLibroLunaDePluton.setISBN("1111111111");
       miLibroLunaDePluton.setCodArea("ARE0002");
        miLibroLunaDePluton.setCodigoEditorial("EDI0002");
        miLibroLunaDePluton.setIdEmpleado("EMP0002");
        miLibroLunaDePluton.setTituloLibro("Introducción a la Filosofia Natural");
        miLibroLunaDePluton.setAnioPublicacion(2016);
        miLibroLunaDePluton.setNumeroPaginas(201);
        miLibroLunaDePluton.setIdioma("Esperanto");
  */
        //DAOLibro.actualizarLibro(miLibroLunaDePluton);

        DAOLibro.eliminarLibro("1111111111");
    }
}
