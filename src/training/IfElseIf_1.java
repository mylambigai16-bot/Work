package training;
import java.util.*;
public class IfElseIf_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner m=new Scanner(System.in);
        System.out.println("Types of seats available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nchoose any one of the option:");
        String seat=m.next();
        
        if(seat.equals("REGULAR"))
        	System.out.println("You have select the REGULAR seat and cost is Rs.80");
        else if(seat.equals("PREMIUM"))
        	System.out.println("you have selected the PREMIUM seat and cost is Rs.100");
        else if(seat.equals("EXCUTIVE"))
        	System.out.println("you have selected the EXCUTIVE seat and cost is Rs.120");
        else if(seat.equals("VIP"))
        	System.out.println("you have selected the VIP seat and cost is Rs.150");
        else
           	System.out.println("you have not selected any type");
        m.close();
	}

}
