package training;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int letter = 'a';
		char letter = 'a'; 
        switch(letter)
        {
        case 'a':
        {
        	System.out.print("Lower case");
        	break;	
        }
        case 'A':
        {
        	System.out.print("Upper case");
        	break;
        }
        default:
        {
        	System.out.print("Invalid letter");
        	break;
        }
	}
	}
}
