package list;
import java.util.*;
public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("m");
		pq.add("y");
		pq.add("l");
		pq.add("a");
		pq.add("m");
		pq.add("k");
		pq.add("a");
		pq.add("s");
		System.out.println(pq);
	
		while(!(pq.isEmpty())) {
			System.out.println(pq.poll());
			System.out.println(pq);
		}
	}

}
