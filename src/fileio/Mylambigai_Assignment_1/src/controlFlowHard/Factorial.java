/*5. Sam teaches his student to find the factorial of a number. He wanted to test the
understanding of the student. For that, he provides a number. He wants the students
to tell him that number is a factorial of which number. Help the student by writing a
program to do this.
Note that the input should be a number greater than zero. If the input is less than or
equal to zero, the output should be “Invalid Input”. Also, if the input provided is not
exactly the factorial of a number, say, the input provided is 122, which is not a perfect
factorial of a number; it should return “Sorry. The given number is not a perfect
factorial”.
Sample Input 1:
5040
Sample Output 1:
7
Sample Input 2:
0
Sample Output 2:
Invalid Input
Sample Input 3:
700
Sample Output 3:
Sorry. The given number is not a perfect factorial*/
package controlFlowHard;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=m.nextInt();
		if(num <= 0) {
			System.out.println("Invalid Input");
		}
		else {
			int i=1;
			while(num > 1) {

				if(num % i != 0) {
					System.out.println("Not a perfect factorial");
					return;
				}

				num = num / i;
				i++;
			}

			System.out.println("The given number is factorial of: "+(i - 1));
		}
		m.close();
		}

}

