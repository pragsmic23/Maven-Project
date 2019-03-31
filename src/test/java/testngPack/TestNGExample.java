package testngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNGExample {
	
	  @Test
	  public void method1() throws InterruptedException{
	     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     	WebDriver driver = new ChromeDriver(); //launching the browser
	     	driver.get("https://www.calculator.net/calorie-calculator.html");
	     	driver.manage().window().maximize(); //maximize 
	     	//identify the dropdown Activity
	     	WebElement Activitydd = driver.findElement(By.id("cactivity"));
	     	//for changing dropdown values we need to use the Select class
	     	//we will create an instance of Select class and pass the dropdown as an argument
	     	//this select class instance has the methods selectByIndex, selectByValue for changing dropdown values
	     	Select dd = new Select(Activitydd);
	     	System.out.println("Get the Default Value of the dropdown : Moderate " + dd.getFirstSelectedOption().getText());
	     	dd.selectByIndex(0); //Basal Metablic Rate
	     	Thread.sleep(2000);
	     	System.out.println("Get the Current Value of the dropdown : Basal Metabolic " + dd.getFirstSelectedOption().getText());
	     	dd.selectByValue("1.725");
	     	Thread.sleep(2000);
	     	System.out.println("Get the Current Value of the dropdown : Very Active " + dd.getFirstSelectedOption().getText());
	     	dd.selectByVisibleText("Light: exercise 1-3 times/week");
	     	Thread.sleep(2000);
	     	System.out.println("Get the Current Value of the dropdown : Light " + dd.getFirstSelectedOption().getText());
	     	WebElement ExtraActive =driver.findElement(By.xpath("//*[@id='cactivity']/option[text()='Extra Active: very intense exercise daily, or physical job']"));
	     	System.out.println(ExtraActive.getText());
	     	System.out.println("Is the dropdown multiselect :" + dd.isMultiple());
	     	//dd.deselectAll();

	  }
	  
	  

}
