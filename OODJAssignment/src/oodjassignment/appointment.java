/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

/**
 *
 * @author kishe
 */
public class appointment {
    private String id, appointmentTime, appliance, dateCreated, appointmentCustomerId, appointmentManagerId, appointmentTechnicianId;
    
    public appointment(String appointmentTime, String appliance, String dateCreated, String appointmentCustomerId, String appointmentTechnicianId){
        // constructor does not take in appointmentManagerId as it is obtained from login
        // TODO: get appointmentManagerId from login
        appointmentManagerId = "1"; // else assign to first manager
        
        // TODO: automatic ID assignment
        
        this.appointmentTime = appointmentTime;
        this.appliance = appliance;
        this.dateCreated = dateCreated;
        this.appointmentCustomerId = appointmentCustomerId;
        this.appointmentTechnicianId = appointmentTechnicianId;
    }
    
    public String getAppointmentTime(){
        return id;
    }
    
    public String getAppliance(){
        return appliance;
    }
    
    public String getAppointmentCustomerId(){
        return appointmentCustomerId;
    }
    
    public String getAppointmentManagerId(){
        return appointmentManagerId;
    }
    
    public String getAppointmentTechnicianId(){
        return appointmentTechnicianId;
    }
    
    public void setAppointmentTime(String appointmentTime){
        this.appointmentTime = appointmentTime ;
    }
    
    public void setAppliance(String appliance){
        this.appliance = appliance;
    }
    
    public void setAppointmentCustomerId(String appointmentCustomerId){
        this.appointmentCustomerId = appointmentCustomerId;
    }
    
    public void setAppointmentManagerId(String appointmentManagerId){
        this.appointmentManagerId = appointmentManagerId;
    }
    
    public void setAppointmentTechnicianId(String appointmentTechnicianId){
        this.appointmentTechnicianId = appointmentTechnicianId;
    }
}
