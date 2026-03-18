/*8. Accepts a string and calculate the number of digits and letters.
Sample I/O:
Enter String: India became independent in 1947
Output:
Letters: 24, Digits: 4, Other Symbols: 4*/

//controlFlowMedium;
package handsOn_1_ControlStatement;

import java.util.*;

public class Digits_Letters {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = m.nextLine();
		int letter_count = 0, digit_count = 0, symbol_count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
				letter_count++;
			else if ((str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				digit_count++;
			else
				symbol_count++;
		}
		System.out.printf("Letters: %d\nDigits: %d\nSymbols: %d", letter_count, digit_count, symbol_count);
		m.close();
	}
}
