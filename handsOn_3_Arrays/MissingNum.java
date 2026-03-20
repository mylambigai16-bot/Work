//8. Write a program to find the missing number in a given integer array of 1 to 100
package handsOn_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9]; // example: 1–10 with one missing

		System.out.println("Enter array input:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		// Check if 1 is missing
		if (arr[0] != 1) {
			System.out.println("Missing number is: 1");
			return;
		}

		// Check missing in between
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] != arr[i] + 1) {
				System.out.println("Missing number is: " + (arr[i] + 1));
				return;
			}
		}

		// Check last number
		System.out.println("Missing number is: " + (arr[arr.length - 1] + 1));

		sc.close();
	}
}