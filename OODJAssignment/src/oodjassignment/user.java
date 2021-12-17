/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

public abstract class user {

String userId, name, email, role;
String accountCreationDate;
    
    public user(){
        userId = "0";
        name = "test";
        email = "test2gmail.com";
        role = "CT";
        accountCreationDate = "0/0/2021";
    }


    public user(String userId, String name, String email, String role, String accountCreationDate){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.role = role;
        this.accountCreationDate = accountCreationDate;
    }

    public String getUserId(){
        return userId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getRole(){
        return role;
    }
    
    public String getAccountCreationDate(){
        return accountCreationDate;
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public void setAccountCreationDate(String accountCreationDate){
        this.accountCreationDate = accountCreationDate;
    }
    
  
}
