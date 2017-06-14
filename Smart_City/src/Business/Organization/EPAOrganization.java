/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EPASpecialistRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author vanda
 */
public class EPAOrganization extends Organization{
    
    public EPAOrganization(){
          super(Type.EPASpecialist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EPASpecialistRole());
        return roles;
    }
    
}



