package genrics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

	public static void main(String[] args) {
		List <Double> inte=new ArrayList<>();
		inte.add((double) 3);
		inte.add((double)5);
		inte.add((double)10);
		double sum=sum(inte);
		System.out.println("Sum: "+sum);
	}
	public static double sum(List<? extends Number>list) {
		double sum=0;
		for(Number n:list) {
			sum=sum+n.doubleValue();
		}
		return sum;
	}
	

}
