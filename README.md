# Run-Length-Encoding
Run-length encoding (RLE) is a very simple form of lossless data compression in which runs of data (that is, sequences in which the same data value occurs in many consecutive data elements) are stored as a single data value and count, rather than as the original run. This is most useful on data that contains many such runs. Consider, for example, simple graphic images such as icons, line drawings, and animations. It is not useful with files that don't have many runs as it could greatly increase the file size.
Method 1) Encode with zero and no wrap-around
Algorithm steps for computing:

step 0: inFile, outFile  open input and output files
numRows, numCols, minVal, maxVal  read for inFile
 
r <-- 0

Step 1: 
	c <-- 0
	count <-- 0
	currVal <-- read the next pixel (integer) from inFile 
*one integer at a time*

Step 2: output r and c and currVal to outFile
	
  count ++

Step 3: c++

Step 4: nextVal <-- read the next pixel (integer) from inFile

Step 5: if nextVal == currVal
	   	count++
	  else
	   	output count to outFile
	  	currVal <-- nextVal
	  	count <-- 1
	   	output r and c and currVal
		 
Step 6: repeat step 3 to step 5 until end of text line

Step 7: r++ 
		
Step 8: repeat Step 1 to Step 7 until end of file

			
step 9: closed all files
