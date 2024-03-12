package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitMethod_wait {

	public static void main(String[] args) {
		// have to specify multiple times for multiple elements
		//it  will wait for the condtion, after that it will work
		
		ChromeDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(3));//declartion of explicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		username.sendKeys("Admin");
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("admin123");
		
		WebElement login_click=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		login_click.click();
		

	}

}
