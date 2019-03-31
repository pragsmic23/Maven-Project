package com.project.MavenPro;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.*;

public class FunctionalTest extends TestBase {
	private static WebDriver driver = null;
	
	
	@Test(priority=0)
	public void Home() throws InterruptedException{
		//HomePage.Logo(driver).equals("YourLogo");
	    assertNotEquals("Sign out",HomePage.SignOut(driver).getText());
		Thread.sleep(2000);
		System.out.println("User is not logged in");		
	}
	
	
	@Test
	public void Login() throws InterruptedException{
		//WebDriver driver =null;
		LoginPage.Login(driver).click();
		Thread.sleep(2000);
		//assertEquals("Authentication",LoginPage.Authorization(driver).getText() );
		LoginPage.User_Id(driver).sendKeys("Shopping@gmail.com");
		LoginPage.Password(driver).sendKeys("Shopping12");
		LoginPage.Sign_In(driver).click();
		Thread.sleep(2000);
	   // assertEquals("My Account",MyAccount.Title(driver).getText() );   		
	}
	
	
	@Test
	public void LoginFail() throws InterruptedException{
		//WebDriver driver =null;
		LoginPage.Login(driver).click();
		Thread.sleep(2000);
		//assertEquals("Authentication",LoginPage.Authorization(driver).getText() );
		LoginPage.User_Id(driver).sendKeys("Shopping@gmail.com");
		LoginPage.Password(driver).sendKeys("Shopping11");
		LoginPage.Sign_In(driver).click();
		Thread.sleep(2000);
		Alert Alt = driver.switchTo().alert();
		String Message = Alt.getText();
		String ActualMsg = HomePage.Authenitication_Failure(driver).getText();
	    assertEquals(Message, ActualMsg );  
	    System.out.println("Authentication Issue, Test case Passed");
	}
	
	
	@Test
	public void AddtoCart() {
		Products.Search_Bar(driver).sendKeys("Summer");
		Products.Search_Icon(driver).click();
		assertEquals("Printed Summer Dress",Products.Product_Summer(driver).getText());
		
		
		
	}
}
