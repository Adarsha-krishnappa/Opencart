package Day43;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver;
	void open()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1,dataProvider="dp")
	void login(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=2)
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
	@DataProvider(name= "dp")
	String[][] logon()
	{
		String data[][]= { { "abc@gmail.com", "test123" }, 
				           { "pavanol@gmail.com", "test@123" },
				           { "pavanoltraining@gmail.com", "test3" },
			               { "pavanoltraining@gmail.com", "test@123" },
			               { "Admin", "admin123" } 
				};
		return data;
	}

}
