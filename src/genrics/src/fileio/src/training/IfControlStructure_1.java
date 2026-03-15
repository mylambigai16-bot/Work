package training;
import java.util.Scanner;
public class IfControlStructure_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean seat=true;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the seat number: ");
        String num=m.next();
        if(seat)
        	System.out.print(num);
	}

}
