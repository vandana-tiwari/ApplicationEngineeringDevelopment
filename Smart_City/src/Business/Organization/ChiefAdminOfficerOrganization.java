/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ChiefAdminOfficerRole;
import Business.Role.ResidentRole;
import Business.Role.Role;
import Business.Sensor.AirSensorReading;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class ChiefAdminOfficerOrganization extends Organization{
    private String houseNumber;
    private AirSensorReading airSensorReading;
    

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
           
    public ChiefAdminOfficerOrganization() {
        super(Organization.Type.ChiefAdminOfficer.getValue());
        airSensorReading = new AirSensorReading();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChiefAdminOfficerRole());
        
        return roles;
    }
     
}