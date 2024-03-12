package Day37;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		
		ChromeOptions Options=new ChromeOptions();//we can do the setting on driver leavel
		Options.addArguments("--headless=new");
		
		ChromeDriver driver=new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>windowIDs=driver.getWindowHandles();//retruns two window id's
		System.out.println(windowIDs);
		
	for(String wind:windowIDs)
	{
		String title=driver.switchTo().window(wind).getTitle();
		if(title.equals("OrangeHRM")  || title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"));

	}

	}

}
