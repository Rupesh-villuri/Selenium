package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		 driver.manage().window().maximize();
		 
		 Actions action = new Actions(driver);
		 
		 WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
		 
		 action.contextClick(rightClickButton).build().perform();
		 
		 //context click for right clicking
		 //now after right clicking selecting any option on right click
		 
		 WebElement copy  = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		 String copyText = copy.getText();
		 copy.click();
		 System.out.println(copyText);
	}

}
