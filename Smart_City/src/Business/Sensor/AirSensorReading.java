/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensor;

import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class AirSensorReading {
    
    private ArrayList<AirSensor> airSensorReading;
    
    public AirSensorReading(){
        airSensorReading = new ArrayList<>();
    }
    
    public AirSensor addNewAirSensorReading(){
        AirSensor as = new AirSensor();
        airSensorReading.add(as);
        return as;
    }
    public void deleteAirSensorReading(AirSensor as){
        airSensorReading.remove(as);
    }

    public ArrayList<AirSensor> getAirSensorReading() {
        return airSensorReading;
    }
    
    
    
    
}
