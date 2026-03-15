package training;

public class TheatreConstructor {
	int id;
	String name;
	int screens;
	String location;
	
	TheatreConstructor(int ID,String NAME,int SCREEN,String LOCATION){
		id=ID;
		name=NAME;
		screens=SCREEN;
		location=LOCATION;
	}
	
	 TheatreConstructor() {
		// TODO Auto-generated constructor stub
	}

	public void get() {
		System.out.println("Theatre Id:"+id);
		System.out.println("Theatre Name:"+name);
		System.out.println("Theatre Screen:"+screens);
		System.out.println("Theatre location:"+location);
	}
	public static void main(String[] args) {
		TheatreConstructor m=new TheatreConstructor();
		m.get();
	}
}
