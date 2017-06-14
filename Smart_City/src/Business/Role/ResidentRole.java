/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResidentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ResidentRole.ResidentWorkAreaJPanel;

/**
 *
 * @author vanda
 */
public class ResidentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ResidentWorkAreaJPanel(userProcessContainer, account, (ResidentOrganization)organization, enterprise);
    }
    
    
}
