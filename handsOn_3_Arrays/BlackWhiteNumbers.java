package handsOn_3_Arrays;

import java.util.Scanner;

public class BlackWhiteNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;

        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            arr[size++] = num;
        }

        for (int i = 0; i < size; i++) {

            if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
                arr[i] = -6;
            } 
            else if (arr[i] % 7 == 0) {
                arr[i] = -2;
            } 
            else if (arr[i] % 8 == 0) {
                arr[i] = -9;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}