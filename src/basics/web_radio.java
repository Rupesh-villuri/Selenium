package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class web_radio {

	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.quackit.com/html/codes/html_radio_button.cfm");
		
		List<WebElement> radio_button = driver.findElements(By.name("preferred_color"));
		
		System.out.println(radio_button.get(2).getAttribute("value")); 
		
		System.out.println(radio_button.get(2).getAttribute("checked")); //it will print null if not checked
		
		radio_button.get(2).click(); //check the radio button if it is unchecked
		
		System.out.println(radio_button.get(2).getAttribute("checked")); //will print true if checked
		
		
	}

}
