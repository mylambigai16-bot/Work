package arrayMedium;

import java.util.*;

public class Unique_Duplicate {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = m.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array element:");
		for (int i = 0; i < size; i++)
			arr[i] = m.nextInt();
		int duplicate_count = 0, unique_count = 0;
		for (int i = 0; i < size; i++) {

			int count = 1;
			boolean visited = false;

			// Check if element already counted
			for (int k = i - 1; k >= 0; k--) {
				if (arr[i] == arr[k]) {
					visited = true;
					break;
				}
			}

			if (visited)
				continue;

			// Count occurrences
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > 1)
				duplicate_count++;
			else
				unique_count++;
		}

		System.out.println("No of duplicate element: " + duplicate_count);
		System.out.println("No of unique elements: " + unique_count);

		m.close();
	}

}
