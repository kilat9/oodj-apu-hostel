/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kishe
 */
public class appointment {
    private String id, appointmentTime, appliance, dateCreated, appointmentCustomerId, appointmentManagerId, appointmentTechnicianId;
    
    public appointment(String id, String appointmentTime, String appliance, String dateCreated, String appointmentCustomerId, String appointmentManagerId, String appointmentTechnicianId){
        try{
            //Open the file
            String filename = "src/db/appointment_t.txt";
            FileWriter fw = new FileWriter(filename, true); //append
            PrintWriter outputFile = new PrintWriter(fw);

            //Write Data
            outputFile.print(id +
                ";" + appointmentTime +
                ";" + appliance +
                ";" + dateCreated +
                ";" + appointmentCustomerId +
                ";" + appointmentManagerId +
                ";" + appointmentTechnicianId
                    + "\r\n");

            outputFile.close();
        } catch (IOException ex){}
    }
    
    AppointmentForm updateAppointment = new AppointmentForm();
    public appointment(String id, String appointmentTime, String appliance, String dateCreated, String appointmentCustomerId, String appointmentManagerId, String appointmentTechnicianId, int rowCount, int columnCount, int selectedRow){
        DefaultTableModel model = (DefaultTableModel)updateAppointment.appointmentList.getModel(); //model from JTable
        
        model.setValueAt(id, selectedRow, 0); // id
        model.setValueAt(appointmentTime, selectedRow, 1); //appointmentTime
        model.setValueAt(appliance, selectedRow, 2); // appliance
        model.setValueAt(dateCreated, selectedRow, 3); // dateCreated
        model.setValueAt(appointmentCustomerId, selectedRow, 4); // customer id
        model.setValueAt(appointmentManagerId, selectedRow, 5); // manager id
        model.setValueAt(appointmentTechnicianId, selectedRow, 6); // technician id
        
        //update from JTable to textfile
        try {
            File appointmentTXTF = new File("src/db/appointment_t.txt");
            FileWriter fw = new FileWriter(appointmentTXTF);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < rowCount; i++){ //rows in appointment List table
                for(int j = 0; j < columnCount; j++){//columns in appointment list table
                    bw.write(updateAppointment.appointmentList.getValueAt(i, j).toString()+";"); //use delimiter ";" to seperate
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {}
    }
    
    public String getAppointmentTime(){
        return appointmentTime;
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
