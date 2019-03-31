package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {

	private static WebElement element =null;
	
public static WebElement Title(WebDriver driver) {
	element = driver.findElement(By.className("page-heading"));
	return element;  
	
	}
public static WebElement OrderHistory(WebDriver driver) {
	 element = driver.findElement(By.linkText("Orders"));
	return element;  
	
}

public static WebElement MyCredit(WebDriver driver) {
// TODO Auto-generated method stub
element = driver.findElement(By.linkText("Credit slips"));
return element ;
}

public static WebElement Address(WebDriver driver) {
// TODO Auto-generated method stub
element = driver.findElement(By.linkText("Addresses"));
return element ;
}

public static WebElement Info(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.linkText("Information"));
	return element ;
	}

public static WebElement WishList(WebDriver driver) {
	// TODO Auto-generated method stub
	element = driver.findElement(By.linkText("My wishlists"));
	return element ;
	}
	
}
