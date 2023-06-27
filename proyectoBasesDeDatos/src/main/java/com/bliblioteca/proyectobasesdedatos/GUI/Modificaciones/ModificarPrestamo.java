/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.logica.Ejemplar;
import com.bliblioteca.proyectobasesdedatos.logica.Prestamo;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.quevedo
 */

public class ModificarPrestamo extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    private DefaultComboBoxModel modelcomboboxisbn,modelComboboxusuario;
    public ModificarPrestamo() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoModificarFechaPrestamo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonModificarPrestamo = new javax.swing.JButton();
        campoModificarNumPrestamo = new javax.swing.JTextField();
        campoModificarFechaDevolucion = new javax.swing.JTextField();
        jComboBoxISBN = new javax.swing.JComboBox<>();
        jComboBoxUsuario = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Modificar Prestamo");

        jLabel2.setText("Fecha de devolución:");

        jLabel4.setText("ID Usuario:");

        jLabel5.setText("ISBN del libro:");

        jLabel6.setText("Fecha:");

        campoModificarFechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarFechaPrestamoActionPerformed(evt);
            }
        });

        jLabel7.setText("Prestamo Nro:");

        botonModificarPrestamo.setText("Modificar");
        botonModificarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPrestamoActionPerformed(evt);
            }
        });

        jComboBoxISBN.setModel(modelcomboboxisbn);

        jComboBoxUsuario.setModel(modelComboboxusuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 251, Short.MAX_VALUE)
                        .addComponent(botonModificarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(campoModificarFechaPrestamo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoModificarNumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoModificarFechaDevolucion)
                            .addComponent(jComboBoxISBN, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoModificarNumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campoModificarFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoModificarFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(botonModificarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private DefaultComboBoxModel comboBoxModelCrearPrestamo, comboBoxModelCrearPrestamoISBN;
    private String idEmpleado;
    private Controlador controlador;
    public ModificarPrestamo(Controlador controlador, String idEmpleado) {
        this.controlador = controlador;
        this.idEmpleado = idEmpleado;
        comboBoxModelCrearPrestamo = new DefaultComboBoxModel();
        comboBoxModelCrearPrestamoISBN = new DefaultComboBoxModel();
        controlador.llenarComboBoxAgregarPrestamo(comboBoxModelCrearPrestamo, true);
        controlador.llenarComboBoxAgregarPrestamo(comboBoxModelCrearPrestamoISBN, false);
        initComponents();


    }
    private void botonModificarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPrestamoActionPerformed
        if(jComboBoxUsuario.getSelectedIndex() == 0 || jComboBoxISBN.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un id usuario y/o ISBN");
        }
        else{
            String numPrestamo = campoModificarNumPrestamo.getText();
            String date = campoModificarFechaPrestamo.getText();
            String id_usuario = (String)jComboBoxUsuario.getSelectedItem();
            String ISBN = (String)jComboBoxISBN.getSelectedItem();
            Date fecha;
            try{
                fecha = controlador.convertirStringADate(date);
                Stack<Ejemplar> disponibles = controlador.obtenerEjemplaresDisponibles(ISBN);
                if(disponibles.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles para el prestamo");
                }
                else{
                    String numero = controlador.prestarUltimoEjemplar(disponibles).getNumero();
                    Prestamo prestamo = new Prestamo(numPrestamo, fecha, null, id_usuario, idEmpleado, ISBN, numero);
                    System.out.println("llegue aca");
                    controlador.agregarObjeto(prestamo);
                    JOptionPane.showMessageDialog(null, "Prestamo modificado con exito");
                }


            }
            catch(ParseException e){
                JOptionPane.showMessageDialog(null, "Formato de fecha no valido");
            }



        }
    }//GEN-LAST:event_botonModificarPrestamoActionPerformed

    private void campoModificarFechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarFechaPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModificarFechaPrestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarPrestamo;
    private javax.swing.JTextField campoModificarFechaDevolucion;
    private javax.swing.JTextField campoModificarFechaPrestamo;
    private javax.swing.JTextField campoModificarNumPrestamo;
    private javax.swing.JComboBox<String> jComboBoxISBN;
    private javax.swing.JComboBox<String> jComboBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
