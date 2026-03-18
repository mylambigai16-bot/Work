/*9. Write a program to print sum of digits of a given number*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.*;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int k = m.nextInt();
		int sum = 0, r;
		while (k > 0) {
			r = k % 10;
			sum += r;
			k /= 10;

		}
		System.out.print("Sum : " + sum);
		m.close();
	}

}
