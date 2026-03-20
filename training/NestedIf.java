package training;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner m=new Scanner(System.in);
        int age=m.nextInt();
        int weight = m.nextInt();
        if(age>18)
        {
        	if(weight>50)
        		System.out.println("Your eligible to donate blood");
        	else
        		System.out.println("Not eligible because you are under weight");
        }
        else
        	System.out.println("Not eligible because your under age");
	}

}
