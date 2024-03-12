package Day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//1st methid
		
		//URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//2nd method
		//driver.navigate().to(myurl);
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//1st methid
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().to("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		driver.quit();;
	}

}
