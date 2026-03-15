/*9. To check whether the given number is Armstrong number or not.
Note: Armstrong number is 3 digit number, the sum of cubes of each digit is equal to
the number itself.*/

package controlFlowMedium;

import java.util.*;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = m.nextInt();
		int r, k = num, result = 0;
		while (num > 0) {
			r = num % 10;
			result = result + (r * r * r);
			num = num / 10;
		}
		System.out.println(k == result ? "Armstrong" : "Not Armstrong");
		// System.out.println(num+" "+k+" "+result);
		m.close();
	}

}
