package list;
import java.util.*;
public class Spliterator1 {

	public static void main(String[] args) {
		ArrayList<Double>a=new ArrayList<Double>();
		System.out.println("Initial size:"+a.size());
		a.add(1.0);
		a.add(2.0);
		a.add(3.0);
		a.add(4.0);
		a.add(5.0);
		System.out.println("Contents of array using tryAdvance:");//takes each element at a time (slower in performance)
		Spliterator<Double>sitr=a.spliterator();
		while(sitr.tryAdvance((n)->System.out.println(n+"")));
		System.out.println();
		System.out.println("Contents of array using forEachRemaining:");//takes all elements together(faster in performance)
		sitr=a.spliterator();
		while(sitr.tryAdvance((n)->System.out.println(n+"")));
		System.out.println();
		System.out.println("size after insertion:"+a.size());

	}

}
