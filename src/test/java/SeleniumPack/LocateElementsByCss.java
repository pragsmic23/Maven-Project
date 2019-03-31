package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver(); //launching the browser
     	driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.manage().window().maximize(); //maximize 
		
		WebElement ageLabelRel = driver.findElement(By.cssSelector("#calinputtable>tbody>tr:nth-child(1)>td:nth-child(1)"));
		System.out.println(ageLabelRel.getText());
		
		//Pattern match on attribute values using css - starts-with
		System.out.println("//Identify all the elements in the attribute id starting with c character");
		List<WebElement> startswithccss = driver.findElements(By.cssSelector("[id^='c']"));
		for(WebElement element: startswithccss){
			System.out.println(element.getAttribute("id"));
		}
		System.out.println("//Identify all the elements in the attribute name containing height");
		//Pattern match on attribute values using csss - using contains
		List<WebElement> containsnameheightcss = driver.findElements(By.cssSelector("[name*='height']"));
		for(WebElement element: containsnameheightcss){
			System.out.println(element.getAttribute("name"));
		}
		
		
		
		
	}

}
