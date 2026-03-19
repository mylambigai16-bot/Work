/*2. Write a function to find the prime numbers between 1 to 100*/
//functionEasy;
package HandsOn_2_Function;

public class Prime {
	static void prime() {
		for (int i = 2; i < 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("The prime numbers between 1 to 100:");
		prime();

	}

}
