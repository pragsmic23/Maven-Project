package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByIdNameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver = new ChromeDriver(); //launching the browser
     	driver.get("https://www.calculator.net/calorie-calculator.html");
     	driver.manage().window().maximize(); //maximize 
     	WebElement ageElement = driver.findElement(By.name("cage"));
     	System.out.println("Get the default value of age Textbox : " + ageElement.getAttribute("value"));
     	ageElement.clear();
     	ageElement.sendKeys("45"); //enter 45 
     	System.out.println("Get the Current value of age Textbox : " + ageElement.getAttribute("value"));
     	System.out.println("Get the id value of age Textbox : " + ageElement.getAttribute("id"));
     	System.out.println("Get the name value of age Textbox : " + ageElement.getAttribute("name"));
     	System.out.println("Get the class value of age Textbox : " + ageElement.getAttribute("class"));
     	System.out.println("Get the tagname of age Textbox : " + ageElement.getTagName());
     	System.out.println("Get the getText of age Textbox : " + ageElement.getText());
     	System.out.println("Get the id value of age Textbox : " + ageElement.getCssValue("width"));
     	
     	List<WebElement> sexList = driver.findElements(By.name("csex"));
     	for(WebElement sex : sexList ){
     		if(sex.getAttribute("value").equals("f")){
     			if(!sex.isSelected()){
     				sex.click();
     				break;
     			}     			
     		}
     	}
     	
     	
     	
     	
     	
     	
     	
	
	}

}
