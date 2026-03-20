//6. Write a program to find the duplicate number on a given integer array.
package handsOn_3_Arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		boolean[] visited = new boolean[10];

		System.out.println("Enter array input: ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < 10; i++) {

			if (visited[i])
				continue;

			boolean isDuplicate = false;

			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					visited[j] = true; // mark duplicate
				}
			}

			if (isDuplicate) {
				System.out.println("Duplicate element is " + arr[i]);
			}
		}

		sc.close();
	}
}