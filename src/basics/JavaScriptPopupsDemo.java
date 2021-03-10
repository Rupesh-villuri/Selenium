package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopupsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		//selenium identifies every window by its unique window id
		
		Set<String> windowids = driver.getWindowHandles();
		
		//window handles provides the uniqueid's of whatever new window opens
		//we keep this unique window ids under hash set
		//in array list will accepts the duplicates as well.
		
		Iterator<String> iterate =  windowids.iterator();
		
		System.out.println(iterate.next()); //first window (main window)
		
		
		
		System.out.println("After opening tab window -----------");
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	
		windowids = driver.getWindowHandles();
		iterate =  windowids.iterator();
		
		String firstWindow = iterate.next();
		String tabWiindow = iterate.next();
		System.out.println(firstWindow);
		System.out.println(tabWiindow);
		
	}

}
