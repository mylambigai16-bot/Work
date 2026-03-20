package training;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max=10,seatCount=0;
        while(max>seatCount) {
        	System.out.println("Current seat Availability: "+(max-seatCount));
        	seatCount++;
        }
	}

}
 