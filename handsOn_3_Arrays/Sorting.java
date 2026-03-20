/*2. Write a program to sort the elements of an array in sequence.
*/
package handsOn_3_Arrays;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter array of input: ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}
}
