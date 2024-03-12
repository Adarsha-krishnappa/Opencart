package Day43;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramtest {
	
	WebDriver driver;
	/*
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl)
	{
		if(br.equals("chrome")) 
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
			
			{
			driver=new ChromeDriver();
			}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(appurl);
		
	}
	
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		try {
		boolean logostatus=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logostatus, true);
		
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		
	}
	@Test(priority=2)
	void testhomepagetitle()
	{
		/*String title=driver.getTitle();
		System.out.println("Hopepagetitle--"+title);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=3)
	@Parameters({"url"})
	void testappurl(String appurl)
	{
		/*String url=driver.getCurrentUrl();
		System.out.println("Appurl--"+url);
		Assert.assertEquals(driver.getCurrentUrl(), appurl);
	}
	*/

	
  //@BeforeClass
	@Test
  void Setup() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
  }
  
	  @Test
  void HomePage()
  {
		  try {
	 boolean logo= driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
	 Assert.assertEquals(logo, true);
		  }
		  catch(Exception e) {
		 
			  Assert.fail();
		  }
  }
		  @Test
		  void search_laptop()
		  {
			  Actions act=new Actions(driver);
			 driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptop");
			 act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		  }
		  
		  @Test
		  void clickOnproduct()
		  {
			  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a")).click();
		  }
		  
		  
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	

}
