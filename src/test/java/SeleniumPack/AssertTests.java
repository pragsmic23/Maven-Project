package SeleniumPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTests {
	
	@Test
	public void AssertTest(){
		
		Assert.assertEquals("Expected Result","Expected Result"); //pass
		Assert.assertTrue(1==1); //pass
		Assert.assertFalse(3==4); //pass
		String str = "Selenium";
		Assert.assertNotNull(str);//fail
	}

}
