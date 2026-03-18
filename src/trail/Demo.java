package trail;

class x {
	int i;

	void display() {
		System.out.println(i);
	}
}
 
class Derived extends x {
	int j;

	void display() {
		//super.display();
		System.out.println(j);
	}
}

public class Demo {
	public static void main(String args[]) {
		Derived obj = new Derived();
		obj.i = 5;
		obj.display();
		obj.j = 10;
		obj.display();
	}
}
