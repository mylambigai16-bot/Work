//functionHard;
package HandsOn_2_Function;

import java.util.Scanner;

public class SalaryIncrement {

	// Function to calculate incremented salary
	static double calculateIncrement(double salary, double rating) {
		if (salary <= 0 || rating < 1 || rating > 10) {
			System.out.println("Invalid Input");
			return -1; // Return -1 to indicate invalid input
		}

		double increment = 0;

		if (rating >= 1 && rating <= 4) {
			increment = 0.10 * salary; // 10%
		} else if (rating > 4 && rating <= 7) {
			increment = 0.25 * salary; // 25%
		} else if (rating > 7 && rating <= 10) {
			increment = 0.30 * salary; // 30%
		}

		return salary + increment;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the salary: ");
		double salary = sc.nextDouble();

		System.out.print("Enter the appraisal rating: ");
		double rating = sc.nextDouble();

		double newSalary = calculateIncrement(salary, rating);

		if (newSalary != -1) {
			System.out.println((int) newSalary); // Display as integer as per sample output
		}

		sc.close();
	}
}
