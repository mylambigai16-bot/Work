/*6. Mark enters randomly twenty five numbers from the keyboard and stores it into an
array. He wants to search if the number is present in the array and if it is present, he
needs to display the number of times it appears in the array. */
package handsOn_3_Arrays;

import java.util.Scanner;

public class SearchFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Frequency of " + key + " is: " + count);
        } else {
            System.out.println("Number not found");
        }

        sc.close();
    }
}
