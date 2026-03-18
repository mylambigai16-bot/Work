package Final;

public class FinalClass {
	public void display(String k) {
		System.out.println(k);
	}
}

class Sample extends FinalClass {
	public void display(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.display("Try");

	}
}
