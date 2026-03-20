//Movie seat ooking for VIP, Premium< and Regular
package training;
import java.util.*;
public class MovieSeat {

	public static void main(String[] args) {
		String seats[][]=new String[][] {{"B","B","A","A","A"},{"A","A","A","B","B"},{"A","B","B","B","B"},{"B","A","A","B","A"}};
		int vip_tot=5,premium_tot=10,rugular_tot=5;
		int vip=0,premium=0,regular=0;
		/*for(int i=0;i<seats.length;i++) {
			if(i==0) 
				System.out.println("VIP Seat");
	
			else if(i==1) 
				System.out.println("Premiunm Seat");
		
			else if(i==3) 
				System.out.println("Regulat seat");
	
		}*/
		for(int i=0;i<seats.length;i++) {
			for(int j=0;j<seats[i].length;j++) {
				if(i==0&&seats[i][j].equals("B"))
					vip++;
				else if((i>0&&i<3)&&seats[i][j].equals("B"))
					premium++;
				else if(i==3&&seats[i][j].equals("B"))
					regular++;
			}
		}
		System.out.println("Seat booked details");
		System.out.println("---VIP seat---");
		System.out.println("Booked-"+vip+" Available-"+(vip_tot-vip)+" Total-"+vip_tot);
		
		System.out.println("---Premium seat---");
		System.out.println("Booked-"+premium+" Available-"+(premium_tot-premium)+" Total-"+premium_tot);
		
		System.out.println("---Regular seat---");
		System.out.println("Booked-"+regular+" Available-"+(rugular_tot-regular)+" Total-"+premium_tot);
		}
		}
