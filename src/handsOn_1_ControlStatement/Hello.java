/*6. Write a program that reads an integer continuously and displays "Hello" as many times
as the value of the integer. If the user enters a negative number, the insertion of
integers should end and the program should display the total number of the displayed
"Hello".*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.*;

public class Hello {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int k = m.nextInt();
		int c = 0;
		while (k >= 0) {
			System.out.println("Hello");
			k = m.nextInt();
			c++;
		}
		System.out.println("Count: " + c);
		m.close();
	}

}
