/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class pFeedback extends javax.swing.JFrame {

    /**
     * Creates new form pFeedback1
     */
    public pFeedback() {
        initComponents();
        AutoFeedbackID();
        if (txtFeedbackID.getText().equals("")){
                    txtFeedbackID.setText("1");
        }
        setTechnicianId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTechnicianID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAppointmentID = new javax.swing.JLabel();
        txtFeedbackID = new javax.swing.JTextField();
        txtAppointmentID = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblMessage1 = new javax.swing.JLabel();
        txtTechnicianID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTechnicianID.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblTechnicianID.setText("Technician ID");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel2.setText("FEEDBACK");

        lblAppointmentID.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblAppointmentID.setText("Appointment ID");

        txtFeedbackID.setEnabled(false);
        txtFeedbackID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeedbackIDActionPerformed(evt);
            }
        });
        txtFeedbackID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFeedbackIDKeyReleased(evt);
            }
        });

        txtAppointmentID.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        txtAppointmentID.setEnabled(false);
        txtAppointmentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAppointmentIDKeyReleased(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblMessage.setText("Message");

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        txtMessage.setRows(5);
        txtMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMessageFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtMessage);

        btnSend.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMessage1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblMessage1.setText("Feedback ID");

        txtTechnicianID.setEnabled(false);
        txtTechnicianID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTechnicianIDActionPerformed(evt);
            }
        });
        txtTechnicianID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTechnicianIDKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMessage)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAppointmentID)
                                        .addComponent(lblTechnicianID)
                                        .addComponent(lblMessage1))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAppointmentID)
                                            .addComponent(txtFeedbackID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtTechnicianID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage1)
                    .addComponent(txtFeedbackID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTechnicianID)
                    .addComponent(txtTechnicianID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentID)
                    .addComponent(txtAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFeedbackIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeedbackIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeedbackIDActionPerformed

    private void txtFeedbackIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeedbackIDKeyReleased
        String value = txtFeedbackID.getText();
        int l = value.length();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() <= '-' ) {
            if(l <0 || l>12){
                JOptionPane.showMessageDialog(null, "Invalid Length");
                txtFeedbackID.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
            txtFeedbackID.setText("");
        }
    }//GEN-LAST:event_txtFeedbackIDKeyReleased

    private void txtAppointmentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppointmentIDKeyReleased
        String value = txtAppointmentID.getText();
        int l = value.length();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() <= '-' ) {
            if(l <0 || l>12){
                JOptionPane.showMessageDialog(null, "Invalid Length");
                txtAppointmentID.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
            txtAppointmentID.setText("");
        }
    }//GEN-LAST:event_txtAppointmentIDKeyReleased

    private void txtMessageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusLost
        if(txtMessage.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "Invalid symbol ':' used ");
            txtMessage.setText("");
        }
    }//GEN-LAST:event_txtMessageFocusLost
    
    String technicianID, appointmentID, message, feedbackID,creationDate;
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        try{

            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");

            creationDate = datef.format(currentDate.getTime());
            feedbackID = txtFeedbackID.getText();
            technicianID = txtTechnicianID.getText();
            appointmentID = txtAppointmentID.getText();
            message = txtMessage.getText();

            IsEmpty = true;
            CheckEmpty();

            if (IsEmpty == false){
                // Write the name to the file.
                feedback fb = new feedback(feedbackID, message, creationDate,  technicianID, appointmentID);
                fb.addFeedback(feedbackID, message, creationDate, technicianID, appointmentID);
                
                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
                ClearText();
                AutoFeedbackID();
                System.out.println(feedbackID);

                JOptionPane.showMessageDialog(null, fb.toString(), "Adding Succesful!",  JOptionPane.PLAIN_MESSAGE );
                returnToMenu();
            }else {
                JOptionPane.showMessageDialog(null, "Make sure all input fields are properly keyed in");

            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "An error occured!");
        }

        
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtTechnicianIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTechnicianIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTechnicianIDActionPerformed

    private void txtTechnicianIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTechnicianIDKeyReleased
        String value = txtTechnicianID.getText();
        int l = value.length();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() <= '-' ) {
            if(l <0 || l>12){
                JOptionPane.showMessageDialog(null, "Invalid Length");
                txtTechnicianID.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
            txtTechnicianID.setText("");
        }
    }//GEN-LAST:event_txtTechnicianIDKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        returnToMenu();
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        returnToMenu();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(pFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pFeedback().setVisible(true);
            }
        });
    }
    
    private void setTechnicianId(){
        txtTechnicianID.setText(oodjassignment.pLogin.getId());
    }
    
    public void setAppointmentId(int id){
        txtAppointmentID.setText(String.valueOf(id));
    }
    
    boolean IsEmpty;
    private void CheckEmpty(){
        
        
        if(txtFeedbackID.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblTechnicianID.setForeground(Color.red);
        }else if(txtAppointmentID.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblAppointmentID.setForeground(Color.red);
        }else if(txtMessage.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblMessage.setForeground(Color.red);
        }else {
            IsEmpty = false;
           defaultLabelColor();
        }
       
    }
    
    private void defaultLabelColor(){
            lblTechnicianID.setForeground(Color.BLACK);
            lblAppointmentID.setForeground(Color.BLACK);
            lblMessage.setForeground(Color.BLACK);
    }
    
    private void ClearText(){
         
           txtFeedbackID.setText("");
           txtAppointmentID.setText("");
           txtMessage.setText("");
           txtTechnicianID.setText("");
           defaultLabelColor();
           
    }
    
     private void AutoFeedbackID(){
        //DecimalFormat dc = new DecimalFormat("000000");
        // This is to ensure the entire method have access to the selectedID array
        String[] selectedID = null;
        try {
            String dir = System.getProperty("user.dir") + "\\src\\DB\\";
            // For debugging purpose only
            // JOptionPane.showMessageDialog(null, bID);
            File customertxt = new File(dir + "feedback_t.txt");
            Scanner inputFile;
            try {
                inputFile = new Scanner(customertxt);
                // Read lines from the file until no more are left.
                while (inputFile.hasNext())
                {
                   // Read the next line.
                   String bEntry = inputFile.nextLine();
                   // Split the line by using the delimiter ":" (semicolon) and store into array.
                   selectedID = bEntry.split(":");
                }
                inputFile.close();
                int newCustomerID = Integer.parseInt(selectedID[0]) + 1;
                txtFeedbackID.setText(String.valueOf(newCustomerID));
                
                System.out.println(newCustomerID);
                
                
            } catch (FileNotFoundException ex) {
              
            }
        }
        catch (Exception ex) {
   
        }
    }
     
     private void returnToMenu(){
         this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         
         this.setVisible(false);
         
         AHHASC_Technician technicianInterface = new AHHASC_Technician();
         technicianInterface.setVisible(true);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppointmentID;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblTechnicianID;
    private javax.swing.JTextField txtAppointmentID;
    private javax.swing.JTextField txtFeedbackID;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtTechnicianID;
    // End of variables declaration//GEN-END:variables
}
