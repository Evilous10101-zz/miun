package miun;
import miun.Hang404;
import miun.Hang;
import java.io.*;
public class Random {
	
	 public static BufferedReader fR;
	 
	    public static void openRead(String storage) throws IOException, FileNotFoundException {
	        try {
	            fR = new BufferedReader(new FileReader(storage));
	        } catch (IOException ex) {
	            System.out.println("Error opening file: " + ex);
	        }
	    }
	
	    Hang404 restart = new Hang404();
	    
}

//This part here is useless since I put it on Hang
//If it hates being on Hang then I will use this instead
//right now String[] hates using buffered reader.
//Only for word length
//no idea why
//I will be half way done one this bug is done