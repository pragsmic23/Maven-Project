package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessTest {
	
	@Test
	public void HeadlessTestExec() throws IOException, WebDriverException{
		HtmlUnitDriver driver = new HtmlUnitDriver();
     	driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.manage().window().maximize(); //maximize
     	System.out.println(driver.getTitle());
     	System.out.println(driver.getCurrentUrl());
     	driver.findElement(By.linkText("BMI")).click();
     	System.out.println(driver.getTitle());
     	System.out.println(driver.getCurrentUrl());
     	TakesScreenshot ts = (TakesScreenshot)driver;
     	File file = ts.getScreenshotAs(OutputType.FILE);
     	FileUtils.copyFile(file, new File("./screenshots/BMIPage.png"));

	}

}
