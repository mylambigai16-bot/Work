/*3. Find max or min value in an array of primitives */

package arrayEasy;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=m.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter arry element:");
		for(int i=0;i<size;i++)
			arr[i]=m.nextInt();
		int max = arr[0],min = arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Min: "+min+" Max: "+max);
		m.close();
	}

}
