/*10. Write a program to print the following number pattern
Sample I/O
Enter the N value: 5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */

package controlFlowEasy;
import java.util.Scanner;
public class Numpyramid {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the K Value : ");
		int k=m.nextInt();
		for(int i=1;i<=k;i++,System.out.println()) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
		}
		m.close();
	}

}
