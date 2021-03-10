package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class web_checkbox {

	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		List<WebElement> check_box = driver.findElements(By.name("PersistentCookie"));
		
		System.out.println(check_box.get(0).getAttribute("value"));
		
		System.out.println(check_box.get(0).getAttribute("checked"));
		
		check_box.get(0).click(); //check the radio button if it is unchecked
		
		System.out.println(check_box.get(0).getAttribute("checked"));

	}

}

