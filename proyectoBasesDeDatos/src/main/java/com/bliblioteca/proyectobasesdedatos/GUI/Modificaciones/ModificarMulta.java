/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI.Modificaciones;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import com.bliblioteca.proyectobasesdedatos.GUI.Crear.*;
import com.bliblioteca.proyectobasesdedatos.logica.Multa;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author juan.quevedo
 */
public class ModificarMulta extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud
     */
    DefaultComboBoxModel comboBoxModelCrearMultaIdUs,comboBoxModelCrearMultaISBN;
    public ModificarMulta() {
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
        jLabel3 = new javax.swing.JLabel();
        campoModificarNumMulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoModificarFechaMulta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoModificarDescripcion = new javax.swing.JTextArea();
        botonModificarMulta = new javax.swing.JButton();
        campoModificarValorMulta = new javax.swing.JTextField();
        jComboBox_id_usuario = new javax.swing.JComboBox<>();
        jComboBox_isbn = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(460, 430));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Modificar Multa");

        jLabel2.setText("Valor Multa:");

        jLabel3.setText("Multa Nro:");

        campoModificarNumMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarNumMultaActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Usuario:");

        jLabel5.setText("ISBN del libro:");

        jLabel6.setText("Fecha:");

        campoModificarFechaMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarFechaMultaActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion:");

        campoModificarDescripcion.setColumns(20);
        campoModificarDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoModificarDescripcion);

        botonModificarMulta.setText("Modificar");
        botonModificarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarMultaActionPerformed(evt);
            }
        });

        campoModificarValorMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModificarValorMultaActionPerformed(evt);
            }
        });

        jComboBox_id_usuario.setModel(comboBoxModelCrearMultaIdUs);

        jComboBox_isbn.setModel(comboBoxModelCrearMultaISBN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonModificarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoModificarNumMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoModificarValorMulta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(campoModificarFechaMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox_id_usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_isbn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoModificarNumMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoModificarFechaMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoModificarValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox_id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jComboBox_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonModificarMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private DefaultComboBoxModel comboBoxModelCrearMultaIdUs, comboBoxModelCrearMultaISBN;
    private Controlador controlador;

    public ModificarMulta(Controlador controlador) {
        this.controlador = controlador;
        comboBoxModelCrearMultaIdUs = new DefaultComboBoxModel();
        comboBoxModelCrearMultaISBN = new DefaultComboBoxModel();
        controlador.llenarComboBoxAgregarMulta(comboBoxModelCrearMultaIdUs, true);
        controlador.llenarComboBoxAgregarMulta(comboBoxModelCrearMultaISBN, false);
        initComponents();


    }
    private void campoModificarNumMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarNumMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModificarNumMultaActionPerformed

    private void botonModificarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarMultaActionPerformed
        if(jComboBox_id_usuario.getSelectedIndex() == 0 || jComboBox_isbn.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un id usuario y/o ISBN");
        }
        else{
            if(!(campoModificarNumMulta.getText().equals("")||campoModificarFechaMulta.getText().equals("")||campoModificarDescripcion.getText().equals(""))){
                String nMulta = campoModificarNumMulta.getText();
                String date = campoModificarFechaMulta.getText();
                String descripcion = campoModificarDescripcion.getText();
                if(controlador.esEntero(campoModificarValorMulta.getText())){
                    int valor = Integer.parseInt(campoModificarValorMulta.getText());
                    String idUsuario = (String)jComboBox_id_usuario.getSelectedItem();
                    String ISBN = (String) jComboBox_isbn.getSelectedItem();
                    Date fecha;
                    try{
                        fecha = controlador.convertirStringADate(date);
                        String numero = controlador.obtenerNEjemplarByISBNIdUsu(ISBN, idUsuario);
                        Multa multa = new Multa(nMulta, valor, fecha, descripcion, ISBN, numero, idUsuario);
                        controlador.agregarObjeto(multa);
                        JOptionPane.showMessageDialog(null, "Multa modificada con exito");
                    }
                    catch(ParseException e){
                        JOptionPane.showMessageDialog(null, "Formato de fecha no valido 'DD-MM-YYYY'");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "El valor para la multa debe ser un entero");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Asegurse de llenar todos los campos");
            }

        }
    }//GEN-LAST:event_botonModificarMultaActionPerformed

    private void campoModificarFechaMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarFechaMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModificarFechaMultaActionPerformed

    private void campoModificarValorMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModificarValorMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModificarValorMultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarMulta;
    private javax.swing.JTextArea campoModificarDescripcion;
    private javax.swing.JTextField campoModificarFechaMulta;
    private javax.swing.JTextField campoModificarNumMulta;
    private javax.swing.JTextField campoModificarValorMulta;
    private javax.swing.JComboBox<String> jComboBox_id_usuario;
    private javax.swing.JComboBox<String> jComboBox_isbn;
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
