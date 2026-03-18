package list;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack <String> s=new Stack<String>();
		System.out.println("Initial size: "+s.size());
		s.push("M");
		s.push("Y");
		s.push("L");
		s.push("U");
		System.out.println("Stack: "+s);
		System.out.println("Stack size:"+s.size());
		s.pop();
		s.remove(2);
		System.out.println("Stack: "+s);
		System.out.println("Stack size:"+s.size());
	}

}
