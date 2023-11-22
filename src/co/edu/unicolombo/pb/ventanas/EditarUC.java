/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicolombo.pb.ventanas;

import co.edu.unicolombo.pb.entidades.UsuarioC;
import co.edu.unicolombo.pb.persistencia.Almacenamiento;
import static co.edu.unicolombo.pb.ventanas.PerfilUsuario.etqCorreo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Ramos
 */
public class EditarUC extends javax.swing.JFrame {

    /**
     * Creates new form EditarUC
     */
    public EditarUC() {
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

        etqNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoExperienciaLaboral = new javax.swing.JTextField();
        campoProfesion = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etqNombre.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        etqNombre.setText("Nombre completo:");

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        jLabel7.setText("Cedula:");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        jLabel5.setText("Profesion:");

        jLabel10.setFont(new java.awt.Font("Sitka Display", 0, 20)); // NOI18N
        jLabel10.setText("Experiencia Laboral:");

        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqNombre)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoExperienciaLaboral)
                            .addComponent(campoProfesion)
                            .addComponent(campoNombre)
                            .addComponent(campoCorreo)
                            .addComponent(campoCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoExperienciaLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38)
                .addComponent(btnGuardar)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String correo = campoCorreo.getText();
     
       PerfilUsuario u = new  PerfilUsuario();
        u.setLocationRelativeTo(null);
      
        if (UsuarioC.candidato.containsKey(correo)) {
           UsuarioC e = UsuarioC.candidato.get(correo);
           
           e.nombre = campoNombre.getText();
           e.cedula = campoCedula.getText();
           e.experiencia_laboral = campoExperienciaLaboral.getText();
           e.profesion = campoProfesion.getText();
           
            UsuarioC.candidato.put(correo, e);
            
           
            
             try {
            Almacenamiento.guardarUC(UsuarioC.candidato);
            JOptionPane.showMessageDialog(this, "Sus datos han sido editados con exito...");
        } catch (IOException error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        
       
        } 
            PerfilUsuario.etqNombre.setText(e.nombre);
            PerfilUsuario.etqCedula.setText(e.cedula);
            PerfilUsuario.etqProfesion.setText(e.profesion);
            PerfilUsuario.etqCorreo.setText(e.correo);
            PerfilUsuario.etqExperiencia.setText(e.experiencia_laboral);    
        }
        
            dispose();
         
        u.setVisible(true);
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    public static javax.swing.JTextField campoCedula;
    public static javax.swing.JTextField campoCorreo;
    public static javax.swing.JTextField campoExperienciaLaboral;
    public static javax.swing.JTextField campoNombre;
    public static javax.swing.JTextField campoProfesion;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
