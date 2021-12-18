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
public class feedback {
    private String id, message, dateCreated, feedbackTechnicianId, feedbackAppointmentId;

    public feedback(String message, String dateCreated, String feedbackTechnicianId, String feedbackAppointmentId){
        // TODO: constructor thst automatically generates id

        this.message = message;
        this.dateCreated = dateCreated;
        this.feedbackTechnicianId = feedbackTechnicianId;
        this.feedbackAppointmentId = feedbackAppointmentId;
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
}
