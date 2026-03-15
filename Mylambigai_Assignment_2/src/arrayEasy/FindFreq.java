/*4. Write a program to find the frequency of each element in the array*/
package arrayEasy;

import java.util.*;

public class FindFreq {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = m.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++)
			arr[i] = m.nextInt();

		boolean[] visited = new boolean[size];

		for (int i = 0; i < size; i++) {

			if (visited[i])
				continue;

			int count = 1;

			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(arr[i] + " occurs " + count + " times");
		}

		m.close();
	}
}
