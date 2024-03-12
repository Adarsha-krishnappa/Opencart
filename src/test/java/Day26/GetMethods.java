package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// can access through webdriver insatnce
		ChromeDriver driver=new ChromeDriver();
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//open the url
		//getTitle()
		//System.out.println(driver.getTitle());//return the title of the page
		//getCurrentUrl()
		//System.out.println(driver.getCurrentUrl());//retrun the current url of the page
		//getpagesiurce()
		//System.out.println(driver.getPageSource());//retruns the page source
		
		//getWindowHandle()--returns thr id of the single browser window
        //it is randamly generate by browser at run time 
		//System.out.println("Browser window id:"+ driver.getWindowHandle());
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//getWindowhandles()--retruns the id's of the mulgtipule browser windows 
		Set<String> windows=driver.getWindowHandles();
		for (String wind:windows)
		{
			System.out.println(wind);
		}
	}

}
