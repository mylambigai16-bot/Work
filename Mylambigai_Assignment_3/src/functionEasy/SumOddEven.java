/*1. Write a function to Calculate the Sum of Odd & Even Numbers*/
package functionEasy;
import java.util.*;
public class SumOddEven {
	static void oddEven(int x,int[] arr) {   //called function
		int sum_odd=0,sum_even=0;
		for(int i=0;i<x;i++) {
			if(arr[i]%2==0)    //even
				sum_even+=arr[i];
			else if(arr[i]%2!=0) //odd
				sum_odd+=arr[i];
		}
		System.out.println("Odd sum: "+sum_odd);
		System.out.println("Even sum: "+sum_even);
	}

	public static void main(String[] args) {
		Scanner m =new Scanner(System.in);
		int x = m.nextInt();             //array size
		int [] arr = new int[x];
		for(int i=0;i<x;i++)
			arr[i]=m.nextInt();
		oddEven(x,arr);                  //calling function
		m.close();
	}

}
