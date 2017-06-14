/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class PatientVitalSignHistory {
    
    private ArrayList<PatientVitalSign> patientVitalSignHistory;
    
    
    public PatientVitalSignHistory(){
        
        patientVitalSignHistory = new ArrayList<>();
        //patientVitalSign = new PatientVitalSign();
    }

    public ArrayList<PatientVitalSign> getPatientVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setPatientVitalSignHistory(ArrayList<PatientVitalSign> patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }
    
    public PatientVitalSign addVitalSign(){
        PatientVitalSign vs = new PatientVitalSign();
        patientVitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitalSign(PatientVitalSign vs){
        patientVitalSignHistory.remove(vs);
    }
    
    
}
