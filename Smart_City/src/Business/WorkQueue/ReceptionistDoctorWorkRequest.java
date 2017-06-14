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
public class ReceptionistDoctorWorkRequest extends WorkRequest{
    
    private String testResult;
    private Resident patientName;
    private String date;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
