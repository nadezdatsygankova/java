/*//Author: Nadezda Tsygankova
//ID: 152949194
//Final exam  -Q2
 This task is required to create Craps, which is a popular dice game played in casinos.
You are supposed to write a program to play a variation of the game, as follows:
• Roll two dice. (Each roll should produce two random numbers between 1 to 6)
• Each die has six faces representing values 1, 2, …, and 6, respectively.
• Check the sum of the two dice. If the sum is 2, 3, or 12 (your program should display craps), you lose
the game.
• If the sum of the two dice is 7 or 11 (your program should display naturals), you win the game.
• If the sum of two dice is any value (i.e., 4, 5, 6, 8, 9, or 10), your program should establish a point in
the game (meaning store that sum). Continue to roll the dice until the sum is either a 7 or the same
point value which was established. If rolled sum is 7, you lose the game. Otherwise, if the rolled sum is
equal to established point you win.
 * 
 * 
 * 
 */

public class Q2 {

	private static int number1 = 0;
	private static int number2 = 0;
	private static int savePoint = 0;

	// function that randomly select a word
	public static int RandomNumber() {

		int min = 1;
		int max = 6;
		// generate random number between min and max inclusive
		int number = (int) Math.floor(Math.random() * (max - min + 1) + min);

		return number;
	}

//function for games craps
	public void craps() {
		boolean flag = false;
		do {
			number1 = RandomNumber();
			number2 = RandomNumber();
			// calculate sum using function sum
			int sum = sum(number1, number2);
			// if savePoint = 0 -> first roll
			if (savePoint == 0) {
//win
				if (sum == 7 || sum == 11) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("Congratulations, You win");
					flag = true;
					// lose
				} else if (sum == 2 || sum == 3 || sum == 12) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("Craps, Better Luck Next Time, You lose");
					flag = true;
				}
//establish a point in the game (save it in savePoint)
				else {
					savePoint = sum;
					System.out.println("Point is (established) set to " + savePoint);
				}
				// next roll if we have savePoint >0
			} else {
				// lose
				if (sum == 7) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("Craps, Better Luck Next Time, You lose");
					flag = true;
				}
				// win
				else if (sum == savePoint) {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
					System.out.println("Congratulations, You win");
					flag = true;
				}
				// print result
				else {
					System.out.println("You rolled " + number1 + " + " + number2 + " = " + sum);
				}

			}
		} while (!flag);

	}

//function for sum two int
	public static int sum(int number1, int number2) {
		return number1 + number2;

	}

	public static void main(String[] args) {
		Q2 newGameQ2 = new Q2();
		newGameQ2.craps();
	}

}
