/*8. Write a program to find the missing number in a given integer array of 1 to 100*/
package arrayEasy;

import java.util.*;

public class MissingNum {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = m.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = m.nextInt();
			sum += arr[i];
		}

		int expectedSum = 100 * 101 / 2;

		int missing = expectedSum - sum;

		System.out.println("Missing number: " + missing);

		m.close();
	}
}
