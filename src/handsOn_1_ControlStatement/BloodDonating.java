/*7. Write a program using if statement to check whether the blood donor is eligible or not
for donating blood. The rules laid down are as follows.
a. Age should be above 18 yrs but less than 55 yrs.
b. Weight should be more than 45kg.*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.*;

public class BloodDonating {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter age and weight: ");
		int age = m.nextInt();
		int weight = m.nextInt();
		if ((age > 18 && age < 55) && weight > 45)
			System.out.println("Eligible for donating blood!");
		else
			System.out.println("Not eligible for donating blood!");
		m.close();
	}

}
