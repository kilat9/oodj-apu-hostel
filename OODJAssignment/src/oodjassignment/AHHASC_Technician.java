/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author K15H3N
 */
public class AHHASC_Technician extends javax.swing.JFrame {
    
    public void setUsername(String uname){
        greeting.setText("Welcome Back " + uname +"!");
    }
    
    public AHHASC_Technician() {
        initComponents();
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
        feedback_BTN = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentList = new javax.swing.JTable();
        appointment_LBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JTable();
        customerLBL = new javax.swing.JLabel();
        slotCB = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        pastAppointmentList = new javax.swing.JTable();
        appointment_LBL1 = new javax.swing.JLabel();

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

        MDIparent.setBackground(new java.awt.Color(225, 226, 180));
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
        home.setForeground(new java.awt.Color(226, 38, 88));
        home.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N

        greeting.setBackground(new java.awt.Color(235, 215, 194));
        greeting.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(0, 33, 71));
        greeting.setText("Welcome Back!");

        feedback_BTN.setBackground(new java.awt.Color(0, 33, 71));
        feedback_BTN.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        feedback_BTN.setForeground(new java.awt.Color(255, 255, 255));
        feedback_BTN.setText("Provide Feedback");
        feedback_BTN.setEnabled(false);
        feedback_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedback_BTNActionPerformed(evt);
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
        appointmentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        appointmentList.getTableHeader().setReorderingAllowed(false);
        appointmentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentListMouseClicked(evt);
            }
        });
        appointmentList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appointmentListKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(appointmentList);

        appointment_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        appointment_LBL.setForeground(new java.awt.Color(0, 33, 71));
        appointment_LBL.setText("Your Upcoming Appointments");

        customerList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        customerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerList.setEnabled(false);
        customerList.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(customerList);
        if (customerList.getColumnModel().getColumnCount() > 0) {
            customerList.getColumnModel().getColumn(0).setPreferredWidth(30);
            customerList.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        customerLBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        customerLBL.setForeground(new java.awt.Color(0, 33, 71));
        customerLBL.setText("Customer Details");

        slotCB.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        slotCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "10am - 12pm", "2pm - 4pm", "4pm - 6pm" }));
        slotCB.setEnabled(false);

        pastAppointmentList.setAutoCreateRowSorter(true);
        pastAppointmentList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        pastAppointmentList.setModel(new javax.swing.table.DefaultTableModel(
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
        pastAppointmentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        pastAppointmentList.getTableHeader().setReorderingAllowed(false);
        pastAppointmentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastAppointmentListMouseClicked(evt);
            }
        });
        pastAppointmentList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pastAppointmentListKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(pastAppointmentList);

        appointment_LBL1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        appointment_LBL1.setForeground(new java.awt.Color(0, 33, 71));
        appointment_LBL1.setText("Past Appointments");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(homeLayout.createSequentialGroup()
                                .addComponent(appointment_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(slotCB, 0, 148, Short.MAX_VALUE)
                                .addGap(54, 54, 54)))
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeLayout.createSequentialGroup()
                                .addComponent(customerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(homeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(feedback_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(appointment_LBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addGap(18, 18, 18)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appointment_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slotCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(feedback_BTN))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(appointment_LBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        greeting.getAccessibleContext().setAccessibleName("");

        MDIparent.addTab("Home", home);

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

    private void feedback_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedback_BTNActionPerformed
        this.setVisible(false);
        oodjassignment.pFeedback feedback = new oodjassignment.pFeedback();
        
        DefaultTableModel model = (DefaultTableModel)pastAppointmentList.getModel(); //model from JTable
        int rowIndex = pastAppointmentList.getSelectedRow();
        int appointmentId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
        feedback.setAppointmentId(appointmentId);
        
        feedback.setVisible(true);
    }//GEN-LAST:event_feedback_BTNActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logout();
    }//GEN-LAST:event_formWindowClosing

    private void appointmentListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentListKeyReleased
        appointmentInfo(appointmentList);
    }//GEN-LAST:event_appointmentListKeyReleased

    private void appointmentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentListMouseClicked
        appointmentInfo(appointmentList);
    }//GEN-LAST:event_appointmentListMouseClicked

    private void pastAppointmentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastAppointmentListMouseClicked
        appointmentInfo(pastAppointmentList);
    }//GEN-LAST:event_pastAppointmentListMouseClicked

    private void pastAppointmentListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pastAppointmentListKeyReleased
        appointmentInfo(pastAppointmentList);
    }//GEN-LAST:event_pastAppointmentListKeyReleased
    
    public void initializeAppointments(){
        //APPOINTMENT_T
        File appointment = new File("src/db/appointment_t.txt");
        
        try{         
        FileReader fr = new FileReader(appointment);
        BufferedReader br = new BufferedReader(fr);
        
        // Upcoming Appontments Table
        DefaultTableModel model = (DefaultTableModel)appointmentList.getModel();
        model.setRowCount(0); //clear table
        
        // Past Appointments Table
        DefaultTableModel pastAppointment = (DefaultTableModel)pastAppointmentList.getModel();
        pastAppointment.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(";");
            if (row[7].toString().equals(oodjassignment.pLogin.getId()) == true){ // only show appointments for logged in technician
                
                try{ // compare appointment date to today's date
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //format date
                Date appointmentDate = formatter.parse(row[1].toString());
                
                SimpleDateFormat local = new SimpleDateFormat("yyyy-MM-dd");
                LocalDate today = LocalDate.now(); //today's date
                LocalDate appointmentDateFormatted = LocalDate.parse(local.format(appointmentDate));
                long duration = ChronoUnit.DAYS.between(today, appointmentDateFormatted);
                
                if (duration > 0){ // ignore past appointments
                    model.addRow(row); //load data
                } else {
                    pastAppointment.addRow(row);
                }
                } catch(ParseException ex){}
            }
        }
        
        //CUSTOMER_T
        File customer = new File("src/db/customer_t.txt");
        
        fr = new FileReader(customer);
        br = new BufferedReader(fr);
            
        model = (DefaultTableModel)customerList.getModel();
        model.setRowCount(0); //clear table
        lines = br.lines().toArray();
        
        //List Customers
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            model.addRow(row);
        }
        
        } catch(FileNotFoundException ex){}
    }
    
    public void appointmentInfo(javax.swing.JTable table){
        DefaultTableModel model = (DefaultTableModel)table.getModel(); //model from JTable
        int rowIndex = table.getSelectedRow();
        
        int appointmentId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());
        int slot = Integer.parseInt(model.getValueAt(rowIndex, 4).toString());
        int customerId = Integer.parseInt(model.getValueAt(rowIndex, 5).toString());
        
        slotCB.setSelectedIndex(slot+ 1); // +1 because this CB's first value is empty
        rowHighlighter(customerList, customerId , 0); // customer Table [id at 0th row]
        
        if (table == pastAppointmentList){
            appointmentList.clearSelection();
            if (checkFeedback(appointmentId) == false){
                feedback_BTN.setEnabled(true);
            } else {
                feedback_BTN.setEnabled(false);
            }
        } else {
            pastAppointmentList.clearSelection();
            feedback_BTN.setEnabled(false);
        }
    }
    
        public void rowHighlighter(javax.swing.JTable table, int id, int colNum){
        try{ //Highlight
            int rowNum = -1;
            Object valueRow;
            do{
                rowNum++; //increment to 0
                valueRow = table.getModel().getValueAt(rowNum, colNum); //get the id at stated row
            }while(Integer.parseInt(valueRow.toString()) != id && rowNum < table.getRowCount()); //check if id matches and ensure checking does not exceed number of rows
                table.setRowSelectionInterval(rowNum, rowNum); //highlight the row in table
        } catch (ArrayIndexOutOfBoundsException ex) {
            //to account for the possibility of a deleted record, clear selection if nothing found (the while loop exceeds)
            table.clearSelection(); //clear selection if no longer exists
        }
    }
        
    private Boolean checkFeedback(int id){
        Boolean feedbackExist = false;
        
        try {
        //FEEDBACK_T
        File feedback = new File("src/db/feedback_t.txt");
        
        FileReader fr = new FileReader(feedback);
        BufferedReader br = new BufferedReader(fr);
        Object[] lines = br.lines().toArray();
        
        // Split data to array
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            if (id == Integer.valueOf(row[4])){
                feedbackExist = true;
            }
        }
        } catch(FileNotFoundException ex){}
         return feedbackExist;
    }
    
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
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTabbedPane MDIparent;
    javax.swing.JTable appointmentList;
    private javax.swing.JLabel appointment_LBL;
    private javax.swing.JLabel appointment_LBL1;
    private javax.swing.JLabel customerLBL;
    javax.swing.JTable customerList;
    private javax.swing.JButton feedback_BTN;
    private javax.swing.JLabel greeting;
    private javax.swing.JPanel home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutButton;
    javax.swing.JTable pastAppointmentList;
    protected javax.swing.JComboBox<String> slotCB;
    // End of variables declaration//GEN-END:variables
}