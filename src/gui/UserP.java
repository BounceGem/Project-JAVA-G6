package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;

public class UserP extends javax.swing.JFrame {

    public UserP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Position");
        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 130, 40));

        jLabel3.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("ID");
        jLabel3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel3PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, 40));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Firstname");
        jLabel4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel4PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 140, 60));

        jLabel5.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Lastname");
        jLabel5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel5PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 160, 40));

        jLabel7.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Username");
        jLabel7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel7PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 60));

        jLabel8.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Role");
        jLabel8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel8PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 40));

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Mobile");
        jLabel9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel9PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 40));

        jLabel10.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("UserID :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("Username :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("Firstname :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Lastname :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Role : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText("Position :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText("Mobile :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/profile_teaser2.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 190, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ProfileText.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 40, 550, 100));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 80, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 255));
        jButton2.setText("Edit");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 80, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/tg6.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel3PropertyChange
        jLabel3.setText(String.valueOf(LoginP.user.getUserId()));
    }//GEN-LAST:event_jLabel3PropertyChange
    private void jLabel7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel7PropertyChange
        jLabel7.setText(LoginP.user.getUser());
    }//GEN-LAST:event_jLabel7PropertyChange
    private void jLabel4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel4PropertyChange
        jLabel4.setText(LoginP.user.getFirstName());
    }//GEN-LAST:event_jLabel4PropertyChange
  private void jLabel5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel5PropertyChange
      jLabel5.setText(LoginP.user.getLastName());
  }//GEN-LAST:event_jLabel5PropertyChange
  private void jLabel8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel8PropertyChange
      jLabel8.setText(LoginP.user.getRole());
  }//GEN-LAST:event_jLabel8PropertyChange
  private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange
      jLabel2.setText(LoginP.user.getPosition());
  }//GEN-LAST:event_jLabel2PropertyChange
  private void jLabel9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel9PropertyChange
      jLabel9.setText(LoginP.user.getMobile());
  }//GEN-LAST:event_jLabel9PropertyChange
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      LocationP lp02 = new LocationP();
      lp02.setDefaultCloseOperation(EXIT_ON_CLOSE);
      lp02.setVisible(true);
      this.setVisible(false);
  }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserP().setVisible(true);
            }
        });
    }

    Connection con;
    PreparedStatement ps;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
