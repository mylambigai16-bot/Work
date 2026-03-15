package arrayHard;
import java.util.*;
public class Chocolate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of friends: ");
		int friends=sc.nextInt();
		int [] chacolate=new int[friends];
		System.out.println("Enter each members have how many chacolate: ");
		for(int i=0;i<friends;i++) {
			chacolate[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<friends;i++) {
			sum+=chacolate[i];
		}
		System.out.println("Can they share among them?");
		System.out.println(sum%friends==0?"Yes":"No");
		sc.close();
	}

}
