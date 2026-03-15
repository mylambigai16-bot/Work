package arrayHard;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[100];
		int j=0;
		System.out.println("Enter integer input:");
		while(true) {
			int num=sc.nextInt();
			if(num<=-1)
				break;
			arr[j++]=num;
		}
		for(int i=0;i<j;i++) {
			if(arr[i]%7==0 && arr[i]%8==0) {
				arr[i]=-6;
			}
			else if(arr[i]%7==0)
				arr[i]=-2;
			else if(arr[i]%8==0)
				arr[i]=-9;
		}
		System.out.println("Output:");
		for(int i=0;i<j;i++)
			System.out.println(arr[i]+" ");
		sc.close();
	}

}
