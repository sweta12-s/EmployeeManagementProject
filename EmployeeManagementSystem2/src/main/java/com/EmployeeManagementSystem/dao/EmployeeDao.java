//declaring package of employeemanagementsystem.dao
package com.EmployeeManagementSystem.dao;

//importing employee
import com.EmployeeManagementSystem.model.Employee;

//declaring interface of employeeDao
public interface EmployeeDao {

	// declaring
	void addEmployee();

	boolean deleteEmployee(int id);

	Employee findEmployee(int id);

	void displayAll();

}
//end of interface EmployeeDao
