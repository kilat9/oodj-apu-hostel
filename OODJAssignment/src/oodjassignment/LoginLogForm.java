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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static oodjassignment.PaymentForm.paymentList;

/**
 *
 * @author kishe
 */
public class LoginLogForm extends javax.swing.JPanel {

    /**
     * Creates new form ResetPasswordForm
     */
    public LoginLogForm() {
        initComponents();
        initializeLoginLogs();
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
        loginLogList = new javax.swing.JTable();
        loginLogLBL = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        loginDate_TXT = new com.toedter.calendar.JDateChooser();
        loginDate_LBL = new javax.swing.JLabel();
        roleCB = new javax.swing.JComboBox<>();
        selectUserLBL = new javax.swing.JLabel();
        userId_TXT = new javax.swing.JTextField();
        userId_LBL = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(235, 215, 194));
        setPreferredSize(new java.awt.Dimension(900, 600));

        loginLogList.setAutoCreateRowSorter(true);
        loginLogList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        loginLogList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Role", "User_ID", "Name", "Login Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loginLogList.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(loginLogList);

        loginLogLBL.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        loginLogLBL.setForeground(new java.awt.Color(0, 33, 88));
        loginLogLBL.setText("Login Logs");

        printButton.setBackground(new java.awt.Color(0, 33, 71));
        printButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print to PDF");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        loginDate_TXT.setDateFormatString("dd/MM/y");
        loginDate_TXT.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        loginDate_TXT.setEnabled(false);
        loginDate_TXT.getCalendarButton().setEnabled(true);

        Calendar today = Calendar.getInstance();
        Date toDay = today.getTime();
        loginDate_TXT.setMaxSelectableDate(toDay); // select until today
        loginDate_TXT.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                loginDate_TXTPropertyChange(evt);
            }
        });

        loginDate_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        loginDate_LBL.setForeground(new java.awt.Color(0, 33, 71));
        loginDate_LBL.setText("Login Date :");

        roleCB.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Center Manager", "Center Technician" }));
        roleCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCBActionPerformed(evt);
            }
        });

        selectUserLBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        selectUserLBL.setForeground(new java.awt.Color(0, 33, 71));
        selectUserLBL.setText("Select User:");

        userId_TXT.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        userId_TXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userId_TXTKeyReleased(evt);
            }
        });

        userId_LBL.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        userId_LBL.setForeground(new java.awt.Color(0, 33, 71));
        userId_LBL.setText("User ID :");

        clearButton.setBackground(new java.awt.Color(0, 33, 71));
        clearButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Filters");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginLogLBL)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginDate_LBL)
                            .addComponent(userId_LBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginDate_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectUserLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roleCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginDate_TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(userId_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginLogLBL)
                                        .addComponent(selectUserLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roleCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(loginDate_LBL, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(userId_LBL))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(clearButton)))
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try{
           printLoginLogs();
           JOptionPane.showMessageDialog(null, "PDF report generated", "Success!", JOptionPane.INFORMATION_MESSAGE);
       } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "PDF cannot be created", "An Error occured!", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_printButtonActionPerformed

    private void printLoginLogs() throws FileNotFoundException{
        
        
        String filePath = "src\\reports\\login_records.pdf";
        PdfWriter pdf1 = new PdfWriter(filePath);
        
        PdfDocument pdfDoc = new PdfDocument(pdf1);
        
        Document Doc = new Document(pdfDoc);
        
        
        Style styleTitle = new Style();
        styleTitle.setTextAlignment(TextAlignment.CENTER);
        styleTitle.setBold();
        styleTitle.setUnderline();
        styleTitle.setFontSize(34);
        String title = "Login records";
        Paragraph p1 = new Paragraph(title).addStyle(styleTitle);
        
        Doc.add(p1);
        
        float columnWidth[] = {50,100,100,100};
        
        Table table1 = new Table(columnWidth);
        
        table1.addCell("User Role");
        table1.addCell("User ID");
        table1.addCell("Name");
        table1.addCell("Login Date");
        
        
        for(int i=0; i<loginLogList.getRowCount() ;i++) {
            String Role = loginLogList.getValueAt(i, 0).toString();
            String ID = loginLogList.getValueAt(i, 1).toString();
            String Name = loginLogList.getValueAt(i, 2).toString();
            String Date = loginLogList.getValueAt(i, 3).toString();
            
            table1.addCell(Role);
            table1.addCell(ID);
            table1.addCell(Name);
            table1.addCell(Date);
        }
        
        Doc.add(table1);
        
        Doc.close();
        
    }
    
    private void roleCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCBActionPerformed
        filterLoginLogs();
    }//GEN-LAST:event_roleCBActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        roleCB.setSelectedIndex(0);
        userId_TXT.setText("");
        loginDate_TXT.setDate(null);
        initializeLoginLogs();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void userId_TXTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userId_TXTKeyReleased
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int numbersOnly = 0;
        
        for(int digit =0; digit < userId_TXT.getText().length(); digit++){ //for each character in string
            for(int i =0; i < numbers.length; i++){ //check if matches with each digit
                if (userId_TXT.getText().substring(digit, digit + 1).equals(numbers[i])){
                    numbersOnly++; // increment by 1
                }
            }
        }
        
        if (userId_TXT.getText().length() != numbersOnly){
            JOptionPane.showMessageDialog(null, "The user id entered is invalid", "Only Numbers Allowed", JOptionPane.WARNING_MESSAGE);
            userId_TXT.requestFocus();
        } else {
            filterLoginLogs();
        }
    }//GEN-LAST:event_userId_TXTKeyReleased

    private void loginDate_TXTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_loginDate_TXTPropertyChange
        filterLoginLogs();
    }//GEN-LAST:event_loginDate_TXTPropertyChange
    
    SimpleDateFormat loginDateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    private void filterLoginLogs(){
        //LOGIN LOG_T
        File loginLog = new File("src/db/loginLog_t.txt");
        
        try{         
        FileReader fr = new FileReader(loginLog);
        BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel)loginLogList.getModel();
        model.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(";");
            if(loginDate_TXT.getDate() != null && ( userId_TXT.getText().equals("") == true ) && roleCB.getSelectedIndex() == 0){  // code to filter based on condition
                if(row[3].contains(loginDateFormatter.format(loginDate_TXT.getDate())) == true){
                    model.addRow(row); //load data
                }
            }
            else if(loginDate_TXT.getDate() == null && ( userId_TXT.getText().equals("") == false ) && roleCB.getSelectedIndex() == 0){  // code to filter based on condition
                if(row[1].equals(userId_TXT.getText()) == true){
                    model.addRow(row); //load data
                }
            }
            else if(loginDate_TXT.getDate() == null && ( userId_TXT.getText().equals("") == true ) && roleCB.getSelectedIndex() != 0){  // code to filter based on condition
                if(row[0].equals(roleCB.getSelectedItem().toString()) == true){
                    model.addRow(row); //load data
                }
            }
            else if(loginDate_TXT.getDate() != null && ( userId_TXT.getText().equals("") == false ) && roleCB.getSelectedIndex() == 0){  // code to filter based on condition
                if(row[3].contains(loginDateFormatter.format(loginDate_TXT.getDate())) == true){
                    if(row[1].equals(userId_TXT.getText()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if(loginDate_TXT.getDate() != null && ( userId_TXT.getText().equals("") == true ) && roleCB.getSelectedIndex() != 0){  // code to filter based on condition
                if(row[3].contains(loginDateFormatter.format(loginDate_TXT.getDate())) == true){
                    if(row[0].equals(roleCB.getSelectedItem().toString()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if(loginDate_TXT.getDate() == null && ( userId_TXT.getText().equals("") == false ) && roleCB.getSelectedIndex() != 0){  // code to filter based on condition
                if(row[1].equals(userId_TXT.getText()) == true){
                    if(row[0].equals(roleCB.getSelectedItem().toString()) == true){
                        model.addRow(row); //load data
                    }
                }
            }
            else if (loginDate_TXT.getDate() != null && ( userId_TXT.getText().equals("") == false ) && roleCB.getSelectedIndex() != 0) { // FILTER USING ALL
                if(row[1].equals(userId_TXT.getText()) == true){
                    if(row[0].equals(roleCB.getSelectedItem().toString()) == true){
                        if(row[3].contains(loginDateFormatter.format(loginDate_TXT.getDate())) == true){
                            model.addRow(row); //load data
                        }
                    }
                }
            }
            else { initializeLoginLogs(); }
            
        }
        } catch(FileNotFoundException ex){}
    }
    
    private void initializeLoginLogs(){
        //LOGIN LOG_T
        File loginLog = new File("src/db/loginLog_t.txt");
        
        try{         
        FileReader fr = new FileReader(loginLog);
        BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel)loginLogList.getModel();
        model.setRowCount(0); //clear table
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++){
            String[] row = lines[i].toString().split(";");
            model.addRow(row); //load data
        }
        } catch(FileNotFoundException ex){}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton clearButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loginDate_LBL;
    private com.toedter.calendar.JDateChooser loginDate_TXT;
    private javax.swing.JLabel loginLogLBL;
    static javax.swing.JTable loginLogList;
    private static javax.swing.JButton printButton;
    protected javax.swing.JComboBox<String> roleCB;
    private javax.swing.JLabel selectUserLBL;
    private javax.swing.JLabel userId_LBL;
    protected javax.swing.JTextField userId_TXT;
    // End of variables declaration//GEN-END:variables
}
