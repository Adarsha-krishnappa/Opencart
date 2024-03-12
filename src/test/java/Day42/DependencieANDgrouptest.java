package Day42;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencieANDgrouptest {
	
	WebDriver driver;
	
	@Test(priority=1,groups= {"opens"})
	void open()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");	
	}
	@Test(priority=3,dependsOnMethods= {"open"},groups= {"opens","logo"})
	void testlogo()
	{
		try {
		driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	@Test(priority=2,groups= {"opens"})
	void entername()
	{
		driver.findElement(By.id("name")).sendKeys("Adarsh");
	}
	@Test(priority=4,dependsOnMethods= {"open","logo"})
	void close()
	{
		driver.close();
	}

}
