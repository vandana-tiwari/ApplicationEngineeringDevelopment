/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Resident;
import Business.Sensor.AirSensor;
import Business.VitalSigns.PatientVitalSign;
import java.util.Date;

/**
 *
 * @author vanda
 */
public class HealthOfficerHospitalWorkRequest extends WorkRequest{
    
    private String testResult;
    private Resident patientName;
    private PatientVitalSign vsDate;
    private AirSensor asDate;

    public PatientVitalSign getVsDate() {
        return vsDate;
    }

    public void setVsDate(PatientVitalSign vsDate) {
        this.vsDate = vsDate;
    }

    public AirSensor getAsDate() {
        return asDate;
    }

    public void setAsDate(AirSensor asDate) {
        this.asDate = asDate;
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
