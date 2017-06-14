/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author vanda
 */
public class Employee {
    
    private String name;
    private String email;
    private int id;
    private int areaCode;
    private String phNum;
    private static int count = 1;


    public Employee() {
        id = count;
        count++;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

//    public String getIsMayor() {
//        return isMayor;
//    }
//
//    public void setIsMayor(String isMayor) {
//        this.isMayor = isMayor;
//    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
