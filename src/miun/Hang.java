package miun;

import java.util.Scanner;

public class Hang {
		//I want to try to get the game to autogenerate a word instead of choosing one of these words. 
	private static String[] words = {"cat", "dog", "spider", "chicken", "word", "coke","hangman","game","java","window", "a", "chrome", "black", "board", "information"};
	private static String word = words[(int) (Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;
		//Code above generates a mask from a random word from the words string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 5 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
			//If there is a try left it will ask the user for input
		sc.close();
	}
	
	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}
			//Code to deal with mask above 
		if (asterisk.equals(newasterisk)) {
			count++;
			Wrongguess();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("You win! The word was " + word);
			System.exit(0);
		}
			//Gives player input that they screwed up, got a letter right or won the game. I might have to lower the amount of tries, it just seems to easy. 7 to 5 for now.
	}
	public static void Wrongguess() {
		
		 
	{
		if (count == 1) {
			System.out.println("Wrong guess, you have 4 trys left");
		}
		if (count == 2) {
			System.out.println("Wrong guess, you have 3 trys left");
		}
		if (count == 3) {
			System.out.println("Wrong guess, you have 2 trys left");
		}
		if (count == 4) {
			System.out.println("Wrong guess, you have 1 try left");
		}
		if (count == 5) {
			System.out.println("You used all of your trys");
			System.out.println("GAME OVER! The word was " + word);
			System.exit(0); 
				//Tells player that they got a letter wrong and then tells the user the word when they lose. It also kills the game when lost. I want to add in a way to get it to restart the game if the user wants to. 
		}
	}
}
}

