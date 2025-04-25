/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic.appointment.system;
/**
 *
 * @author Aeron
 */
public class CancelAppointment extends javax.swing.JFrame {
    
    public CancelAppointment(String username) {
        initComponents();

    }
    // Constructor that accepts the username
    public CancelAppointment() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        toBook = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        toBook.setBackground(java.awt.SystemColor.control);
        toBook.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        toBook.setForeground(new java.awt.Color(10, 50, 80));
        toBook.setText("Start setting appointment again");
        toBook.setBorder(null);
        toBook.setContentAreaFilled(false);
        toBook.setFocusPainted(false);
        toBook.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBookActionPerformed(evt);
            }
        });
        jPanel2.add(toBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 460, 49));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 50, 80));
        jLabel3.setText("PAWHUB VET CLINIC");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 50));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 50, 80));
        jLabel10.setText("Appointment canceled!");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 790, 110));

        logout.setBackground(java.awt.SystemColor.control);
        logout.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        logout.setForeground(new java.awt.Color(10, 50, 80));
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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 86, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void toBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBookActionPerformed
          UserAppointment toadmin = new UserAppointment();
          toadmin.setVisible(true);
          toadmin.pack();
          toadmin.setLocationRelativeTo(null);
          this.dispose();
    }//GEN-LAST:event_toBookActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login1 toAdmin = new Login1();
        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(CancelAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CancelAppointment().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton toBook;
    // End of variables declaration//GEN-END:variables
}
