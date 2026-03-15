/*6.Calculate purchase amount to be paid after discount using if-else. Consider 10 %
discount for the Sale amount above 1000 and 5% discount for the Sale amount less
than 1000.
Formula:
Purchase Amount = price * quantity
Discount Amount = Purchase amount * 0.10(10%)
Paid Amount = Purchase Amount – Discount Amount*/

package controlFlowMedium;

import java.util.*;

public class Discount {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter price:");
		int price = m.nextInt();
		System.out.println("Enter quantity:");
		int quantity = m.nextInt();
		int Discount_Amount = 0;

		int Purchase_Amount = price * quantity;
		if (Purchase_Amount > 1000)
			Discount_Amount = Purchase_Amount * 10 / 100;
		else if (Purchase_Amount < 1000)
			Discount_Amount = Purchase_Amount * 5 / 100;

		int Paid_Amount = Purchase_Amount - Discount_Amount;
		System.out.println("Paid Amount: " + Paid_Amount);
		m.close();
	}

}
