package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sign_Up {

	public static void main(String[] args) throws InterruptedException {
		//lunch the chrome driver
		ChromeDriver driver=new ChromeDriver();
		
		//lunch the brwoser
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();//maximize the window
		//click  on signup button
		//driver.findElement(By.id("signin2")).click();
		WebElement signup=driver.findElement(By.id("signin2"));
		signup.click();//click the signup 
		
		//enter username and password
		driver.findElement(By.id("sign-username")).sendKeys("Adarsha");
		driver.findElement(By.id("sign-password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(3000);
		//accepeting the pop alert
		driver.switchTo().alert().accept();
		
		boolean status=driver.findElement(By.id("signInModalLabel")).isDisplayed();
		System.out.println(status);//true
		if(status=true)
		{
			System.out.println("SIGN-UP IS PASSED");
		}
		else
		{
			System.out.println("SIGN-UP IS FAILED");
		}

		driver.quit();
		
	}

}
