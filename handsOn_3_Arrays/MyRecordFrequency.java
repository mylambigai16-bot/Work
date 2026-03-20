/*5. Teena having elements as 10,10,10,10,20,20,20,20,40,40,50,50,30 and she
maintained in the data structure “my_record”. She needs to find the frequency of
element in my_report and display the count.*/
package handsOn_3_Arrays;

public class MyRecordFrequency {
    public static void main(String[] args) {

        int[] arr = {10,10,10,10,20,20,20,20,40,40,50,50,30};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " frequency " + count);
        }
    }
}