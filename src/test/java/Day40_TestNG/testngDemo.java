package Day40_TestNG;

import org.testng.annotations.Test;

/*
 open application
 login
 logout
 */
//XML file-->classes-->methods
public class testngDemo {

	@Test(priority=1)
	void openapp()
	{
		System.out.println("open application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login to the application");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from application");
	}
}
