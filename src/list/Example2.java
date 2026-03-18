package list;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter array size:");
		arr.add(4);
		arr.add(3);
		arr.add(4);
		arr.add(9);
		arr.add(5);
		arr.add(3);
		arr.add(8);
		System.out.println(arr);
		Integer a[]=new Integer[arr.size()];
		a=arr.toArray(a);
		int sum=0;
		for(int i=0;i<arr.size();i++) {
			sum+=a[i];
		}
		System.out.println("Sum: "+sum);
	}

}
