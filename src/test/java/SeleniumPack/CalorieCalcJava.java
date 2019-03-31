package SeleniumPack;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalorieCalcJava {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCalorieCalc() throws Exception {
    driver.get(baseUrl + "/search?q=calorie+calculator&ie=utf-8&oe=utf-8&client=firefox-b-ab");
    driver.findElement(By.cssSelector("h3.LC20lb")).click();
    driver.findElement(By.id("cage")).clear();
    driver.findElement(By.id("cage")).sendKeys("45");
    driver.findElement(By.id("csex2")).click();
    driver.findElement(By.id("cheightfeet")).clear();
    driver.findElement(By.id("cheightfeet")).sendKeys("6");
    driver.findElement(By.id("cheightinch")).clear();
    driver.findElement(By.id("cheightinch")).sendKeys("2");
    driver.findElement(By.id("cpound")).clear();
    driver.findElement(By.id("cpound")).sendKeys("200");
    new Select(driver.findElement(By.id("cactivity"))).selectByVisibleText("Active: daily exercise or intense exercise 3-4 times/week");
    driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
