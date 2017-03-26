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
        signupRB = new javax.swing.JButton();
        resetRB = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressA = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        quitLB4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 120));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 624));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setText("REGISTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 170, 60));

        jLabel1.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("STUDENT ID OR STAFF ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("LASTNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, -1));

        jLabel5.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("E-MAIL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 80, 30));

        emailRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRFActionPerformed(evt);
            }
        });
        getContentPane().add(emailRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 250, 30));

        cPasswordRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPasswordRFActionPerformed(evt);
            }
        });
        cPasswordRF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cPasswordRFKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cPasswordRFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPasswordRFKeyTyped(evt);
            }
        });
        getContentPane().add(cPasswordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 250, 30));

        passwordRF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordRFKeyReleased(evt);
            }
        });
        getContentPane().add(passwordRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 250, 30));

        usernameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRFActionPerformed(evt);
            }
        });
        getContentPane().add(usernameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, 30));

        firstnameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameRFActionPerformed(evt);
            }
        });
        getContentPane().add(firstnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 250, 30));

        lastnameRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameRFActionPerformed(evt);
            }
        });
        getContentPane().add(lastnameRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 250, 30));

        signupRB.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        signupRB.setText("Sign up");
        signupRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupRBActionPerformed(evt);
            }
        });
        getContentPane().add(signupRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 120, 40));

        resetRB.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        resetRB.setText("Reset");
        resetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetRBActionPerformed(evt);
            }
        });
        getContentPane().add(resetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 120, 40));

        jRadioButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jRadioButton1.setText("Staff");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("FIRSTNAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));
        getContentPane().add(IDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 250, 30));

        AddressA.setColumns(20);
        AddressA.setRows(5);
        jScrollPane1.setViewportView(AddressA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 250, 110));

        jLabel9.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("PASSWORD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Valken", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("RE-PASSWORD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        quitLB4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quitLB4.setText("Back");
        quitLB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitLB4ActionPerformed(evt);
            }
        });
        getContentPane().add(quitLB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, 40));

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

    private void signupRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupRBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_signupRBActionPerformed

    private void resetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetRBActionPerformed
        IDF.setText("");
        usernameRF.setText("");
        passwordRF.setText("");
        cPasswordRF.setText("");
        firstnameRF.setText("");
        lastnameRF.setText("");
        emailRF.setText("");
        AddressA.setText("");
    }//GEN-LAST:event_resetRBActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void passwordRFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordRFKeyReleased
        if (cPasswordRF.getText().equals(passwordRF.getText())) {
            jLabel7.setText("รหัสตรงกัน");
        }else{
            jLabel7.setText("รหัสไม่ตรงกัน");
        }
    }//GEN-LAST:event_passwordRFKeyReleased

    private void cPasswordRFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordRFKeyTyped

    }//GEN-LAST:event_cPasswordRFKeyTyped

    private void cPasswordRFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordRFKeyReleased
        if (cPasswordRF.getText().equals(passwordRF.getText())) {
            jLabel7.setText("รหัสตรงกัน");
        }else{
            jLabel7.setText("รหัสไม่ตรงกัน");
        }
    }//GEN-LAST:event_cPasswordRFKeyReleased

    private void cPasswordRFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordRFKeyPressed

    }//GEN-LAST:event_cPasswordRFKeyPressed

    private void cPasswordRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPasswordRFActionPerformed

    }//GEN-LAST:event_cPasswordRFActionPerformed

    private void quitLB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitLB4ActionPerformed
        LoginP LiP = new LoginP();
        LiP.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LiP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quitLB4ActionPerformed

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
    private javax.swing.JTextArea AddressA;
    private javax.swing.JTextField IDF;
    private javax.swing.JPasswordField cPasswordRF;
    private javax.swing.JTextField emailRF;
    private javax.swing.JTextField firstnameRF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastnameRF;
    private javax.swing.JPasswordField passwordRF;
    private javax.swing.JButton quitLB4;
    private javax.swing.JButton resetRB;
    private javax.swing.JButton signupRB;
    private javax.swing.JTextField usernameRF;
    // End of variables declaration//GEN-END:variables
}
