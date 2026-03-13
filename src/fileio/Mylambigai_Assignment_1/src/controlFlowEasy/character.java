/*3. Use switch case structure to print the appropriate message to recognize the entered
character is vowel, consonant or symbol.*/
package controlFlowEasy;
import java.util.*;
public class character {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		char c=m.next().charAt(0);
		//char cc=character.toUpperCase(c);
		switch(c) {
		case 'a','e','i','o','u','A','E','I','O','U':{
			System.out.println("Vowel");
			break;}
		default:
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
				System.out.println("Consonant");
			else
				System.out.println("Symbol");
				
		}
		m.close();
	}
}
