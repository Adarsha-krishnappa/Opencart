package Day41;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	//@Test
	void hardAssertion()
	{
		System.out.println("this is hardAssertion");
		System.out.println("this is hardAssertion");
		Assert.assertEquals(1, 2);
		
		System.out.println("hardassertion completed");
		Assert.assertEquals(1, 1);
	}
	
	@Test
	void softAssertion()
	{
		System.out.println("this is hardAssertion");
		System.out.println("this is hardAssertion");
		
		SoftAssert as=new SoftAssert();
		as.assertEquals(1, 2);
		
		System.out.println("hardassertion completed");
		as.assertEquals(1, 1);
		
		as.assertAll();
	}
}
