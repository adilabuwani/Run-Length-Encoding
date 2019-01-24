import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			
			if(args.length<2) 
		    {
		        System.err.println("Invalid number of arguments");
		        System.exit(1);
		    }
			//step 0: inFile, outFile  open input and output files

			Scanner inFile = new Scanner(new FileReader(args[0]));
			FileWriter outFile= new FileWriter(args[1]);  //the output file stored
			
			//numRows, numCols, minVal, maxVal  read for inFile
			RunLength fileLength= new RunLength(inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt());
			
			fileLength.setheaderInformation(outFile);
			
			RunLengthEncode Encode= new RunLengthEncode(fileLength.getnumRows(), fileLength.getnumCols());
			
			Encode.setImageArr(inFile);  //setImageArr
			
			Encode.Method1(fileLength.getnumRows(), fileLength.getnumCols(), outFile);
			
			
			//close inFile, and outFile
			inFile.close();
			outFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("cannot find file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("cannot find file");
			e.printStackTrace();
		}
		

	}//end main

}
