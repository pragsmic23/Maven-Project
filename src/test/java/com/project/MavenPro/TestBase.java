package com.project.MavenPro;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	
		public static WebDriver driver = null;
		
		@BeforeMethod
		public void initialize() throws IOException, InterruptedException{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();		
			//To maximize browser
	                driver.manage().window().maximize();
		        //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//To open shopping site
	                driver.get("http://automationpractice.com/index.php");
	                Thread.sleep(2000);
			
		}
		
	/*
	 * @AfterTest public void cleanUp(){ driver.manage().deleteAllCookies();
	
	    } */
		
		@AfterMethod
		//Test cleanup
		public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }

	}


