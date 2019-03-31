package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

		
		private static WebElement element =null;
			// TODO Auto-generated method stub
		
		
	public static WebElement Authorization(WebDriver driver) {
	element = driver.findElement(By.className("page-heading"));
	return element;  
      
	}

	public static WebElement Login(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("login"));
		return element ;
	}
	
	public static WebElement User_Id(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("email"));
		return element ;
	}

	public static WebElement Password(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("passwd"));
		return element ;
	}
	
	public static WebElement Sign_In(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("SubmitLogin"));
		return element ;
	}
	
	public static WebElement Forgot_Pass(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("lost_password form-group"));
		return element ;
	}
		
	
}

