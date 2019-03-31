package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop_HandlingFrames {
	@Test
	public void HandlingFrames(){
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver(); //launching the browser
     	driver.get("https://jqueryui.com/droppable/");
     	driver.manage().window().maximize(); //maximize
     	WebElement frameElement = driver.findElement(By.className("demo-frame"));
     	driver.switchTo().frame(frameElement);
     	WebElement dragElement = driver.findElement(By.id("draggable"));
     	WebElement dropElement = driver.findElement(By.id("droppable"));

     	Actions action = new Actions(driver);
     	action.dragAndDrop(dragElement, dropElement).build().perform();
     	//I want to make sure the drop has happened successfully and that is indicated 
     	//by the text in the droppable Element Dropped!
     	if (dropElement.getText().equals("Dropped!"))
     		System.out.println("Element Dropped Successfully");
     	else 
     		System.out.println("Element Drop did not happen");
 
	}
}
