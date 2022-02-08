/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment;

public abstract class user {

private String userId, name, email, accountCreationDate;
    
    public user(){
        userId = "0";
        name = "test";
        email = "test2gmail.com";
        accountCreationDate = "0/0/2021";
    }


    public user(String userId, String name, String email, String accountCreationDate){
        this.userId = userId;
        this.name = name;
        this.email = email;
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
    
    
    public void setAccountCreationDate(String accountCreationDate){
        this.accountCreationDate = accountCreationDate;
    }
    
  
}
