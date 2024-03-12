package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 quit--close the all window on browser
		 close---close the single window on browser
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(5000);
		//driver.close();//it will close only first window  bcz our driver foucusing only one 1st window
		driver.quit();//it will close entire browser(all tabs which we open through the program)

	
	}

}
