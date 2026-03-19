//functionHard;
package HandsOn_2_Function;

import java.util.Scanner;

public class MaxPlacement {

	// Function to find the department(s) with maximum placements
	static void findMaxPlacement(int cs, int ec, int me) {
		// Check for invalid input
		if (cs < 0 || ec < 0 || me < 0) {
			System.out.println("Input is invalid");
			return;
		}

		// Check if all departments have zero or equal placements
		if (cs == ec && ec == me) {
			System.out.println("None of the department has got the highest placement");
			return;
		}

		// Find the maximum placement value
		int max = Math.max(cs, Math.max(ec, me));

		System.out.print("Highest placement ");

		// Print department(s) with maximum placements
		if (cs == max) {
			System.out.print("CS ");
		}
		if (ec == max) {
			System.out.print("EC ");
		}
		if (me == max) {
			System.out.print("ME ");
		}

		System.out.println(); // Move to next line
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of students placed in CS: ");
		int cs = sc.nextInt();

		System.out.print("Enter the no of students placed in EC: ");
		int ec = sc.nextInt();

		System.out.print("Enter the no of students placed in ME: ");
		int me = sc.nextInt();

		findMaxPlacement(cs, ec, me);

		sc.close();
	}
}
