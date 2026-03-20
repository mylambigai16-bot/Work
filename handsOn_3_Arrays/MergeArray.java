//7. Write a program to merge two arrays into a third array. Display the values of three
//arrays. 
package handsOn_3_Arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[5];
		System.out.println("Enter array input: ");
		for (int i = 0; i < 5; i++)
			arr1[i] = sc.nextInt();

		int[] arr2 = new int[5];
		System.out.println("Enter array input: ");
		for (int i = 0; i < 5; i++)
			arr2[i] = sc.nextInt();

		int[] arr3 = new int[10];
		int k = 0;
		for (int i = 0; i < 5; i++)
			arr3[k++] = arr1[i];
		for (int i = 0; i < 5; i++)
			arr3[k++] = arr2[i];

		System.out.print("Array 1: ");
		for (int i = 0; i < 5; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		System.out.print("Array 2: ");
		for (int i = 0; i < 5; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		System.out.print("Array 3: ");
		for (int i = 0; i < 10; i++)
			System.out.print(arr3[i] + " ");

		sc.close();
	}

}
