package Day43;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowsertset {
	//Crossbrowsertset execute the test cases in diffrent browsers
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void open(String br, String appurl)
	{
		if (br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(appurl);
	}
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=1)
	void title()
	{
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		Assert.assertEquals(act_title, exp_title);
	}
	@AfterClass
	void shutdown()
	{
		driver.quit();
	}
	

}
