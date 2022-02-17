/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kishe
 */
public class FeedbackForm extends javax.swing.JPanel {

    /**
     * Creates new form ResetPasswordForm
     */
    public FeedbackForm() {
        initComponents();
        initializeFeedback();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        feedbackList = new javax.swing.JTable();
        feedbackLBL = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        feedbackDate_TXT = new com.toedter.calendar.JDateChooser();
        feedbackDate_LBL = new javax.swing.JLabel();
        appointmentId_TXT = new javax.swing.JTextField();
        appointmentId_LBL = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        technicianId_TXT = new javax.swing.JTextField();
        technicianId_LBL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 215, 194));
        setPreferredSize(new java.awt.Dimension(900, 600));

        feedbackList.setAutoCreateRowSorter(true);
        feedbackList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        feedbackList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Message", "Date", "Technician ID", "Appointment ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feedbackList.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(feedbackList);

        feedbackLBL.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        feedbackLBL.setForeground(new java.awt.Color(0, 33, 88));
        feedbackLBL.setText("Feedback");

        printButton.setBackground(new java.awt.Color(0, 33, 71));
        printButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print to PDF");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        feedbackDate_TXT.setDateFormatString("dd/MM/y");
        feedbackDate_TXT.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        feedbackDate_TXT.setEnabled(false);
        feedbackDate_TXT.getCalendarButton().setEnabled(true);

        Calendar today = Calendar.getInstance();
        Date toDay = today.getTime();
        feedbackDate_TXT.setMaxSelectableDate(toDay); // select until today
        feedbackDate_TXT.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                feedbackDate_TXTPropertyChange(evt);
            }
        });

        feedbackDate_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        feedbackDate_LBL.setForeground(new java.awt.Color(0, 33, 71));
        feedbackDate_LBL.setText("Feedback Date :");

        appointmentId_TXT.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        appointmentId_TXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appointmentId_TXTKeyReleased(evt);
            }
        });

        appointmentId_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        appointmentId_LBL.setForeground(new java.awt.Color(0, 33, 71));
        appointmentId_LBL.setText("Appointment ID :");

        clearButton.setBackground(new java.awt.Color(0, 33, 71));
        clearButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Filters");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        technicianId_TXT.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        technicianId_TXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                technicianId_TXTKeyReleased(evt);
            }
        });

        technicianId_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        technicianId_LBL.setForeground(new java.awt.Color(0, 33, 71));
        technicianId_LBL.setText("Technician ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(feedbackLBL)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feedbackDate_LBL)
                            .addComponent(appointmentId_LBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feedbackDate_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointmentId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(technicianId_LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(technicianId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(feedbackDate_TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(appointmentId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(feedbackLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(feedbackDate_LBL, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(24, 24, 24)
                                        .addComponent(appointmentId_LBL))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(technicianId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(technicianId_LBL)))
                                        .addGap(18, 18, 18)
                                        .addComponent(clearButton)))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try{
           printFeedbackRecords();
           JOptionPane.showMessageDialog(null, "PDF report generated", "Success!", JOptionPane.INFORMATION_MESSAGE);
       } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "PDF cannot be created", "An Error occured!", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_printButtonActionPerformed

    private void printFeedbackRecords() throws FileNotFoundException{
        
        
        String filePath = "src\\reports\\feedback_records.pdf";
        PdfWriter pdf1 = new PdfWriter(filePath);
        
        PdfDocument pdfDoc = new PdfDocument(pdf1);
        
        Document Doc = new Document(pdfDoc);
        
        
        Style styleTitle = new Style();
        styleTitle.setTextAlignment(TextAlignment.CENTER);
        styleTitle.setBold();
        styleTitle.setUnderline();
        styleTitle.setFontSize(34);
        String title = "Feedback records";
        Paragraph p1 = new Paragraph(title).addStyle(styleTitle);
        
        Doc.add(p1);
        
        float columnWidth[] = {25,250,100,50,50};
        
        Table table1 = new Table(columnWidth);
        
        table1.addCell("ID");
        table1.addCell("Message");
        table1.addCell("Date");
        table1.addCell("Technician ID");
        table1.addCell("Appointment ID");
        
        
        for(int i=0; i<feedbackList.getRowCount() ;i++) {
            String ID = feedbackList.getValueAt(i, 0).toString();
            String Message = feedbackList.getValueAt(i, 1).toString();
            String Date = feedbackList.getValueAt(i, 2).toString();
            String Technician = feedbackList.getValueAt(i, 3).toString();
            String Appointment = feedbackList.getValueAt(i, 4).toString();
            
            table1.addCell(ID);
            table1.addCell(Message);
            table1.addCell(Date);
            table1.addCell(Technician);
            table1.addCell(Appointment);
        }
        
        Doc.add(table1);
        
        Doc.close();
        
    }
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        technicianId_TXT.setText("");
        appointmentId_TXT.setText("");
        feedbackDate_TXT.setDate(null);
        initializeFeedback();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void appointmentId_TXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentId_TXTKeyReleased
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int numbersOnly = 0;
        
        for(int digit =0; digit < appointmentId_TXT.getText().length(); digit++){ //for each character in string
            for(int i =0; i < numbers.length; i++){ //check if matches with each digit
                if (appointmentId_TXT.getText().substring(digit, digit + 1).equals(numbers[i])){
                    numbersOnly++; // increment by 1
                }
            }
        }
        
        if (appointmentId_TXT.getText().length() != numbersOnly){
            JOptionPane.showMessageDialog(null, "The appointment id entered is invalid", "Only Numbers Allowed", JOptionPane.WARNING_MESSAGE);
            appointmentId_TXT.requestFocus();
        } else {
            filterPayment();
        }
    }//GEN-LAST:event_appointmentId_TXTKeyReleased

    private void feedbackDate_TXTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_feedbackDate_TXTPropertyChange
        filterPayment();
    }//GEN-LAST:event_feedbackDate_TXTPropertyChange

    private void technicianId_TXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_technicianId_TXTKeyReleased
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int numbersOnly = 0;
        
        for(int digit =0; digit < technicianId_TXT.getText().length(); digit++){ //for each character in string
            for(int i =0; i < numbers.length; i++){ //check if matches with each digit
                if (technicianId_TXT.getText().substring(digit, digit + 1).equals(numbers[i])){
                    numbersOnly++; // increment by 1
                }
            }
        }
        
        if (technicianId_TXT.getText().length() != numbersOnly){
            JOptionPane.showMessageDialog(null, "The technician id entered is invalid", "Only Numbers Allowed", JOptionPane.WARNING_MESSAGE);
            technicianId_TXT.requestFocus();
        } else {
            filterPayment();
        }
    }//GEN-LAST:event_technicianId_TXTKeyReleased
    
    SimpleDateFormat loginDateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    private void filterPayment(){
        //LOGIN LOG_T
        File feedback = new File("src/db/feedback_t.txt");
        
        try{         
        FileReader fr = new FileReader(feedback);
        BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel)feedbackList.getModel();
        model.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            if(feedbackDate_TXT.getDate() != null && ( appointmentId_TXT.getText().equals("") == true ) && ( technicianId_TXT.getText().equals("") == true )){  // code to filter based on condition
                if(row[2].contains(loginDateFormatter.format(feedbackDate_TXT.getDate())) == true){
                    model.addRow(row); //load data
                }
            }
            else if(feedbackDate_TXT.getDate() == null && ( appointmentId_TXT.getText().equals("") == false ) && ( technicianId_TXT.getText().equals("") == true )){  // code to filter based on condition
                if(row[4].equals(appointmentId_TXT.getText()) == true){
                    model.addRow(row); //load data
                }
            }
            else if(feedbackDate_TXT.getDate() == null && ( appointmentId_TXT.getText().equals("") == true ) && ( technicianId_TXT.getText().equals("") == false )){  // code to filter based on condition
                if(row[3].equals(technicianId_TXT.getText()) == true){
                    model.addRow(row); //load data
                }
            }
            else if(feedbackDate_TXT.getDate() != null && ( appointmentId_TXT.getText().equals("") == false ) && ( technicianId_TXT.getText().equals("") == true )){  // code to filter based on condition
                if(row[2].contains(loginDateFormatter.format(feedbackDate_TXT.getDate())) == true){
                    if(row[4].equals(appointmentId_TXT.getText()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if(feedbackDate_TXT.getDate() != null && ( appointmentId_TXT.getText().equals("") == true ) && ( technicianId_TXT.getText().equals("") == false )){  // code to filter based on condition
                if(row[2].contains(loginDateFormatter.format(feedbackDate_TXT.getDate())) == true){
                    if(row[3].equals(technicianId_TXT.getText()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if(feedbackDate_TXT.getDate() == null && ( appointmentId_TXT.getText().equals("") == false ) && ( technicianId_TXT.getText().equals("") == false )){  // code to filter based on condition
                if(row[4].equals(appointmentId_TXT.getText()) == true){
                    if(row[3].equals(technicianId_TXT.getText()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if (feedbackDate_TXT.getDate() != null && ( appointmentId_TXT.getText().equals("") == false ) && ( technicianId_TXT.getText().equals("") == false )) { // FILTER USING ALL
                if(row[4].equals(appointmentId_TXT.getText()) == true){
                    if(row[3].equals(technicianId_TXT.getText()) == true){
                        if(row[2].contains(loginDateFormatter.format(feedbackDate_TXT.getDate())) == true){
                            model.addRow(row); //load data
                        }
                    }
                }
            }
            else { initializeFeedback(); }
            
        }
        } catch(FileNotFoundException ex){}
    }
    
    private void initializeFeedback(){
        //Feedback_T
        File feedback = new File("src/db/feedback_t.txt");
        
        try{         
        FileReader fr = new FileReader(feedback);
        BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel)feedbackList.getModel();
        model.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(":");
            model.addRow(row); //load data
        }
        } catch(FileNotFoundException ex){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentId_LBL;
    protected javax.swing.JTextField appointmentId_TXT;
    private static javax.swing.JButton clearButton;
    private javax.swing.JLabel feedbackDate_LBL;
    private com.toedter.calendar.JDateChooser feedbackDate_TXT;
    private javax.swing.JLabel feedbackLBL;
    static javax.swing.JTable feedbackList;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JButton printButton;
    private javax.swing.JLabel technicianId_LBL;
    protected javax.swing.JTextField technicianId_TXT;
    // End of variables declaration//GEN-END:variables
}
