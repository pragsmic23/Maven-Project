package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String browser  ="firefox";
	    if (browser.equals("chrome"))
	    {
	     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver(); //launching the browser
	    }
	    else if(browser.equals("firefox"))
	    {
		//Firefox 53.0.3 64 bit + geckodriver 0.16.1
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe"); 
			driver = new FirefoxDriver();
	    }
	    else if(browser.equals("ie"))
	    {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	    }
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();
		//for IE, you also need to make sure that Protected Mode for all zones are either enabled or disabled

	}

}
