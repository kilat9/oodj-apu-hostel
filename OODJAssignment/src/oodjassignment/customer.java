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
    
    String customerAddress;
    
    public customer(String userId, String name, String email,  String customerAddress, String accountCreationDate){
        super(userId, name, email, accountCreationDate);
        this.customerAddress = customerAddress;
    }
    
    
    public String getCustomerAddress(){
        return customerAddress;
    }
    
    public String toString(){
      
       return "ID : " + super.getUserId()+ "\n" +
              "Name : " + super.getName() + "\n" +
              "Email : " + super.getEmail() + "\n" +
              "Address : " +  getCustomerAddress() +"\n" +
              "Account Creation Date : " + super.getAccountCreationDate() + "\n"
              ;
   }
    
}
