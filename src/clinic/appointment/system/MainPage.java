/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinic.appointment.system;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


class Appointment { //blueprint for appointment obj
    protected String name;
    protected String address;
    protected String number;
    protected String petname;
    protected String breed;
    protected String type;
    protected String sex;
    protected String date;
    protected String time;
    protected String vet;
    protected String appointmentType;

    public Appointment(String name, String address, String number, String petname, String breed,
                       String type, String sex, String date, String time, String vet, String appointmentType) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.petname = petname;
        this.breed = breed;
        this.type = type;
        this.sex = sex;
        this.date = date;
        this.time = time;
        this.vet = vet;
        this.appointmentType = appointmentType;
    }
    

    public boolean isEmptyFields() {
        return name.isEmpty() || breed.isEmpty() || petname.isEmpty() || breed.isEmpty() ||
                type.isEmpty() || sex.isEmpty() || date.isEmpty() || time.isEmpty() ||
                appointmentType.isEmpty() || vet.isEmpty() || number.isEmpty();
    }
    
}


class VeterinaryAppointment extends Appointment {
    public VeterinaryAppointment(String name, 
                                 String address, 
                                 String number, 
                                 String petname,
                                 String breed, 
                                 String type, 
                                 String sex, 
                                 String date, 
                                 String time,
                                 String vet, 
                                 String appointmentType) {
        super(name, address, number, petname, breed, type, sex, date, time, vet, appointmentType);
    }
}

public class MainPage extends javax.swing.JFrame {
    
    private void addAppointment() {
        String name = tfName.getText();
        String address = tfAddress.getText();
        String number = tfNumber.getText();
        String petname = tfPetName.getText();
        String breed = tfPetbreed.getText();
        String type = tfpettype.getSelectedItem().toString();
        String sex = tfpetsex.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String date = dateFormat.format(tfDate.getDate());
        String time = tfTime.getSelectedItem().toString();
        String vet = tfVet.getSelectedItem().toString();
        String appointmentType = tfappointmenttype.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null, "Add Appointment?");
        
        VeterinaryAppointment newAppointment = new VeterinaryAppointment(name, address, number, petname, breed,
                type, sex, date, time, vet, appointmentType);

        if (newAppointment.isEmptyFields()) {
            JOptionPane.showMessageDialog(this, "Please Enter All fields", "Try Again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            Object[] newRow = new Object[]{name, address, petname, breed, type, sex, date, time, appointmentType, vet, number};

            if (isDuplicateAppointment(model, date, time)) {
                JOptionPane.showMessageDialog(this, "An appointment already exists.", "Duplicate Appointment", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Please select different time and date");
                return;
            }
            totalappointmentcount++;//iterate
            appointmentCount++;
            tfAppointmentCount.setText(Integer.toString(appointmentCount));
            tfTotalAppointment.setText(Integer.toString(totalappointmentcount));
            int insertIndex = findInsertIndex(model, newRow);//sort
            
            model.insertRow(insertIndex, newRow);
            try {
            writeDataToFile(name, address, number, petname, breed, sex, type, appointmentType, vet, date, time);
        } catch (IOException ex) {
            Logger.getLogger(UserAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
            clearTextFields();

        }
    }
    

    private void clearTextFields() {
        tfName.setText("");
        tfAddress.setText("");
        tfNumber.setText("");
        tfPetName.setText("");
        tfPetbreed.setText("");
        tfpettype.setSelectedItem(null);
        tfpetsex.setSelectedItem(null);
        tfDate.setDate(null);
        tfAddress.setText("");
        tfNumber.setText("");
        tfVet.setSelectedItem(null);
        tfTime.setSelectedItem(null);
        tfappointmenttype.setSelectedItem(null);
    }
    
    
    private static void log(Level SEVERE, Object object, ClassNotFoundException ex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int totalappointmentcount = 0;
    private int appointmentCount = 0;
    private int canceledAppointment = 0;
    private int completedAppointment = 0;
    private String username;

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        AddUserAppointment();
    
    }
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        timePickerMenu1 = new com.raven.swing.TimePickerMenu();
        timingTargetAdapter1 = new org.jdesktop.animation.timing.TimingTargetAdapter();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tfName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tfAddress = new javax.swing.JTextField();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfNumber = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tfPetName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tfPetbreed = new javax.swing.JTextField();
        javax.swing.JButton AddAppointment1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        tfpetsex = new javax.swing.JComboBox<>();
        tfpettype = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        tfDate = new com.toedter.calendar.JDateChooser();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfVet = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        tfappointmenttype = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        javax.swing.JButton CancelAppointment2 = new javax.swing.JButton();
        tfTime = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tfCanceledAppointment = new javax.swing.JTextField();
        tfAppointmentCount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CompletedAppointment = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfTotalAppointment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        MarkasDone = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 40, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        tfName.setBorder(null);
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 340, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 20));

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, 40));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("Phone Number");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 20));

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 340, 40));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setText("Pet Owner Details");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 350, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Veterinarian");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 200, 20));

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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tfPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 240, 40));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Breed");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 90, 20));

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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tfPetbreed, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfPetbreed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 240, 40));

        AddAppointment1.setBackground(java.awt.SystemColor.control);
        AddAppointment1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        AddAppointment1.setForeground(new java.awt.Color(10, 50, 80));
        AddAppointment1.setText("Add appointment");
        AddAppointment1.setBorder(null);
        AddAppointment1.setContentAreaFilled(false);
        AddAppointment1.setFocusPainted(false);
        AddAppointment1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        AddAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAppointment1ActionPerformed(evt);
            }
        });
        jPanel2.add(AddAppointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 790, 220, 60));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADMINISTRATOR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, 140, 30));

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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 86, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 50, 80));
        jLabel1.setText("PAWHUB VET CLINIC");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 320, 60));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Pet Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 90, 20));

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
        jPanel2.add(tfpetsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 100, 40));

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
        jPanel2.add(tfpettype, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 100, 40));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Pet Type");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 70, 20));

        tfDate.setBackground(new java.awt.Color(255, 255, 255));
        tfDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tfDate.setForeground(new java.awt.Color(10, 50, 80));
        tfDate.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        jPanel2.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 440, 40));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("Pet Name");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 220, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel14.setText("Pet Details");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 160, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel20.setText("Type of Appointment");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 250, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setText("Select Appointment type");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 240, 20));

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
        jPanel2.add(tfVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 270, 40));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("Select Date");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 20));

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
        jPanel2.add(tfappointmenttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 270, 40));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("Select Tme");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 160, 20));

        tableClients.setBackground(new java.awt.Color(255, 255, 255));
        tableClients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));
        tableClients.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Petname", "Breed", "Type", "Gender", "Date", "Time", "Appointment Type", "Incharge person", "Phone #"
            }
        ));
        tableClients.setGridColor(new java.awt.Color(10, 50, 80));
        tableClients.setRowHeight(25);
        tableClients.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableClients.setShowGrid(false);
        tableClients.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tableClients);
        if (tableClients.getColumnModel().getColumnCount() > 0) {
            tableClients.getColumnModel().getColumn(2).setPreferredWidth(3);
            tableClients.getColumnModel().getColumn(3).setPreferredWidth(3);
            tableClients.getColumnModel().getColumn(4).setPreferredWidth(3);
            tableClients.getColumnModel().getColumn(5).setPreferredWidth(2);
            tableClients.getColumnModel().getColumn(7).setPreferredWidth(4);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1340, 360));

        CancelAppointment2.setBackground(java.awt.SystemColor.control);
        CancelAppointment2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        CancelAppointment2.setForeground(new java.awt.Color(10, 50, 80));
        CancelAppointment2.setText("Cancel Appoinment");
        CancelAppointment2.setBorder(null);
        CancelAppointment2.setContentAreaFilled(false);
        CancelAppointment2.setFocusPainted(false);
        CancelAppointment2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        CancelAppointment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAppointment2ActionPerformed(evt);
            }
        });
        jPanel2.add(CancelAppointment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 789, 190, 60));

        tfTime.setBackground(new java.awt.Color(255, 255, 255));
        tfTime.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "8:00 - 9:00 AM", "9:00 - 10:00 AM", "10:00 - 11:00 AM", "BREAK TIME", "1:00 - 2:00 PM", "2:00 - 3:00 PM", "3:00 - 4:00 PM", "4:00 - 5:00 PM", "6:00 - 7:00 PM", "7:00 - 8:00 PM", " " }));
        tfTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 50, 80), 2, true));
        tfTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimeActionPerformed(evt);
            }
        });
        jPanel2.add(tfTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 210, 40));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel22.setText("Schedule of Appointment");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));

        tfCanceledAppointment.setBackground(new java.awt.Color(255, 255, 255));
        tfCanceledAppointment.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        tfCanceledAppointment.setForeground(new java.awt.Color(10, 50, 80));
        tfCanceledAppointment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCanceledAppointment.setBorder(null);
        tfCanceledAppointment.setCaretColor(new java.awt.Color(255, 255, 255));
        tfCanceledAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCanceledAppointmentActionPerformed(evt);
            }
        });

        tfAppointmentCount.setBackground(new java.awt.Color(255, 255, 255));
        tfAppointmentCount.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        tfAppointmentCount.setForeground(new java.awt.Color(10, 50, 80));
        tfAppointmentCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAppointmentCount.setBorder(null);
        tfAppointmentCount.setCaretColor(new java.awt.Color(255, 255, 255));
        tfAppointmentCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAppointmentCountActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 50, 80));
        jLabel4.setText("Current");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 50, 80));
        jLabel9.setText("Canceled");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 50, 80));
        jLabel2.setText("Completed");

        CompletedAppointment.setBackground(new java.awt.Color(255, 255, 255));
        CompletedAppointment.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        CompletedAppointment.setForeground(new java.awt.Color(10, 50, 80));
        CompletedAppointment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CompletedAppointment.setBorder(null);
        CompletedAppointment.setCaretColor(new java.awt.Color(255, 255, 255));
        CompletedAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompletedAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(tfAppointmentCount)
                        .addContainerGap())
                    .addComponent(tfCanceledAppointment)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(CompletedAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfAppointmentCount, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(tfCanceledAppointment))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CompletedAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 320, 260));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 50, 80), 2));

        tfTotalAppointment.setBackground(new java.awt.Color(255, 255, 255));
        tfTotalAppointment.setFont(new java.awt.Font("Century Gothic", 1, 40)); // NOI18N
        tfTotalAppointment.setForeground(new java.awt.Color(10, 50, 80));
        tfTotalAppointment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTotalAppointment.setBorder(null);
        tfTotalAppointment.setCaretColor(new java.awt.Color(255, 255, 255));
        tfTotalAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalAppointmentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 50, 80));
        jLabel6.setText("Total Appointment:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotalAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTotalAppointment)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 320, 110));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 50, 80));
        jLabel3.setText("List of Appointment");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 80));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 50, 80));
        jLabel7.setText("Set Appointment");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 90));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 50, 80));
        jLabel8.setText("Dashboard");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, -1, 80));

        clearbtn.setBackground(java.awt.SystemColor.control);
        clearbtn.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(10, 50, 80));
        clearbtn.setText("Clear");
        clearbtn.setBorder(null);
        clearbtn.setContentAreaFilled(false);
        clearbtn.setFocusPainted(false);
        clearbtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 790, 150, 60));

        MarkasDone.setBackground(new java.awt.Color(10, 50, 80));
        MarkasDone.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        MarkasDone.setForeground(new java.awt.Color(255, 255, 255));
        MarkasDone.setText("Mark as Done");
        MarkasDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkasDoneActionPerformed(evt);
            }
        });
        jPanel2.add(MarkasDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 800, 150, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void AddUserAppointment() {
            try {
        BufferedReader reader = new BufferedReader(new FileReader("UserData_.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            try {
                String[] data = line.split(",");
                VeterinaryAppointment appointment = new VeterinaryAppointment(
                        data[0], data[1], data[3], data[4], data[6], data[5], data[9],data[10], data[7], data[2], data[8] );
                if (!appointment.isEmptyFields()) {
                    DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
                    Object[] newRow = new Object[]{
                        appointment.name, appointment.address, appointment.number, appointment.petname,
                        appointment.breed, appointment.type, appointment.sex, appointment.date,
                        appointment.time, appointment.appointmentType, appointment.vet
                    };
                    totalappointmentcount++;
                    appointmentCount++;
                    tfAppointmentCount.setText(Integer.toString(appointmentCount));
                    tfTotalAppointment.setText(Integer.toString(totalappointmentcount));
                    int insertIndex = findInsertIndex(model, newRow);
                    model.addRow(newRow);
                    
                    writeDataToFile(appointment);
                }
            } catch (Exception e) {
                System.err.println("Error processing line: " + line);
                e.printStackTrace();
            }
        }

        reader.close();
    } catch (IOException ex) {
        Logger.getLogger(UserAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void writeDataToFile(VeterinaryAppointment appointment) throws IOException {
    SimpleDateFormat fileTimestampFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String fileName = "AdminData_" + ".txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
    writer.write(appointment.name + "," + appointment.address + "," + appointment.number + "," + appointment.petname + "," + appointment.breed + "," + appointment.sex + "," + appointment.type + "," + appointment.appointmentType + "," + appointment.vet + "," + appointment.date + "," + appointment.time);
    writer.newLine();
    System.out.println("Data written to file: " + fileName);
    writer.close();
}
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login1 toAdmin = new Login1();
        toAdmin.setVisible(true);
        toAdmin.pack();
        toAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
      
    private void AddAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAppointment1ActionPerformed
         addAppointment();
            
    }//GEN-LAST:event_AddAppointment1ActionPerformed

    private void writeDataToFile(String name, String address, String number, String petname, String breed, String sex, String type, String appoint, String vet, String date, String time) throws IOException {

        SimpleDateFormat fileTimestampFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String fileName = "AdminData_" + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(name + "," + address + "," + number + "," + petname + "," + breed + "," + sex + "," + type + "," + appoint + "," + vet + "," + date + "," + time);
        writer.newLine();
        System.out.println("Data written to file: " + fileName);
        writer.close();
    }

    private boolean isDuplicateAppointment(DefaultTableModel model, String date, String time) {
    for (int i = 0; i < model.getRowCount(); i++) {
        String existingDate = model.getValueAt(i, 6).toString(); // Assuming date is in column 6
        String existingTime = model.getValueAt(i, 7).toString(); // Assuming time is in column 7

        if (existingDate.equals(date) && existingTime.equals(time)) {
            return true; // Duplicate appointment found
        }
    }
    return false;
}
    

private int findInsertIndex(DefaultTableModel model, Object[] newRow) {
    // Compare the new row with existing rows and find the correct position
    for (int i = 0; i < model.getRowCount(); i++) {
        String existingDate = model.getValueAt(i, 6).toString();
        String existingTime = model.getValueAt(i, 7).toString();

        int dateComparison = existingDate.compareTo(newRow[6].toString());
        if (dateComparison > 0 || (dateComparison == 0 && existingTime.compareTo(newRow[7].toString()) > 0)) {
            return i;
        }
    }
    return model.getRowCount(); // If the new row should be added at the end
}    private void readDataFromFileAndAddToTable() {
        
        JOptionPane.showMessageDialog(null, "Add User reservation?");  
        try (BufferedReader reader = new BufferedReader(new FileReader("UserData_.txt"))) {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();

            // Read each line from the file and add it to the table
            String line;
            while ((line = reader.readLine()) != null) {
                

                String[] data = line.split(",");
                Object[] newRow = new Object[]{data[0], data[1], data[3], data[4], data[6], data[5], data[9],data[10] , data[7],data[8] , data[2]};
                model.addRow(newRow);
                totalappointmentcount++;
                appointmentCount++;

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void tfpetsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpetsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpetsexActionPerformed

    private void tfpettypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpettypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpettypeActionPerformed

    private void tfVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVetActionPerformed

    private void tfappointmenttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfappointmenttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfappointmenttypeActionPerformed

    private void CancelAppointment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAppointment2ActionPerformed
        int row = tableClients.getSelectedRow();
        
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    " No row is selected! Please select atleast one row"
            ,"Select row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            JOptionPane.showMessageDialog(null, "Cancel Appointment?");
            model.removeRow(row);
            canceledAppointment++;
            tfCanceledAppointment.setText(Integer.toString(canceledAppointment));
            appointmentCount--;
            tfAppointmentCount.setText(Integer.toString(appointmentCount));
            
        }
    }//GEN-LAST:event_CancelAppointment2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void tfTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimeActionPerformed
        
    }//GEN-LAST:event_tfTimeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void tfCanceledAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCanceledAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCanceledAppointmentActionPerformed

    private void tfAppointmentCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAppointmentCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAppointmentCountActionPerformed

    private void tfTotalAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalAppointmentActionPerformed
        int row = tableClients.getSelectedRow();
        
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    " No row is selected! Please select atleast one row"
            ,"Select row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            JOptionPane.showMessageDialog(null, "Cancel Appointment?");
            model.removeRow(row);
            canceledAppointment++;
            tfCanceledAppointment.setText(Integer.toString(canceledAppointment));
            appointmentCount--;
            tfAppointmentCount.setText(Integer.toString(appointmentCount));
        }                                    
    }//GEN-LAST:event_tfTotalAppointmentActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        tfName.setText("");
            tfAddress.setText("");
            tfNumber.setText("");
            tfPetName.setText("");
            tfPetbreed.setText("");
            tfpettype.setSelectedItem(null);
            tfpetsex.setSelectedItem(null);
            tfDate.setDate(null);
            tfAddress.setText("");
            tfNumber.setText("");
            tfVet.setSelectedItem(null);
            tfTime.setSelectedItem(null);
            tfappointmenttype.setSelectedItem(null);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void CompletedAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompletedAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompletedAppointmentActionPerformed

    private void MarkasDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkasDoneActionPerformed
        int row = tableClients.getSelectedRow();
    
    if (row < 0) {
        JOptionPane.showMessageDialog(this,
                " No row is selected! Please select at least one row",
                "Select row", JOptionPane.ERROR_MESSAGE);
    } else {
        DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
        
        int option = JOptionPane.showConfirmDialog(this, "Mark this appointment as done?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            // Get data from the selected row
            String name = (String) model.getValueAt(row, 0);
            String address = (String) model.getValueAt(row, 1);
            String petname = (String) model.getValueAt(row, 2);
            String breed = (String) model.getValueAt(row, 3);
            String type = (String) model.getValueAt(row, 4);
            String sex = (String) model.getValueAt(row, 5);
            String date = (String) model.getValueAt(row, 6);
            String time = (String) model.getValueAt(row, 7);
            String appointmentType = (String) model.getValueAt(row, 8);
            String vet = (String) model.getValueAt(row, 9);
            String number = (String) model.getValueAt(row, 10);

            // Example: Send data to another method
            writeDataToFile2(name, address, petname, breed, type, sex, date, time, appointmentType, vet, number);

            // Example: Update counters
            completedAppointment++;
            CompletedAppointment.setText(Integer.toString(completedAppointment));
            appointmentCount--;
            tfAppointmentCount.setText(Integer.toString(appointmentCount));

            // Remove the row from the table
            model.removeRow(row);
        }
    }

    }//GEN-LAST:event_MarkasDoneActionPerformed
    
    private void writeDataToFile2(String name, String address, String petname, String breed, String type, String sex, String date, String time, String appointmentType, String vet, String number) {
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        BufferedWriter writer = new BufferedWriter(new FileWriter("CompleteAppointment.txt", true));
        writer.write(timestamp + "," + name + "," + address + "," + petname + "," + breed + "," + type + "," +
                     sex + "," + date + "," + time + "," + appointmentType + "," + vet + "," + number);
        writer.newLine();
        writer.close();
        System.out.println("Data written to file: CompleteAppointment.txt");
    } catch (IOException ex) {
        Logger.getLogger(UserAppointment.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
    
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
            java.util.logging.Logger.getLogger(toDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(toDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(toDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(toDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
                
                
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompletedAppointment;
    private javax.swing.JButton MarkasDone;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTable tableClients;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAppointmentCount;
    private javax.swing.JTextField tfCanceledAppointment;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNumber;
    private javax.swing.JTextField tfPetName;
    private javax.swing.JTextField tfPetbreed;
    private javax.swing.JComboBox<String> tfTime;
    private javax.swing.JTextField tfTotalAppointment;
    private javax.swing.JComboBox<String> tfVet;
    private javax.swing.JComboBox<String> tfappointmenttype;
    private javax.swing.JComboBox<String> tfpetsex;
    private javax.swing.JComboBox<String> tfpettype;
    private com.raven.swing.TimePickerMenu timePickerMenu1;
    private org.jdesktop.animation.timing.TimingTargetAdapter timingTargetAdapter1;
    // End of variables declaration//GEN-END:variables

    private static class Select8 {
        

        public Select8() {
        }

        private void setBackground(java.awt.Color Green) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setOpaque(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class toDashboard {

        public toDashboard() {
        }
    }

    
    
}
