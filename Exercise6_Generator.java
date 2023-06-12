package EXERCISE6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * EXERCISE6
 * 
 * byte-based stream
 * DataOutputStream.class
 * 
 * @author Amelia_Asyqin(B032210011)
 * 
 */


public class Exercise6_Generator {
	
	public static void main (String [] args)
	{
		
		String OutFile = "Rainfall.txt";
		

		// id of each stations
		int id[] = {2222002, 2125002};
		
		// name of each stations
		String Name_Of_Station[] = {"Durian Tunggal","Telok Rimba"};
		
		// name of each stations
		String Name_Of_District[] = {"Alor Gajah","Jasin"};
		
		//Data on each date
		//6 June 2023
		double data1[] = {37.0, 69.0};
		//7 June 2023
		double data2[] = {6.0,53.0};
		//8 June 2023
		double data3[] = {9.0,4.0};
		//9 June 2023
		double data4[] = {0.0,0.0};
		//10 June 2023
		double data5[] = {5.0, 89.0};
		//11 June 2023
		double data6[] = {0.0, 0.0};
		
		try {
			
			DataOutputStream DosOut = new DataOutputStream(new FileOutputStream(OutFile));
			
			for (int index = 0; index < Name_Of_Station.length; index++) {
				
				DosOut.writeInt(id[index]);
				DosOut.writeUTF(Name_Of_Station[index]);
				DosOut.writeUTF(Name_Of_District[index]);
				DosOut.writeDouble(data1[index]);
				DosOut.writeDouble(data2[index]);
				DosOut.writeDouble(data3[index]);
				DosOut.writeDouble(data4[index]);
				DosOut.writeDouble(data5[index]);
				DosOut.writeDouble(data6[index]);

				DosOut.flush();
			}
			DosOut.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		System.out.println("End of program. Check out " + OutFile); 
	}
}
