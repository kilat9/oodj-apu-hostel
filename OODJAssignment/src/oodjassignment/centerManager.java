/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class centerManager extends user{
 
    String password;
    public centerManager(){
        super();
        this.password = "pass";
    }
    
    public centerManager(String userId, String name, String email, String role, String accountCreationDate, String password){
        super(userId, name, email, role, accountCreationDate);
        super.setRole("CM");
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
     
    public void registerCustomer(String userId, String name, String email, String role, String accountCreationDate, int custLoyaltypoint, String customerAddress){
        try{
            

            String Filename = "src\\db\\customer_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + role + ":" + accountCreationDate + ":" + custLoyaltypoint + ":" +  customerAddress);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!");
        }
    }
    
    
    
    public void registerCenterManager(String userId, String name, String email, String role, String accountCreationDate, String password){
        try{
            

            String Filename = "src\\db\\centerManager_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + role + ":" + accountCreationDate + ":" + password);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!" + " " +e);
        }
    }
    
    
    
    
    
}
