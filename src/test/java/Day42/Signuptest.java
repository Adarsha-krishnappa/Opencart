package Day42;

import org.testng.annotations.Test;

/*
 * signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression
 */
public class Signuptest {

	@Test(priority=1, groups= {"sanity"})
	void signupbyemail()
	{
		System.out.println("This is signupbyemail");
	}
	@Test(priority=2, groups= {"sanity","regression"})
	void signupbyfacebook()
	{
		System.out.println("This is signupbyfacebook");
	}
	@Test(priority=3, groups= {"sanity"})
	void signupbytwitter()
	{
		System.out.println("This is signupbytwitter");
	}

}
