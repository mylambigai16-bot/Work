/*1. Write a program to add even and odd numbers from 1 to 10. Store and display their
results in two separate arrays.*/
package arrayEasy;

public class OddEven {

	public static void main(String[] args) {
		int odd_Arr[] = new int[10];
		int even_Arr[] = new int[10];
		int k = 0, m = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				even_Arr[k++] = i;
			else
				odd_Arr[m++] = i;

		}
		System.out.println("Even array : ");
		for (int i = 0; i < k; i++)
			System.out.print(even_Arr[i] + " ");

		System.out.println();

		System.out.println("Odd array : ");
		for (int i = 0; i < m; i++)
			System.out.print(odd_Arr[i] + " ");
	}

}
