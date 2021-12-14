/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

/**
 *
 * @author User
 */
public class customer extends user{
    
    int customerLoyaltyPoint;
    String customerAddress;
    
    public customer(String userId, String name, String email, String role, String accountCreationDate, int custLoyaltypoint, String customerAddress){
        super(userId, name, email, role, accountCreationDate);
        this.customerLoyaltyPoint = custLoyaltypoint;
        this.customerAddress = customerAddress;
    }
    
    public int getCustomerLoyaltyPoint(){
        return customerLoyaltyPoint;
    }
    
    public String getCustomerAddress(){
        return customerAddress;
    }
    
}
