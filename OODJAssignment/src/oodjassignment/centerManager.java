/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class centerManager extends user{
 
    String password;
    public centerManager(){
        super();
        this.password = "pass";
    }
    
    public centerManager(String userId, String name, String email, String password, String accountCreationDate){
        super(userId, name, email, accountCreationDate);
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
     
    public void registerCustomer(String userId, String name, String email, String customerAddress, String accountCreationDate){
        try{
            

            String Filename = "src\\db\\customer_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + customerAddress + ":" + accountCreationDate);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!");
        }
    }
    
    
    
    public void registerCenterManager(String userId, String name, String email, String accountCreationDate, String password){
        try{
            

            String Filename = "src\\db\\centerManager_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + password + ":" + accountCreationDate );

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!" + " " +e);
        }
    }
    
    public void registerCenterTechnician(String userId, String name, String email, String accountCreationDate, String password, int basePay){
        try{
            

            String Filename = "src\\db\\centerTechnician_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + password + ":" + basePay + ":" + accountCreationDate);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!" + " " +e);
        }
    }
    
    @Override
    public String toString(){
      
       return "ID : " + super.getUserId()+ "\n" +
              "Name : " + super.getName() + "\n" +
              "Email : " + super.getEmail() + "\n" +
              "Account Creation Date : " + super.getAccountCreationDate() + "\n" +
              "Password : " + getPassword() + "\n"
              ;
   }
    
    UserForm updateUser = new UserForm();
    
    // UPDATE
    public void updateCustomer(int id, String name, String email, String address, String dateCreated, int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.customerList.getModel(); //model from JTable

        model.setValueAt(id, selectedRow, 0);
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(email, selectedRow, 2);        
        model.setValueAt(address, selectedRow, 3);    
        model.setValueAt(dateCreated, selectedRow, 4);

            //update from JTable to textfile
            try {
                File customerTXTF = new File("src/db/customer_t.txt");
                FileWriter fw = new FileWriter(customerTXTF);
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(int i = 0; i < rowCount; i++){ //rows in table
                    for(int j = 0; j < columnCount; j++){//columns in table
                        bw.write(updateUser.customerList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
            
            } catch (IOException ex) {}
    }
    
    public void updateManager(int id, String name, String email, String password, String dateCreated, int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.managerList.getModel(); //model from JTable

        model.setValueAt(id, selectedRow, 0);
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(email, selectedRow, 2);
        
        for(int i = 0; i< rowCount; i++){ //load passwords first
            model.setValueAt(updateUser.getPasswordManager(i), i, 3);
        }
        
        model.setValueAt(password, selectedRow, 3);    
        model.setValueAt(dateCreated, selectedRow, 4);

            //update from JTable to textfile
            try {
                File managerTXTF = new File("src/db/centerManager_t.txt");
                FileWriter fw = new FileWriter(managerTXTF);
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(int i = 0; i < rowCount; i++){ //rows in table
                    for(int j = 0; j < columnCount; j++){//columns in table
                        bw.write(updateUser.managerList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
            
            } catch (IOException ex) {}
    }
    
    public void updateTechnician(int id, String name, String email, String password, int payGrade, String dateCreated, int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.technicianList.getModel(); //model from JTable

        model.setValueAt(id, selectedRow, 0);
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(email, selectedRow, 2);
        
        for(int i = 0; i< rowCount; i++){ //load passwords first
            model.setValueAt(updateUser.getPasswordTechnician(i), i, 3);
        }
        
        model.setValueAt(password, selectedRow, 3);
        model.setValueAt(payGrade, selectedRow, 4);    
        model.setValueAt(dateCreated, selectedRow, 5);

            //update from JTable to textfile
            try {
                File technicianTXTF = new File("src/db/centerTechnician_t.txt");
                FileWriter fw = new FileWriter(technicianTXTF);
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(int i = 0; i < rowCount; i++){ //rows in table
                    for(int j = 0; j < columnCount; j++){//columns in table
                        bw.write(updateUser.technicianList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
            
            } catch (IOException ex) {}
    }
    
    // DELETE
    public void deleteCustomer(int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.customerList.getModel(); //model from JTable
        model.removeRow(selectedRow);
        
        //update from JTable to textfile
        try {
            File customerTXTF = new File("src/db/customer_t.txt");
            FileWriter fw = new FileWriter(customerTXTF);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < rowCount - 1; i++){ //rows in table //row -1 because has been removed
                for(int j = 0; j < columnCount; j++){//columns in table
                    bw.write(updateUser.customerList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {}
    }
    
    public void deleteCenterTechnician(int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.technicianList.getModel(); //model from JTable
        
        for(int i = 0; i< rowCount; i++){ //load passwords first
            model.setValueAt(updateUser.getPasswordTechnician(i), i, 3);
        }
        
        model.removeRow(selectedRow);
        
        //update from JTable to textfile
        try {
            File technicianTXTF = new File("src/db/centerTechnician_t.txt");
            FileWriter fw = new FileWriter(technicianTXTF);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < rowCount - 1; i++){ //rows in table //row -1 because has been removed
                for(int j = 0; j < columnCount; j++){//columns in table
                    bw.write(updateUser.technicianList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {}
    }
    
    public void deleteCenterManager(int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateUser.managerList.getModel(); //model from JTable
        
        for(int i = 0; i< rowCount; i++){ //load passwords first
            model.setValueAt(updateUser.getPasswordManager(i), i, 3);
        }
        
        model.removeRow(selectedRow);
        
        //update from JTable to textfile
        try {
            File managerTXTF = new File("src/db/centerManager_t.txt");
            FileWriter fw = new FileWriter(managerTXTF);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < rowCount - 1; i++){ //rows in table //row -1 because has been removed
                for(int j = 0; j < columnCount; j++){//columns in table
                    bw.write(updateUser.managerList.getValueAt(i, j).toString()+":"); //use delimiter ":" to seperate
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {}
    }
    
    
}
