/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Busquedas;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.logica.Solicitud;
import com.bliblioteca.proyectobasesdedatos.logica.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.quevedo
 */
public class BuscarSolicitud extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    private DefaultComboBoxModel comboBoxModelBuscarSolicitud;
    private DefaultTableModel tableModelBuscarSolicitud;

    private Controlador controlador;
    public BuscarSolicitud(Controlador controlador) {
        this.controlador = controlador;
        tableModelBuscarSolicitud= new DefaultTableModel();
        comboBoxModelBuscarSolicitud = new DefaultComboBoxModel();
        controlador.llenarTablaBuscarSolicitud(tableModelBuscarSolicitud);
        controlador.llenarComboBoxBuscarSolicitud(comboBoxModelBuscarSolicitud);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonEditarSolicitud = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonBuscarSolicitud = new javax.swing.JButton();
        botonEliminarSolicitud = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Solicitud");

        jLabel2.setText("Número de Solcitud:");

        botonEditarSolicitud.setText("Editar");
        botonEditarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarSolicitudActionPerformed(evt);
            }
        });

        jTable1.setModel(tableModelBuscarSolicitud);
        jScrollPane1.setViewportView(jTable1);

        botonBuscarSolicitud.setText("Buscar");
        botonBuscarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarSolicitudMouseClicked(evt);
            }
        });
        botonBuscarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarSolicitudActionPerformed(evt);
            }
        });

        botonEliminarSolicitud.setText("Eliminar");
        botonEliminarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarSolicitudMouseClicked(evt);
            }
        });
        botonEliminarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarSolicitudActionPerformed(evt);
            }
        });

        jComboBox1.setModel(comboBoxModelBuscarSolicitud);

        jButton1.setText("Mostrar todos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEditarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonBuscarSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscarSolicitud)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarSolicitudActionPerformed

    private void botonBuscarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarSolicitudActionPerformed

    private void botonEliminarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarSolicitudActionPerformed

    private void botonBuscarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarSolicitudMouseClicked
        if(jComboBox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un numero de solicitud");
        }
        else{
            String numSolicitud = (String) jComboBox1.getSelectedItem();
            Solicitud solicitudEncontrada = controlador.buscarSolicitud(numSolicitud);
            Object[] filas = new Object[7];
            tableModelBuscarSolicitud.setRowCount(0);
            filas[0] = solicitudEncontrada.getNumeroSolicitud();
            filas[1] = solicitudEncontrada.getTituloLibro();
            filas[2] = solicitudEncontrada.getFecha();
            filas[3] = solicitudEncontrada.getDescripcion();
            filas[4] = solicitudEncontrada.getISBNSolicitud();
            filas[5] = solicitudEncontrada.getIdEmpleado();
            filas[6] = solicitudEncontrada.getIdUsuario();
            tableModelBuscarSolicitud.addRow(filas);
            
        }
    }//GEN-LAST:event_botonBuscarSolicitudMouseClicked

    private void botonEliminarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarSolicitudMouseClicked
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == 1) {
            int columnas = jTable1.getColumnCount();
            Object[] valores = new Object[columnas];

            for (int columna = 0; columna < columnas; columna++) {
                valores[columna] = jTable1.getValueAt(filaSeleccionada, columna);
            }

            
            Solicitud solicitudAEliminar = new Solicitud();
            solicitudAEliminar.setNumeroSolicitud((String)valores[0]);
            try{
                controlador.eliminarObjeto(solicitudAEliminar);
            }
            catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla para eliminar");
        }
    }//GEN-LAST:event_botonEliminarSolicitudMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        controlador.llenarTablaBuscarSolicitud(tableModelBuscarSolicitud);
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarSolicitud;
    private javax.swing.JButton botonEditarSolicitud;
    private javax.swing.JButton botonEliminarSolicitud;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}