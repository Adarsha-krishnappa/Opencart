package Day20;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
public class NewTest {
	
	WebDriver driver;
	
	
  //@BeforeClass
	@Test(priority=1)
	@Parameters({"browser"})
  void Setup(String br) {
		if(br.equals("Chrome")) {
			 driver=new ChromeDriver();
		}else if(br.equals("Edge"))
		{
			 driver=new EdgeDriver();
		}else if(br.equals("Firefox"))
		{
			 driver=new FirefoxDriver();
		}
		
	 // driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
  }
  
	  @Test(priority=2)
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
		  @Test(priority=3)
		  void search_laptop()
		  {
			  Actions act=new Actions(driver);
			 driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptop");
			 act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		  }
		  
		  @Test(priority=4)
		  void clickOnproduct()
		  {
			  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a")).click();			
		  }
		  

		  @Test(priority=5)
		  void WindowHandle()
		  {
			 Set<String> windowid=driver.getWindowHandles();
			 List<String> mywindow=new ArrayList(windowid);
			 String ParentWindow=mywindow.get(0);
			 String ChildWindow=mywindow.get(1);
			 driver.switchTo().window(ChildWindow);
			 
		  }
		  
		 
		  @Test(priority=6)
		  void AddCart() throws InterruptedException
		  { 
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		  }
		  
		  @Test(priority=7)
		  void ShoppingCart()
		  {
			  driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
			  
		  }
		  
		  
		  
		/*  @Test
		  void Added_Item()
		  {
			  
		  }*/
		  
		  @Test(priority=8)
		  void PlaceOrder()
		  {
			  WebElement place_holder=driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
			  JavascriptExecutor js=(JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", place_holder );
		  }
		  
		  
		  @Test(priority=9)
		  void login()
		  {
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9739389744");
			  driver.findElement(By.xpath("//span[normalize-space()='CONTINUE']")).click();
		  }
		  
		  
		  @Test(priority=10)
		  void AddAddress()
		  {
			  driver.findElement(By.xpath("//div[normalize-space()='Add a new address']")).click();
			  //enter the address 
		  }
		  
		  
		  @Test(priority=11)
		  void tearDown()
		  {
			  driver.quit();
		  }
 
}
