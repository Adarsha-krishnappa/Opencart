package Day20;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project1 {
	 //a[@target='_blank' and @rel='noopener noreferrer'] &//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//open flipkart page
		driver.get("https://www.flipkart.com/");
		
		//verify the home page 
		WebElement Home_logo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		if(Home_logo.isDisplayed())
		{
			System.out.println("Entired Home page sucessfully");
		}
		else
		{
			System.out.println("Incorrect page");
		}
		
		//search and add to cart
		WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchbox.sendKeys("Laptop");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		//searchbox.click();
		
		//clcik on the laptop to view product deatils
		WebElement laptop=driver.findElement(By.xpath("//*[@class='_396cs4' and @alt='Acer Swift Go 14 AMD Ryzen 5 Hexa Core 7530U - (8 GB/512 GB SSD/Windows 11 Home) SFG14-41 Thin and Lig...']"));
		String added_laptop=laptop.getText();
		System.out.println(added_laptop);
		laptop.click();
		System.out.println(driver.getWindowHandles());
		
		Set<String> windowid=driver.getWindowHandles();
		for(String wind:windowid)
		{
			String title=driver.switchTo().window(wind).getTitle();	
			System.out.println(title);
			if(title.contains("Acer Swift Go 14"))
					{
				driver.switchTo().window(wind);
					}
			
		
		//click on add to cart
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		
		
		
			if(title.contains("Acer Swift Go 14"))
					{
				driver.switchTo().window(wind);
					}
			
		}
		////navigate cart
		
		//login
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9739389744");
		driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
	}

}
