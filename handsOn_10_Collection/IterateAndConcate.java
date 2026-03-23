package handsOn_10_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateAndConcate {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("Java");
		hs.add("Hello");
		hs.add("Programming");
		hs.add("World");
		String conc="";
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			String word=it.next();
			System.out.println("Elements in the Set :"+word);
			conc= conc.concat(" "+word);
		}
		System.out.println("Concatenated result:"+conc);

	}

}
