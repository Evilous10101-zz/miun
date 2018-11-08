package edu.ycc.java.chapter3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import edu.ycc.java.chapter3.Test76;
public class Gathering {
	public static void gath() {
	Test76 lblNewLabel_2 = new Test76();
	Test76 lblPassword = new Test76();
	try (PrintWriter out = new PrintWriter("C:/usernamespasswords")) {
	    out.println("username:" + lblNewLabel_2);
	    out.println("password" + lblPassword);
	    
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}

}
}