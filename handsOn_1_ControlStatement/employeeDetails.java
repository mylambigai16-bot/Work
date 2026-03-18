/*1. Write a program to get employee details, wages and number of days worked from user
and find total salary.*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.*;

public class employeeDetails {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enetr employee details:");
		// System.out.println("Employee Name: ");
		// String name=m.nextLine();
		// System.out.println("Enter employee ID:");
		// String id=m.nextLine();
		System.out.println("Enter wages: ");
		float wages = m.nextFloat();
		System.out.println("Number of days worked: ");
		int days = m.nextInt();
		int total_salary = (int) (wages * days);
		System.out.println("Total salary: " + total_salary);
		m.close();
	}

}
