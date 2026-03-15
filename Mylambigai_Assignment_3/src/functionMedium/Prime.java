/*2. To speed up his composition of generating unpredictable rhythms, Aniruth wants the
list of prime numbers available in a range of numbers. Can you help him out? Write a
C# program to print all prime numbers in the interval [x,y] (x and y, both
inclusive).(Use separate function to print all prime numbers in the given interval)
Sample Input 1:
2
15
Sample Output 1:
2 3 5 7 11 13*/
package functionMedium;
import java.util.*;

public class Prime {

    // Function to print all prime numbers in the interval [x, y]
    static void prime(int x, int y) {
        if (x > y) {
            System.out.println("Provide valid input");
            return;
        }

        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to next line after printing all primes
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the range:");
        int x = m.nextInt();
        int y = m.nextInt();
        prime(x, y);
        m.close();
    }
}
