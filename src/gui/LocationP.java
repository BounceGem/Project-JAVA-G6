package gui;

import javax.swing.*;
import model.*;

public class LocationP extends javax.swing.JFrame {

    
    public LocationP() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nextLB = new javax.swing.JButton();
        quitLB4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Location [Facility Management]");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(400, 120));
        setPreferredSize(new java.awt.Dimension(800, 624));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(51, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GYM", "CB1", "CB2", "CB3", "CB4", "CB5", "SIT BUILDING", "FIBO BUILDING" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("CHOOSE LOCATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        nextLB.setBackground(new java.awt.Color(102, 255, 204));
        nextLB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        nextLB.setForeground(new java.awt.Color(204, 51, 0));
        nextLB.setText("NEXT");
        nextLB.setToolTipText("");
        getContentPane().add(nextLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 100, 30));

        quitLB4.setBackground(new java.awt.Color(102, 255, 204));
        quitLB4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        quitLB4.setForeground(new java.awt.Color(204, 51, 0));
        quitLB4.setText("BACK");
        quitLB4.setToolTipText("");
        quitLB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitLB4ActionPerformed(evt);
            }
        });
        getContentPane().add(quitLB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("REPAIR & FINANCE ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(51, 255, 204));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REPAIR", "FINANCE" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, 36));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Add Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 110, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/map.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitLB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitLB4ActionPerformed
        LoginP LiP = new LoginP();
        LiP.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LiP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quitLB4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LocationP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocationP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocationP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocationP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocationP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextLB;
    private javax.swing.JButton quitLB4;
    // End of variables declaration//GEN-END:variables
}
