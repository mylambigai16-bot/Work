/*8. Write a program to check whether the given Character is an Alphabet/ Digit /Special
Symbol using if-else-if statement*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.Scanner;

public class CharCheck {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the character:");
		char c = m.next().charAt(0);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println("Alphabet");
		else if (c >= '0' && c <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special Symbol");
		m.close();
	}
}
