/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MayorRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Funds.Fund;
import Business.WorkQueue.EPASpecialistMayorWorkRequest;
import Business.WorkQueue.HealthOfficerMayorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanda
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    WorkRequest request;
    private int initialFundsAvailable;
    private Date date;
    private Enterprise enterprise;
    private ArrayList<Object> transactionHist;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, WorkRequest request, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise = enterprise;
        transactionHist = new ArrayList<>();
        date = new Date();
 
        
//        boolean isFirstTransaction = true;
//        for(Fund fund : enterprise.getFundsHistory().getTransactionsHist()){
            System.out.println("Avlbl funds:"+ enterprise.getFundsHistory().getInitialMayorFunds());
            fundsAvailTxt.setText(Integer.toString(enterprise.getFundsHistory().getInitialMayorFunds()) );
//            isFirstTransaction = false;
//        }
//        
//        if (isFirstTransaction == true){
//            
//        }
        
        
        populateTable();
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fundsAllocatedTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        allFunds = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fundsAvailTxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        submitJButton.setBackground(java.awt.Color.white);
        submitJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Comments");

        backJButton.setBackground(java.awt.Color.white);
        backJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        fundsAllocatedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Allocated to", "Fund Closing Balance", "Date"
            }
        ));
        jScrollPane1.setViewportView(fundsAllocatedTable);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Allocate");

        orgCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("to");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Funds available:");

        fundsAvailTxt.setEditable(false);
        fundsAvailTxt.setEnabled(false);
        fundsAvailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundsAvailTxtActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Funds Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(allFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fundsAvailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultJTextField)))
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fundsAvailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(allFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewWorkRequestsJPanel dwjp = (ViewWorkRequestsJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(allFunds.getText().trim().length()== 0){
            JOptionPane.showMessageDialog(null, "Please enter the amount to be allocated", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(resultJTextField.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter the Comments", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!(allFunds.getText().matches("^[0-9]*"))){
            JOptionPane.showMessageDialog(null, "Please enter valid amount to be allocated", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(request instanceof HealthOfficerMayorWorkRequest){
            System.out.println("M here");
            HealthOfficerMayorWorkRequest hwr = (HealthOfficerMayorWorkRequest)request;
            hwr.setTestResult(resultJTextField.getText());
            hwr.setStatus("Completed");
        }else{
            System.out.println("M nt here");
            EPASpecialistMayorWorkRequest ewr = (EPASpecialistMayorWorkRequest)request;
            ewr.setTestResult(resultJTextField.getText());
            ewr.setStatus("Completed");
        }
        Float closingBalance = calculateFunds();
        if(closingBalance< 0){
            //JOptionPane.showMessageDialog(null, "Inappropriate funds", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String allocatedTo = (String)orgCombo.getSelectedItem();
        enterprise.getFundsHistory().addTransaction(allocatedTo,closingBalance);
        populateTable();
        populateFields(closingBalance);
        //enterprise.getFundsHistory().addTransaction(allocatedTo,closingBalance);
        

        
    }//GEN-LAST:event_submitJButtonActionPerformed
    
    public float calculateFunds(){
        //for(Fund f : enterprise.getFundsHistory().getTransactionsHist()){
            initialFundsAvailable = enterprise.getFundsHistory().getInitialMayorFunds();
        //}
        initialFundsAvailable = enterprise.getFundsHistory().getInitialMayorFunds();
        int fundsAvailable = initialFundsAvailable;
        int allotedFund = Integer.parseInt(allFunds.getText());
        if(allotedFund > fundsAvailable){
            JOptionPane.showMessageDialog(null, "Exceeded the maximum fund available", "Warning", JOptionPane.WARNING_MESSAGE);
            return -1;
        }
        fundsAvailable= initialFundsAvailable - allotedFund;
//        for (Fund f : enterprise.getFundsHistory().getTransactionsHist()){
//            f.setClosingBalance(fundsAvailable);             
//        }
        enterprise.getFundsHistory().setInitialMayorFunds(fundsAvailable);
        return fundsAvailable;
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) fundsAllocatedTable.getModel();
        dtm.setRowCount(0);
//        if(enterprise.getFundsHistory() ==  null){
//            return;
//        }
//        else{
        for (Fund f : enterprise.getFundsHistory().getTransactionsHist()){
            System.out.println("populating table");
            Object[] row = new Object[3];
            row[0] = f.getAllocatedTo();
            row[1] = f.getClosingBalance();
            row[2] = f.getDate();
            dtm.addRow(row);
//        }
    }
        System.out.println("populating table completed");
    }
    
    public void populateCombo(){
        orgCombo.removeAllItems();
        orgCombo.addItem("Hospital");
        orgCombo.addItem("Resident");
    }
    
    public void populateFields(float closingBalance){
        allFunds.setText("");
        fundsAvailTxt.setText(Float.toString(closingBalance));
        resultJTextField.setText("");
   
    }
    
    private void fundsAvailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundsAvailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fundsAvailTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allFunds;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable fundsAllocatedTable;
    private javax.swing.JTextField fundsAvailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgCombo;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}