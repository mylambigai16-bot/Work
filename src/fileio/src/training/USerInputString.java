package training;
import java.util.*;
public class USerInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner m=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=m.next();
        System.out.println("Hi, "+name+". Welcome!");
        System.out.printf("Hi %s. Welcome!",name);
	}

}
