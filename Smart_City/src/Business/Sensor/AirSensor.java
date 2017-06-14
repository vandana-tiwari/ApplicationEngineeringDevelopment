/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensor;

import java.util.Date;

/**
 *
 * @author vanda
 */
public class AirSensor {
    private double sulphurDiOxide;
    private double carbonMonoOxide;
    private double ozone;
    private double nitrogenOxide;
    private Date createdOn;
    private String asRequest;
    private String asCaoProccessed;
    
    private String date;
    private String airQualityStatus;

    public String getAsCaoProccessed() {
        return asCaoProccessed;
    }

    public void setAsCaoProccessed(String asCaoProccessed) {
        this.asCaoProccessed = asCaoProccessed;
    }
    

    public AirSensor(){
        
    }

    public String getAsRequest() {
        return asRequest;
    }

    public void setAsRequest(String asRequest) {
        this.asRequest = asRequest;
    }
    

    public String getAirQualityStatus() {
        airQualityStatus = checkStatus();
        this.airQualityStatus = airQualityStatus;
        return airQualityStatus;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn() {
        this.createdOn = new Date();
    }

    public double getSulphurDiOxide() {
        
        return sulphurDiOxide;
    }

    public void setSulphurDiOxide(int min, int max) {
        sulphurDiOxide = randomData(min,max);
        System.out.println("sulphurDiOxide"+sulphurDiOxide);
        this.sulphurDiOxide = sulphurDiOxide;
    }

    public double getCarbonMonoOxide() {
        return carbonMonoOxide;
    }

    public void setCarbonMonoOxide(int min, int max) {
        carbonMonoOxide = randomData(min,max);
        System.out.println("carbonMonoOxide"+carbonMonoOxide);
        this.carbonMonoOxide = carbonMonoOxide;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(int min, int max) {
        ozone = randomData(min,max);
        System.out.println("ozone"+ozone);
        this.ozone = ozone;
    }

    public double getNitrogenOxide() {
        return nitrogenOxide;
    }

    public void setNitrogenOxide(int min, int max) {
        nitrogenOxide = randomData(min,max);
        System.out.println("nitrogenOxide"+nitrogenOxide);
        this.nitrogenOxide = nitrogenOxide;
    }
    
    public String checkStatus(){
        String status;

        if(sulphurDiOxide >=0 && sulphurDiOxide <=35 && carbonMonoOxide>=0 && carbonMonoOxide<=4 && ozone>=0 && ozone<=53 && nitrogenOxide>=0 && nitrogenOxide<=53 ){
            status = "Good";           
        }
        else if(sulphurDiOxide >=36 && sulphurDiOxide <=75 && carbonMonoOxide>=5 && carbonMonoOxide<=10 && ozone>=54 && ozone<=70 && nitrogenOxide>=54 && nitrogenOxide<=100){
            status = "Moderate";
        }
        else if(sulphurDiOxide >=76 && sulphurDiOxide <=185 && carbonMonoOxide>=11 && carbonMonoOxide<=13 && ozone>=71 && ozone<=164 && nitrogenOxide>=101 && nitrogenOxide<=360){
            status = "Unhealthy";
        }
        else if(sulphurDiOxide >=186 && sulphurDiOxide <=304 && carbonMonoOxide>=14 && carbonMonoOxide<=16 && ozone>=165 && ozone<=204 && nitrogenOxide>=361 && nitrogenOxide<=649){
            status = "Very unhealthy";
        }
        else if(sulphurDiOxide >=305 && sulphurDiOxide <=604 && carbonMonoOxide>=16 && carbonMonoOxide<=30 && ozone>=205 && ozone<=404 && nitrogenOxide>=650 && nitrogenOxide<=1249 ){
            status = "Hazardous";
        }
        //else if(sulphurDiOxide >604 && carbonMonoOxide>31 && ozone>404 && nitrogenOxide>1249){
        else{
            status = "Very Hazardous";
        }
        return status;
    }

    public static double randomData(int minVal, int maxVal){
        return ((Math.random() * (maxVal-minVal) + minVal));
    }

    @Override
    public String toString() {
        return String.valueOf(createdOn) ;
    }
    
    
}
