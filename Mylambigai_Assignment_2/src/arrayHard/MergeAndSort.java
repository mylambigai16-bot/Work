package arrayHard;
import java.util.*;
public class MergeAndSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first array size:");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++)
			arr1[i]=sc.nextInt();
		
		System.out.println("Enter second array size:");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++)
			arr2[i]=sc.nextInt();
		
		System.out.println("Enter third array size:");
		int size3=sc.nextInt();
		int[] arr3=new int[size3];
		for(int i=0;i<size3;i++)
			arr3[i]=sc.nextInt();
		
		int size4=size1+size2+size3;
		int[] arr4=new int[size4];
		int k=0;
		for(int i=0;i<size1;i++)
			arr4[k++]=arr1[i];
		for(int i=0;i<size2;i++)
			arr4[k++]=arr2[i];
		for(int i=0;i<size3;i++)
			arr4[k++]=arr3[i];
		Arrays.sort(arr4);
		System.out.println("Sorted array after merging:");
		for(int i=0;i<size4;i++)
			System.out.print(arr4[i]+" ");
		sc.close();
	}

}
