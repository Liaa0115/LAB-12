package EXERCISE7;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * EXERCISE7
 * 
 * 
 * @author Amelia_Asyqin(B032210011) 
 *
 */
public class Exercise7_Generator {

	public static void main( String args[]) throws IOException {
			// 1. 
			String fileName = "rainfalll.txt";
			
			try {
				//  2. 
				Writer data = new FileWriter(fileName);
				
				//Data
				data.write("2222002,Durian Tunggal,Alor Gajah,37.0,6.0,9.0,0.0,5.0,0.0\n");
				data.write("2222033,Batu Hampar,Melaka Tengah,30.0,11.5,22.0,0.0,21.5,0.0\n");
				data.write("2225044,Chohong,Jasin,39.0,14.5,24.5,0.5,3.5,0.0\n");
		         
				data.close();
				
			} catch (FileNotFoundException e) {
				
				
				e.printStackTrace();
			}
			
			System.out.println("Succesfully created. End of execution. Check out "+ fileName);		
	}
}
