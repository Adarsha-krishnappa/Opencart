package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		WebElement LAPNOP=driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Macs (0)']"));
		WebElement wind=driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(LAPNOP).moveToElement(wind).build().perform();
		//build()--create an action(we can createaction then we can able to perform that action whenever required 
		//perform()--perform an action
		act.moveToElement(LAPNOP).moveToElement(mac).moveToElement(wind).click().perform();
		
	}

}
