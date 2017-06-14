/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Email.ValidateEmail;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.MayorRole;
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
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        emailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Network");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setBackground(java.awt.Color.white);
        submitJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        backJButton.setBackground(java.awt.Color.white);
        backJButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setText("Manage Enterprise Administrator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(269, 269, 269)
                        .addComponent(submitJButton)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        String email = emailTxt.getText();
        String phNum = phTxt.getText();
        if(username.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a Username", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!(username.matches("^[a-zA-Z0-9]*"))){
            JOptionPane.showMessageDialog(null, " Please enter correct a username. Valid username consists of only alphanumeric characters", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, username +" already exists. Please enter another username", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(password.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a Password", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(name.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!(name.matches("^[a-zA-Z]*"))){
            JOptionPane.showMessageDialog(null, " Please enter a valid name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(email.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter an Email address", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ValidateEmail ve = new ValidateEmail();
        boolean status = ve.validationEmail(email);
         if(status == false){
             JOptionPane.showMessageDialog(null, " Please enter a valid email address", "Warning", JOptionPane.WARNING_MESSAGE);
             return;
         }
 
        if(phNum.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter a Phone Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!(phNum.matches("^[0-9]*"))){
            JOptionPane.showMessageDialog(null, " Please enter a valid phone number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        boolean checkuser = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username);
       
        
        if(checkuser == false)
        {
         Employee employee = enterprise.getEmployeeDirectory().createEmployee(name,email,phNum);
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        
         populateTable();
        }
        else if(checkuser == true){
            JOptionPane.showMessageDialog(null,"UserName already available");
        }
        
        
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField phTxt;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
