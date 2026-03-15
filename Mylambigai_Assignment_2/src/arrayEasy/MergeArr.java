/*7. Write a program to merge two arrays into a third array. Display the values of three
arrays*/
package arrayEasy;

import java.util.*;

public class MergeArr {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Array 1 size:");
		int x = m.nextInt();
		System.out.println("Array 2 size:");
		int y = m.nextInt();
		int arr1[] = new int[x];
		int arr2[] = new int[y];
		int arr3[] = new int[x + y];
		System.out.println("Enter Array_1:");
		for (int i = 0; i < x; i++)
			arr1[i] = m.nextInt();
		System.out.println("Enter Array_2:");
		for (int i = 0; i < y; i++)
			arr2[i] = m.nextInt();

		for (int i = 0; i < x; i++)
			arr3[i] = arr1[i];

		for (int i = 0; i < y; i++)
			arr3[x++] = arr2[i];

		System.out.println("Array_1:");
		for (int i : arr1)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("Array_2:");
		for (int i : arr2)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("Merged Array:");
		for (int i : arr3)
			System.out.print(i + " ");
		m.close();
	}

}
