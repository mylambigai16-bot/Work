package arrayMedium;

public class RollDice {

	public static void main(String[] args) {

		//Random r = new Random();

		int[] freq = new int[7]; // index 1–6

		for(int i = 0; i < 10; i++) {
			int roll = (int)(Math.random()*6) + 1; // generates 1–6
			freq[roll]++;
		}

		System.out.println("Dice Frequency:");

		for(int i = 1; i <= 6; i++) {
			System.out.println(i + " occurred " + freq[i] + " times");
		}
	}
}
