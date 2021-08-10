/*//Author: Nadezda Tsygankova
//ID: 152949194
//Lab3-4-5 -Q3
 Create a dictionary of words, as a String array. Initialize you array in your main method
(i.e. hard code). Make this array size 20 (with 20 words) – add any words you wish
(preferably greater than 5 characters per word – to make things interesting).
 * 
 * */

package labs;

import java.util.Scanner;

public class Dictionary {
	private static String[] dictonary;

	public static String[] getDictonary() {
		return dictonary;
	}

	public void setDictonary(String[] dictonary) {
		Dictionary.dictonary = dictonary;
	}

	// function that randomly select a word
	public static String RandomWord() {
		String wordString = null;
		int min = 0;
		int max = dictonary.length - 1;
		// generate random number between min and max inclusive
		int random = (int) Math.floor(Math.random() * (max - min + 1) + min);

		// find this random word
		for (int i = 0; i < dictonary.length; i++) {
			wordString = dictonary[random];
		}
		return wordString;
	}

	// function for guess
	public void guess() {
		// find a random word
		String word = RandomWord();
		// array char for char, that guess
		char[] wordGuess = new char[word.length()];
		// initialize the array '_'
		for (int i = 0; i < word.length(); i++) {
			wordGuess[i] = '-';
			System.out.print(wordGuess[i]);
		}
		Scanner sc = new Scanner(System.in);
		char chString;
		// check guess
		int count = 0;
		// check not guess tries
		int notGues = 0;
		// loop for guessing
		do {
			notGues = 0;
			System.out.println("");
			// input a char
			System.out.println("Guess a character: ");
			chString = sc.next().charAt(0);
			// check if this char exists
			for (int i = 0; i < word.length(); i++) {
				// check for existing and check for double input same char
				if (chString == word.charAt(i) && (wordGuess[i] != word.charAt(i))) {
					wordGuess[i] = word.charAt(i);
					count = count + 1;
				} else if (word.charAt(i) == '-') {
					wordGuess[i] = '-';
				}
				// calculate not guess tries
				else if (chString != word.charAt(i)) {
					notGues = notGues + 1;
				}
			}
			// for not exists
			if (notGues == word.length()) {
				System.out.println("The character does not exists.");
				System.out.print(wordGuess);
			} else {
				System.out.print(wordGuess);
			}
		} while (count < word.length());
		// guess
		System.out.println("\nYay you guessed it");
		sc.close();
	}

	public static void main(String[] args) {
		// a dictionary of words
		Dictionary dictionary = new Dictionary();
		String[] dict = new String[20];
		dict[0] = "banana";
		dict[1] = "fruit";
		dict[2] = "apple";
		dict[3] = "longan";
		dict[4] = "mango";
		dict[5] = "strawberries";
		dict[6] = "sapodilla";
		dict[7] = "roseapple";
		dict[8] = "rhubarb";
		dict[9] = "raspberries";
		dict[10] = "quince";
		dict[11] = "pummelo";
		dict[12] = "prunes";
		dict[13] = "pricklypear";
		dict[14] = "pomegranate";
		dict[15] = "plums";
		dict[16] = "pineapple";
		dict[17] = "peaches";
		dict[18] = "passion";
		dict[19] = "nectarine";

		dictionary.setDictonary(dict);
		dictionary.guess();
	}

}
