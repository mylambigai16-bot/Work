package list;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String ,Integer>();
		System.out.println("Hash map size: "+hm.size());
		hm.put("Mylu",21);
		hm.put("Kalai",39);
		hm.put("Ila",23);
		System.out.println("Element in map:"+hm);
		Set<Map.Entry<String,Integer>>set=hm.entrySet();
		for(Map.Entry<String,Integer>me:set) {
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
		}
	}

}
