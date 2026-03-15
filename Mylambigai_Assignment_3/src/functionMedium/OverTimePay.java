package functionMedium;
	import java.util.Scanner;

public class OverTimePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalEmployees = 5; // Number of employees

        for (int i = 1; i <= totalEmployees; i++) {
            System.out.print("Enter hours worked by employee " + i + ": ");
            int hours = sc.nextInt();

            int overtimeHours = 0;
            if (hours > 40) {
                overtimeHours = hours - 40; // Overtime hours
            }

            int overtimePay = overtimeHours * 15; // Rs.15 per hour
            System.out.println("Overtime pay for employee " + i + ": Rs." + overtimePay);
            System.out.println();
        }

        sc.close();
    }
}
