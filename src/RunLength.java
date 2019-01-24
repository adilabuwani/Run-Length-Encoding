import java.io.FileWriter;
import java.io.IOException;

class RunLength{
	
	private int numRows;
	private int numCols;
	private int minVal;
	private int maxVal;
	
	public RunLength() {
		this.numRows=0;
		this.numCols=0;
		this.minVal=0;
		this.maxVal=0;
		
	}
	
	public RunLength(int numR, int numC, int minV, int maxV) {
		
		this.numRows=numR;
		this.numCols=numC;
		this.minVal=minV;
		this.maxVal=maxV;
	}
	
	public void setnumRows(int numR) {
		this.numRows=numR;
	}
	public void setnumCols(int numC) {
		this.numCols=numC;
	}
	public void setminVal(int minV) {
		this.minVal=minV;
	}
	public void setmaxVal(int maxV) {
		this.maxVal=maxV;
	}
	
	public int getnumRows() {
		return this.numRows;
	}
	
	public int getnumCols() {
		return this.numCols;
	}
	
	public int getminVal() {
		return this.minVal;
	}
	public int getmaxVal() {
		return this.maxVal;
	}
	
	//get haderInformation and write to file
	//The first text line is the input image header;
	public void setheaderInformation(FileWriter oFile) {
		try {
			oFile.write(this.getnumRows()+" "+this.getnumCols()+" "+this.getminVal()+" "+this.getmaxVal());
			oFile.append(System.lineSeparator());
		} catch (IOException e) {
			System.out.println("Invalid number of arguments");
			e.printStackTrace();
		}
	}//end setheaderInformation
	
	
	
}//end class RunLength
