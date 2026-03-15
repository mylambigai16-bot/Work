/*6. Write a program to find the duplicate number on a given integer array.*/
package arrayEasy;

import java.util.*;

public class duplicate {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int size = m.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = m.nextInt();
		int c = 0;
		// Brute Force Algorithm
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					c++;
					break;
				}
			}
		}
		System.out.println(c == 0 ? "No duplicate" : "Duplicate found");
		m.close();
	}
}
//Time Complexity O(n²)
