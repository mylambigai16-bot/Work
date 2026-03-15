/*2. Write a program to check whether the given number is divisor of 7 using simple if
statement*/

package controlFlowEasy;
import java.util.Scanner;
public class divisibleBySeven {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=m.nextInt();
		if(num%7==0)
			System.out.print(num+" is divisor of 7.");
		m.close();
	}
}
