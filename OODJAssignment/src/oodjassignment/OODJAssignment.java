/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oodjassignment;

/**
 *
 * @author User
 */
public class OODJAssignment {
    public static void main(String[] args) {
        centerManager user1 = new centerManager("1","John Doe", "test@gmail.com", "CT", "15/12/2021", "pass");
        
        user1.registerCustomer("1","Customer Name", "test@gmail.com", "customer", "15/12/2021", 0, "27, Taman Minang, Kuala Lumpur");
        
        user1.registerCenterManager("1","John Doe", "test@gmail.com", "CT", "15/12/2021", "pass");
    }
    
}
