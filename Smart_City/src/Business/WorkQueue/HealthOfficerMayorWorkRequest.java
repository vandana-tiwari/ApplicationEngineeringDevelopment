/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Resident;
import Business.VitalSigns.PatientVitalSign;
import java.util.Date;

/**
 *
 * @author vanda
 */
public class HealthOfficerMayorWorkRequest extends WorkRequest{
    
    private String testResult;
    private Resident patientName;
    private PatientVitalSign date;

    public PatientVitalSign getDate() {
        return date;
    }

    public void setDate(PatientVitalSign date) {
        this.date = date;
    }

    public Resident getPatientName() {
        return patientName;
    }

    public void setPatientName(Resident patientName) {
        this.patientName = patientName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
