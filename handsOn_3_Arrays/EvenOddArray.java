/*1. Write a program to add even and odd numbers from 1 to 10. Store and display their
results in two separate arrays.
*/
package handsOn_3_Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] evenArray = new int[5];
		int[] oddArray = new int[5];
		int even = 0, odd = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				evenArray[even++] = i;
			else
				oddArray[odd++] = i;
		}
		
		System.out.println("Even Array: ");
		for (int i = 0; i < 5; i++)
			System.out.print(evenArray[i] + " ");
		
		System.out.println();
		System.out.println("Even Array: ");
		for (int i = 0; i < 5; i++)
			System.out.print(oddArray[i] + " ");
	}

}
