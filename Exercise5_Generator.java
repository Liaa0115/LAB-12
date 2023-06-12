package EXERCISE5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * EXERCISE5
 * 
 * 
 * @author Amelia_Asyqin(B032210011)
 *
 */
public class Exercise5_Generator {

      public static void main(String[] args) {
		// 1
		String outFile = "rainfall.txt";
		
		// Data declaration
		String dates[] = {"06/06/2023", "07/06/2023", "08/06/2023", "09/06/2023", "10/06/2023", "11/06/2023"};
        double rainfalldata[] = {6.0, 19.0, 1.0, 0.0, 61.0, 0.0};
		
		try {
			// 2
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			dos.writeUTF("Simpang Ampat");
			dos.writeUTF("Alor Gajah");
			// Process data
			for (int index = 0; index < dates.length; index++) {
				
				// 3
				dos.writeUTF(dates[index]);
				dos.writeDouble(rainfalldata[index]);
				
				// 4
				dos.flush();
			}
			
			// 5
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// End of program
		System.out.println("End of program. Check out " + outFile); 
	}
}
