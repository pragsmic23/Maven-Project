package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByClass_ExtractWebTable {

	public static void main(String[] args) throws InterruptedException {
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver(); //launching the browser
     	driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.manage().window().maximize(); //maximize 
     	WebElement table = driver.findElement(By.className("cinfoT"));
     	//with respect to table element get the number of rows
     	List<WebElement> rows = table.findElements(By.tagName("tr"));
     	for(WebElement row : rows){
     		//get the cols
     		List<WebElement> cols = row.findElements(By.tagName("td"));
     		for(WebElement col: cols){
     			System.out.print(col.getText() +"\t");     		//print all the cell values in the same line with tabspaces 
     			//tabspace is equivalent to two spaces
     		}
     		System.out.println("");//for next print in next line
     	}
     	
     	//identify by LinkText and PartialLinkText
     	driver.findElement(By.linkText("BMI")).click();
     	Thread.sleep(2000); //wait for 2 sec
     	driver.navigate().back();
     	driver.findElement(By.partialLinkText("Watcher")).click();
     	Thread.sleep(1000); //wait for 1 sec
     	driver.navigate().back();
     	Thread.sleep(1000); //wait for 1 sec
     	driver.navigate().refresh();
     	driver.navigate().forward();
	}

}
