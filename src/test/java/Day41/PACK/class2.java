package Day41.PACK;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class2 {

	@Test
	void xyz()
	{
		System.out.println("xyz");
	}
	@AfterTest
	void m2()
	{
		System.out.println("This is aftetest");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("This is befoersuite");
	}
}
