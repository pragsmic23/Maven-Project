package testngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample2 {
	
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethod(){
		System.out.println("After Method");
	}
	
	@Test(priority=0)
	public void Login(){
		System.out.println("Login");
	}

	@Test(priority=1)
	public void AccountEnquiry(){
		System.out.println("AccountEnquiry");
	}
	
	@Test(priority=2)
	public void Reporting(){
		System.out.println("Reporting");
		method1();
	}

	
	public void method1(){
		System.out.println("method1");
	}
}

