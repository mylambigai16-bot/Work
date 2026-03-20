package handsOn_3_Arrays;
import java.util.*;

public class ThreeArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array 1 size: ");
		int size1=sc.nextInt();
		int[] arr1 = new int[10];
		System.out.println("Enter array 1 input: ");
		for (int i = 0; i < size1; i++)
			arr1[i] = sc.nextInt();
		
		System.out.println("Enter array 2 size: ");
		int size2=sc.nextInt();
		int[] arr2 = new int[10];
		System.out.println("Enter array 2 input: ");
		for (int i = 0; i < size2; i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("Enter array 3 size: ");
		int size3=sc.nextInt();
		int[] arr3 = new int[10];
		System.out.println("Enter array 3 input: ");
		for (int i = 0; i < size3; i++)
			arr3[i] = sc.nextInt();
		
		int size4=size1+size2+size3;
		int k=0;
		int[] arr4 = new int[size4];
		for (int i = 0; i < size1; i++)
			arr4[k++]=arr1[i];
		for (int i = 0; i < size1; i++)
			arr4[k++]=arr2[i];
		for (int i = 0; i < size1; i++)
			arr4[k++]=arr3[i];
		
		Arrays.sort(arr4);
		
		for(int i=0;i<size4;i++)
			System.out.print(arr4[i]+" ");
		
		sc.close();
	}

}
