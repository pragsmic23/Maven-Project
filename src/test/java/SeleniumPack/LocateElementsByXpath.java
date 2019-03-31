package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver(); //launching the browser
     	driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.manage().window().maximize(); //maximize 
		WebElement ageLabel = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[1]/td[1]"));
		System.out.println(ageLabel.getText());
		
		WebElement ageLabelRel = driver.findElement(By.xpath("//table[@id='calinputtable']/tbody/tr[1]/td[1]"));
		System.out.println(ageLabelRel.getText());
		
		//Pattern match on attribute values using xpath - starts-with
		System.out.println("//Identify all the elements in the attribute id starting with c character");
		List<WebElement> startswithcxpath = driver.findElements(By.xpath("//*[starts-with(@id,'c')]"));
		for(WebElement element: startswithcxpath){
			System.out.println(element.getAttribute("id"));
		}
		System.out.println("//Identify all the elements in the attribute name containing height");
		//Pattern match on attribute values using xpath - using contains
		List<WebElement> containsnameheightxpath = driver.findElements(By.xpath("//*[contains(@name,'height')]"));
		for(WebElement element: containsnameheightxpath){
			System.out.println(element.getAttribute("name"));
		}
		
		
		
		
	}

}
