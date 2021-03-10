package handlingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		
		ReadingFiles.ReadingTextFile();
		
		ReadingFiles.ReadingTextFileUsingLoop();
			
	}
	
	public static void ReadingTextFile() throws IOException {
		
		//Stream Connectivity
		
				//output stream to select directory
				File f = new File ("B:\\Eclipse\\Workspace\\myTextFile.txt");
				//output stream to write files and chaining to previous step
				FileReader fr = new FileReader(f);
				//Chainig buffered writer to write in the text file
				BufferedReader reader = new BufferedReader(fr);
				
				//read text file
				System.out.println(reader.readLine());//read the very 1st line (single line)
				System.out.println(reader.readLine());//it will actually gonna read the second line , i.e., next line

				//closing the stream
				reader.close();

				System.out.println("File Reading Success");
				
	}
	
	public static void ReadingTextFileUsingLoop() throws IOException 
	{
		
		//Stream Connectivity
		
		File f = new File ("B:\\Eclipse\\Workspace\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//read text file
		String line = null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		
		//closing the stream
		reader.close();

		System.out.println("File Reading Success");
				
	}

}
