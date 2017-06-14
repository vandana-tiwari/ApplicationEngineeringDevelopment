/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String email, String phNum){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhNum(phNum);
        employeeList.add(employee);
        return employee;
    }
    
     public Resident createResident(){
        Resident resident = new Resident();
        employeeList.add(resident);
        return resident;
    }
}