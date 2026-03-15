/*3. Ana planned to choose the four digit lucky number for her car. Her lucky numbers are 3,
5 and 7. Help her to find the number, whose sum is divisible by 3 or 5 or 7. Provide a
valid car number, Fails to provide a valid input then display that number is not a valid
car number.
Sample Input 1:
Enter the car no: 1234
Sample Output 1:
Lucky Number
Sample Input 2:
Enter the car no: 1214
Sample Output 2:
Sorry it’s not my lucky number
Sample Input 3:
Enter the car no: 14
Sample Output 3:
14 is not a valid car number*/
package controlFlowHard;
import java.util.*;
public class LuckyNumber {
	public static void main(String[] args) {
		Scanner m= new Scanner(System.in);
		System.out.println("Enter car number: ");
		int num=m.nextInt();
		int c=0,r,sum=0,k=num;
		while(num>0) {
			c++;
			r=num%10;
			sum+=r;
			num/=10;
		}
		if(c==4) {
			if(sum%3==0 || sum%5==0 || sum%7==0)
				System.out.println("Lucky Number");
			else
				System.out.println("Sorry it's not my lucky number");
		}
		else
			System.out.println(k+" is not a valid car number");
		m.close();
	}

}
