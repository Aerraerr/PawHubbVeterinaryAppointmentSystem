/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic.appointment.system;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aeron
 */
class AppointmentData {
    protected String name;
    protected String address;
    protected String number;
    protected String petname;
    protected String breed;
    protected String sex;
    protected String type;
    protected String appointmentType;
    protected String vet;
    protected String date;
    protected String time;

    public AppointmentData(String name, String address, String number, String petname, String breed,
                            String sex, String type, String appointmentType, String vet, String date, String time) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.petname = petname;
        this.breed = breed;
        this.sex = sex;
        this.type = type;
        this.appointmentType = appointmentType;
        this.vet = vet;
        this.date = date;
        this.time = time;
    }

    public void writeDataToFile() throws IOException {
        // Implement write data to file logic here
    }
}

class VeterinaryAppointmentData extends AppointmentData {
    public VeterinaryAppointmentData(String name, String address, String number, String petname, String breed,
                                     String sex, String type, String appointmentType, String vet, String date, String time) {
        super(name, address, number, petname, breed, sex, type, appointmentType, vet, date, time);
    }
}
public class UserAppointment extends javax.swing.JFrame {
    
    public UserAppointment(String USERNAME) {
        initComponents();
        tfName.setText(USERNAME);

    }
    public UserAppointment() {
        initComponents();

        
    }
    public UserAppointment(String username, String address,String number, String petname, String breed, String sex, String type,
                String appoint, String vet, String date, String time){
                initComponents();
                
                
                tfName.setText(username);
                tfAddress.setText(address);
                tfNumber.setText(number);
                tfPetName.setText(petname);
                tfPetName.setText(petname);
                tfPetbreed.setText(breed);
                tfpetsex.setSelectedItem(sex);
                tfpettype.setSelectedItem(type);
                tfappointmenttype.setSelectedItem(appoint);
                tfVet.setSelectedItem(vet);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfAddress = new javax.swing.JTextField();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfNumber = new javax.swing.JTextField();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tfPetName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        tfPetbreed = new javax.swing.JTextField();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        tfpetsex = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfpettype = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfappointmenttype = new javax.swing.JComboBox<>();
        tfVet = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        tfDate = new com.toedter.calendar.JDateChooser();
        tfTime = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        EnteredName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        toData = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();

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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 760, 70, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setText("Pet Owner Details");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 460, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));

        tfAddress.setBackground(new java.awt.Color(255, 255, 255));
        tfAddress.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfAddress.setBorder(null);
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 450, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 350, 20));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));

        tfNumber.setBackground(new java.awt.Color(255, 255, 255));
        tfNumber.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfNumber.setBorder(null);
        tfNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 450, 40));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("Phone Number");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 350, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel14.setText("Pet Details");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 220, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("Pet Name");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 280, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));

        tfPetName.setBackground(new java.awt.Color(255, 255, 255));
        tfPetName.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfPetName.setBorder(null);
        tfPetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPetNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(tfPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 300, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));

        tfPetbreed.setBackground(new java.awt.Color(255, 255, 255));
        tfPetbreed.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfPetbreed.setBorder(null);
        tfPetbreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPetbreedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(tfPetbreed, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfPetbreed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 300, 40));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Breed");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 150, 20));

        tfpetsex.setBackground(new java.awt.Color(255, 255, 255));
        tfpetsex.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfpetsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", " " }));
        tfpetsex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfpetsex.setMaximumSize(new java.awt.Dimension(0, 0));
        tfpetsex.setPreferredSize(new java.awt.Dimension(0, 0));
        tfpetsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpetsexActionPerformed(evt);
            }
        });
        jPanel2.add(tfpetsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 110, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Pet Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 110, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Pet Type");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 90, 20));

        tfpettype.setBackground(new java.awt.Color(255, 255, 255));
        tfpettype.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfpettype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Dog", "Cat", "Hamsters", "Rabbits", "Parrots", "Canaries" }));
        tfpettype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfpettype.setMaximumSize(new java.awt.Dimension(0, 0));
        tfpettype.setPreferredSize(new java.awt.Dimension(0, 0));
        tfpettype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpettypeActionPerformed(evt);
            }
        });
        jPanel2.add(tfpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 110, 40));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setText("Type of Appointment");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 420, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setText("Select Appointment type");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 410, 20));

        tfappointmenttype.setBackground(new java.awt.Color(255, 255, 255));
        tfappointmenttype.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfappointmenttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Wellness Checkup", "Vaccination", "Symptoms Diagnosis", "Spaying and Neutering Consultation", "Senior Pet Check-up", "Behavioral Consultation", "Nutritional Consultation", "Parasites Prevention Consultation", "Allergy Testing", "Grooming Session", "Others" }));
        tfappointmenttype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfappointmenttype.setMaximumSize(new java.awt.Dimension(0, 0));
        tfappointmenttype.setPreferredSize(new java.awt.Dimension(0, 0));
        tfappointmenttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfappointmenttypeActionPerformed(evt);
            }
        });
        jPanel2.add(tfappointmenttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 420, 40));

        tfVet.setBackground(new java.awt.Color(255, 255, 255));
        tfVet.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tfVet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Lebron James", "Kobe Bryant", "Giannis Antetokounmpo", "Russell Westbrook", "Kareem Abdul-Jabbar" }));
        tfVet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfVet.setMaximumSize(new java.awt.Dimension(0, 0));
        tfVet.setPreferredSize(new java.awt.Dimension(0, 0));
        tfVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVetActionPerformed(evt);
            }
        });
        jPanel2.add(tfVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 420, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Veterinarian");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 370, 20));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel22.setText("Schedule of Appointment");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 310, 30));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("Select Date");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 310, 20));

        tfDate.setBackground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfDate.setForeground(new java.awt.Color(10, 50, 80));
        tfDate.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 440, 40));

        tfTime.setBackground(new java.awt.Color(255, 255, 255));
        tfTime.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "8:00 - 9:00 AM", "9:00 - 10:00 AM", "10:00 - 11:00 AM", "BREAK TIME", "1:00 - 2:00 PM", "2:00 - 3:00 PM", "3:00 - 4:00 PM", "4:00 - 5:00 PM", "6:00 - 7:00 PM", "7:00 - 8:00 PM", " " }));
        tfTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));
        tfTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimeActionPerformed(evt);
            }
        });
        jPanel2.add(tfTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 440, 40));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("Select Tme");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 160, 20));

        EnteredName.setBackground(new java.awt.Color(255, 255, 255));
        EnteredName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EnteredName.setForeground(new java.awt.Color(10, 50, 80));
        EnteredName.setBorder(null);
        EnteredName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnteredNameActionPerformed(evt);
            }
        });
        jPanel2.add(EnteredName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, 480, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 50, 80));
        jLabel7.setText("Setting of Appointment");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 90));

        toData.setBackground(java.awt.SystemColor.control);
        toData.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        toData.setForeground(new java.awt.Color(10, 50, 80));
        toData.setText("Finish appoinment");
        toData.setBorder(null);
        toData.setContentAreaFilled(false);
        toData.setFocusPainted(false);
        toData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toData.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDataActionPerformed(evt);
            }
        });
        jPanel2.add(toData, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 410, 49));

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.setBorder(null);
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        jPanel2.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 420, 26));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login1 toAdmin = new Login1();
        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberActionPerformed

    private void tfPetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPetNameActionPerformed

    private void tfPetbreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPetbreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPetbreedActionPerformed

    private void tfpetsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpetsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpetsexActionPerformed

    private void tfpettypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpettypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpettypeActionPerformed

    private void tfappointmenttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfappointmenttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfappointmenttypeActionPerformed

    private void tfVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVetActionPerformed

    private void tfTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimeActionPerformed

    }//GEN-LAST:event_tfTimeActionPerformed

    private void EnteredNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnteredNameActionPerformed

    }//GEN-LAST:event_EnteredNameActionPerformed

    private void toDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDataActionPerformed
        String name = tfName.getText();
        String address = tfAddress.getText();
        String number = tfNumber.getText();
        String petname = tfPetName.getText();
        String breed = tfPetbreed.getText();
        String sex = tfpetsex.getSelectedItem().toString();
        String type = tfpettype.getSelectedItem().toString();
        String appoint = tfappointmenttype.getSelectedItem().toString();
        String vet = tfVet.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String date = dateFormat.format(tfDate.getDate());
        String time = tfTime.getSelectedItem().toString();

        // Create Data object with the entered data
        Data dataWindow = new Data(name, address, number, petname, breed, sex, type, appoint, vet, date, time);
        dataWindow.setVisible(true);
        setVisible(false);

        try {
            writeDataToFile(name, address, number, petname, breed, sex, type, appoint, vet, date, time);
        } catch (IOException ex) {
            Logger.getLogger(UserAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void writeDataToFile(String name, String address, String number, String petname, String breed, String sex, String type, String appoint, String vet, String date, String time) throws IOException {
        SimpleDateFormat fileTimestampFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String fileName = "UserData_" + ".txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(name + "," + address + "," + number + "," + petname + "," + breed + "," + sex + "," + type + "," + appoint + "," + vet + "," + time + "," + date);
        writer.newLine();  // Add a new line for the next entry
        System.out.println("Data written to file: " + fileName);
        writer.close();
    }

    private void readDataFromFileAndAddToTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 


    private static class tfDate {

        public tfDate() {
        }
    }

    private static class tfNumber {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public tfNumber() {
        }
    }//GEN-LAST:event_toDataActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {        
                new UserAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnteredName;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logout;
    private javax.swing.JTextField tfAddress;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfPetName;
    private javax.swing.JTextField tfPetbreed;
    private javax.swing.JComboBox<String> tfTime;
    private javax.swing.JComboBox<String> tfVet;
    private javax.swing.JComboBox<String> tfappointmenttype;
    private javax.swing.JComboBox<String> tfpetsex;
    private javax.swing.JComboBox<String> tfpettype;
    private javax.swing.JButton toData;
    // End of variables declaration//GEN-END:variables
}
