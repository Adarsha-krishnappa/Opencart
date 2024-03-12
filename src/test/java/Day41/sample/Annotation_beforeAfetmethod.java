package Day41.sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_beforeAfetmethod {
	
	@BeforeMethod
	
	void login()
	{
		System.out.println("login...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("seraching...");
	}
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("Advancedserach...");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("logout...");
	}
}
