/*1. Write a C# program to find the sums of the running odd numbers and even numbers
from a given lowerbound to an upperbound. Also compute their absolute
difference. (Use separate function to find the sum of odd and even numbers
from lowerbound to upperbound)
Sample Input and Output
The sum of odd numbers from 1 to 1000 is: 250000
The sum of even numbers from 1 to 1000 is: 250500
The absolute difference between the two sums is: 500*/
package functionMedium;
import java.util.*;
public class AbsDiff {
	static int odd_sum(int x,int y) {
		int odd_sum=0;
		for(int i=x;i<=y;i++) {
			if(i%2!=0)
				odd_sum+=i;       //odd number sum
		}
		return odd_sum;
	}
	static int even_sum(int x,int y) {
		int even_sum=0;
		for(int i=x;i<=y;i++) {
			if(i%2==0)
				even_sum+=i;     //even number sum
		}
		return even_sum;
		
	}
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Range:");
		int x=m.nextInt();
		int y=m.nextInt();
		int a=odd_sum(x,y);
		int b=even_sum(x,y);
		System.out.println("Difference: "+Math.abs(a-b)); //for absolute difference - math.abs
		m.close();
	}

}
