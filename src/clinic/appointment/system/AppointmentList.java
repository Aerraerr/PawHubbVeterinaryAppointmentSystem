/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic.appointment.system;
/**
 *
 * @author Aeron
 */
public class AppointmentList extends javax.swing.JFrame {
    
    public AppointmentList(String username) {
        initComponents();
    }
    // Constructor that accepts the username
    public AppointmentList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        toDashboard2 = new javax.swing.JButton();
        toDashboard1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        EnteredName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 50, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAWHUB");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic/appointment/system/Paw3.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 20));

        logout.setBackground(java.awt.SystemColor.control);
        logout.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setContentAreaFilled(false);
        logout.setFocusPainted(false);
        logout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        toDashboard2.setBackground(java.awt.SystemColor.control);
        toDashboard2.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        toDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        toDashboard2.setText("Home");
        toDashboard2.setBorder(null);
        toDashboard2.setContentAreaFilled(false);
        toDashboard2.setFocusPainted(false);
        toDashboard2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDashboard2ActionPerformed(evt);
            }
        });

        toDashboard1.setBackground(java.awt.SystemColor.control);
        toDashboard1.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        toDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        toDashboard1.setText("Appointment");
        toDashboard1.setBorder(null);
        toDashboard1.setContentAreaFilled(false);
        toDashboard1.setFocusPainted(false);
        toDashboard1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDashboard1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toDashboard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toDashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157)
                .addComponent(toDashboard2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(toDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 800));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        jLabel6.setText("List of Appointment");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 630, 110));

        exit.setBackground(java.awt.SystemColor.control);
        exit.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        exit.setForeground(new java.awt.Color(204, 204, 204));
        exit.setText("x");
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 0, 40, 30));

        EnteredName.setBackground(new java.awt.Color(255, 255, 255));
        EnteredName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EnteredName.setForeground(new java.awt.Color(10, 50, 80));
        EnteredName.setText("Name");
        EnteredName.setBorder(null);
        EnteredName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnteredNameActionPerformed(evt);
            }
        });
        jPanel2.add(EnteredName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 250, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 240, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login1 toAdmin = new Login1();
        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed
    
    private void toDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toDashboard1ActionPerformed

    private void toDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDashboard2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toDashboard2ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void EnteredNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnteredNameActionPerformed

    }//GEN-LAST:event_EnteredNameActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AppointmentList().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnteredName;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton toDashboard1;
    private javax.swing.JButton toDashboard2;
    // End of variables declaration//GEN-END:variables
}
