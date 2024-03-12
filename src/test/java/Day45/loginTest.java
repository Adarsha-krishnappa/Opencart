package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
	WebDriver driver;
	loginpage1 lp;
	@BeforeClass
	void setup()
	{   
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	void test()
	{
		lp=new loginpage1(driver);
		lp.setusername("Admin");
		lp.setpassword("admi123");
		lp.clicklogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	/*@Test
	void testLinks() 
	{
		lp=new loginpage1(driver);
		System.out.println(lp.getlinks());
		Assert.assertEquals(lp.getlinks(), 5);
	}*/

	@AfterClass
	void signout()
	{
		driver.quit();
	}

}
