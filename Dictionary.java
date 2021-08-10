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

	
	public static String RandomWord() {
		String wordString = null;
		int min = 0;
		int max =19;
		
		int random = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		
		for (int i = 0; i < dictonary.length; i++) {
			wordString=dictonary[random];
		}		
		return wordString;	
	}
	
	public void guess() {
		String word = RandomWord();
		char[] wordGuess= new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			wordGuess[i]='-';
			System.out.print(wordGuess[i]);
		}
//		System.out.println(word);
		 Scanner sc = new Scanner(System.in);
		 char chString;
		 int count=0;
		 int notGues=0;
		do {
			notGues=0;
			System.out.println("");
			System.out.println("Guess a character: ");
			chString = sc.next().charAt(0);
			for (int i = 0; i < word.length(); i++) {
              if(chString==word.charAt(i) &&(wordGuess[i]!=word.charAt(i)))
				{
            	  wordGuess[i]=word.charAt(i); 
					count = count+1;
				}
              else if(word.charAt(i)=='-'){
            	  wordGuess[i]='-'; 
			}else if (chString!=word.charAt(i)) {
				notGues=notGues+1;
			}
            
//					System.out.print(wordGuess[i]);
			}	
			
			if( notGues==word.length()) {
			System.out.println("The character does not exists.");
			System.out.print(wordGuess);
			}
			else {
				System.out.print(wordGuess);
			}
		}while(count < word.length());
System.out.println("\nYay you guessed it");
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		String[] dict =new String[20];
		dict[0]="banana";
		dict[1]="fruit";
		dict[2]="apple";
		dict[3]="longan";
		dict[4]="mango";
		dict[5]="strawberries";
		dict[6]="sapodilla";
		dict[7]="roseapple";
		dict[8]="rhubarb";
		dict[9]="raspberries";
		dict[10]="quince";
		dict[11]="pummelo";
		dict[12]="prunes";
		dict[13]="pricklypear";
		dict[14]="pomegranate";
		dict[15]="plums";
		dict[16]="pineapple";
		dict[17]="peaches";
		dict[18]="passion";
		dict[19]="nectarine";
		
		
		dictionary.setDictonary(dict);
		dictionary.guess();
		
		
	}

}
