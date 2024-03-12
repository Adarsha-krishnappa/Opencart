package Day41;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 *login--@befoerclass
 *search--@test
 *advancedsearch--@test
 *logout--@afterclass

 */
public class AnnotationDemo2 {
	@BeforeClass
	void login() {
		System.out.println("Login");
	}
	@AfterClass
	void logout()
	{
		System.out.println("logout");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advancedsearch");
	}

}
