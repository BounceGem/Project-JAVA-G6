package gui;

import java.awt.event.*;
import java.sql.*;
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 625));
        setMinimumSize(new java.awt.Dimension(800, 625));
        setPreferredSize(new java.awt.Dimension(800, 635));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameL.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        NameL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/facilityT.png"))); // NOI18N
        NameL.setText("Facility Management");
        NameL.setToolTipText("");
        getContentPane().add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 790, 80));

        usernameLIF.setBackground(new java.awt.Color(184, 218, 252));
        usernameLIF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usernameLIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameLIFKeyPressed(evt);
            }
        });
        getContentPane().add(usernameLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 280, 30));

        passwordLIF.setBackground(new java.awt.Color(184, 218, 252));
        passwordLIF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
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

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordLIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordLIFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nextP();
        }
    }//GEN-LAST:event_passwordLIFKeyPressed
    private void logiinLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logiinLIBActionPerformed
        nextP();
    }//GEN-LAST:event_logiinLIBActionPerformed
    private void signupLIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupLIBActionPerformed
        RegisterP su = new RegisterP();
        su.setDefaultCloseOperation(EXIT_ON_CLOSE);
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_signupLIBActionPerformed
    private void usernameLIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameLIFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nextP();
        }
    }//GEN-LAST:event_usernameLIFKeyPressed
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            passwordLIF.setEchoChar((char) 0);
        } else {
            passwordLIF.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public void nextP() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM `user` WHERE `username`=? AND `password`=?");
            ps.setString(1, usernameLIF.getText());
            ps.setString(2, String.valueOf(passwordLIF.getPassword()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User.orm(rs, user);
                LocationP lp02 = new LocationP();
                lp02.setDefaultCloseOperation(EXIT_ON_CLOSE);
                lp02.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Invalid", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginP().setVisible(true);
            }
        });
    }

    Connection con;
    PreparedStatement ps;
    public static User user = new User();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameL;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logiinLIB;
    private javax.swing.JPasswordField passwordLIF;
    private javax.swing.JButton signupLIB;
    private javax.swing.JTextField usernameLIF;
    // End of variables declaration//GEN-END:variables
}
