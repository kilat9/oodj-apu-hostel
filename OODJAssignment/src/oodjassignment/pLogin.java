/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class pLogin extends javax.swing.JFrame {

    /**
     * Creates new form pLogin
     */
    public pLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtAccountType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnForgotPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(225, 226, 188));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel2.setText("Password");

        txtUserID.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N

        txtAccountType.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        txtAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center Manager", "Center Technician" }));
        txtAccountType.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel3.setText("Account Type");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel5.setText("LOGIN");

        btnForgotPassword.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        btnForgotPassword.setText("Forgot password?");
        btnForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(btnForgotPassword))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin)
                            .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(btnForgotPassword))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (loginValidate()) {
             this.setVisible(false);
             addLoginLog();
             
            if(userRole == "Center Manager"){
                AHHASC_Manager managerInterface = new AHHASC_Manager();
                managerInterface.setUsername(name);
                managerInterface.setVisible(true);
            }
            else if(userRole == "Center Technician"){
                AHHASC_Technician technicianInterface = new AHHASC_Technician();
                technicianInterface.setUsername(name);
                technicianInterface.setVisible(true);
            }
            
                          
        } else {
            JOptionPane.showMessageDialog(null, "Login failed! Your ID or password may be wrong.", "Account Authentication Failed!", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you would like to proceed with password recovery?", "Forgot Password", JOptionPane.ERROR_MESSAGE); 
        if (result == JOptionPane.YES_OPTION){
            pForgotPassword ForgotPassword = new pForgotPassword();
            ForgotPassword.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }       
    }//GEN-LAST:event_btnForgotPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(pLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgotPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> txtAccountType;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables


    protected static String ID, name,userRole;
    
    public static String getId(){
        return ID;
    }
    
    private boolean loginValidate() {
        
        boolean Validated = false;
        
        userRole = txtAccountType.getItemAt(txtAccountType.getSelectedIndex());
    
      
        try {
            if(userRole == "Center Manager"){
                String saveDir = System.getProperty("user.dir") + "\\src\\db\\";
            ID = txtUserID.getText();
            String Password = String.valueOf(txtPassword.getText());
            File centerManagerText = new File(saveDir + "centerManager_t.txt");
            if (!centerManagerText.exists()){
                centerManagerText.createNewFile();
            }
      
            Scanner inputFile = new Scanner(centerManagerText);
            String[] SelectedID;
            while (inputFile.hasNext())
            {
                
                String lEntry = inputFile.nextLine();
   
                SelectedID = lEntry.split(":");

                if (ID.equals(SelectedID[0]) && Password.equals(SelectedID[3])) {
                    Validated = true;
                    name = SelectedID[1];
                }
            }
            inputFile.close();
            }
            
            if(userRole == "Center Technician"){
                String saveDir = System.getProperty("user.dir") + "\\src\\db\\";
            ID = txtUserID.getText();
            String Password = String.valueOf(txtPassword.getText());
            File centerManagerText = new File(saveDir + "centerTechnician_t.txt");
            if (!centerManagerText.exists()){
                centerManagerText.createNewFile();
            }
      
            Scanner inputFile = new Scanner(centerManagerText);
            String[] SelectedID;
            while (inputFile.hasNext())
            {
                
                String lEntry = inputFile.nextLine();
   
                SelectedID = lEntry.split(":");

                if (ID.equals(SelectedID[0]) && Password.equals(SelectedID[3])) {
                    Validated = true;
                    name = SelectedID[1];
                }
            }
            inputFile.close();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An Error occured!");

        }
        return Validated;
    }



    private void addLoginLog(){
        
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String creationDate = datef.format(currentDate.getTime());
        String userID = txtUserID.getText();
        
        
        try{
            
           String Filename = "src\\db\\loginLog_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userRole + ":" + userID + ":" + name + ":" + creationDate);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!");
        }
    
    }
    


}
