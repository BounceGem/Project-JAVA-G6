package gui;

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
        ProfileB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        actionCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        addLocaB = new javax.swing.JButton();
        quitLB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Management");
        setAlwaysOnTop(true);
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

        ProfileB.setBackground(new java.awt.Color(102, 255, 204));
        ProfileB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ProfileB.setForeground(new java.awt.Color(204, 51, 0));
        ProfileB.setText("PROFILE");
        ProfileB.setToolTipText("");
        ProfileB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBActionPerformed(evt);
            }
        });
        getContentPane().add(ProfileB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("REPAIR & FINANCE ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        actionCB.setBackground(new java.awt.Color(51, 255, 204));
        actionCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REPAIR", "FINANCE" }));
        getContentPane().add(actionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 36));

        jButton1.setText("Seminar B");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        jButton2.setText("Innovative B");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jButton3.setText("ENG B");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jButton4.setText("Dhamma2");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButton5.setText("Dhamma1");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jButton6.setText("EM workshop");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jButton7.setText("ENV");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jButton8.setText("CB3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jButton9.setText("CB4");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jButton10.setText("CB5");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jButton11.setText("ChemE B");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jButton12.setText("Me B");
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jButton13.setText("P 14");
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        jButton14.setText("UTO");
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        jButton15.setText("President B");
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jButton16.setText("Green S");
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jButton17.setText("Store");
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jButton18.setText("B&G div");
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jButton19.setText("ProductE B");
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jButton20.setText("CB1");
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jButton21.setText("CB2");
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jButton22.setText("Canteen");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jButton23.setText("HiVolt B");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jButton24.setText("Recycle B");
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jButton25.setText("Maintanance ");
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jButton26.setText("Plant");
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jButton27.setText("Sola");
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jButton28.setText("ChemB");
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        jButton29.setText("Phy B");
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, 20));

        jButton30.setText("Math B");
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        jButton31.setText("Sci center");
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jButton32.setText("Micro B");
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jButton33.setText("SciLab B");
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        jButton34.setText("Library");
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        jButton35.setText("Sit B");
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jButton36.setText("Fibo B");
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 180, -1));

        addLocaB.setBackground(new java.awt.Color(255, 204, 204));
        addLocaB.setForeground(new java.awt.Color(0, 153, 153));
        addLocaB.setText("Add Location");
        getContentPane().add(addLocaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 110, 30));

        quitLB.setBackground(new java.awt.Color(102, 255, 204));
        quitLB.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        quitLB.setForeground(new java.awt.Color(204, 51, 0));
        quitLB.setText("BACK");
        quitLB.setToolTipText("");
        quitLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitLBActionPerformed(evt);
            }
        });
        getContentPane().add(quitLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/map.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBActionPerformed
      UserP UsP = new UserP();
      UsP.setDefaultCloseOperation(EXIT_ON_CLOSE);
      UsP.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_ProfileBActionPerformed

    private void quitLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitLBActionPerformed
      LoginP LiP = new LoginP();
      LiP.setDefaultCloseOperation(EXIT_ON_CLOSE);
      LiP.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_quitLBActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

  public static void main(String args[]) {

    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
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
    private javax.swing.JButton ProfileB;
    private javax.swing.JComboBox<String> actionCB;
    private javax.swing.JButton addLocaB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextLB;
    private javax.swing.JButton quitLB;
    // End of variables declaration//GEN-END:variables

}
