/*4. Write a program to find the frequency of each element in the array*/
package handsOn_3_Arrays;

import java.util.Scanner;

public class FrequencyOfEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter array of input: ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		
		boolean visited[] = new boolean[10];
		
		for (int i = 0; i < 10; i++) {
			if (visited[i])
				continue;
			int count = 1;
			for (int j = 0; j < 10; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " frequency " + count);
		}
		
		sc.close();

	}

}
