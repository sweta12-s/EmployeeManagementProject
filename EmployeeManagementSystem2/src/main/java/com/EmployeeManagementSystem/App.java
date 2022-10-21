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
package com.EmployeeManagementSystem;

//importing Scanner
import java.util.Scanner;

//importing dao.EmployeeDao
import com.EmployeeManagementSystem.dao.EmployeeDao;
//importing daoimple.EmployeeDaoImple
import com.EmployeeManagementSystem.daoimple.EmployeeDaoImple;
//imporitng model.Employee
import com.EmployeeManagementSystem.model.Employee;

//declaring class App
public class App {
	// declaring method menu
	public static void menu() {
		// printing
		System.out.println(" ....THE MENU:........");
		System.out.println("1. Add student");
		System.out.println("2. Delete Student");
		System.out.println("3. Search Student");
		System.out.println("4. Display all the employee details");
		System.out.println("5. Exit");
	}
	// end menu

	// declaring main method

	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);

		// creating object of EmployeeDaoimple
		EmployeeDao office = new EmployeeDaoImple();

		// declaring varible choice
		try {
			int ch = 0; // initializing value ch=0
			do {
				menu();
				ch = sc1.nextInt();
				switch (ch) {
				case 1:
					office.addEmployee();
					System.out.println("..........Employee inserted..........");
					break;
				case 2:
					System.out.println("Enter Id that want to delete:");
					int id = sc1.nextInt();
					boolean flag = office.deleteEmployee(id);
					if (flag)
						System.out.println(".......Employee deleted.......");
					else
						System.out.println("........Employee not found......");
					break;

				case 3:
					Employee em = null;
					System.out.println("Enter Id that want to search:");
					id = sc1.nextInt();
					em = office.findEmployee(id);
					if (em == null)
						System.out.println("........Employee not found.......");
					else
						System.out.println("Employee Id :" + em.getId() + "  Name:" + em.getName() + "   Salary:"
								+ em.getSalary());
					break;

				case 4:
					office.displayAll();
					break;

				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("..........Invalid input.......");

				}

			} while (ch != 5);

			// end of do while

			sc1.close();
			// closing
		} catch (Exception e) {
			System.out.println(e);
		}
		// end clatch

	}
	// end of main method
}
//end of class App