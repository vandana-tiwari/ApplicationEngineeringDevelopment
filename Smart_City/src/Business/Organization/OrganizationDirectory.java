/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Resident.getValue())){
            organization = new ResidentOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HealthOfficer.getValue())){
            organization = new HealthOfficerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ChiefAdminOfficer.getValue())){
            organization = new ChiefAdminOfficerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.EPASpecialist.getValue())){
            organization = new EPAOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}