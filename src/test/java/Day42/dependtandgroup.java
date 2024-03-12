package Day42;

import org.testng.annotations.Test;

public class dependtandgroup {

	@Test(priority=1, groups= {"opens"})
	void loginByEmail()
	{
		System.out.println("This is loginByEmail");
	}
	@Test(priority=2, groups= {"opens","logo"})
	void loginByfacebook()
	{
		System.out.println("This is loginByfacebook");
	}
	@Test(priority=3, groups= {"logo"})
	void loginBytwitter()
	{
		System.out.println("This is loginBytwitter");
	}


}
