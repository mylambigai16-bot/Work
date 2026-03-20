package genrics;

public class GenericMethod {

	static <T> void display(T val) {
		System.out.println(val);
		System.out.println(val.getClass().getName()+"="+val);
	}

	public static void main(String[] args) {
		display(21);
		display("Myl");
		display(21.0);
	}

}
