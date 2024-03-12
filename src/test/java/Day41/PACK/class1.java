package Day41.PACK;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	
	@Test
	void abc() {
		System.out.println("adbc");
	}
	@BeforeTest
	void m1()
	{
		System.out.println("This is beforetest");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is aftersuite");
	}


}
