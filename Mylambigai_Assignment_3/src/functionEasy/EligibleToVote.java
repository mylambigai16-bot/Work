/*4. A person is elligible to vote if his/her age is greater than or equal to 18. Define a
method to find out if he/she is elligible to vote*/
package functionEasy;
import java.util.*;
public class EligibleToVote {
	static void vote(int age) {
		if(age>=18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible");
	}

	public static void main(String[] args) {
		Scanner m =new Scanner(System.in);
		System.out.println("Enter age:");
		int age=m.nextInt();
		vote(age);
		m.close();
	}

}
