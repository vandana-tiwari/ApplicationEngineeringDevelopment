/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EPAOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EPASpecialistRole.EPAWorkAreaJPanel;

/**
 *
 * @author vanda
 */
public class EPASpecialistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new EPAWorkAreaJPanel(userProcessContainer, system , account, (EPAOrganization)organization, enterprise);
    }
    
}
