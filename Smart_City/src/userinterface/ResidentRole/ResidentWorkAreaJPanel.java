/* * and open the template in the editor.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package userinterface.ResidentRole;

import Business.VitalSigns.PatientVitalSign;
import Business.VitalSigns.PatientVitalSignHistory;
import Business.Employee.Employee;
import Business.Employee.Resident;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResidentOrganization;
import Business.Sensor.AirSensor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanda
 */
public class ResidentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientVitalSign
     */
    //private PatientVitalSignHistory vsh;
    private int age;
    private float respRate;
    private float heartRate;
    private float systolicBP;
    private float weight;
    private int count=1;
    //private String status;
    private JPanel userProcessContainer;
    private Resident resident;
    private UserAccount account;
    private Enterprise enterprise;
    
   
    
    public ResidentWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, ResidentOrganization organization, Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.resident = (Resident)account.getEmployee();
        this.userProcessContainer = userProcessContainer; 
        this.enterprise =  enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveVitalSignJButton = new javax.swing.JButton();
        respTxt = new javax.swing.JTextField();
        bPTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        heartTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Patient's Vital Sign");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Respiratory Rate");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Heart Rate");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Weight (in Pounds)");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Systolic Blood Pressure");

        saveVitalSignJButton.setBackground(java.awt.Color.white);
        saveVitalSignJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        saveVitalSignJButton.setText("Save Vital Sign");
        saveVitalSignJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveVitalSignJButton.setContentAreaFilled(false);
        saveVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVitalSignJButtonActionPerformed(evt);
            }
        });

        respTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respTxtActionPerformed(evt);
            }
        });

        backJButton.setBackground(java.awt.Color.white);
        backJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backJButton.setText("<<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveVitalSignJButton)
                                .addGap(38, 38, 38)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1)))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(heartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveVitalSignJButton)
                    .addComponent(backJButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVitalSignJButtonActionPerformed
        // TODO add your handling code here:

        try{
        respRate = Float.parseFloat(respTxt.getText());
        heartRate = Float.parseFloat(heartTxt.getText());
        systolicBP = Float.parseFloat(bPTxt.getText());
        weight = Float.parseFloat(weightTxt.getText());
        age = resident.getAge();
        //status= getStatus();

       
        PatientVitalSign vitalSign = resident.getPatientVitalSignHistory().addVitalSign();
        
        vitalSign.setHeartRate(heartRate);
        vitalSign.setCreatedOn();
        vitalSign.setRespiratoryRate(respRate);
        vitalSign.setSystolicBP(systolicBP);
        vitalSign.setWeight(weight);
        vitalSign.setVsRequest("Unprocessed");
        Float resp =vitalSign.getRespiratoryRate();
        System.out.println("@@@@@@@@@@@@@"+resp);
        String dt =vitalSign .getCreatedOn().toString();
        System.out.println("@@@@@@@@@@@@@"+dt);
        vitalSign.setStatus(age);
        
            AirSensor as = resident.getAirSensorReading().addNewAirSensorReading();
            System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("+ count);
            System.out.println("count"+ count);
            if(count ==1){
                as.setSulphurDiOxide(605,700);
                as.setCarbonMonoOxide(31,40);
                as.setOzone(405,410);
                as.setNitrogenOxide(1250,1260);
            }
            else if (count ==2){
                as.setSulphurDiOxide(305,604);
                as.setCarbonMonoOxide(16,30);
                as.setOzone(205,404);
                as.setNitrogenOxide(650,1249);
            }
            else if (count == 3){
                as.setSulphurDiOxide(186,304);
                as.setCarbonMonoOxide(14,16);
                as.setOzone(165,204);
                as.setNitrogenOxide(361,649);
                
            }else if (count == 4){
                as.setSulphurDiOxide(76,185);
                as.setCarbonMonoOxide(11,13);
                as.setOzone(71,164);
                as.setNitrogenOxide(101,360);
                
            }else if (count == 5){
                as.setSulphurDiOxide(36,75);
                as.setCarbonMonoOxide(5,10);
                as.setOzone(54,70);
                as.setNitrogenOxide(54,100);
                
            }else if (count == 6){
                as.setSulphurDiOxide(0,35);
                as.setCarbonMonoOxide(0,4);
                as.setOzone(0,53);
                as.setNitrogenOxide(0,53);
                count = 0;
            }
            count ++ ;
            as.setCreatedOn();
            
            as.setAsRequest("Unprocessed");
            as.setAsCaoProccessed("Unprocessed");
            System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("+ count);
        
        
        
        JOptionPane.showMessageDialog(null, "Vital Sign saved successfully");
        
        }
        catch (NumberFormatException nE){
            JOptionPane.showMessageDialog(null, "Please enter correct values", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveVitalSignJButtonActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
       
        userProcessContainer.remove(this);  //removes current panel from the stack
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void respTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respTxtActionPerformed

//    public String getStatus(){
//        if((age>=1 && age<=3 && respRate>=20 && respRate<=30 && heartRate>=80 && heartRate<=130 && systolicBP>=80 && systolicBP<=110 && weight>=22 && weight<=31) || (age>=4 & age<=5 && respRate>=20 && respRate<=30 && heartRate>=80 && heartRate<=120 && systolicBP>=80 && systolicBP<=110 && weight>=31 && weight<=40) || (age>=6 && age<=12 && respRate>=20 && respRate<=30 && heartRate>=70 && heartRate<=110 && systolicBP>=80 && systolicBP<=120 && weight>=41 && weight<=92) || (age>=13 && respRate>=12 && respRate<=20 && heartRate>=55 && heartRate<=105 && systolicBP>=110 && systolicBP<=120 && weight>110)){
//            status = "Normal";           
//        }else{
//            status = "Abnormal";
//        }
//        return status;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bPTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField heartTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField respTxt;
    private javax.swing.JButton saveVitalSignJButton;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}