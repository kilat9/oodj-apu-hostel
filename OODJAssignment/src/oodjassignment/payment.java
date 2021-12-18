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
public class payment {
    private String id, dateCreated, paymentManagerId, paymentTechnicianId, paymentAppointmentId;
    private double paymentAmount;

    public payment(double paymentAmount, String dateCreated, String paymentManagerId, String paymentTechnicianId, String paymentAppointmentId){
        // TODO: automatically set id
        this.paymentAmount = paymentAmount;
        this.dateCreated = dateCreated;
        this.paymentManagerId = paymentManagerId;
        this.paymentTechnicianId = paymentTechnicianId;
        this.paymentAppointmentId = paymentAppointmentId;
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
}
