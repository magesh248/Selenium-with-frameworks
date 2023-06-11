package javaForAutomation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


/*How to WRITE A File in Java

1. File Writer =>straight forward, direct interaction with files,less performance
2. Buffered Writer =>Easiest way, performance wise better and widely used
3. FileOutputStream=>for writing raw byte array information (eg. images)
4. Path => this also writes byte array
*/


public class UsingFilewriter {
	
	
	public static void main(String[] args) throws IOException {
		
		
		/* METHOD 2 //Mostly used 
		 * String location="D://UsingBufferFilewriterDoc.txt"; // if i give
		 * "D://UsingBufferFilewriterDoc.txt" it will store in D drive location or it
		 * will store in same console if refresh
		 * 
		 * String Content="Java is widely used in selenium to test the application ";
		 * 
		 * FileWriter filewrite =new FileWriter(location); // Buffer is temp storage
		 * BufferedWriter bufferwriter =new BufferedWriter(filewrite);
		 * 
		 * bufferwriter.write(Content);
		 * 
		 * bufferwriter.close();
		 */
		
		
		
		
		/*METHOD 1
		 * String location="UsingFilewriterDoc.txt"; 
		 * 
		 * String Content="Selenium is the framework used for Automation testing to test the web application ! ";
		 * 
		 * FileWriter filewrite =new FileWriter(location);
		 * 
		 * filewrite.write(Content);
		 * 
		 * filewrite.close();
		 */
		
		
		
		/*METHOD 3
		 * String location="UsingFileOutputStream.txt";
		 * 
		 * String Content="TestNG is framework used in selenium NG mean Next Genration";
		 * 
		 * FileOutputStream fileout=new FileOutputStream(location);
		 * 
		 * byte[] statement= Content.getBytes();
		 * 
		 * fileout.write(statement);
		 * 
		 * fileout.close();
		 */
		
		
		
	}

}
