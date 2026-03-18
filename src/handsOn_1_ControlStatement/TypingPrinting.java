/*Write a program to calculate bill of a job work done as follows by using if-else
statement.
a. Rate of typing 3 Rs. per page
b. Printing of 1s copy Rs. per page and later every copy 3 Rs. per page*/

//controlFlowMedium;
package handsOn_1_ControlStatement;

import java.util.*;

public class TypingPrinting {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter number of pages : ");
		int pages = m.nextInt();
		System.out.println("Enter number of copies : ");
		int copy = m.nextInt();

		int typing = pages * 3;
		int printing = 0;
		if (copy > 0) {
			printing = pages * 1;
			if (copy > 1)
				printing = printing + pages * (copy - 1) * 3;
		}
		int total = typing + printing;
		System.out.println("Total cost : " + total);
		m.close();
	}

}
