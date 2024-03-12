package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentMethod_wait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
			return driver.findElement(By.xpath("//input[@name='username']"));
			}
			});
		username.sendKeys("Admin");
		
		WebElement password = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
			return driver.findElement(By.xpath("//input[@name='password']"));
			}
			});
		password.sendKeys("admin123");
		
		WebElement login = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
			return driver.findElement(By.xpath("//button[@type='submit']"));
			}
			});
		login.click();
		
		

	}

}
