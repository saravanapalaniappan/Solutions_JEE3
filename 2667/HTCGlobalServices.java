package com.htc.financials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class contains collection of employee data
 */
public class HTCGlobalServices implements ICompanyServiceProvider {
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
		HTCGlobalServices htcGlobalServices = new HTCGlobalServices("HTC001", "TROY MI");

		htcGlobalServices.addEmployee(new Employee("h001", "Mani", 55872, "hr"));
		htcGlobalServices.addEmployee(new Employee("h002", "Ram", 49586, "payroll"));
		htcGlobalServices.addEmployee(new Employee("h003", "Hari", 63849, "finance"));
		System.out.println(htcGlobalServices.getEmployees().toString());

		System.out.println("==========After removing h002=========");
		htcGlobalServices.removeEmployee("h002");
		System.out.println(htcGlobalServices.getEmployees().toString());

		System.out.println("=========After updating h003==========");
		htcGlobalServices.updateEmployee("h003", "Testing");
		System.out.println(htcGlobalServices.getEmployees().toString());
	}
}