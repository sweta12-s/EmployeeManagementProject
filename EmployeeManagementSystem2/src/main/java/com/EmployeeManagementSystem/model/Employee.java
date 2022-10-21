/*Program : WAP to  create Employee management using collections 
Perform operations:
1.Add an employee
2. Delete an employee
3. Find an employee"
4. Display
@Author:Sweta Das
@Date: 20.10.22 
*/

//declaring package 
package com.EmployeeManagementSystem.model;

//declaring class Employee
public class Employee {

	// properties of employee
	private int id;
	private String name;
	private double salary;

	// default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int id, String name, double salary) {
		super();
		// initializing variables
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
//end of class Employee
