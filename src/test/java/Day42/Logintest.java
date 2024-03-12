package Day42;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity*/

public class Logintest {

	@Test(priority=1, groups= {"regression"})
	void loginByEmail()
	{
		System.out.println("This is loginByEmail");
	}
	@Test(priority=2, groups= {"sanity","regression"})
	void loginByfacebook()
	{
		System.out.println("This is loginByfacebook");
	}
	@Test(priority=3, groups= {"sanity","regression"})
	void loginBytwitter()
	{
		System.out.println("This is loginBytwitter");
	}

}
