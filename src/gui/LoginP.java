package gui;

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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 636));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameL.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        NameL.setText("Facility Management");
        NameL.setToolTipText("");
        getContentPane().add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 540, 80));

        usernameLIF.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        usernameLIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLIFActionPerformed(evt);
            }
        });
        getContentPane().add(usernameLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 250, 30));

        passwordLIF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordLIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLIFActionPerformed(evt);
            }
        });
        getContentPane().add(passwordLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 250, 30));

        logiinLIB.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        logiinLIB.setText("Login");
        logiinLIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logiinLIBActionPerformed(evt);
            }
        });
        getContentPane().add(logiinLIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 100, 30));

        signupLIB.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        signupLIB.setText("Sign up");
        signupLIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupLIBActionPerformed(evt);
            }
        });
        getContentPane().add(signupLIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 100, 30));

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

    private void logiinLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logiinLIBActionPerformed
        if (usernameLIF.getText().equals("mildsadz") && passwordLIF.getText().equals("mildza789")) {
            LocationP lp = new LocationP();
            lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
            lp.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Invalid", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JButton logiinLIB;
    private javax.swing.JPasswordField passwordLIF;
    private javax.swing.JButton signupLIB;
    private javax.swing.JTextField usernameLIF;
    // End of variables declaration//GEN-END:variables
}
