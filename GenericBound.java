package genrics;

public class GenericBound {
	static <T extends Number> T display(T one,T two) {
		return (T)(Integer)(one.intValue()+two.intValue());
		
	}
	static <T> T dis(T str1) {
		return (T) (str1);
		
	}

 public static void main(String[] args) {
		System.out.println(display(11,12));
		System.out.println(dis("Myl"));
	}

}
