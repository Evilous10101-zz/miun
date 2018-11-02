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
