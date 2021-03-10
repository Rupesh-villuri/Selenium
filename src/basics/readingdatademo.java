package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class readingdatademo {
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//define list to add element names and ID's
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		
		
		FileInputStream in = new FileInputStream(new File("C:\\Users\\Rupesh\\Desktop\\Selenium\\IPSTestDataProcessing.xls"));
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(in);
		HSSFSheet ReporterForm= workbook.getSheetAt(3);
		
		HSSFRow ElementNmaesrow = ReporterForm.getRow(0);
		HSSFRow Elementidrow = ReporterForm.getRow(1);
		HSSFRow Elementdatarow = ReporterForm.getRow(2);
		
		//Pick data from excel-Reporter form sheet for element names and element Id's
		
		for (int cell=0 ;cell<23 ;cell++)
		{
			HSSFCell ElementNmaesRow= ElementNmaesrow.getCell(cell);
			String ReporterformElementname = ElementNmaesRow.getStringCellValue();
			list1.add(ReporterformElementname);
			//System.out.println(ReporterformElementname);
			
			HSSFCell ElementIDs= Elementidrow.getCell(cell);
			String ReporterformElementids = ElementIDs.getStringCellValue();
			list2.add(ReporterformElementids);
			//System.out.println(ReporterformElementids);
			
			HSSFCell Elementdata = Elementdatarow.getCell(cell);
			String  ReporterformElementsData = Elementdata.getStringCellValue();
			list3.add(ReporterformElementsData);
			//System.out.println(ReporterformElementsData);
		}
		
		System.out.println("Reporter Form Element names are: "+list1);
		System.out.println("Reporter Form Element Id's are "+list2);
		System.out.println("Reporter Form Element Id's are "+list3);
		
		
		for (int column=0;column<23;column++)
		{	
			//use below line to check at what cell of data you are getting error, just uncomment below line
			//System.out.println("Element name is "+list1.get(column)+"and its Id is "+ list2.get(column)+ "and its data is "+list3.get(column));
			
			if (column <15)
			{
				driver.findElement(By.id(list2.get(column))).clear();
				Thread.sleep(0300);
				driver.findElement(By.id(list2.get(column))).sendKeys(list3.get(column));
				Thread.sleep(0200);
		    }else{
		    	//if you want to get all drodpown values in console to check all are taking or not uncomment below 2 lines
		    	//String b=driver.findElement(By.id(list2.get(column))).getText();
		    	//System.out.println(b);
		    	new Select(driver.findElement(By.id(list2.get(column)))).selectByVisibleText(list3.get(column));
		    	Thread.sleep(0300);
		    }
			
		    
		}
		Thread.sleep(1500);
			
	}

}
