package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep_method {

	public static void main(String arg[]) throws InterruptedException {
		//whenever we have syncronization problem we are using sleep or wait methods
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//ElementNotFindException --locator is incorrect
		//NoSuchElementException--page/element is loaded slowily (Syncronization problem) then use sleep or wait methods
	}
	
}
