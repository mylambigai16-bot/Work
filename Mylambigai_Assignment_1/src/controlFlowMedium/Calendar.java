/*5. Write a program that reads continuously a month number (1 = Jan, 12 = Dec), the day
that the month begins (1 = Mon, 7 = Sun), and displays the calendar for that month. If
the selected month is February, the program should prompt the user to enter the
month’s number of days, that is, 28 or 29. If the given month is out of [1, 12], the
program should terminate*/

package controlFlowMedium;

import java.util.*;

public class Calendar {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int month = m.nextInt();

		System.out.println("Enter the day that the month begins:");
		int month_begins = m.nextInt();

		month_begins = month_begins - 1;
		//String day[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String Month[] = { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		switch (month) {
		case 1, 3, 5, 7, 8, 12: {
			System.out.println("-----" + Month[month - 1] + "-----");
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			for (int i = 0; i < month_begins; i++)
				System.out.print("    ");
			for (int i = 1; i <= 31; i++) {
				System.out.printf("%3d ", i);
				month_begins++;

				if (month_begins % 7 == 0)
					System.out.println();
			}
			break;
		}
		case 4, 6, 9, 11: {
			System.out.println("-----" + Month[month - 1] + "-----");
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			for (int i = 0; i < month_begins; i++)
				System.out.print("    ");
			for (int i = 1; i <= 31; i++) {
				System.out.printf("%3d ", i);
				month_begins++;

				if (month_begins % 7 == 0)
					System.out.println();
			}
			break;
		}
		case 2: {
			System.out.println("Enter days in feburary(28 or 29):");
			int days = m.nextInt();
			System.out.println("-----Feburary-----");
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			System.out.println("Mon Tue Wed Thu Fri Sat Sun");
			for (int i = 0; i < month_begins; i++)
				System.out.print("    ");
			for (int i = 1; i <= days; i++) {
				System.out.printf("%3d ", i);
				month_begins++;

				if (month_begins % 7 == 0)
					System.out.println();
			}
			break;
		}
		}
		m.close();

	}
}