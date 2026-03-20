//1. Write a program to check whether a specific element is present in this Array or not.
package handsOn_3_Arrays;

import java.util.Scanner;

public class Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter array input: ");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter key input: ");
		int key = sc.nextInt();

		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == key)
				flag = true;
		}
		System.out.println(flag ? "True" : "False");
		sc.close();
	}

}
