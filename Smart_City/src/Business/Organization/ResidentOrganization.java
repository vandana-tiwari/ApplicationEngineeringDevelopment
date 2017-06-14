/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ResidentRole;
import Business.Role.Role;
import Business.Sensor.AirSensorReading;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class ResidentOrganization extends Organization{
    private String houseNumber;
    private AirSensorReading airSensorReading;
    

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
           
    public ResidentOrganization() {
        super(Organization.Type.Resident.getValue());
        airSensorReading = new AirSensorReading();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ResidentRole());
        return roles;
    }
     
}