//declaring package od employeemanagementsystem.daoimple
package com.EmployeeManagementSystem.daoimple;

//importing arraylist
import java.util.ArrayList;
//importing list
import java.util.List;
//importing Scanner
import java.util.Scanner;

//importing dao.employeeDao
import com.EmployeeManagementSystem.dao.EmployeeDao;
//importing model.Employee
import com.EmployeeManagementSystem.model.Employee;

//declaring class employeeDaoImple 
public class EmployeeDaoImple implements EmployeeDao {

	List<Employee> eList = new ArrayList<Employee>();

	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	@Override
	public void addEmployee() {

		// creating employee object
		Employee em = new Employee();

		// input the details of employee
		System.out.println("Enter the employee id :");
		em.setId(sc.nextInt());
		System.out.println("Enter the employee name :");
		em.setName(sc.next());
		System.out.println("Enter the employee salary :");
		em.setSalary(sc.nextDouble());

		// adding the employee into the collection
		eList.add(em);
		System.out.println(eList);

	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false; // ckecking status
		Employee edel = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				edel = e;
		}
		// check whether the record is present or not
		if (edel == null)
			status = false;
		else {
			eList.remove(edel);
			status = true;
		}

		return status;
	}

	@Override
	public Employee findEmployee(int id) {

		Employee efind = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}

		return efind;
	}

	// displaying
	@Override
	public void displayAll() {
		// TODO Auto-generated method stub

		for (Employee e : eList) {
			System.out.println(e);
		}
	}
}
//end of class EmployeeDaoImple
