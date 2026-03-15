/*5. Given an n-dimensional array A[]. The aim is to identify the greatest element
therein*/
package arrayEasy;

import java.util.*;

public class MaxIn2D {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the row size:");
		int x = m.nextInt();
		System.out.println("Enter the column size:");
		int y = m.nextInt();
		int arr[][] = new int[x][y];
		System.out.println("Enter the element:");
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				arr[i][j] = m.nextInt();
		int max = arr[0][0];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.print("Greatest: " + max);
		m.close();
	}

}
