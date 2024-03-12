package Day42;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencytest {

	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
		System.out.println("this is openapp");
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
		System.out.println("this is login");
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);
		System.out.println("this is search");
	}
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advancesearch()
	{
		Assert.assertTrue(true);
		System.out.println("this is advancesearch");
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
		System.out.println("this is logout");
	}
}
