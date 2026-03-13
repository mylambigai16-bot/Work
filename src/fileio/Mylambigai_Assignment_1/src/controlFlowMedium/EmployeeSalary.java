/*7. To input basic salary of an employee and calculate gross salary based on the condition
given below using if-else-if statement:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90%
Basic Salary >= 20001 : HRA = 30%, DA = 95%
Gross Salary=Basic Salary + HRA + DA
*/
package controlFlowMedium;

import java.util.*;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Basic salary: ");
		int basic_salary = m.nextInt();
		int HRA = 0, DA = 0;
		if (basic_salary <= 10000) {
			HRA = basic_salary * 20 / 100;
			DA = basic_salary * 80 / 100;
		} else if (basic_salary > 10000 && basic_salary < 20001) {
			HRA = basic_salary * 25 / 100;
			DA = basic_salary * 90 / 100;
		} else if (basic_salary > 20000) {
			HRA = basic_salary * 30 / 100;
			DA = basic_salary * 95 / 100;
		}

		int Gross_Salary = basic_salary + HRA + DA;
		System.out.println("Gross Salary: " + Gross_Salary);
		m.close();
	}

}
