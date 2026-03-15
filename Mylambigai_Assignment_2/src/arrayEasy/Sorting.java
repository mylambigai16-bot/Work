/*2. Write a program to sort the elements of an array in sequence.*/
package arrayEasy;
import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enetr array size:");
		int size=m.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<size;i++)
			arr[i]=m.nextInt();
		
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i:arr) {
				System.out.print(i+" ");

	}
		m.close();
	}

}
