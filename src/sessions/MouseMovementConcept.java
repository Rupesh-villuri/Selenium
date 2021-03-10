package sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();

		 
		 driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		 
		 //dynamic wait
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 
		 Actions action = new Actions(driver);
		 //we have to pass the driver instance to the actions class
		 
		 action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		 //build() method will return one action class object
		 //perform method will tell selenium to perform these action
		 //whenever we are using actions class , at the end we have to use .build().perform(); methods
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Articles']")).click();
		 ////ul[@class='submenu']//li/a[text()='Articles']))
		 
		 //Example 2 - multiple levels of mouse hovering
		 driver.get("https://spicejet.com/");
		 action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		 Thread.sleep(3000);
		 
		//a[text()='Seat + Meal Combo']
		 WebElement spiceLounge =driver.findElement(By.xpath("//a[text()='SpiceLounge']"));
		 action.moveToElement(spiceLounge).build().perform();
		 Thread.sleep(3000);
		 spiceLounge.click();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 
		 action.moveToElement(driver.findElement(By.xpath("//a[text()='Login / Signup']"))).build().perform();
		 Thread.sleep(3000);
		 WebElement spiceClubMembers =driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		 action.moveToElement(spiceClubMembers).build().perform();
		 Thread.sleep(3000);
		 WebElement memberLogin =driver.findElement(By.xpath("//a[text()='Member Login']"));
		 action.moveToElement(memberLogin).build().perform();
		 Thread.sleep(3000);
		 memberLogin.click();
		
	}

}
