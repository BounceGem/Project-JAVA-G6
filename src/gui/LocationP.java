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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nextLB = new javax.swing.JButton();
        quitLB4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 636));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setText("Location Page");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "loca1", "loca2", "loca3", "loca4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 192, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("เลือกสถานที่");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        nextLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextLB.setText("ถัดไป");
        getContentPane().add(nextLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 133, 42));

        quitLB4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quitLB4.setText("ออก");
        quitLB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitLB4ActionPerformed(evt);
            }
        });
        getContentPane().add(quitLB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 133, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("เลือกกิจกรรม");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ซ่อมแซม", "การเงิน" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 192, 36));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitLB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitLB4ActionPerformed
        System.exit(0);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextLB;
    private javax.swing.JButton quitLB4;
    // End of variables declaration//GEN-END:variables
}
