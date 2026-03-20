//2. Roll the dice 100 times and display the frequency of each number rolled using
//arrays.
package handsOn_3_Arrays;

import java.util.Scanner;

public class RollDice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] roll = new int[10];
		boolean[] dice = new boolean[6];

		for (int i = 0; i < 10; i++)
			roll[i] = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			if (dice[i])
				continue;
			int c = 0;
			for (int j = 0; j < 10; j++) {
				if (roll[i] == roll[j]) {
					c++;
					dice[i] = true;
				}
			}
			System.out.println(roll[i] + " frequency " + c);
		}
		sc.close();
	}

}
