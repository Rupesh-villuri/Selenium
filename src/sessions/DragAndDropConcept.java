package sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "B:\\Eclipse\\Selenium\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		 
		 /*very hardly we will see this drag and drop feature in ur application.
		   drag and drop is only available for webelements , not for dragging elements from webpage to local or vice versa 
		   as selenium cant interact with other than browser 
		   in this we have to drag element from source webelement to target webelement
		   	   
		*/ 
		 WebElement sourceElement=driver.findElement(By.id("draggable"));
		 WebElement targetElement=driver.findElement(By.id("droppable"));
		 //now i have these 2 elements , now i have to drag from source to target using actions
		 
		 Actions action = new Actions(driver);
		 //how we will drag and drop manually-> first we will click the element and hold it and release
		 //for moving element we need to click and hold and for dropping we need to release
		 
		 action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();


	}

}
