package Day40_TestNG;



	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import static org.testng.Assert.fail;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.WebDriver;
	public class NewTest1 {
		
		WebDriver driver;
		
		Actions act=new Actions(driver);
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
				 driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptop");
				 act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
			  }
			  
			  @Test
			  void clickOnproduct()
			  {
				  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a")).click();
			  }
			  
			  
	 
	}


