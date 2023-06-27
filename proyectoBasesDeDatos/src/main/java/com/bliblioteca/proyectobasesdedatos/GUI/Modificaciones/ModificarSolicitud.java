/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.logica.Solicitud;
import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.quevedo
 */
public class ModificarSolicitud extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    public ModificarSolicitud() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboModificarUsuarioSolicitud = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoModificarNumSolicitud = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoModificarTituloSolicitud = new javax.swing.JTextField();
        campoModificarISBNSolicitud = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoModificarFechaSolicitud = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoModificarDescripcioSolicitud = new javax.swing.JTextArea();
        botonModificarSolicitud = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Modificar Solicitud");

        comboModificarUsuarioSolicitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboModificarUsuarioSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModificarUsuarioSolicitudActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un usuario:");

        jLabel3.setText("Solicitud Nro:");

        campoModificarNumSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarNumSolicitudActionPerformed(evt);
            }
        });

        jLabel4.setText("Título del libro:");

        campoModificarISBNSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarISBNSolicitudActionPerformed(evt);
            }
        });

        jLabel5.setText("ISBN del libro:");

        jLabel6.setText("Fecha:");

        campoModificarFechaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarFechaSolicitudActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion:");

        campoModificarDescripcioSolicitud.setColumns(20);
        campoModificarDescripcioSolicitud.setRows(5);
        jScrollPane1.setViewportView(campoModificarDescripcioSolicitud);

        botonModificarSolicitud.setText("Modificar");
        botonModificarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoModificarISBNSolicitud)
                                        .addComponent(comboModificarUsuarioSolicitud, 0, 194, Short.MAX_VALUE)
                                        .addComponent(campoModificarTituloSolicitud))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addComponent(campoModificarNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(campoModificarFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonModificarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoModificarNumSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoModificarFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboModificarUsuarioSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoModificarTituloSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarISBNSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonModificarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents
    private DefaultComboBoxModel comboBoxModelCrearSolicitudIDUS;
    private String idEmpleado;
    private Controlador controlador;
    public ModificarSolicitud(Controlador controlador, String idEmpleado) {
        this.controlador = controlador;
        this.idEmpleado = idEmpleado;
        comboBoxModelCrearSolicitudIDUS = new DefaultComboBoxModel();
        controlador.llenarComboBoxAgregarSolicitud(comboBoxModelCrearSolicitudIDUS);
        initComponents();
    }
    private void comboModificarUsuarioSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModificarUsuarioSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboModificarUsuarioSolicitudActionPerformed

    private void campoModificarNumSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarNumSolicitudActionPerformed
        String size = campoModificarNumSolicitud.getText();
        if(size.length()>10){
            campoModificarNumSolicitud.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 10 caracteres");
        }
    }//GEN-LAST:event_campoModificarNumSolicitudActionPerformed

    private void campoModificarISBNSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarISBNSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModificarISBNSolicitudActionPerformed

    private void botonModificarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSolicitudActionPerformed
        if(comboModificarUsuarioSolicitud.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un id usuario");
        }
        else{
            String nSolicitud = campoModificarNumSolicitud.getText();
            String date = campoModificarFechaSolicitud.getText();
            String id_usuario = (String)comboModificarUsuarioSolicitud.getSelectedItem();
            String titulo_libro = campoModificarTituloSolicitud.getText();
            String ISBN = campoModificarISBNSolicitud.getText();
            String descripcion = campoModificarDescripcioSolicitud.getText();
            Date fecha;
            try{
                fecha = controlador.convertirStringADate(date);
                Solicitud laSolicitud = new Solicitud(nSolicitud, titulo_libro, fecha, descripcion, ISBN, idEmpleado, id_usuario);
                controlador.editarSolicitud(laSolicitud);
                JOptionPane.showMessageDialog(null, "Solicitud modificada con exito");
            }
            catch(ParseException e){
                JOptionPane.showMessageDialog(null, "Formato de fecha no valido");
            }



        }
    }//GEN-LAST:event_botonModificarSolicitudActionPerformed

    private void campoModificarFechaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarFechaSolicitudActionPerformed
        campoModificarFechaSolicitud.setText("");
        campoModificarFechaSolicitud.setBackground(Color.BLACK);
    }//GEN-LAST:event_campoModificarFechaSolicitudActionPerformed

    private void CampoModificarNumSolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNumSolicitudKeyReleased
        String size = campoModificarNumSolicitud.getText();
        if(size.length()>10){
            campoModificarNumSolicitud.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 10 caracteres");
        }
    }//GEN-LAST:event_campoNumSolicitudKeyReleased

    private void CampoModificarTituloSolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTituloKeyReleased
        String size = campoModificarTituloSolicitud.getText();
        if(size.length()>500){
            campoModificarTituloSolicitud.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 500 caracteres");
        }
    }//GEN-LAST:event_campoTituloKeyReleased

    private void CampoModificarISBNSolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoISBNKeyReleased
        String size = campoModificarISBNSolicitud.getText();
        if(size.length()>13){
            campoModificarISBNSolicitud.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 13 caracteres");
        }
    }//GEN-LAST:event_campoISBNKeyReleased

    private void CampoModificarDescripcioSolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDescripcionKeyReleased
        String size = campoModificarDescripcioSolicitud.getText();
        if(size.length()>500){
            campoModificarDescripcioSolicitud.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 500 caracteres");
        }
    }//GEN-LAST:event_campoDescripcionKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarSolicitud;
    private javax.swing.JTextArea campoModificarDescripcioSolicitud;
    private javax.swing.JTextField campoModificarFechaSolicitud;
    private javax.swing.JTextField campoModificarISBNSolicitud;
    private javax.swing.JTextField campoModificarNumSolicitud;
    private javax.swing.JTextField campoModificarTituloSolicitud;
    private javax.swing.JComboBox<String> comboModificarUsuarioSolicitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
