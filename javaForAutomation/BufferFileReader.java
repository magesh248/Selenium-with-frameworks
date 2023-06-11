package javaForAutomation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*How to read file in JAVA

Bufferedreader is the simplest and widely used way*/

public class BufferFileReader {
	
	public static void main(String[] args) throws IOException {
		
		String location ="UsingBufferFilewriterDoc.txt";
		
		FileReader fileRead =new FileReader(location);
		
		BufferedReader bufferfileRead =new BufferedReader(fileRead);
		
		String Content;
		
		while((Content =bufferfileRead.readLine())!= null)// to read next line of data
		{
			System.out.println(Content);
			
		}
		
		
		bufferfileRead.close();
		
		
		
		
	}
}
