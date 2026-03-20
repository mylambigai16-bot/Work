package handsOn_3_Arrays;

import java.util.Scanner;

public class Share {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of friends: ");
		int friends = sc.nextInt();
		System.out.println("Enter number of chocolate they have: ");
		int m, sum = 0;
		for (int i = 0; i < friends; i++) {
			m = sc.nextInt();
			sum = sum + m;
		}
		System.out.println(sum % friends == 0 ? "Yes" : "No");
		sc.close();
	}

}
