/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Crear;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.logica.Estudiante;
import com.bliblioteca.proyectobasesdedatos.logica.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.quevedo
 */
public class CrearEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    private Controlador controlador;
    private Usuario usuario;
    public CrearEstudiante(Controlador controlador, Usuario usuario) {
        this.controlador = controlador;
        this.usuario = usuario;
        
        initComponents();
        labelIdUsuario.setText(usuario.getIdUsuario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoCarrera = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botonGuardarEstudiante = new javax.swing.JButton();
        campoUniversidad = new javax.swing.JTextField();
        labelIdUsuario = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Crear Usuario - Estudiante");

        jLabel2.setText("Universidad:");

        jLabel4.setText("ID Usuario:");

        campoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCarreraActionPerformed(evt);
            }
        });
        campoCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoCarreraKeyReleased(evt);
            }
        });

        jLabel5.setText("Carrera:");

        botonGuardarEstudiante.setText("Guardar");
        botonGuardarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarEstudianteMouseClicked(evt);
            }
        });
        botonGuardarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarEstudianteActionPerformed(evt);
            }
        });

        campoUniversidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoUniversidadKeyReleased(evt);
            }
        });

        labelIdUsuario.setText("Id Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 251, Short.MAX_VALUE)
                        .addComponent(botonGuardarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campoUniversidad)
                            .addComponent(labelIdUsuario)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIdUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(campoUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(91, 159, Short.MAX_VALUE)))
                .addComponent(botonGuardarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCarreraActionPerformed

    private void botonGuardarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarEstudianteActionPerformed

    private void botonGuardarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarEstudianteMouseClicked
        if(campoUniversidad.getText().equals("")|| campoCarrera.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor llene los campos para continuar");
        }
        else{
            String carrera = campoCarrera.getText();
            String universidad =campoUniversidad.getText();
            controlador.agregarEstudiante(usuario, universidad, carrera);
            controlador.agregarObjeto(usuario);
            JOptionPane.showMessageDialog(null, "Estudiante agregado con exito");
            botonGuardarEstudiante.setEnabled(false);
            campoUniversidad.setEnabled(false);
            campoUniversidad.setEditable(false);
            campoCarrera.setEditable(false);
            campoCarrera.setEnabled(false);
        }
    }//GEN-LAST:event_botonGuardarEstudianteMouseClicked

    private void campoUniversidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUniversidadKeyReleased
        String size = campoUniversidad.getText();
        if(size.length()>100){
            campoUniversidad.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 100 caracteres");
        }
    }//GEN-LAST:event_campoUniversidadKeyReleased

    private void campoCarreraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCarreraKeyReleased
        String size = campoCarrera.getText();
        if(size.length()>100){
            campoCarrera.setText("");
            JOptionPane.showMessageDialog(null, "El campo no puede tener mas de 100 caracteres");
        }
    }//GEN-LAST:event_campoCarreraKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarEstudiante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCarrera;
    private javax.swing.JTextField campoUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelIdUsuario;
    // End of variables declaration//GEN-END:variables
}
