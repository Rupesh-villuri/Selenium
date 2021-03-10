package handlingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		WritingFiles.WritingTextFile();
		
		WritingFiles.WritingTextFileWithAppendData();
		
		WritingFiles.WritingTextFileWithSomeRandomData();
		
		WritingFiles.WritingCSVFile();
		
		WritingFiles.WritingCSVFileWithAppendData();
		
		WritingFiles.WritingHtmlFile();
		
	}
	
	public static void WritingTextFile() throws IOException {
				
		//Stream Connectivity
		
				//output stream to select directory
				File f = new File ("B:\\Eclipse\\Workspace\\myTextFile.txt");
				//output stream to write files and chaining to previous step
				FileWriter fw = new FileWriter(f);
				//Chainig buffered writer to write in the text file
				BufferedWriter writer = new BufferedWriter(fw);
				
				//writing inside the file
				writer.write("First line");
				//creating a new line using a method of bufferef writer
				writer.newLine();
				writer.write("India");
				writer.newLine();
				writer.write("Automate Web pages through Selenium");
				
				//close the last stream , if i close the stream it will close all the connecting streams
				writer.close();
				
				System.out.println("File written Success");
				
				//if we change values in above lines and run , the text file will be overridden
	}

	public static void WritingTextFileWithAppendData() throws IOException {
		
		       //Stream Connectivity
				
		        File f = new File ("B:\\Eclipse\\Workspace\\myTextFile1.txt");
				
				//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileWriter.html
				
			    /*if u see u can see constructor which accepts an arg appened which accespts boolean, 
				  this means next time again i write it will append this in new line
				*/
				
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter writer = new BufferedWriter(fw);
						
				
				//writing inside the file
				writer.write("First line");
				writer.newLine();
				writer.write("Andhra");
				writer.newLine();
				writer.write("Automate Web pages through Selenium");
				writer.newLine();

				
				//close the stream , if i close the stream it will close all the connecting streams
				writer.close();
				
				System.out.println("File written Success");
				
				//if we change values in above lines and run , the text file will be appended with new values
				
		
	}

	public static void WritingTextFileWithSomeRandomData() throws IOException {
        
		File f = new File ("B:\\Eclipse\\Workspace\\myTextFile2.txt");
        FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//writing inside the file
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<5;j++) {
				
				int num = (int) ((Math.random())*100);
				writer.write(num +"\t");
			}
			writer.newLine();
		}
		
		writer.close();
		
		System.out.println("File written Success");


	}
	
	public static void WritingCSVFile() throws IOException {
		
		File f = new File ("B:\\Eclipse\\Workspace\\myCSVFile.csv");//just change the extension
        FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//writing inside the file
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<5;j++) {
				
				int num = (int) ((Math.random())*100);
				writer.write(num +","); //for writing in csv just change \t to ,
			}
			writer.newLine();
		}
		
		writer.close();
		
		System.out.println("File written Success");
	}

	public static void WritingCSVFileWithAppendData() throws IOException {
		
		File f = new File ("B:\\Eclipse\\Workspace\\myCSVFile1.csv");//just change the extension
        FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//writing inside the file
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<5;j++) {
				
				int num = (int) ((Math.random())*100);
				writer.write(num +","); //for writing in csv just change \t to ,
			}
			writer.newLine();
		}
		
		writer.close();
		
		System.out.println("File written Success");
	}

	public static void WritingHtmlFile() throws IOException {
		
		File f = new File ("B:\\Eclipse\\Workspace\\myhtmlFile.html");//just change the extension
        FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//writing inside the file
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				
				writer.write("<html><body> <title>Way To Automation</title> <h1>Learning java from way to automation.com</h1></body></html>");
			}
			writer.newLine();
		}
		
		writer.close();
		
		System.out.println("File written Success");
	}
	
}
