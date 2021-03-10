package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","B:/Eclipse/Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Polymorphic statement
		//ChromeDriver driver = new ChromeDriver(); //Above and this statement are same
		//it will open a new Chrome browser.
		
		driver.manage().window().maximize();//it will maximise the window
		
		driver.get("http://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// will wait for page to load for 40 sec , 
		//if completes page loading in 10 sec , will neglect rem 30 sec
		
		//Thread.sleep(25000);
		
		
		
		System.out.println("Title of current Page :"+driver.getTitle()); //will provide the title of a web page
		
		WebElement drodopdownlink = driver.findElement(By.linkText("DropDown Menu"));
		
		System.out.println(drodopdownlink.getAttribute("href")+" "+drodopdownlink.getAttribute("class"));
		
		System.out.println("TagName of Element :"+drodopdownlink.getTagName());
		
		boolean display = drodopdownlink.isDisplayed();
		
		boolean enable =drodopdownlink.isEnabled();
		
		System.out.println("Link displayed : "+display + " Link enabled : " + enable);
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement Email = driver.findElement(By.className("input-field email-field"));
				//driver.findElement(By.id("custom_field_text_field_1016375"));
		
		Email.click();
		
		Email.sendKeys("seshu.g@gmail.com");
		
		Email.clear();
		
		System.out.println("Tag name : "+Email.getTagName());
		*/
		
		new Select (driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"))).selectByVisibleText("Argentina");
		
		Thread.sleep(0500);
		
		
		

	}

}
