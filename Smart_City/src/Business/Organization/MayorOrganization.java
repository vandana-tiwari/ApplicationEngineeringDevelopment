/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MayorRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author vanda
 */
public class MayorOrganization extends Organization{
    
    public MayorOrganization(){
          super(Type.Mayor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MayorRole());
        return roles;
    }
    
}


