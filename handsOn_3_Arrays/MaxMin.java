/*3. Find max or min value in an array of primitives*/
package handsOn_3_Arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter array of input: ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		
		int max = arr[0], min = arr[0];
		for (int i = 1; i < 10; i++) {
			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];
		}
		
		System.out.println("Max :" + max + " Min :" + min);
		sc.close();
	}

}
