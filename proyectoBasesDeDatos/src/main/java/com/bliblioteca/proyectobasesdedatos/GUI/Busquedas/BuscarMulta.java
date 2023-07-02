/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Busquedas;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.BibliotecaJFrame;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones.ModificarLibro;
import com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones.ModificarMulta;
import com.bliblioteca.proyectobasesdedatos.logica.Multa;
import com.bliblioteca.proyectobasesdedatos.logica.Prestamo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.quevedo
 */
public class BuscarMulta extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    private DefaultComboBoxModel modelComboBoxBuscarMulta;
    private DefaultTableModel tableModelBuscarMulta;
    private Controlador controlador;
    public BuscarMulta(Controlador controlador) {
        this.controlador = controlador;
        tableModelBuscarMulta = new DefaultTableModel();
        modelComboBoxBuscarMulta = new DefaultComboBoxModel();
        controlador.llenarComboBoxBuscarMulta(modelComboBoxBuscarMulta);
        controlador.llenarTablaBuscarMulta(tableModelBuscarMulta);

        Object[] columnas = {"N_MULTA","VALOR", "FECHA","DESCRIPCION","ISBN","NUMERO", "ID_USUARIO"};
        tableModelBuscarMulta.setColumnIdentifiers(columnas);
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
        botonEditarMulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonBuscarMulta = new javax.swing.JButton();
        botonEliminarMulta = new javax.swing.JButton();
        jComboBoxIdMulta = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Buscar Multa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Número de Multa:");

        botonEditarMulta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonEditarMulta.setText("Editar");
        botonEditarMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarMultaMouseClicked(evt);
            }
        });
        botonEditarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarMultaActionPerformed(evt);
            }
        });

        jTable1.setModel(tableModelBuscarMulta);
        jScrollPane1.setViewportView(jTable1);

        botonBuscarMulta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonBuscarMulta.setText("Buscar");
        botonBuscarMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMultaMouseClicked(evt);
            }
        });
        botonBuscarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarMultaActionPerformed(evt);
            }
        });

        botonEliminarMulta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonEliminarMulta.setText("Eliminar");
        botonEliminarMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMultaMouseClicked(evt);
            }
        });
        botonEliminarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMultaActionPerformed(evt);
            }
        });

        jComboBoxIdMulta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBoxIdMulta.setModel(modelComboBoxBuscarMulta);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Mostrar todos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxIdMulta, 0, 274, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEditarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEliminarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxIdMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEditarMultaActionPerformed

    private void botonBuscarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarMultaActionPerformed

    private void botonEliminarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarMultaActionPerformed

    private void botonBuscarMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMultaMouseClicked
        if(jComboBoxIdMulta.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un numero de multa");
        }
        else{
            String numPrestamo = (String) jComboBoxIdMulta.getSelectedItem();
            Multa solicitudEncontrada = controlador.buscarMulta(numPrestamo);
            Object[] filas = new Object[7];
            tableModelBuscarMulta.setRowCount(0);
            filas[0] = solicitudEncontrada.getnMulta();
            filas[1] = solicitudEncontrada.getValor();
            filas[2] = solicitudEncontrada.getFecha();
            filas[3] = solicitudEncontrada.getDescripcion();
            filas[4] = solicitudEncontrada.getISBN();
            filas[5] = solicitudEncontrada.getNumero();
            filas[6] = solicitudEncontrada.getIdUsuario();
            tableModelBuscarMulta.addRow(filas);
            
        }
    }//GEN-LAST:event_botonBuscarMultaMouseClicked

    private void botonEliminarMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMultaMouseClicked
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

            
            Multa solicitudAEliminar = new Multa();
            solicitudAEliminar.setnMulta((String)valores[0]);
            try{
                controlador.eliminarObjeto(solicitudAEliminar);
                JOptionPane.showMessageDialog(null, "MULTA ELIMINADA");
            }
            catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
      
    }//GEN-LAST:event_botonEliminarMultaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        controlador.llenarTablaBuscarMulta(tableModelBuscarMulta);
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonEditarMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMultaMouseClicked
        BibliotecaJFrame.ShowPanel(new ModificarMulta(controlador));
    }//GEN-LAST:event_botonEditarMultaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarMulta;
    private javax.swing.JButton botonEditarMulta;
    private javax.swing.JButton botonEliminarMulta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxIdMulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
