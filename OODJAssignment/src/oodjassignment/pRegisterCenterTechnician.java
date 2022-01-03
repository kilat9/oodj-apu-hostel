/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodjassignment;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class pRegisterCenterTechnician extends javax.swing.JFrame {

    /**
     * Creates new form pRegisterCustomer
     */
    public pRegisterCenterTechnician() {
        initComponents();
        AutoCenterTechnicianID();
        if (txtID.getText().equals("")){
                    txtID.setText("1");
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblBasePay = new javax.swing.JLabel();
        txtBasePay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Register Center Technician");

        txtID.setEditable(false);

        lblUserID.setText("User ID");

        lblName.setText("Name");

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        lblPassword.setText("Password");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        lblBasePay.setText("Base Pay");

        txtBasePay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBasePayFocusLost(evt);
            }
        });
        txtBasePay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBasePayKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnRegister)
                .addGap(133, 133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblUserID)
                            .addGap(292, 292, 292))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPassword)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblName)))
                            .addGap(300, 300, 300)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBasePay)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBasePay)
                    .addComponent(txtPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEmail)
                    .addComponent(txtName))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserID)
                        .addGap(35, 35, 35)
                        .addComponent(lblName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBasePay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBasePay))
                .addGap(35, 35, 35)
                .addComponent(btnRegister)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String userID, name, email, role, accountCreationDate, password;
    double basePay;
    boolean IsEmpty, validPassword;
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
   
        try{

            //Overide the existing file

            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
        
        
            userID = txtID.getText();
            name = txtName.getText();
            email = txtEmail.getText();
            role = "CM";
            accountCreationDate = datef.format(currentDate.getTime());
            password = txtPassword.getText();
            basePay = Double.parseDouble(txtBasePay.getText());
           
            
            IsEmpty = true;
            CheckEmpty();
            CheckPassword();

            if (IsEmpty == false){

                // Write the name to the file.
                centerManager ct = new centerManager();
                ct.registerCenterTechnician(userID, name, email , role , accountCreationDate , password, basePay);

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
                ClearText();
                AutoCenterTechnicianID();
                
                centerManager newCT = new centerManager(userID, name, email , role , accountCreationDate , password);
            
                JOptionPane.showMessageDialog(null, newCT.toString(), "Adding Succesful!",  JOptionPane.PLAIN_MESSAGE );
                
            }else {
                JOptionPane.showMessageDialog(null, "Make sure all input fields are properly keyed in");

            }

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, "An error occured!");

    }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if(txtName.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "Invalid symbol ':' used ");
            txtName.setText("");
       } 
    }//GEN-LAST:event_txtNameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "Invalid symbol ':' used ");
            txtEmail.setText("");
       } 
        
        if(txtEmail.getText().contains("@")){
            lblEmail.setForeground(Color.BLACK);
        } else{
            JOptionPane.showMessageDialog(null, "Invalid Email format");
            txtEmail.setText("");
            lblEmail.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "Invalid symbol ':' used ");
            txtPassword.setText("");
       } 
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtBasePayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBasePayFocusLost
        if(txtBasePay.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "Invalid symbol ':' used ");
            txtBasePay.setText("");
       } 
    }//GEN-LAST:event_txtBasePayFocusLost

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBasePayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBasePayKeyReleased
        String value = txtBasePay.getText();
            int l = value.length();
            if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyChar() <= '-' ) {
               if(l <0 || l>12){
               JOptionPane.showMessageDialog(null, "Invalid Length");
                txtBasePay.setText("");
               }
            } else {
               JOptionPane.showMessageDialog(null, "Please enter only numbers");
                txtBasePay.setText("");
            }
    }//GEN-LAST:event_txtBasePayKeyReleased

    
    private void defaultLabelColor(){
            lblUserID.setForeground(Color.BLACK);
            lblName.setForeground(Color.BLACK);
            lblEmail.setForeground(Color.BLACK);
            lblPassword.setForeground(Color.BLACK);
    }
    
    private void CheckPassword(){
        if (txtPassword.getText().length() < 6){
           defaultLabelColor();
           lblPassword.setForeground(Color.red);
           JOptionPane.showMessageDialog(null, "Password length is less than 6 characters!");
           txtPassword.setText("");
           validPassword = false;
        } else {
            validPassword = true;
            defaultLabelColor();
        }
    }
    
    
    private void CheckEmpty(){
    
        if (txtID.getText().equals("")){
           txtID.setText("1");
        } else if (txtName.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblName.setForeground(Color.red);
            
        } else if (txtEmail.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblEmail.setForeground(Color.red);
            
        }else if (txtPassword.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblPassword.setForeground(Color.red);
        }else if (txtBasePay.getText().equals("")){
           IsEmpty = true;
           defaultLabelColor();
           lblBasePay.setForeground(Color.red);
        }else{
           IsEmpty = false;
           defaultLabelColor();
        }
       
    }
    
    private void ClearText(){
         
           txtID.setText("");
           txtName.setText("");
           txtEmail.setText("");
           txtPassword.setText("");
           defaultLabelColor();
    }
    
     private void AutoCenterTechnicianID(){
        //DecimalFormat dc = new DecimalFormat("000000");
        // This is to ensure the entire method have access to the selectedID array
        String[] selectedID = null;
        try {
            String dir = System.getProperty("user.dir") + "\\src\\DB\\";
            // For debugging purpose only
            // JOptionPane.showMessageDialog(null, bID);
            File customertxt = new File(dir + "centerTechnician_t.txt");
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
                txtID.setText(String.valueOf(newCustomerID));
                
                
            } catch (FileNotFoundException ex) {
              
            }
        }
        catch (Exception ex) {
   
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
            java.util.logging.Logger.getLogger(pRegisterCenterTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pRegisterCenterTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pRegisterCenterTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pRegisterCenterTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pRegisterCenterTechnician().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBasePay;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtBasePay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}