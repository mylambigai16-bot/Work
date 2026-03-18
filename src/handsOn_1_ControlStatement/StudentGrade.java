//controlFlowHard;
package handsOn_1_ControlStatement;

import java.util.*;

public class StudentGrade {

	public static void main(String[] args) {

		Scanner m = new Scanner(System.in);

		double exercise, exam, finalGrade;
		double sum = 0;
		int count = 0;

		while (true) {

			System.out.println("Enter exercise grade:");
			exercise = m.nextDouble();

			System.out.println("Enter exam grade:");
			exam = m.nextDouble();

			// stop condition
			if (exercise == -1 || exam == -1)
				break;

			// validation
			if (exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
				System.out.println("Invalid grade. Grades must be between 0 and 10.");
				continue;
			}

			// final grade calculation
			if (exercise >= 5 && exam >= 5)
				finalGrade = 0.3 * exercise + 0.7 * exam;
			else
				finalGrade = Math.min(exercise, exam);

			System.out.println("Final Grade: " + finalGrade);

			sum += finalGrade;
			count++;
		}

		// average calculation
		if (count > 0)
			System.out.println("Average Grade of class: " + (sum / count));
		else
			System.out.println("No student records.");

		m.close();
	}
}
