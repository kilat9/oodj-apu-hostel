/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.io.File;
import java.util.Scanner;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User ID");

        jLabel2.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center Manager", "Center Technician" }));
        txtAccountType.setToolTipText("");

        jLabel3.setText("Account Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                            .addComponent(txtPassword))
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnLogin)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (loginValidate()) {
             //JOptionPane.showMessageDialog(null, "Login Successful!");
             
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
            
             this.setVisible(false);             
        } else {
            JOptionPane.showMessageDialog(null, "Login failed! Your ID or password may be wrong.", "Account Authentication Failed!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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

                if (ID.equals(SelectedID[0]) && Password.equals(SelectedID[5])) {
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

                if (ID.equals(SelectedID[0]) && Password.equals(SelectedID[5])) {
                    Validated = true;
                    name = SelectedID[1];
                }
            }
            inputFile.close();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return Validated;
    }









}
