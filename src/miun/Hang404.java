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
	//goes back to the start of the game
	System.out.println("test to see if this works");
	Hang words = new Hang();
	
	Hang word = new Hang();
	Hang asterisk = new Hang();
	Hang count = new Hang();
	Hang.gatherdata();
	Hang fR = new Hang();
	
	try (PrintWriter out = new PrintWriter("output.txt")) {
	    out.println(word);
	    out.println(asterisk);
	    out.println(count);
	    out.println(words);
	    out.println(fR);
	}
			
			Hang.count = 0;
			
	Hang.main(null);
}
	
	
	
}