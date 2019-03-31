package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleMouseOps {

	WebDriver driver;
	@Test
	public void HandleMouseOPsTest(){
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	driver = new ChromeDriver(); //launching the browser
     	//driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.get("https://demo.opencart.com/");
     	driver.manage().window().maximize(); //maximize 		

     	//Click on COmponents Menu
     	driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
     	//first lets declare a WebDriverWait
     	WebDriverWait wait = new WebDriverWait(driver,30);
     	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a")));
     	WebElement printerElement = driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a"));
     	//we use Actions class for mouse operations
     	Actions action = new Actions(driver);
     	action.moveToElement(printerElement).click().build().perform();
     	
	}
}
