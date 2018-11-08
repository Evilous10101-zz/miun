package miun;

import java.util.Scanner;
import miun.Hang;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import miun.Random;
public class Hang404 {
	
	
public static void restart() throws Exception {
	//goes back to the start of the game, also makes output.txt and writes info on how many tries, if you won, and how much you got right 
	System.out.println("test to see if this works");
	Hang words = new Hang();
	
	Hang word = new Hang();
	Hang asterisk = new Hang();
	Hang count = new Hang();
	Hang.gatherdata();
	Hang fR = new Hang();
	Hang losses = new Hang();
	Hang wins = new Hang();
	try (PrintWriter out = new PrintWriter("output.txt")) {
	    out.println("This is the word you have" + word);
	    out.println("This shows asterisks" + asterisk);
	    out.println("This shows how many trys you used" + count);
	    out.println(words);
	    out.println(fR);
	    out.println("this is the losses you have " + losses);
	    out.println("This is the wins you have " + wins);
	    
	}
			
			Hang.count = 0;
			//sets trys back to zero then goes make to main
	Hang.main(null);
}
	
	
	
}