package Day26;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	private static final String Expecetedconditions = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Implicet wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicet wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Get methods/commands retruns boolean values(true/false)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//opens the usr
		System.out.println(driver.getTitle());//retuns the tile of the webpage
		System.out.println(driver.getCurrentUrl());//return the current url
		System.out.println(driver.getPageSource());//retruns the source page
		System.out.println(driver.getWindowHandle());//retrun the window id of the webpage
		
		//Thread.sleep(3000);
	WebElement	Click_elelment=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='OrangeHRM, Inc']")));
	Click_elelment.click();
	//driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		System.out.println(driver.getWindowHandles());//retrun the window id's of the webpage
		
		Set<String> windows=driver.getWindowHandles();
		for(String wind:windows)
		{
			System.out.println(wind);
		}
		
		//conditional methods/commands
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("male")).isSelected());//false
		driver.findElement(By.id("male")).click();
		System.out.println(driver.findElement(By.id("male")).isSelected());//true
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@id='name']")).isEnabled());//true
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed());//true
		
		//browser methods/commands
		
		/*
		 quit--close the all window on browser
		 close---close the single window on browser
		 */
		//driver.quit();//close the all window on browser
		
		driver.close();//close the single window on browser
		
		
		
		
	}

}
