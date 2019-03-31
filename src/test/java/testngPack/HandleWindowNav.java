package testngPack;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowNav {

	WebDriver driver;
	@Test
	public void HandleWindowNavTest() throws IOException, InterruptedException{
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	driver = new ChromeDriver(); //launching the browser
     	//driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
     	driver.manage().window().maximize(); //maximize
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	Set <String> winids=driver.getWindowHandles();
     	System.out.println("Number of Open windows :"+ winids.size());
     	System.out.println("Main window Id : " + winids.toString());
     	
     	//click on Login button
     	driver.findElement(By.xpath("//*[@title='LOGIN NOW']")).click();
     	winids=driver.getWindowHandles();
     	//the above step is going to launch another window
     	System.out.println("Number of Open windows :"+ winids.size());
     	//Iterator is used to navigate to each of the window ids in getWindowHandles
     	Iterator<String> itr =winids.iterator();
     	//itr.hasNext()
     	String mainWIndowID =itr.next().toString();
     	String subWIndowID =itr.next().toString();
     	System.out.println("mainWindowID : " + mainWIndowID);
     	System.out.println("subWindowID : " + subWIndowID);
     	driver.switchTo().window(subWIndowID);
     	Thread.sleep(3000);
     	driver.findElement(By.name("User_Id")).sendKeys("Selenium");
     	Thread.sleep(2000);
     	driver.close(); //subwindow close
     	driver.switchTo().window(mainWIndowID);
     	driver.findElement(By.id("topMnuinsurance")).click();
     	
	}

}
