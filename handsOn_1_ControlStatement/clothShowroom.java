/*4. A cloth showroom has announced the following festival discounts on the purchase of
items based on the total cost of the items purchased:
Total Cost                       Discount Rate
Less than Rs. 2000                    5%
Rs. 2000 to less than Rs. 5000        25%
Rs. 5000 to less than Rs. 10,000      35%
Rs. 10,000 and above                  50%
Write a program to input the total cost and to compute and display the amount to be
paid by the customer availing the discount.
Sample Input 1:
4500
Sample Output 1:
3375.0
Sample Input 2:
6800
Sample Output 2:
4420.0*/
//controlFlowHard;
package handsOn_1_ControlStatement;

import java.util.*;

public class clothShowroom {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("The total cost:");
		int cost = m.nextInt();
		float discount = 0;
		if (cost < 2000)
			discount = cost * 5 / 100;
		else if (cost >= 2000 && cost < 5000)
			discount = cost * 25 / 100;
		else if (cost >= 5000 && cost < 10000)
			discount = cost * 35 / 100;
		else if (cost >= 10000)
			discount = cost * 50 / 100;

		float paid_amount = cost - discount;
		System.out.println("The amount to be paid: " + paid_amount);
		m.close();
	}
}
