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
public class ChiefAdminOfficerEPASpecialistWorkRequest extends WorkRequest{
    
    private String testResult;
    private Resident patientName;
    private AirSensor date;
    private String processedByCao;

    public String getProcessedByCao() {
        return processedByCao;
    }

    public void setProcessedByCao(String processedByCao) {
        this.processedByCao = processedByCao;
    }
    
    

    public AirSensor getDate() {
        return date;
    }

    public void setDate(AirSensor date) {
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
