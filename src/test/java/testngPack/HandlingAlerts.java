package testngPack;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.utils.PropertyReader;

public class HandlingAlerts {
	WebDriver driver;
	@Test
	public void HandleAlertTest() throws IOException, InterruptedException{
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	driver = new ChromeDriver(); //launching the browser
     	//driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.get(PropertyReader.ReadProperty("appurl"));
     	driver.manage().window().maximize(); //maximize
     	
     	//first we will create an alert using JavaScriptExecutor 
     	JavascriptExecutor js = (JavascriptExecutor)driver;
     	js.executeScript("alert('This is an information message');");
     	//first verify the message
     	//click on ok button
     	Alert alert = driver.switchTo().alert();
     	String alertMsg = alert.getText();
     	Thread.sleep(2000);
     	alert.accept();
     	if(alertMsg.equals("This is an information message"))
     		System.out.println("Match found");
     	else
     		System.out.println("Match not found");
     	
     	js.executeScript("confirm('Please confirm do you want to continue(y/n)?');");
     	alert = driver.switchTo().alert();
     	alertMsg = alert.getText();
     	Thread.sleep(2000);
     	alert.dismiss();
     	if(alertMsg.equals("This is an information message"))
     		System.out.println("Match found for confirm");
     	else
     		System.out.println("Match not found for confirm");
     		

     	
	}

}
