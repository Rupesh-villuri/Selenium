package Calenders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerWithJSExecutor {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
	
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		WebElement DerartureDate =driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		
		selectDateByJS(driver, DerartureDate, "25-03-2021");
		
		Thread.sleep(0500);
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		Thread.sleep(0500);

		WebElement FromCity =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		FromCity.click();
		
		WebElement ReturnDate =driver.findElement(By.id("ctl00_mainContent_txt_Todate"));
		
		selectDateByJS(driver, ReturnDate, "30-03-2021");
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
		Thread.sleep(0500);
		
		FromCity.click();
		
		
		
		
	}
	
	//this will work when we cant enter date as text in date-picker field
	//issue with this is even we provide 32-03-2021 , it will set the value 
	//below code is updating value attribute in DOM directly 
	/*
	 * 	<input name="ctl00$mainContent$txt_Todate"
	 *  type="text" value="17-03-2021" readonly="readonly" 
	 *  id="ctl00_mainContent_txt_Todate" class="custom_date_pic required home-date-pick home-internal-fulldate hasDatepicker" style="">
	 */
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String datevalue) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+datevalue+"');", element);
	}
}
