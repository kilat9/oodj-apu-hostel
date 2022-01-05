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
public class feedback {
    private String feedbackID, message, dateCreated, feedbackTechnicianId, feedbackAppointmentId;

    public feedback(String feedbackID , String message, String dateCreated, String feedbackTechnicianId, String feedbackAppointmentId){
        // TODO: constructor thst automatically generates id
        
        this.feedbackID = feedbackID;
        this.message = message;
        this.dateCreated = dateCreated;
        this.feedbackTechnicianId = feedbackTechnicianId;
        this.feedbackAppointmentId = feedbackAppointmentId;
    }
    
   public String getFeedbackID() {
        return feedbackID;
    }


    public String getMessage() {
        return message;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getFeedbackTechnicianId() {
        return feedbackTechnicianId;
    }

    public String getFeedbackAppointmentId() {
        return feedbackAppointmentId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }
    
    public void addFeedback(String feedbackID ,String message, String dateCreated, String feedbackTechnicianId, String feedbackAppointmentId){
        try{
            

            String Filename = "src\\db\\feedback_t.txt";

            // Open the file.
            //Add onto the existing file
            FileWriter fw = new FileWriter(Filename, true);
            PrintWriter outputFile = new PrintWriter(fw);

            //Overide the existing file


                // Write the name to the file.
                outputFile.println(feedbackID + ":" + message + ":" + dateCreated + ":" + feedbackTechnicianId + ":" + feedbackAppointmentId );

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
      
       return "Feedback ID : " + getFeedbackID() + "\n" +
              "Technician ID : " + getFeedbackTechnicianId() + "\n" +
              "Appointment ID : " + getFeedbackAppointmentId() + "\n" +
              "Message : " + getMessage() + "\n"
              ;
   }
    
}
