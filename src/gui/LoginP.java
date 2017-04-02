package gui;

import java.awt.event.*;
import javax.swing.*;
import model.*;

public class LoginP extends javax.swing.JFrame {

    public LoginP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameL = new javax.swing.JLabel();
        usernameLIF = new javax.swing.JTextField();
        passwordLIF = new javax.swing.JPasswordField();
        logiinLIB = new javax.swing.JButton();
        signupLIB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setPreferredSize(new java.awt.Dimension(800, 625));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameL.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        NameL.setText("Facility Management");
        NameL.setToolTipText("");
        getContentPane().add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 540, 80));

        usernameLIF.setBackground(new java.awt.Color(184, 218, 252));
        usernameLIF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usernameLIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLIFActionPerformed(evt);
            }
        });
        getContentPane().add(usernameLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        passwordLIF.setBackground(new java.awt.Color(184, 218, 252));
        passwordLIF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLIFActionPerformed(evt);
            }
        });
        passwordLIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordLIFKeyPressed(evt);
            }
        });
        getContentPane().add(passwordLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 280, 30));

        logiinLIB.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        logiinLIB.setForeground(new java.awt.Color(73, 73, 73));
        logiinLIB.setText("Login");
        logiinLIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logiinLIBActionPerformed(evt);
            }
        });
        getContentPane().add(logiinLIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, 30));

        signupLIB.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        signupLIB.setForeground(new java.awt.Color(73, 73, 73));
        signupLIB.setText("Sign up");
        signupLIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupLIBActionPerformed(evt);
            }
        });
        getContentPane().add(signupLIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 349, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameLIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLIFActionPerformed
        getContentPane().add(usernameLIF);
    }//GEN-LAST:event_usernameLIFActionPerformed

    private void passwordLIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLIFActionPerformed
        getContentPane().add(passwordLIF);
    }//GEN-LAST:event_passwordLIFActionPerformed

    private void passwordLIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordLIFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (usernameLIF.getText().equals("1") && passwordLIF.getText().equals("123")) {
                LocationP lp02 = new LocationP();
                lp02.setDefaultCloseOperation(EXIT_ON_CLOSE);
                lp02.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Invalid", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_passwordLIFKeyPressed

    private void logiinLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logiinLIBActionPerformed
        if (usernameLIF.getText().equals("1") && passwordLIF.getText().equals("123")) {
            LocationP lp01 = new LocationP();
            lp01.setDefaultCloseOperation(EXIT_ON_CLOSE);
            lp01.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_logiinLIBActionPerformed

    private void signupLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupLIBActionPerformed
        RegisterP su = new RegisterP();
        su.setDefaultCloseOperation(EXIT_ON_CLOSE);
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signupLIBActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logiinLIB;
    private javax.swing.JPasswordField passwordLIF;
    private javax.swing.JButton signupLIB;
    private javax.swing.JTextField usernameLIF;
    // End of variables declaration//GEN-END:variables
}
