package list;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("Size:"+v.size());
		v.add("M");
		v.add("Y");
		v.add("L");
		v.add("U");
		System.out.println("Element in vector: "+v);
		System.out.println("size: "+v.size( ));
	}

}
