/*1. Numbers and Alphabets has equivalent ASCII values i.e Numbers (0 to 9) equivalent
ASCII value is 48 to 57, uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90
and lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. Write a program to
sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values*/

package controlFlowHard;
import java.util.*;
public class Ascii {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter number of character:");
		int x =m.nextInt();
		char[] arr = new char[x];
		
		for(int i=0;i<x;i++)
			arr[i]=m.next().charAt(0);
		
		char temp=arr[0];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted order:");
		for(char k:arr)	
			System.out.println(k);
		m.close();
	}

}
