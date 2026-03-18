package list;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String ,Integer>();
		System.out.println("Tree map size: "+tm.size());
		tm.put("Mylu",21);
		tm.put("Kalai",39);
		tm.put("Ila",23);
		System.out.println("Element in Tree map:"+tm);
		Set<Map.Entry<String,Integer>>set=tm.entrySet();
		for(Map.Entry<String,Integer>me:set) {
			System.out.print(me.getKey()+" : ");
			System.out.println(me.getValue());
		}

	}

}
