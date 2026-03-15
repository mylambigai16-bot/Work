/*2. Mark is purchasing certain glossary items in a supermarket. While purchasing certain items,
a discount of 15% is offered to him if the quantity purchased is more than 500. Help, Mark
to calculate the total expenses*/

package controlFlowMedium;

import java.util.Scanner;

public class SuperMarket {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int cost = m.nextInt();
		if (cost > 500) {
			// discount of 15% if purchase more the 500
			int disc = cost - cost * 15 / 100;
			System.out.print("Total expenses : " + disc);
		} else
			System.out.print("Total expense : " + cost);
		m.close();
	}
}
