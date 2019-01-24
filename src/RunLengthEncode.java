import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class RunLengthEncode{

	public int[][] imageArr;
	public int numRows;
	public int numCols;
	
	public RunLengthEncode(int numR, int numC) {
		this.imageArr= new int[numR][numC];
		this.numRows=numR;
		this.numCols=numC;
	}//end RunLengthEncode
	
	public void setImageArr(Scanner inputFile) {
		
		while(inputFile.hasNext()) {
			
			for(int i=0;i<this.numRows;i++) {
				for(int j=0; j<this.numCols;j++) {
					this.imageArr[i][j]=inputFile.nextInt();
				}//end for numCols
			}//end for numRows
			
		}//end while-hasNext
		
	}//end setImageArr
	
	
	
	////Encode zero, not wrap-around
	void Method1(int numR, int numC, FileWriter oFile) {
		
		//Step1
		int r=0;
		int count=0;
		int currVal=0;  //read the next pixel from infile
	    while(r<numR) {
	    	int c=0;
	    	 
	    	while(c<numC) {
	    		
	    		 count=0;  //no wrap around-begin with 0 once the whole collum is done
	    		
	    		currVal=this.imageArr[r][c];  //read the next pixel from the inFile
	    		
	    		//Step 2: output r and c and currVal to outFile
	    		try {
					oFile.write(r + " "+ c + " " +currVal+" ");
				} catch (IOException e) {
					System.err.println("Cannot write in File");
					e.printStackTrace();
				}
	    		
	    		//step2: count++
	    		do{
	    			count++;
	    			c++;
	    		}while(c<numC&&imageArr[r][c]==currVal);
	    		
	    		try {
	    		
					oFile.write(count+" ");  //LINE SEPERATOR WORKS AFTER A STRING! THATS CRAZY!!!!!!!
					oFile.append(System.lineSeparator());
				} catch (IOException e) {
					System.err.println("Cannot write in File");
					e.printStackTrace();
				}
	    		  	
	    		//count=0;
	    	}//end while numC
	    	r++;
	    }//end while numR
	    
	    
	    
	    
	}//end Method1
	
	
	
	
	
}//end RunLengthEncode