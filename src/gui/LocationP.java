package gui;

import java.awt.event.*;
import javax.swing.*;
import model.*;

public class LocationP extends javax.swing.JFrame {

    public LocationP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LocaCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nextLB = new javax.swing.JButton();
        quitLB4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        actionCB = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        addLocaB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(800, 625));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LocaCB.setBackground(new java.awt.Color(51, 255, 204));
        LocaCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LocaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GYM", "CB1", "CB2", "CB3", "CB4", "CB5", "SIT BUILDING", "FIBO BUILDING" }));
        getContentPane().add(LocaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("OTHER LOCATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nextLB.setBackground(new java.awt.Color(102, 255, 204));
        nextLB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        nextLB.setForeground(new java.awt.Color(204, 51, 0));
        nextLB.setText("NEXT");
        nextLB.setToolTipText("");
        getContentPane().add(nextLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 100, 30));

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
        getContentPane().add(quitLB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("REPAIR & FINANCE ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        actionCB.setBackground(new java.awt.Color(51, 255, 204));
        actionCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REPAIR", "FINANCE" }));
        getContentPane().add(actionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 36));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 180, -1));

        addLocaB.setBackground(new java.awt.Color(255, 204, 204));
        addLocaB.setForeground(new java.awt.Color(0, 153, 153));
        addLocaB.setText("Add Location");
        getContentPane().add(addLocaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 110, 30));

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
    private javax.swing.JComboBox<String> LocaCB;
    private javax.swing.JComboBox<String> actionCB;
    private javax.swing.JButton addLocaB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextLB;
    private javax.swing.JButton quitLB4;
    // End of variables declaration//GEN-END:variables

}
