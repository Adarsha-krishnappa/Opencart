package Day41.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterclass_an {
	
	@BeforeClass
	void login()
	{
		System.out.println("login...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search...");
	}
	@Test(priority=2)
	void advSerachanced()
	{
		System.out.println("advSerachanced...");
	}
	@AfterClass
	void logout()
	{
		System.out.println("logout...");
	}

	
}
