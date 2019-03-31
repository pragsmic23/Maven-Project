package testngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample3 {
	
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Before Method3");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("After Method3");
	}
	
	@Test(priority=0)
	public void Login(){
		System.out.println("Login3");
	}

	@Test(priority=1)
	public void AccountEnquiry(){
		System.out.println("AccountEnquiry3");
	}
	
	@Test(priority=2)
	public void Reporting(){
		System.out.println("Reporting3");
	}

}

