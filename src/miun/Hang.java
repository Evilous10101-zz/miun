package miun;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA_2_3.ORB;

import miun.Hang404;
import miun.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileWriter;
public class Hang {
	 public static  BufferedReader fR;
	 
	    public  void openRead(String storage) throws IOException, FileNotFoundException {
	        try {
	            fR = new BufferedReader(new FileReader(storage));
	        } catch (IOException ex) {
	            System.out.println("Error opening file: " + ex);
	        }
	    }
	    
	    public static int wins = 0;
	    public static int losses = 0;
	private static void simpleListSample()
	{
		
		List<String> strings = new ArrayList<String>();
		strings.add("these are the ammount of wins you have" + wins);
		strings.add("These are the losses you have" + losses);
		strings.add("These are your hints (in word order):");
		strings.add(" pet");
		strings.add(" pet");
		strings.add("an incest");
		strings.add(" farm animal");
		strings.add(" word");
		strings.add(" drink");
		strings.add(" game");
		strings.add(" programing language");
		strings.add("an object in a house");
		strings.add(" word");
		strings.add("an application");
		strings.add(" color");
		strings.add(" food");
		strings.add("an object in a classroom");
		strings.add("knowlegde");
		strings.add(" food");
		strings.add(" number");
		strings.add("an aplication");
		strings.add(" animal");
		strings.add("point of view");
		for(String str : strings)
		{
			System.out.println(str); }
		}
	//IOException ex
	public static Scanner kbd = new Scanner (System.in);
	public static  BufferedReader words = fR;
	
	BufferedReader aString = fR;
	private static String word;
	Reader inFromUser = new StringReader(word);
	
	
	
	// public static String word = ((CharSequence) words).length();
	//word = new word.length();
	//public static  String word = words[(int) (Math.random() * words.length)];
	public static String asterisk = new String(new char[((CharSequence) word).length()]).replace("\0", "*");
	
	public static int MRL;
	
	//MRL is my digital signature. 
		//I want to try to get the game to get the data from the storage file instead of the string
	
	public static int count = 0;
		//Code above generates a mask from a random word from the words string
	
	//gatherdata();
	public static void gatherdata() throws Exception{
		File file = new File("storage"); 
		//redundant code which does nothing new
		//might be removed
		 BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		 }
	
	//gatherdata();
	
	public static void main(String[] args) throws Exception {
		
		//Hang.gatherdata();
		Scanner sc = new Scanner(System.in);
		Hang.simpleListSample();
		while (count < 5 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
			//If there is a try left it will ask the user for input
		sc.close();
	}
	
	public static void hang(String guess) throws Exception {
		//Hang.gatherdata();
		String newasterisk = "";
		for (int i = 0; i < ((CharSequence) word).length(); i++) {
			if (((CharSequence) word).charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += ((CharSequence) word).charAt(i);
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
			System.out.println("do you want to play again? ");
			Integer wins = new Integer(1);
			Scanner input = new Scanner(System.in);
			String decision;

			boolean yn = true;
			while(yn)
			{
			 

			    System.out.println("Do you want to play again, please only enter yes or no");
			    decision = kbd.nextLine();


			    switch(decision)
			    {
			        case "yes":
			            yn = false;
			            Hang404.restart();
			            
			            break;

			        case "no":
			            yn = false;
			            try (PrintWriter out = new PrintWriter("output.txt")) {
			        	    out.println(word);
			        	    out.println(asterisk);
			        	    out.println(count);
			        	    out.println(words);
			        	    out.println(fR);
			            }
			            System.exit(0);
			            break;

			        default:
			            System.out.println("please enter again ");
			            boolean repeat = true;

			            while (repeat)
			            {
			                System.out.println("please enter yes or no again : yes or no");
			                decision = kbd.nextLine();

			                switch (decision)
			                {
			                    case "yes":
			                        yn = repeat = false;
			                       
			                        Hang404.restart();
			                        break;

			                    case "no":
			                        yn = repeat = false;
			                        try (PrintWriter out = new PrintWriter("output.txt")) {
			                    	    out.println(word);
			                    	    out.println(asterisk);
			                    	    out.println(count);
			                    	    out.println(words);
			                    	    out.println(fR);
			                    	}
			                        System.exit(0);
			                        break;
			                }
			            }
			            
			    }
			    
			    
			
			
			
			
		}
			
		}
		}
			//Gives player input that they screwed up, got a letter right or won the game. I might have to lower the amount of tries, it just seems to easy. 7 to 5 for now.
	
	public static void Wrongguess() throws Exception   {
		//Hang.gatherdata();
	{
		if (count == 1) {
			System.out.println("Wrong guess, you have 4 tries left");
		}
		if (count == 2) {
			System.out.println("Wrong guess, you have 3 tries left");
		}
		if (count == 3) {
			System.out.println("Wrong guess, you have 2 tries left");
		}
		if (count == 4) {
			System.out.println("Wrong guess, you have 1 tries left");
		}
		if (count == 5) {
			System.out.println("You used all of your tries :[ ");
			System.out.println("GAME OVER! The word was " + word);
			Scanner input = new Scanner(System.in);
			String decision;
			Integer losses = new Integer(1);
			boolean yn = true;
			while(yn)
			{
			 

			    System.out.println("Do you want to play again, please only enter yes or no");
			    decision = kbd.nextLine();


			    switch(decision)
			    {
			        case "yes":
			            yn = false;
			            
			            Hang404.restart();
			            break;

			        case "no":
			            yn = false;
			            try (PrintWriter out = new PrintWriter("output.txt")) {
			        	    out.println(word);
			        	    out.println(asterisk);
			        	    out.println(count);
			        	    out.println(words);
			        	    out.println(fR);
			        	}
			            System.exit(0);
			            break;

			        default:
			            System.out.println("please enter again ");
			            boolean repeat = true;

			            while (repeat)
			            {
			                System.out.println("please enter yes or no again : yes or no");
			                decision = kbd.nextLine();

			                switch (decision)
			                {
			                    case "yes":
			                        yn = repeat = false;
			                       
			                        Hang404.restart();
			                        break;

			                    case "no":
			                        yn = repeat = false;
			                        try (PrintWriter out = new PrintWriter("output.txt")) {
			                    	    out.println(word);
			                    	    out.println(asterisk);
			                    	    out.println(count);
			                    	    out.println(words);
			                    	    out.println(fR);
			                    	}
			                        System.exit(0);
			                        break;
			                }
			            }
			            
			    }
			    
			    
			
			
			
			
		}
		    }
			
				//Tells player that they got a letter wrong and then tells the user the word when they lose. It also kills the game when lost. I want to add in a way to get it to restart the game if the user wants to. whenever I try the code kills itself. I might have to redo a good amount of code for this.
		}
		
	}
}

	







