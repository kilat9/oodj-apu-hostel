/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author kishe
 */
public class payment {
    private String id, dateCreated, paymentManagerId, paymentTechnicianId, paymentAppointmentId;
    private double paymentAmount;

    public payment(String paymentID ,double paymentAmount, String dateCreated, String paymentManagerId, String paymentTechnicianId, String paymentAppointmentId){
        // TODO: automatically set id
        this.id = paymentID;
        this.paymentAmount = paymentAmount;
        this.dateCreated = dateCreated;
        this.paymentManagerId = paymentManagerId;
        this.paymentTechnicianId = paymentTechnicianId;
        this.paymentAppointmentId = paymentAppointmentId;
    }
    
    public String getPaymentID() {
        return id;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getPaymentManagerId() {
        return paymentManagerId;
    }

    public String getPaymentTechnicianId() {
        return paymentTechnicianId;
    }

    public String getPaymentAppointmentId() {
        return paymentAppointmentId;
    }
    
    public void setPaymentID(String paymentID) {
        this.id = paymentID;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentManagerId(String paymentManagerId) {
        this.paymentManagerId = paymentManagerId;
    }

    public void setPaymentTechnicianId(String paymentTechnicianId) {
        this.paymentTechnicianId = paymentTechnicianId;
    }

    public void setPaymentAppointmentId(String paymentAppointmentId) {
        this.paymentAppointmentId = paymentAppointmentId;
    }
    
  
    public void addPayment(String paymentID, double paymentAmount, String dateCreated, String paymentManagerId, String paymentTechnicianId, String paymentAppointmentId){
        try{
            

            String Filename = "src\\db\\payment_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(paymentID + ":" + paymentAmount + ":" + dateCreated + ":" + paymentManagerId + ":" + paymentTechnicianId + ":" + paymentAppointmentId);

                outputFile.close(); // Close the file.
                System.out.println("Data written to the file.");

                //JOptionPane.showMessageDialog(null, "Adding Succesful!");
        }
        catch(IOException e){

            JOptionPane.showMessageDialog(null, "An error occured!");
        }
    }
    
    @Override
    public String toString(){
      
       return "Payment ID : " + getPaymentID() + "\n" +
              "Payment Amount : " + getPaymentAmount() + "\n" +
              "Date : " + getDateCreated()+ "\n" +
              "Manager ID : " + getPaymentManagerId() + "\n" +
              "Technician ID : " + getPaymentTechnicianId() + "\n" +
              "Appointment ID : " + getPaymentAppointmentId() + "\n" 
              ;
   }
    
}
