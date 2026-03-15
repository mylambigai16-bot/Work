package arrayMedium;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int unique[] = new int[n];

        int count = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}
