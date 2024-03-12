package Day41;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	@AfterSuite
	void as()
	{
		System.out.println("This is @AfterSuite");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("This is @BeforeSuite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is @BeforeTest");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is @AfterTest");
	}
	@BeforeMethod
	void m2()
	{
		System.out.println("this @BeforeMethod");
	}
	
	@AfterMethod
	void m1()
	{
		System.out.println("this @AfterMethod");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is @AfterClass");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("This is @BeforeClass");
	}
	@Test(priority=1)
	void test1()
	{
	System.out.println("test1");
	}
	@Test(priority=2)
	void test2()
	{
	System.out.println("test2");
	}
}
