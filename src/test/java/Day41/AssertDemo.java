package Day41;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	String title="abc";
	@Test
	void test()
	{
		/*if(title.equals("xyz"))
		{
		System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}*/
		Assert.assertTrue(true);
		{
			System.out.println("test is passed");
		}
			}
}
