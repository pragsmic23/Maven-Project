package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products {
	private static WebElement element =null;
	
	public static WebElement Checkout(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("button_order_cart"));
		return element ;
	}
	
	//to view selected products in the cart by selecting drop down
	public static WebElement Cart_DD(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("cart_block block exclusive"));
		return element ;
	}
	
	
	public static WebElement Search_Bar(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.id("search_query_top"));
		return element ;
	}
	
	public static WebElement Search_Icon(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.name("submit_search"));
		return element ;
	}
	
	
	public static WebElement Product_Summer(WebDriver driver) {
		// TODO Auto-generated method stub
	   element = driver.findElement(By.className("product-name"));
		return element ;
	}


}
