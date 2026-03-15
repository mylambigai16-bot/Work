package arrayMedium;

import java.util.*;

public class SearchFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[25];

        System.out.println("Enter 25 numbers:");

        for(int i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 0; i < 25; i++) {
            if(arr[i] == num) {
                count++;
            }
        }

        if(count > 0)
            System.out.println(num + " appears " + count + " times in the array");
        else
            System.out.println(num + " is not present in the array");

        sc.close();
    }
}
