/*1. Keeping in mind there are 86400 seconds per day, 
 * write a program that calculates 
 * how many seconds there are in a week if a week is 7 days*/

package controlFlowMedium;

public class Seconds {
	public static void main(String[] args) {
		int second_per_day = 86400;
		// Seconds in week = seconds per day * days in week
		System.out.print(second_per_day * 7 + " seconds are in a week.");
	}
}
