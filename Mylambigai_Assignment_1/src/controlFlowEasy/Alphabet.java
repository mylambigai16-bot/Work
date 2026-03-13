/*5. Write a program using for loop to print alphabets as follows:
az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za */

package controlFlowEasy;
public class Alphabet {
	public static void main(String[] args) {
		for(char i='a',j='z';i<='z';i++,j--) {//Two pointer algorithm
			System.out.print(i+""+j+" ");
			
		}
	}

}

