package training;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TicketDetails {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Scanner m=new Scanner(System.in);
        System.out.println("Enter Movie ID: ");
        int id=m.nextInt();
        m.nextLine();
        
        System.out.println("Enter Movie Name: ");
        String name=m.nextLine();
        
        System.out.println("Enter Movie description: ");
        String des=m.nextLine();
        
        System.out.println("Enter Movie language: ");
        String lan=m.nextLine();
        
        System.out.println("Enter Movie Generl: ");
        String gen=m.nextLine();
        
        System.out.println("Enter Movie release date (dd/mm/yy): ");
        String date=m.nextLine();
        SimpleDateFormat moviereleasedate=new SimpleDateFormat("dd/MM/yyyy");
        Date moviedate=moviereleasedate.parse(date);
        
        System.out.println("Enter Movie Seat Cost: ");
        float cost=m.nextFloat();
        
        System.out.println("ENTERED MOVIE DETAIL ARE:");
        System.out.println("Enter Movie ID: "+id);
        System.out.println("Enter Movie Name: "+name);
        System.out.println("Enter Movie description: "+des);
        System.out.println("Enter Movie language: "+lan);
        System.out.println("Enter Movie Generl: "+gen);
        System.out.println("Enter Movie release date: "+moviedate);
        System.out.println("Enter Movie cost: "+cost);
        
	}

}
