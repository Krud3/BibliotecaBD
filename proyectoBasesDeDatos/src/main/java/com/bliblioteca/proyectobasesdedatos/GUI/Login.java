/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bliblioteca.proyectobasesdedatos.GUI;

import com.bliblioteca.proyectobasesdedatos.Control.Controlador;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JSMC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private static JFrame main_frame;
    private static Controlador controlador;
    public Login(Controlador controlador) {
        
        initComponents();
        this.controlador =controlador;
        main_frame = new BibliotecaJFrame(controlador);
        this.setLocationRelativeTo(null);
    }
    public static void actualizarControladorLogin(Controlador controlador){
        Login.controlador = controlador;
        main_frame = new BibliotecaJFrame(Login.controlador);
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
        jTextField_id_usuario = new javax.swing.JTextField();
        jPasswordField_pass_usuario = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setText("Usuario:");

        jLabel3.setText(" Clave:");

        jTextField_id_usuario.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_id_usuario.setText("Por favor escriba su usuario");
        jTextField_id_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField_id_usuarioMousePressed(evt);
            }
        });

        jPasswordField_pass_usuario.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField_pass_usuario.setText("jPasswordField1");
        jPasswordField_pass_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField_pass_usuarioMousePressed(evt);
            }
        });

        jButton1.setText("Cancelar");
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

        jButton2.setText("Entrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_id_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jPasswordField_pass_usuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(233, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField_pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(232, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_id_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_id_usuarioMousePressed
        if(jTextField_id_usuario.getText().equals("Por favor escriba su usuario")){
            jTextField_id_usuario.setText("");
            jTextField_id_usuario.setForeground(Color.BLACK);
        }
        if(String.valueOf(jPasswordField_pass_usuario.getPassword()).isEmpty()){
            jPasswordField_pass_usuario.setText("jPasswordField1");
            jPasswordField_pass_usuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTextField_id_usuarioMousePressed

    private void jPasswordField_pass_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_pass_usuarioMousePressed
        if(String.valueOf(jPasswordField_pass_usuario.getPassword()).equals("jPasswordField1")){
            jPasswordField_pass_usuario.setText("");
            jPasswordField_pass_usuario.setForeground(Color.BLACK);
        }
        if(jTextField_id_usuario.getText().isEmpty()){
            jTextField_id_usuario.setText("Por favor escriba su usuario");
            jTextField_id_usuario.setForeground(Color.GRAY);
            
        }
    }//GEN-LAST:event_jPasswordField_pass_usuarioMousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        main_frame.setVisible(true);
        /*
        actualizarControladorLogin(controlador);
        String idEmString = jTextField_id_usuario.getText();
        String pass = String.valueOf(jPasswordField_pass_usuario.getPassword());
        if(controlador.validarPasswordEmpleado(idEmString, pass)){
            actualizarControladorLogin(controlador);
            main_frame.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o clave invalido");
        }
        */
        
    }//GEN-LAST:event_jButton2MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField_pass_usuario;
    private javax.swing.JTextField jTextField_id_usuario;
    // End of variables declaration//GEN-END:variables
}
