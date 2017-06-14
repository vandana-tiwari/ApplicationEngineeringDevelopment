/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class StateHealthDepartmentEnterprise extends Enterprise{

    public StateHealthDepartmentEnterprise(String name) {
        super(name, EnterpriseType.StateHealthDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
