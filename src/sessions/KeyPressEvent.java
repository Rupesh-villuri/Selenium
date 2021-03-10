package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyPressEvent {
	
	/* when we want to perform keyboard or mouse operations like presiing tab , escape or right clicking
	 * for these kind of operations we do not have any direct commands in selenium
	 * So we will go for actions class and keys class
	*/
	
	@Test
	public void keyPressEvent() throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 
		 //option1
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.name("field-keywords")).click();
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("lumia640");
		 //it will move control to firstname element and pressed tab
		 String text=driver.findElement(By.name("field-keywords")).getTagName();
		 System.out.println(text);
		 driver.findElement(By.name("field-keywords")).sendKeys(Keys.RETURN);
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		 Thread.sleep(5000);
		 
		
		 //we can do key press events through actions class
		 //options 2
		 driver.get("https://www.facebook.com/");
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(5000);
		 action.sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(5000);
		 action.sendKeys(Keys.ENTER).build().perform();
		 driver.close();
	}
	@Test
	public void keyPressEvent2() throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("Rupesh");
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.TAB).build().perform();
		 action.sendKeys("password");
		 action.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(5000);
		 driver.close();
		 
	}

}
