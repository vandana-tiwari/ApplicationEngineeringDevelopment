/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class Network  {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    //private ArrayList<String> locationDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        //locationDirectory = new ArrayList<>();
    }
    
//    public void addLocation(String location){
//        //locationDirectory.add(location);
//    }
//
//    public ArrayList<String> getLocationDirectory() {
//        //return locationDirectory;
//    }
//
//    public void setLocationDirectory(ArrayList<String> locationDirectory) {
//        this.locationDirectory = locationDirectory;
//    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
