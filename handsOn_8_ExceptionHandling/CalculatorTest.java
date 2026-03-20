package handsOn_8_ExceptionHandling;

class MyCalculator {

    // Method to calculate n^p with exception handling
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        long result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();

        int[][] testCases = {
            {3, 5},
            {2, 4},
            {0, 0},
            {-1, -2},
            {-1, 3}
        };

        for (int[] test : testCases) {
            int n = test[0];
            int p = test[1];
            try {
                long result = calc.power(n, p);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
    }
}

