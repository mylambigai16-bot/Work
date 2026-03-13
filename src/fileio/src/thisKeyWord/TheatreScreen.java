package thisKeyWord;

public class TheatreScreen {
	private static int total_seats=20;
	
	TheatreScreen(){
		System.out.println("Current seat: "+total_seats);
	}
	
	public void display() {
		System.out.println("Current seat available:"+total_seats);
	}
	
	public static void BookTicket(int tick) {
		System.out.println("Bokked ticket:"+tick);
		total_seats=total_seats-tick;
	}

	public static void main(String[] args) {
		TheatreScreen m=new TheatreScreen();
		m.BookTicket(4);
		TheatreScreen m1=new TheatreScreen();
		m1.BookTicket(5);
		m1.display();
	} 
}
