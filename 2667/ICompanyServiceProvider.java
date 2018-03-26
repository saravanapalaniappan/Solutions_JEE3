package com.htc.financials;

import java.util.List;

/**
 * This interface provides CRUD operation for Employee class
 */

public interface ICompanyServiceProvider {

	void addEmployee(Employee e);

	void removeEmployee(String employeeId);

	Employee getEmployee(String employeeId);

	void updateEmployee(String EmployeeId, String jobId);

	List<Employee> getEmployees();

}
