/*4. Write a program using do-while loop to evaluate the series 1+2+3+…..+i.*/

//controlFlowEasy;
package handsOn_1_ControlStatement;

import java.util.*;

public class Sum {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int i = 1, sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= n);
		System.out.print("sum : " + sum);
		m.close();
	}

}
