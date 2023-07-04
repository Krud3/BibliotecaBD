/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.Busquedas.BuscarLibro;
import com.bliblioteca.proyectobasesdedatos.GUI.Busquedas.BuscarMulta;
import com.bliblioteca.proyectobasesdedatos.GUI.Busquedas.BuscarPrestamo;
import com.bliblioteca.proyectobasesdedatos.GUI.Busquedas.BuscarSolicitud;
import com.bliblioteca.proyectobasesdedatos.GUI.Busquedas.BuscarUsuario;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.CrearLibro;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.CrearMulta;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.CrearPrestamo;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.CrearSolicitud;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.CrearUsuario;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author juan.quevedo
 */
public class BibliotecaJFrame extends javax.swing.JFrame {

    private static JPanel panel_buscar_libro,panel_buscar_multa,buscar_prestamo,buscar_solicitud,buscar_usuario,
            panel_crear_usuario, panel_crear_libro,panel_crear_multa,panel_crear_prestamo,panel_crear_solicitud;
    
    private String idEmpleado;
    /**
     * Creates new form BibliotecaJFrame
     */
    public BibliotecaJFrame(Controlador controlador, String idEmpleado) {
        this.idEmpleado = idEmpleado;
        panel_buscar_libro = new BuscarLibro(controlador, idEmpleado);
        panel_buscar_multa = new BuscarMulta(controlador, idEmpleado);
        buscar_prestamo = new BuscarPrestamo(controlador, idEmpleado);
        buscar_solicitud = new BuscarSolicitud(controlador, idEmpleado);
        buscar_usuario= new BuscarUsuario(controlador, idEmpleado);
        panel_crear_usuario= new CrearUsuario(controlador);
        panel_crear_libro = new CrearLibro(controlador, idEmpleado);
        panel_crear_multa = new CrearMulta(controlador);
        panel_crear_prestamo = new CrearPrestamo(controlador,idEmpleado);
        panel_crear_solicitud = new CrearSolicitud(controlador, idEmpleado);
        initComponents();
        this.setLocationRelativeTo(null);
        execute();
    }

    public static void ShowPanel(JPanel p){
        p.setSize(920, 860);
        p.setLocation(0, 0);        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 860));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        fondo.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 1090, 860));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void execute() {
        ImageIcon iconUsuario = new ImageIcon(getClass().getResource("/images/user.png"));
        ImageIcon iconSolicitud = new ImageIcon(getClass().getResource("/images/solicitud.png"));
        ImageIcon iconPrestamo = new ImageIcon(getClass().getResource("/images/prestamo.png"));
        ImageIcon iconMulta = new ImageIcon(getClass().getResource("/images/multa.png"));
        ImageIcon iconLibro = new ImageIcon(getClass().getResource("/images/libro.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/images/subMenu.png"));
        //  create submenu Usuario
        MenuItem agregarUsuario = new MenuItem(iconSubMenu, "Agregar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_crear_usuario);
            }
        });
        
        MenuItem buscarEditarUsuario = new MenuItem(iconSubMenu, "Buscar/Editar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(buscar_usuario);
            }
        });
        // menus de libro
        MenuItem agregarLibro = new MenuItem(iconSubMenu, "Agregar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_crear_libro);
            }
        });
        
        MenuItem buscarEditarLibro = new MenuItem(iconSubMenu, "Buscar/Editar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_buscar_libro);
            }
        });
        //menus de multa
        MenuItem agregarMulta = new MenuItem(iconSubMenu, "Agregar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_crear_multa);
            }
        });
        
        MenuItem buscarEditarMulta = new MenuItem(iconSubMenu, "Buscar/Editar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_buscar_multa);
            }
        });
        
        //menus de prestamo
        MenuItem agregarPrestamo = new MenuItem(iconSubMenu, "Agregar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_crear_prestamo);
            }
        });
        
        MenuItem buscarEditarPrestamo = new MenuItem(iconSubMenu, "Buscar/Editar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(buscar_prestamo);
            }
        });
        
        //menus de solicitud
        MenuItem agregarSolicitud = new MenuItem(iconSubMenu, "Agregar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(panel_crear_solicitud);
            }
        });
        
        MenuItem buscarEditarSolicitud = new MenuItem(iconSubMenu, "Buscar/Editar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShowPanel(buscar_solicitud);
            }
        });

        MenuItem menuSolicitud = new MenuItem(iconSolicitud, "Solicitud", null, agregarSolicitud, buscarEditarSolicitud);        
        MenuItem menuPrestamo = new MenuItem(iconPrestamo, "Prestamo", null, agregarPrestamo, buscarEditarPrestamo);        
        MenuItem menuMulta = new MenuItem(iconMulta, "Multa", null, agregarMulta, buscarEditarMulta);        
        MenuItem menuLibro = new MenuItem(iconLibro, "Libro", null, agregarLibro, buscarEditarLibro);        
        MenuItem menuUsuario = new MenuItem(iconUsuario, "Usuario", null, agregarUsuario, buscarEditarUsuario);
        addMenu(menuSolicitud, menuPrestamo, menuMulta,menuLibro,menuUsuario);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
