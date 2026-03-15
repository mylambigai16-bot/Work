package genrics;

public class GenericBound {
	static <T extends Number> T display(T one,T two) {
		return (T)(Integer)(one.intValue()+two.intValue());
		
	}

	public static void main(String[] args) {
		System.out.println(display(11,12));
		System.out.println(display("Myl","learning"));
	}

}
