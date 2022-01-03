/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class centerTechnician extends user{
    
 String password;
 double basePay;
 
    public centerTechnician(){
        super();
        this.password = "pass";
        this.basePay = 0;
    }
    
    public centerTechnician(String userId, String name, String email, String role, String accountCreationDate, String password, double basePay){
        super(userId, name, email, role, accountCreationDate);
        super.setRole("CT");
        this.password = password;
        this.basePay = basePay;
    }
    
    public String getPassword(){
        return password;
    }
    
    public double getBasePay(){
        return basePay;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setBasePay( double basePay){
        this.basePay = basePay;
    }
    
     
    public void registerCenterTechnician(String userId, String name, String email, String role, String accountCreationDate, String password, double basePay){
        try{
            

            String Filename = "src\\db\\centerTechnician_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(userId + ":" + name + ":" + email + ":" + role + ":" + accountCreationDate + ":" + password + ":" + basePay);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!");
        }
    }
    
    
    
    public String toString(){
      
       return "ID : " + super.getUserId()+ "\n" +
              "Name : " + super.getName() + "\n" +
              "Email : " + super.getEmail() + "\n" +
              "Role : " + super.getRole() + "\n" +
              "Account Creation Date : " + super.getAccountCreationDate() + "\n" +
              "Password : " + getPassword() + "\n" +
              "Base Pay : " + getBasePay() + "\n" 
              ;
   }   
}
