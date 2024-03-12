package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowsers {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>windowIDs=driver.getWindowHandles();//retruns two window id's
		System.out.println(windowIDs);
		
	for(String wind:windowIDs)
	{
		String title=driver.switchTo().window(wind).getTitle();
		if(title.equals("OrangeHRM")  || title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"));
		driver.close();
		
	/*	if(title.equals("OrangeHRM"))
		{
			System.out.println("Parent window:"+driver.getWindowHandle());
			driver.close();//close the parent window
		}
		
		
		if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
		{
			System.out.println("child window:"+driver.getWindowHandle());
			//driver.close();//close the child window
		}*/
		
	}
		
	
	}

}
