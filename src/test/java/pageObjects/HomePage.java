package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element =null;
	
	public static WebElement Logo(WebDriver driver) {
		 element = driver.findElement(By.linkText("My Store"));
		return element; 
	}
	
	
	
	
	public static WebElement SignOut(WebDriver driver) {
		 element = driver.findElement(By.className("logout"));
		return element; 
	}

	public static WebElement SignIn(WebDriver driver) {
		 element = driver.findElement(By.className("login"));
		return element; 
	}

    public static WebElement Cart(WebDriver driver) {
		 element = driver.findElement(By.className("shopping_cart"));
		return element; 
    }
		
	public static WebElement Category_Women(WebDriver driver) {
		element = driver.findElement(By.linkText("Women"));
		return element; 
	}
    
		public static WebElement Category_Dresses(WebDriver driver) {
			element = driver.findElement(By.linkText("Dresses"));
			return element; 
		}

		
		public static Alert Authenitication_Failure(WebDriver driver) {
			// TODO Auto-generated method stub
			element = driver.findElement(By.className("alert alert-danger"));
			return null;
		}
	    

    

}
