/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Busquedas;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.DAO.DAOUsuario;
import com.bliblioteca.proyectobasesdedatos.GUI.BibliotecaJFrame;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones.ModificarSolicitud;
import com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones.ModificarUsuario;
import com.bliblioteca.proyectobasesdedatos.logica.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.quevedo
 */
public class BuscarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    private DefaultComboBoxModel comboBoxModelBuscarUsuario;
    private DefaultTableModel tableModelBuscarUsuario;
    private Controlador controlador;
    public BuscarUsuario(Controlador controlador) {
        this.controlador = controlador;
        tableModelBuscarUsuario = new DefaultTableModel();  
        comboBoxModelBuscarUsuario = new DefaultComboBoxModel();
        controlador.llenarTablaBuscarUsuario(tableModelBuscarUsuario);
        controlador.llenarComboBoxBuscarUsuario(comboBoxModelBuscarUsuario);
        Object[] columnas = {"ID_USUARIO","NOMBRE", "TELEFONO","DIRECCION","EMAIL"};
        tableModelBuscarUsuario.setColumnIdentifiers(columnas);
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
        botonEditarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonBuscarUsuario = new javax.swing.JButton();
        botonEliminarUsuario = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Buscar Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("ID Usuario :");

        botonEditarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonEditarUsuario.setText("Editar");
        botonEditarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarUsuarioMouseClicked(evt);
            }
        });
        botonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarUsuarioActionPerformed(evt);
            }
        });

        jTable1.setModel(tableModelBuscarUsuario);
        jScrollPane1.setViewportView(jTable1);

        botonBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonBuscarUsuario.setText("Buscar");
        botonBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarUsuarioMouseClicked(evt);
            }
        });
        botonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarUsuarioActionPerformed(evt);
            }
        });

        botonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonEliminarUsuario.setText("Eliminar");
        botonEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarUsuarioMouseClicked(evt);
            }
        });
        botonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarUsuarioActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox1.setModel(comboBoxModelBuscarUsuario);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarUsuarioActionPerformed

    private void botonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarUsuarioActionPerformed

    private void botonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarUsuarioActionPerformed

    private void botonBuscarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarUsuarioMouseClicked
        if(jComboBox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un id usuario");
        }
        else{
            String idUsuario = (String) jComboBox1.getSelectedItem();
            Usuario usuarioEncontrado = controlador.buscarUsuario(idUsuario);
            Object[] filas = new Object[5];
            tableModelBuscarUsuario.setRowCount(0);
            filas[0] = usuarioEncontrado.getIdUsuario();
            filas[1] = usuarioEncontrado.getNombreUsuario();
            filas[2] = usuarioEncontrado.getTelUsuario();
            filas[3] = usuarioEncontrado.getDirUsuario();
            filas[4] = usuarioEncontrado.getEmailUsuario();
            tableModelBuscarUsuario.addRow(filas);
            
        }
    }//GEN-LAST:event_botonBuscarUsuarioMouseClicked

    private void botonEliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarUsuarioMouseClicked
        int filaSeleccionada = jTable1.getSelectedRow();
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null,"Seleccione una fila de la tabla...");
            
        }
        else if(jTable1.getSelectedRows().length >1){
            JOptionPane.showMessageDialog(null,"Seleccione SOLO UNA fila...");
        }
        else{
            int columnas = jTable1.getColumnCount();
            Object[] valores = new Object[columnas];

            for (int columna = 0; columna < columnas; columna++) {
                valores[columna] = jTable1.getValueAt(filaSeleccionada, columna);
            }

            
            Usuario usuarioAEliminar = new Usuario((String)valores[0], "", (String)valores[1],(String) valores[2], (String)valores[3], (String)valores[4]);
            try{
                controlador.eliminarObjeto(usuarioAEliminar);
                JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO");
            }
            catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        
    }//GEN-LAST:event_botonEliminarUsuarioMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        controlador.llenarTablaBuscarUsuario(tableModelBuscarUsuario);
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonEditarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarUsuarioMouseClicked
        BibliotecaJFrame.ShowPanel(new ModificarUsuario(controlador));
    }//GEN-LAST:event_botonEditarUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarUsuario;
    private javax.swing.JButton botonEditarUsuario;
    private javax.swing.JButton botonEliminarUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
