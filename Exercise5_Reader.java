package EXERCISE5;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * EXERCISE5
 * 
 * 
 * @author Amelia_Asyqin(B032210011)
 *
 */

public class Exercise5_Reader {
	public static void main(String[] args) {

		// 1
		String sourceFile = "rainfall.txt";
		String divider = "*****************************************";
	
		System.out.println(divider);
		System.out.println("Reading data from " + sourceFile);
		System.out.println("Rainfall Data for 06/06/2023 - 11/06/2023");
		System.out.println(divider + "\n");
		
		try {
			
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			
			double rainfall_data = 0;
			double Tot_Of_Rainfall_Data = 0;
			int Records_Num = 0;
			String date = "";
			
			String station = dis.readUTF();
            String district = dis.readUTF();
			
			// Display rainfall data
            System.out.println("Station Name : " + station);
            System.out.println("District Name : " + district);
            System.out.println("\n");
			
			
			while(dis.available() > 0) {
				// Read the data
				date = dis.readUTF();
				rainfall_data = dis.readDouble();
				System.out.println( date + " : " + rainfall_data);
				
				// Calculate total utilization
				Tot_Of_Rainfall_Data += rainfall_data;
				Records_Num ++;
			}
			
			// 
			dis.close();
			
			// Calculate the average of daily rainfall
			double ave_rainfall = 	Tot_Of_Rainfall_Data / Records_Num;
			String formattedAverage = String.format("%.1f", ave_rainfall);
			System.out.print("\nAverage rainfall for " + Records_Num 
					+ " dates : " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		System.out.println("\n");
		System.out.println(divider + "\n");
		
		// End of program
		System.out.println("\nEnd of program.");
		
	}

}
