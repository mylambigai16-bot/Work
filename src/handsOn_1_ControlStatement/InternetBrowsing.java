/*4.Write a program to calculate bill for Internet browsing. The conditions are:
a. 1 hr 50 Rs.
b. 1min 1 Re.
c. 5 hrs 200 Rs.
d. User can only browse maximum 7 hrs*/

//controlFlowMedium;
package handsOn_1_ControlStatement;

import java.util.*;

public class InternetBrowsing {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);

		System.out.println("Enter Hours:");
		int h = m.nextInt();

		System.out.println("Enter Minutes:");
		int min = m.nextInt();

		int amount = 0;

		if (h > 7 || (h == 7 && min > 0)) {
			System.out.println("Maximum browsing limit exceeded");
		} else {
			if (h < 5) {
				amount = h * 50 + min * 1;
			} else if (h == 5) {
				amount = 200 + min * 1;
			} else if (h > 5 && h <= 7) {
				amount = h * 50 + min * 1;
			}

			System.out.println("Amount to Pay: Rs " + amount);
		}

		m.close();
	}
}
