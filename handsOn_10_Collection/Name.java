package handsOn_10_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Namelist=new ArrayList<String>();
	
		System.out.println("How many names do you want to input? ");
		int size=s.nextInt();
		s.nextLine();
		
		for(int i=1;i<=size;i++){
			System.out.println("Enter name #"+i);
			Namelist.add(s.nextLine());
			
		}
		System.out.println("Names longer than 5 characters:");
		for(String k:Namelist) {
			if(k.length()>5)
		
			System.out.println(k);
		}

	}

}
