package com.santy.impl;

import com.santy.entity.Employee;
import com.santy.provider.ICompnayServiceProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class contains collection of employee data
 */
public class HTCGlobalServices implements ICompnayServiceProvider {
    private String companyID;
    private String address;
    private Map<String, Employee> employeeMap = new HashMap<String, Employee>();

    /**
     * Initialize HTCGlobalServices
     */
    public HTCGlobalServices() {
    }

    /**
     * Initialize HTCGlobalServices
     *
     * @param companyID
     * @param address
     */
    public HTCGlobalServices(String companyID, String address) {
        this.companyID = companyID;
        this.address = address;
    }

    /**
     * Get company id
     *
     * @return
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Set Company id
     *
     * @param companyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /**
     * Get company address
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set compnay address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Add employee
     *
     * @param e
     */
    @Override
    public void addEmployee(Employee e) {
        employeeMap.put(e.getEmployeeId(), e);
    }

    /**
     * Remove employee
     *
     * @param employeeId
     */
    @Override
    public void removeEmployee(String employeeId) {
        employeeMap.remove(employeeId);
    }

    /**
     * Get employee using employee id
     *
     * @param employeeId
     * @return
     */
    @Override
    public Employee getEmployee(String employeeId) {
        return employeeMap.get(employeeId);

    }

    /**
     * Update employee job id
     *
     * @param employeeId
     * @param jobId
     */
    @Override
    public void updateEmployee(String employeeId, String jobId) {
        employeeMap.get(employeeId).setJobId(jobId);
    }

    /**
     * Get list of employees
     *
     * @return
     */
    @Override
    public List<Employee> getEmployees() {
        return new ArrayList<Employee>(employeeMap.values());
    }

    public static void main(String[] args) {
        HTCGlobalServices htcGlobalServices = new HTCGlobalServices("HTC0001", "TROY MI");

        htcGlobalServices.addEmployee(new Employee("e1234", "xxx", 67979, "hR_rep"));
        htcGlobalServices.addEmployee(new Employee("e1254", "sss", 4579, "hR_timeoffice"));
        htcGlobalServices.addEmployee(new Employee("e154", "ggg", 65679, "hR_payroll"));
        System.out.println(htcGlobalServices.getEmployees().toString());


        System.out.println("*************After removing e154************");
        htcGlobalServices.removeEmployee("e154");
        System.out.println(htcGlobalServices.getEmployees().toString());

        System.out.println("*************After updating e154************");
        htcGlobalServices.updateEmployee("e1254", "s/w");
        System.out.println(htcGlobalServices.getEmployees().toString());
    }
}
