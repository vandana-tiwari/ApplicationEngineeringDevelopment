/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthOfficerRole;


import Business.VitalSigns.PatientVitalSign;
import Business.Employee.Resident;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author vanda
 */
public class ChartGraphJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartGraphJPanel
     */
    private JPanel userProcessContainer;
    private Resident resident;
    public ChartGraphJPanel(JPanel userProcessContainer, Resident resident) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.resident = resident;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Generate Graph");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1)
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(PatientVitalSign patientVitalSign: resident.getPatientVitalSignHistory().getPatientVitalSignHistory()){
            dataset.setValue(patientVitalSign.getRespiratoryRate(), "Respiratory Rate", patientVitalSign.getCreatedOn());
            dataset.setValue(patientVitalSign.getHeartRate(), "Heart Rate", patientVitalSign.getCreatedOn());
            dataset.setValue(patientVitalSign.getSystolicBP(), "Blood Pressure", patientVitalSign.getCreatedOn());
            dataset.setValue(patientVitalSign.getWeight(), "Weight", patientVitalSign.getCreatedOn());
        }
        JFreeChart chart = ChartFactory.createBarChart("VitlSign chart","TimeStmp", "B", dataset,PlotOrientation.VERTICAL,true,true,false);
        
         CategoryPlot catPlot = chart.getCategoryPlot();
         catPlot.setRangeGridlinePaint(Color.RED);
         
         //ChartPanel chartPanel = new ChartPanel(chart);
         
         ChartFrame chartFrame =  new ChartFrame("Bar chart for VitalSigns",chart);
         
         //chartFrame.getContentPane().add(chartPanel);
         chartFrame.setSize(600, 800);
         chartFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
