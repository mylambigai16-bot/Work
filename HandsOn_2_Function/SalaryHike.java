/*3. Get the salary per month and hike from user and the write a C# program to
calculate new salary with hike.
Hint: The formula is Salary hike = oldSalaryPerMonth + (oldSalaryPerMonth X
hike/100)
*/
//functionEasy;
package HandsOn_2_Function;

import java.util.*;

public class SalaryHike {
	static float salary(int x, int y) {
		float Salary = x + (x * y / 100);
		return Salary;
	}

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter salary:");
		int old_salary = m.nextInt();
		System.out.println("Enter hike:");
		int hike = m.nextInt();
		System.out.print("New Salary: " + salary(old_salary, hike));
		m.close();
	}

}
