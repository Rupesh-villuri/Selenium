package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Business']")).click();
		
		Thread.sleep(3000);

		driver.navigate().back();
		
		Thread.sleep(3000);

		driver.navigate().forward();

	}

}
