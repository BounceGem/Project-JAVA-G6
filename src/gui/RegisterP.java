package gui;

import javax.swing.*;
import model.*;

public class RegisterP extends javax.swing.JFrame {

    public RegisterP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailRF = new javax.swing.JTextField();
        cPasswordRF = new javax.swing.JPasswordField();
        passwordRF = new javax.swing.JPasswordField();
        usernameRF = new javax.swing.JTextField();
        firstnameRF = new javax.swing.JTextField();
        lastnameRF = new javax.swing.JTextField();
        addressRF = new javax.swing.JTextField();
        signupRB = new javax.swing.JButton();
        resetRB = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 590));
        setMinimumSize(new java.awt.Dimension(800, 590));
        setPreferredSize(new java.awt.Dimension(800, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setText("REGISTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("FIRSTNAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setText("LASTNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setText("E-MAIL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel7.setText("PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        emailRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRFActionPerformed(evt);
            }
        });
        getContentPane().add(emailRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 280, 30));
        getContentPane().add(cPasswordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 280, 30));
        getContentPane().add(passwordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 280, 30));

        usernameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRFActionPerformed(evt);
            }
        });
        getContentPane().add(usernameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 280, 30));

        firstnameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameRFActionPerformed(evt);
            }
        });
        getContentPane().add(firstnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 280, 30));

        lastnameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameRFActionPerformed(evt);
            }
        });
        getContentPane().add(lastnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 280, 30));

        addressRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressRFActionPerformed(evt);
            }
        });
        getContentPane().add(addressRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 280, 30));

        signupRB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signupRB.setText("Sign up");
        signupRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupRBActionPerformed(evt);
            }
        });
        getContentPane().add(signupRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 133, 42));

        resetRB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetRB.setText("Reset");
        resetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRBActionPerformed(evt);
            }
        });
        getContentPane().add(resetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 133, 42));

        jRadioButton1.setText("Staff");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRFActionPerformed

    private void usernameRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRFActionPerformed

    private void firstnameRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameRFActionPerformed

    private void lastnameRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameRFActionPerformed

    private void addressRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressRFActionPerformed

    private void signupRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupRBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_signupRBActionPerformed

    private void resetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetRBActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressRF;
    private javax.swing.JPasswordField cPasswordRF;
    private javax.swing.JTextField emailRF;
    private javax.swing.JTextField firstnameRF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField lastnameRF;
    private javax.swing.JPasswordField passwordRF;
    private javax.swing.JButton resetRB;
    private javax.swing.JButton signupRB;
    private javax.swing.JTextField usernameRF;
    // End of variables declaration//GEN-END:variables
}
