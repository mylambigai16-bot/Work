/*Funtions movie details
 * 
 */
package training;
import java.util.*;
public class FunctionDeclear {
	static void getMovieDetail(String name,String desc,int duration,String lange,String date,String country,String gen) {
		System.out.println("Movie name: "+name);
		System.out.println("Movie Description:"+desc);
		System.out.println("Movie duration: "+duration);
		System.out.println("Movie language: "+lange);
		System.out.println("Movie release date: "+date);  
		System.out.println("Country date: "+country);
		System.out.println("Movie general: "+gen);
	}

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter movie name:");
		String name=m.nextLine();
		System.out.println("Enter movie description:");
		String desc=m.nextLine();
		System.out.println("Enter Movie duration:");
		int duration=m.nextInt();
		m.nextLine();
		System.out.println("Enter movie language:");
		String lange=m.nextLine();
		System.out.println("Enter release date:");
		String date=m.nextLine();
		System.out.println("Enter country:");
		String country=m.nextLine();
		System.out.println("Enter general:");
		String gen=m.nextLine();
		getMovieDetail(name,desc,duration,lange,date,country,gen);
        m.close();
	}

}
