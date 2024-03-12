package Day41;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		String title="abc";
		
		//hardAssertion
	/*	if(title.equals("xyz"))
		{
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}*/
		
		//Assert.assertEquals("abc", "xyz");
		//Assert.assertEquals(1, 2);
		
		//Assert.assertNotEquals("abc", "xyz");//pass
		//Assert.assertNotEquals("abc", "abc");//fail
		
		//Assert.assertTrue(1==2);//fail
		//Assert.assertFalse(1==2);
		
		//Assert.fail();
		
	}
}
