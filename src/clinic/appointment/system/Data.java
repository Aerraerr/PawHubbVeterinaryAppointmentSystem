/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic.appointment.system;

import java.awt.List;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JTextField;
/**
 *
 * @author Aeron
 */
public class Data extends javax.swing.JFrame {
    
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfPetname;
    private javax.swing.JTextField tfBreed;
    private javax.swing.JTextField tfSex;
    private javax.swing.JTextField tfType;
    private javax.swing.JTextField tfAppoint;
    private javax.swing.JTextField tfVet;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfTime;
    
    public Data() {
        initComponents();

        

    }
    public Data(String username, String address,String number, String petname, String breed, String sex, String type,
                String appoint, String vet, String date, String time){
                initComponents();
        
        jtName.setText(username);
        jtAddress.setText(address);
        jtNumber.setText(number);
        jtPetname.setText(petname);
        jtBreed.setText(breed);
        jtSex.setText(sex);
        jtType.setText(type);
        jtappoint.setText(appoint);
        jtVet.setText(vet);
        jtDate.setText(date);
        jtTime.setText(time);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        EnteredName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtAddress = new javax.swing.JLabel();
        jtName = new javax.swing.JLabel();
        jtPetname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtNumber = new javax.swing.JLabel();
        jtBreed = new javax.swing.JLabel();
        jtType = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtVet = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtSex = new javax.swing.JLabel();
        jtTime = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jtappoint = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jtDate = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        editappointment = new javax.swing.JButton();
        addappointment1 = new javax.swing.JButton();
        toBook = new javax.swing.JButton();

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

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 50, 80));
        jLabel3.setText("PAWHUB VET CLINIC");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 50));

        EnteredName.setBackground(new java.awt.Color(255, 255, 255));
        EnteredName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EnteredName.setForeground(new java.awt.Color(10, 50, 80));
        EnteredName.setBorder(null);
        EnteredName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnteredNameActionPerformed(evt);
            }
        });
        jPanel2.add(EnteredName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, 350, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 50, 80));
        jLabel7.setText("Address :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 50, 80));
        jLabel8.setText("Appoinment Details");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 460, 90));

        jtAddress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtAddress.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 270, 50));

        jtName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtName.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 270, 50));

        jtPetname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtPetname.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtPetname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 280, 50));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 50, 80));
        jLabel9.setText("Name :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 70, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(10, 50, 80));
        jLabel15.setText("Type:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 100, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(10, 50, 80));
        jLabel16.setText("Contact # :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setText("Pet Information");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 350, 30));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel22.setText("Personal Information");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 350, 30));

        jtNumber.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtNumber.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 260, 50));

        jtBreed.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtBreed.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtBreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 260, 50));

        jtType.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtType.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 60, 50));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(10, 50, 80));
        jLabel17.setText("Pet Name :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 110, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(10, 50, 80));
        jLabel18.setText("Pet Breed : ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 110, 30));

        jtVet.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtVet.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 350, 50));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(10, 50, 80));
        jLabel19.setText("Veterinarian:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 280, 30));

        jtSex.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtSex.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 80, 50));

        jtTime.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jtTime.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 260, 50));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setText("Schedule of Appointment");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 420, 30));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(10, 50, 80));
        jLabel23.setText("Pet Gender:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 110, 30));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(10, 50, 80));
        jLabel24.setText("Time :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 290, 30));

        jtappoint.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jtappoint.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtappoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 350, 50));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel25.setText("Type of Appointment");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 420, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(10, 50, 80));
        jLabel26.setText("Selection of Appointment : ");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 280, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(10, 50, 80));
        jLabel27.setText("Date :");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 280, 30));

        jtDate.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jtDate.setForeground(new java.awt.Color(10, 50, 80));
        jPanel2.add(jtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 260, 50));

        logout1.setBackground(java.awt.SystemColor.control);
        logout1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        logout1.setForeground(new java.awt.Color(10, 50, 80));
        logout1.setText("Logout");
        logout1.setBorder(null);
        logout1.setContentAreaFilled(false);
        logout1.setFocusPainted(false);
        logout1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        jPanel2.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 760, 70, 30));

        editappointment.setBackground(java.awt.SystemColor.control);
        editappointment.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        editappointment.setForeground(new java.awt.Color(10, 50, 80));
        editappointment.setText("Edit Appointment");
        editappointment.setBorder(null);
        editappointment.setContentAreaFilled(false);
        editappointment.setFocusPainted(false);
        editappointment.setMargin(new java.awt.Insets(0, 0, 0, 0));
        editappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editappointmentActionPerformed(evt);
            }
        });
        jPanel2.add(editappointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 760, 230, 30));

        addappointment1.setBackground(java.awt.SystemColor.control);
        addappointment1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        addappointment1.setForeground(new java.awt.Color(10, 50, 80));
        addappointment1.setText("Add another Appointment");
        addappointment1.setBorder(null);
        addappointment1.setContentAreaFilled(false);
        addappointment1.setFocusPainted(false);
        addappointment1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        addappointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addappointment1ActionPerformed(evt);
            }
        });
        jPanel2.add(addappointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 760, 330, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 800));

        toBook.setBackground(java.awt.SystemColor.control);
        toBook.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        toBook.setForeground(new java.awt.Color(10, 50, 80));
        toBook.setText("Start setting appointment");
        toBook.setBorder(null);
        toBook.setContentAreaFilled(false);
        toBook.setFocusPainted(false);
        toBook.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toBookActionPerformed(evt);
            }
        });
        getContentPane().add(toBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 460, 49));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void EnteredNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnteredNameActionPerformed

    }//GEN-LAST:event_EnteredNameActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        Login1 toAdmin = new Login1();
        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        this.dispose();
        
        
    }//GEN-LAST:event_logout1ActionPerformed
    
    private void editappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editappointmentActionPerformed

        String name = jtName.getText();
        String address = jtAddress.getText();
        String number = jtNumber.getText();
        String petname = jtPetname.getText();
        String breed = jtBreed.getText();
        String sex = jtSex.getText();
        String type = jtType.getText();
        String appoint = jtappoint.getText();
        String vet = jtVet.getText();
        String date = jtDate.getText();
        String time = jtTime.getText();

        jtName.setText(name);
        jtAddress.setText(address);
        jtNumber.setText(number);
        jtPetname.setText(petname);
        jtBreed.setText(breed);
        jtSex.setText(sex);
        jtType.setText(type);
        jtappoint.setText(appoint);
        jtVet.setText(vet);
        jtDate.setText(date);
        jtTime.setText(time);
        
        UserAppointment toAdmin = new UserAppointment(name, address, number, petname, breed, sex, type, appoint, vet, date, time);
        toAdmin.setVisible(true);
        setVisible(false);

        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_editappointmentActionPerformed

    private void toBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toBookActionPerformed
        MainPage toadmin = new MainPage();
        toadmin.setVisible(true);
        toadmin.pack();
        toadmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_toBookActionPerformed

    private void addappointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addappointment1ActionPerformed
        String name = jtName.getText();
        UserAppointment toAdmin = new UserAppointment(name);

        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_addappointment1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                
                new Data().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnteredName;
    private javax.swing.JButton addappointment1;
    private javax.swing.JButton editappointment;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jtAddress;
    private javax.swing.JLabel jtBreed;
    private javax.swing.JLabel jtDate;
    private javax.swing.JLabel jtName;
    private javax.swing.JLabel jtNumber;
    private javax.swing.JLabel jtPetname;
    private javax.swing.JLabel jtSex;
    private javax.swing.JLabel jtTime;
    private javax.swing.JLabel jtType;
    private javax.swing.JLabel jtVet;
    private javax.swing.JLabel jtappoint;
    private javax.swing.JButton logout1;
    private javax.swing.JButton toBook;
    // End of variables declaration//GEN-END:variables

    private static class tfname {

        public tfname() {
        }
    }
}
