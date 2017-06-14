/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Funds.*;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class AppointmentDirectory {
  
    private ArrayList<Appointment> appointmentDirectory;

    
    public AppointmentDirectory(){
        appointmentDirectory = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<Appointment> appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    public void addAppointment(String date, String time, String name){
        Appointment a = new Appointment();
        a.setDate(date);
        a.setTime(time);
        a.setPatientName(name);
        appointmentDirectory.add(a);
    }
}
