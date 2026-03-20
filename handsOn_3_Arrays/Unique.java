/*4. Ivan has a list of n elements and he need to eliminate the duplicate numbers from
the list and to create the new list to hold the unique number.*/
package handsOn_3_Arrays;

public class Unique{
    public static void main(String[] args) {
      

        int[] arr = {2, 5, 7, 2, 4};
        int n = arr.length;

        int[] unique = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[k++] = arr[i];
            }
        }

        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}