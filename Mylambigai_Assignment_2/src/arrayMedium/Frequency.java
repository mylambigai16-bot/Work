package arrayMedium;

public class Frequency {

    public static void main(String[] args) {

        int record[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};

        int n = record.length;

        for(int i = 0; i < n; i++) {

            int count = 1;

            // check if element already counted
            boolean visited = false;

            for(int k = i - 1; k >= 0; k--) {
                if(record[i] == record[k]) {
                    visited = true;
                    break;
                }
            }

            if(visited)
                continue;

            for(int j = i + 1; j < n; j++) {
                if(record[i] == record[j]) {
                    count++;
                }
            }

            System.out.println(record[i] + " occurs " + count + " times");
        }
    }
}
