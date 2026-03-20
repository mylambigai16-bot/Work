package string;
import java.lang.String; 
public class STRING_3 {

	public static void concat1(String s1) {
		s1.concat("Ram");
	}
	public static void concat2(StringBuilder s2) {
		s2.append("Ravi");
	}
	public static void concat3(StringBuffer s3) {
		s3.append("Kumar");
	}
	public static void main(String[] args) {
		String s1="Hello";
		concat1(s1);
		System.out.println("String:"+s1);
		
		StringBuilder s2=new StringBuilder("Hello, ");
		concat2(s2);
		System.out.println("String bulider: "+s2);
		
		StringBuffer s3=new StringBuffer("Hello, ");
		concat3(s3);
		System.out.println("String buffer: "+s3);

	}

}
