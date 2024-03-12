package Day41;
/*
 *login--@beforemethod
 *search--@test
 *logout@afterremethod
 *login
 *advanced search--@test
 *logout

 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

//annotation will control the execution of test methods
	@BeforeMethod
	void login()
	{
		System.out.println("login");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	@Test
	void search()
	{
		System.out.println("serach");
	}
	@Test(priority=1)
	void advancedsearch()
	{
		System.out.println("advanced search");
	}
}
