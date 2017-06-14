/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthOfficerRole;


import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Employee.Resident;
import Business.Enterprise.Enterprise;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.MayorOrganization;
import Business.Organization.Organization;
import Business.Organization.ResidentOrganization;
import Business.Sensor.AirSensor;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.PatientVitalSign;
import Business.WorkQueue.HealthOfficerHospitalWorkRequest;
import Business.WorkQueue.HealthOfficerMayorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanda
 */
public class RequestToMayorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
   // private DoctorOrganization organization;
    private Enterprise enterprise;
    private EmployeeDirectory employeeDirectoryMayor ;
    private UserAccount account;
    private EmployeeDirectory employeeDirectoryResident;
    
    
    public RequestToMayorJPanel(JPanel userProcessContainer,UserAccount account, Organization org, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.employeeDirectoryMayor = employeeDirectoryMayor;
        this.employeeDirectoryResident = employeeDirectoryResident;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        System.out.println(account);
        populateTable();
        populateRequestTable();
        populateAirQualityTable();
        
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) patientVSTable.getModel();
        dtm.setRowCount(0);
        //System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+employeeDirectoryResident.getEmployeeList());
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof ResidentOrganization){
        for(Employee e : o.getEmployeeDirectory().getEmployeeList()){
            System.out.println(e.getName());
             Resident r = (Resident)e;
                System.out.println("res"+r);
                for(PatientVitalSign p : r.getPatientVitalSignHistory().getPatientVitalSignHistory()){
                    System.out.println(p.getVsRequest());
                    if(p.getVsRequest().equals("Unprocessed")){
                        System.out.println("#####for patient vitall sign######");
                        Object row[] = new Object [2];
                        row[0]= p;
                        row[1]= r;
                        dtm.addRow(row); 
                    }
            }
        }
//  
            }
            
        }
    }        
            
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
      
        model.setRowCount(0);
        if(account.getWorkQueue().getWorkRequestList().isEmpty())
        {
            return;
        }
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            String result;
            
            Object[] row = new Object[6];
            if(request instanceof HealthOfficerMayorWorkRequest){
                row[0] = ((HealthOfficerMayorWorkRequest)request).getPatientName();
                row[1] = ((HealthOfficerMayorWorkRequest)request).getDate();
                result = ((HealthOfficerMayorWorkRequest) request).getTestResult();
            }
            else{
                row[0] = ((HealthOfficerHospitalWorkRequest)request).getPatientName();
                System.out.println("(HealthOfficerHospitalWorkRequest)request).getMessage()"+((HealthOfficerHospitalWorkRequest)request).getMessage());
                if(((HealthOfficerHospitalWorkRequest)request).getMessage().equalsIgnoreCase("Patients with abnormal Vital Signs")){
//                    System.out.println("I am going here");
                    row[1] = ((HealthOfficerHospitalWorkRequest)request).getAsDate();
                }
                else{
                    row[1] = request.getRequestDate();
//                    System.out.println("I need to check Date " + ((HealthOfficerHospitalWorkRequest)request).getVsDate());
                }
                
                result = ((HealthOfficerHospitalWorkRequest) request).getTestResult();
            }
            row[2] = request;
            row[3] = request.getReceiver();
            row[4] = request.getStatus();
            //String result = ((HealthOfficerMayorWorkRequest) request).getTestResult();
            row[5] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
    }

    private void populateAirQualityTable(){
    DefaultTableModel dtm = (DefaultTableModel) sensorReadingJTable.getModel();
        dtm.setRowCount(0);
        //System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+employeeDirectoryResident.getEmployeeList());
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof ResidentOrganization){
        for(Employee e : o.getEmployeeDirectory().getEmployeeList()){
//            System.out.println(e.getName());
             Resident r = (Resident)e;
//                System.out.println("res"+r);
                for(AirSensor a : r.getAirSensorReading().getAirSensorReading()){
//                    System.out.println(a.getAirQualityStatus());
                     if((!((a.getAirQualityStatus().equals("Good")) || (a.getAirQualityStatus().equals("Moderate")))) && a.getAsRequest().equals("Unprocessed")){
//                        System.out.println("#####for air sensor reading######");
                        Object row[] = new Object [2];
                        row[0]= a;
                        row[1]= r;
                        dtm.addRow(row); 
                    }
            }
        }
    }  
        
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        requestHospitalJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientVSTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        sensorReadingJTable = new javax.swing.JTable();
        sensorRequestHospitalJButton = new javax.swing.JButton();
        valueLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient", "Date", "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        requestTestJButton.setBackground(java.awt.Color.white);
        requestTestJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        requestTestJButton.setText("Send Request to Mayor");
        requestTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(java.awt.Color.white);
        refreshTestJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        valueLabel.setText("Patients with Abnormal Vital Sign Status:");

        valueLabel1.setText("<value>");

        requestHospitalJButton.setBackground(java.awt.Color.white);
        requestHospitalJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        requestHospitalJButton.setText("Send Request to Hospital");
        requestHospitalJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestHospitalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestHospitalJButtonActionPerformed(evt);
            }
        });

        patientVSTable.setFont(new java.awt.Font("Californian FB", 0, 11)); // NOI18N
        patientVSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Name"
            }
        ));
        jScrollPane3.setViewportView(patientVSTable);

        sensorReadingJTable.setFont(new java.awt.Font("Californian FB", 0, 11)); // NOI18N
        sensorReadingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Name"
            }
        ));
        jScrollPane4.setViewportView(sensorReadingJTable);

        sensorRequestHospitalJButton.setBackground(java.awt.Color.white);
        sensorRequestHospitalJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sensorRequestHospitalJButton.setText("Send checkup request to Hospital");
        sensorRequestHospitalJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sensorRequestHospitalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorRequestHospitalJButtonActionPerformed(evt);
            }
        });

        valueLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        valueLabel2.setText("Patients with Abnormal Air Quality Issue:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(120, 120, 120)
                    .addComponent(requestHospitalJButton)
                    .addGap(123, 123, 123))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valueLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)
                            .addComponent(sensorRequestHospitalJButton)))
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(381, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTestJButton)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(sensorRequestHospitalJButton))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestHospitalJButton)
                    .addComponent(backJButton))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        

        HealthOfficerMayorWorkRequest request = new HealthOfficerMayorWorkRequest();
        int selectedRow =  patientVSTable.getSelectedRow();
        PatientVitalSign vs = (PatientVitalSign)patientVSTable.getValueAt(selectedRow, 0);
        Resident resident = (Resident)patientVSTable.getValueAt(selectedRow, 1);
        
        request.setPatientName(resident);
        request.setDate(vs);
        
        request.setMessage("Patients with abnormal Vital Signs");
        request.setSender(account);
        request.setStatus("Sent");
        request.setReceiver(account);
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof MayorOrganization){
                System.out.println("Inside organization");
                org = organization;
                System.out.println("Ogranization::::::"+ org);
                break;
            }
        }
        if (org!=null){
            System.out.println("Inside nt null org");
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            
            System.out.println("................");
        }

        if(selectedRow>=0){
            for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
                System.out.println("enterprise.getOrganizationDirectory().getOrganizationList("+enterprise.getOrganizationDirectory().getOrganizationList());
            if(o instanceof ResidentOrganization){
                for(Employee e : o.getEmployeeDirectory().getEmployeeList()){
            if(e instanceof Resident)
            {
            Resident r = (Resident)e;
            if(r==resident){
                for(PatientVitalSign p : r.getPatientVitalSignHistory().getPatientVitalSignHistory()){
                    if(p == vs){
                    p.setVsRequest("Processed");
                    }
                    }
            }
            }
            }
            }
                
        }
        
        }
        refresh();
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        refresh();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void requestHospitalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestHospitalJButtonActionPerformed
        // TODO add your handling code here:
        HealthOfficerHospitalWorkRequest hWrequest = new HealthOfficerHospitalWorkRequest();
        
        int selectedRow =  workRequestJTable.getSelectedRow();
        WorkRequest req = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 2);
        HealthOfficerMayorWorkRequest hwr = (HealthOfficerMayorWorkRequest)req;
//        System.out.println(":::hWrequest:::::::::::"+hwr);
//        System.out.println("hwr.getPatientName()::::::::::::::"+hwr.getPatientName());
//        System.out.println("hwr.getDate()::::::::::::::"+hwr.getDate());
//        System.out.println("hwr.getMessage()::::::::::::::"+hwr.getMessage());
//        System.out.println("account::::::::::::::"+account+"...."+hwr.getReceiver());
//        System.out.println("hwr.getSender()"+hwr.getPatientName());
        hWrequest.setPatientName(hwr.getPatientName());
        hWrequest.setVsDate(hwr.getDate());
        hWrequest.setMessage("Schedule an appointment");
        hWrequest.setReceiver(account);
        hWrequest.setSender(hwr.getSender());
        hWrequest.setStatus("Sent");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ReceptionistOrganization){
                System.out.println("Inside organization");
                org = organization;
                System.out.println("Ogranization::::::"+ org);
                break;
            }
        }
        if (org!=null){
//            System.out.println("Inside nt null org:::"+ account);
            org.getWorkQueue().getWorkRequestList().add(hWrequest);
            account.getWorkQueue().getWorkRequestList().add(hWrequest);
//            System.out.println("................");
        }
        refresh();
    }//GEN-LAST:event_requestHospitalJButtonActionPerformed

    private void sensorRequestHospitalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorRequestHospitalJButtonActionPerformed
        // TODO add your handling code here:
        HealthOfficerHospitalWorkRequest request = new HealthOfficerHospitalWorkRequest();
        int selectedRow =  sensorReadingJTable.getSelectedRow();
        AirSensor as = (AirSensor)sensorReadingJTable.getValueAt(selectedRow, 0);
        Resident resident = (Resident)sensorReadingJTable.getValueAt(selectedRow, 1);
        request.setPatientName(resident);
        request.setAsDate(as);
        //System.out.println("Date::::::::::::::::::::::::::"+request.getAsDate());
        request.setMessage("Patients with abnormal Air Quality");
        request.setSender(account);
        request.setStatus("Sent");
        request.setReceiver(account);
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ReceptionistOrganization){
                System.out.println("Inside organization");
                org = organization;
                System.out.println("Ogranization::::::"+ org);
                break;
            }
        }
        if (org!=null){
            //System.out.println("Inside nt null org");
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            //org.getWorkQueue().getWorkRequestList().add(request);
            //System.out.println("................");
        }
        if(selectedRow>=0){
            for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o instanceof ResidentOrganization){
        for(Employee e : o.getEmployeeDirectory().getEmployeeList()){
 
            if(e instanceof Resident)
            {
            Resident r = (Resident)e;
            if(r==resident){
                for(AirSensor a : r.getAirSensorReading().getAirSensorReading()){
                    if(a == as){
                    a.setAsRequest("Processed");
                    }
                    }
            }
            }

        }
            }
            }
        }
                    refresh();
 
    }//GEN-LAST:event_sensorRequestHospitalJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);  //removes current panel from the stack
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    public void refresh(){
        populateRequestTable();
        populateTable();
        populateAirQualityTable();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable patientVSTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestHospitalJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable sensorReadingJTable;
    private javax.swing.JButton sensorRequestHospitalJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JLabel valueLabel2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
