/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.Date;

/**
 *
 * @author vanda
 */
public class PatientVitalSign {
    
    private float respiratoryRate;
    private float heartRate;
    private float systolicBP;
    private float weight;
    private String date;
    private String status;
    private String vsRequest;
    private Date createdOn;
    
    public PatientVitalSign(){
        
    }

    public String getVsRequest() {
        return vsRequest;
    }

    public void setVsRequest(String vsRequest) {
        this.vsRequest = vsRequest;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn() {
        
        this.createdOn = new Date();
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(float systolicBP) {
        this.systolicBP = systolicBP;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(int age) {
        status = checkStatus(age);
        this.status = status;
    }
    
    public String checkStatus(int age){
        String status;
        if((age>=1 && age<=3 && respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=80 && heartRate<=130 && systolicBP>=80 && systolicBP<=110 && weight>=22 && weight<=31) || (age>=4 & age<=5 && respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=80 && heartRate<=120 && systolicBP>=80 && systolicBP<=110 && weight>=31 && weight<=40) || (age>=6 && age<=12 && respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=70 && heartRate<=110 && systolicBP>=80 && systolicBP<=120 && weight>=41 && weight<=92) || (age>=13 && respiratoryRate>=12 && respiratoryRate<=20 && heartRate>=55 && heartRate<=105 && systolicBP>=110 && systolicBP<=120 && weight>110)){
            status = "Normal";           
        }else{
            status = "Abnormal";
        }
        return status;
    }
  
    @Override
    public String toString(){
        return String.valueOf(createdOn);
    }
    
}
