/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author K15H3N
 */
public class AHHASC_Manager extends javax.swing.JFrame {
    
    public void setUsername(String uname){
        greeting.setText("Welcome Back " + uname +"!");
    }
    
    public AHHASC_Manager() {
        initComponents();
        home.setBackground(Color.decode("#EBD7C2")); // set background colour
        initializeAppointments();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    oodjassignment.AppointmentForm appointmentTab = new oodjassignment.AppointmentForm();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MDIparent = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        greeting = new javax.swing.JLabel();
        userPane = new javax.swing.JButton();
        appointmentPane = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        appointment_LBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentList = new javax.swing.JTable();
        paymentButton = new javax.swing.JButton();
        oodjassignment.AppointmentForm appointment;
        appointment = appointmentTab;
        oodjassignment.UserForm user;
        user = new oodjassignment.UserForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AHHASC");
        setBackground(new java.awt.Color(225, 226, 180));
        setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 10)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        MDIparent.setBackground(new java.awt.Color(235, 215, 194));
        MDIparent.setForeground(new java.awt.Color(0, 33, 71));
        MDIparent.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        MDIparent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MDIparent.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        MDIparent.setPreferredSize(new java.awt.Dimension(900, 600));
        MDIparent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MDIparentMouseClicked(evt);
            }
        });

        home.setBackground(new java.awt.Color(235, 215, 194));
        home.setForeground(new java.awt.Color(0, 33, 71));
        home.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        greeting.setBackground(new java.awt.Color(235, 215, 194));
        greeting.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(0, 33, 71));
        greeting.setText("Welcome Back!");

        userPane.setBackground(new java.awt.Color(0, 33, 71));
        userPane.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        userPane.setForeground(new java.awt.Color(255, 255, 255));
        userPane.setText("Manage Users");
        userPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPaneActionPerformed(evt);
            }
        });

        appointmentPane.setBackground(new java.awt.Color(0, 33, 71));
        appointmentPane.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        appointmentPane.setForeground(new java.awt.Color(255, 255, 255));
        appointmentPane.setText("Manage Appointments");
        appointmentPane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentPaneActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 33, 71));
        logoutButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        appointment_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        appointment_LBL.setForeground(new java.awt.Color(0, 33, 71));
        appointment_LBL.setText("Unpaid Appointments");

        appointmentList.setAutoCreateRowSorter(true);
        appointmentList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        appointmentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Appliance", "Date Created", "Slot", "Customer_ID", "Manager_ID", "Technician_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentList.getTableHeader().setReorderingAllowed(false);
        appointmentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentListMouseClicked(evt);
            }
        });
        appointmentList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                appointmentListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(appointmentList);

        paymentButton.setBackground(new java.awt.Color(0, 33, 71));
        paymentButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        paymentButton.setForeground(new java.awt.Color(255, 255, 255));
        paymentButton.setText("Make Payment");
        paymentButton.setEnabled(false);
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeLayout.createSequentialGroup()
                                .addComponent(appointment_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paymentButton))
                            .addComponent(jScrollPane1))
                        .addGap(41, 41, 41)
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appointmentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(paymentButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointment_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addComponent(appointmentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(userPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        greeting.getAccessibleContext().setAccessibleName("");

        MDIparent.addTab("Home", home);

        appointment.setBackground(new java.awt.Color(235, 215, 194));
        appointment.setForeground(new java.awt.Color(0, 33, 71));
        MDIparent.addTab("Appointments", appointment);

        user.setBackground(new java.awt.Color(235, 215, 194));
        user.setForeground(new java.awt.Color(0, 33, 71));
        MDIparent.addTab("Users", user);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MDIparent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MDIparent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MDIparent.getAccessibleContext().setAccessibleName("");
        MDIparent.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MDIparentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MDIparentMouseClicked
        appointmentTab.initializeAppointments();
    }//GEN-LAST:event_MDIparentMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logout();
    }//GEN-LAST:event_formWindowClosing

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // Obtain Data
        DefaultTableModel model = (DefaultTableModel)appointmentList.getModel(); //model from JTable
        int rowIndex = appointmentList.getSelectedRow();

        int appointmentId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
        int managerId = Integer.parseInt(model.getValueAt(rowIndex, 6).toString());
        int technicianId = Integer.parseInt(model.getValueAt(rowIndex, 7).toString());

        //TECHNICIAN_T
        File technician = new File("src/db/centerTechnician_t.txt");
        try{
            FileReader fr = new FileReader(technician);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();

            //List Technicians
            int basePay = 100; // default value
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(":");
                if (technicianId == Integer.valueOf(row[0])){
                    basePay = Integer.valueOf(row[4]);
                }
            }

            // Show Form
            pPayment payment = new pPayment();
            payment.setVisible(true);
            payment.txtManagerID.setText(String.valueOf(oodjassignment.pLogin.getId())); // id of logged in manager
            payment.txtTechnicianID.setText(String.valueOf(technicianId));
            payment.txtAppointmentID.setText(String.valueOf(appointmentId));

            payment.txtPaymentAmount.setText(String.valueOf(basePay));
            this.setVisible(false);
        } catch(FileNotFoundException ex){}
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void appointmentListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentListKeyPressed
        if (appointmentList.isRowSelected(appointmentList.getSelectedRow()) == true){ // only if a row is selected
            paymentButton.setEnabled(true);
        } else {
            paymentButton.setEnabled(false);
        }
    }//GEN-LAST:event_appointmentListKeyPressed

    private void appointmentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentListMouseClicked
        if (appointmentList.isRowSelected(appointmentList.getSelectedRow()) == true){ // only if a row is selected
            paymentButton.setEnabled(true);
        } else {
            paymentButton.setEnabled(false);
        }
    }//GEN-LAST:event_appointmentListMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void appointmentPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentPaneActionPerformed
        MDIparent.setSelectedIndex(1);
    }//GEN-LAST:event_appointmentPaneActionPerformed

    private void userPaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPaneActionPerformed
        MDIparent.setSelectedIndex(2);
    }//GEN-LAST:event_userPaneActionPerformed
    
    private void logout(){
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you would like to logout? Any unsaved changes will be lost.", "Logout?", JOptionPane.ERROR_MESSAGE); 
        if (result == JOptionPane.YES_OPTION){
            this.setVisible(false);
            pLogin login = new pLogin();
            login.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }
    
    public void initializeAppointments(){
        //APPOINTMENT_T
        File appointment = new File("src/db/appointment_t.txt");
        
        try{         
        FileReader fr = new FileReader(appointment);
        BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel)appointmentList.getModel();
        model.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(";");
            
            // filter for past appointments
            try{ // compare appointment date to today's date
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //format date
            Date appointmentDate = formatter.parse(row[1].toString());

            SimpleDateFormat local = new SimpleDateFormat("yyyy-MM-dd");
            LocalDate today = LocalDate.now(); //today's date
            LocalDate appointmentDateFormatted = LocalDate.parse(local.format(appointmentDate));
            long duration = ChronoUnit.DAYS.between(today, appointmentDateFormatted);

            if (duration < 0){ // ignore past appointments
                if (checkTechnician(Integer.valueOf(row[7])) == true){ // ignore deleted technicians
                    if (checkPayment(Integer.valueOf(row[0])) == false){ // only show unpaid appointments
                        model.addRow(row); //load data
                    }
                }
            } 
            } catch(ParseException ex){}
        }
        } catch(FileNotFoundException ex){}
    }
    
    private Boolean checkPayment(int id){
        Boolean paymentExist = false;
        
        try {
        //PAYMENT_T
        File payment = new File("src/db/payment_t.txt");
        
        FileReader fr = new FileReader(payment);
        BufferedReader br = new BufferedReader(fr);
        Object[] lines = br.lines().toArray();
        
        // Split data to array
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            if (id == Integer.valueOf(row[5])){
                paymentExist = true;
            }
        }
        } catch(FileNotFoundException ex){}
         return paymentExist;
    }
    
    private Boolean checkTechnician(int id){
        Boolean technicianExist = false;
        
        try {
        //PAYMENT_T
        File technician = new File("src/db/centerTechnician_t.txt");
        
        FileReader fr = new FileReader(technician);
        BufferedReader br = new BufferedReader(fr);
        Object[] lines = br.lines().toArray();
        
        // Split data to array
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            if (id == Integer.valueOf(row[0])){
                technicianExist = true;
            }
        }
        } catch(FileNotFoundException ex){}
         return technicianExist;
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTabbedPane MDIparent;
    public javax.swing.JTabbedPane appointment;
    javax.swing.JTable appointmentList;
    private javax.swing.JButton appointmentPane;
    private javax.swing.JLabel appointment_LBL;
    private javax.swing.JLabel greeting;
    private javax.swing.JPanel home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JTabbedPane user;
    private javax.swing.JButton userPane;
    // End of variables declaration//GEN-END:variables
}