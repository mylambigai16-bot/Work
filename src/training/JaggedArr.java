package training;
import java.util.*;
public class JaggedArr {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		int a=m.nextInt();
		char book_no[][]=new char[a][];
	
		for(int i=0;i<a;i++)
		{
			int k=m.nextInt();
			book_no[i]=new char[k];
			for(int j=0;j<k;j++)
			{
				book_no[i][j]=m.next().charAt(0);
			}
		}
		for(int i=0;i<book_no.length;i++,System.out.println())
			for(int j=0;j<book_no[i].length;j++)
				System.out.print(book_no[i][j]);
	}

}
