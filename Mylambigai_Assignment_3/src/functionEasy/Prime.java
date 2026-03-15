/*2. Write a function to find the prime numbers between 1 to 100*/
package functionEasy;

public class Prime {
	static void prime() {
		for(int i=2;i<10 ;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		prime();
	
	}

}
