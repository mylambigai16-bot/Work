/*1.Write a Java method that removes all duplicate characters from a given string while
preserving the order of first appearance.
 Constraints:
• Ignore case for duplication comparison (optional based on requirement)
• Do not use Set<String> built-in removal methods
• Use your own logic + frequency/boolean array
Sample Input:
corporate assignment
Sample Output:
corpte asingm*/
package HandsOn_7_Stringbuffer;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		String str=m.nextLine();
		boolean arr[]=new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
	
			if(!arr[c]) {
				System.out.print(c);
				arr[c]=true;
			}
		}
		m.close();
	}

}
