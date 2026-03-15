/*8. Write a program to find the missing number in a given integer array of 1 to 100*/
package arrayMedium;

import java.util.*;

public class Key {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = m.nextInt();
		System.out.println("Enter the array element:");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = m.nextInt();
		System.out.println("Enter the key:");
		int key = m.nextInt();
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "True" : "False");
		m.close();
	}

}
