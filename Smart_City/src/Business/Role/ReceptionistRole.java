/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ReceptionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vanda
 */
public class ReceptionistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, (ReceptionistOrganization)organization, enterprise);
    }
    
    
}
