/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

//import Business.Location.Location;
//import Business.Location.LocationDirectory;
import Business.Sensor.AirSensorReading;
import Business.VitalSigns.PatientVitalSignHistory;

/**
 *
 * @author vanda
 */
public class Resident extends Employee{
    private int pID;
    private int age;
    private String locality;
    private PatientVitalSignHistory patientVitalSignHistory;
    private AirSensorReading airSensorReading;
    private static int count = 1;
//    private Location location;
    
    public Resident() {
        patientVitalSignHistory = new PatientVitalSignHistory();
        airSensorReading =  new AirSensorReading();
        //location = new Location();
        pID = count;
        count++;
    }

//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
    
    

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
    

    public AirSensorReading getAirSensorReading() {
        return airSensorReading;
    }

    public void setAirSensorReading(AirSensorReading airSensorReading) {
        this.airSensorReading = airSensorReading;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    public PatientVitalSignHistory getPatientVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setPatientVitalSignHistory(PatientVitalSignHistory patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }
    

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }
    
    
}
