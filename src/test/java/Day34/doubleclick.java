package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
	field1.clear();
	field1.sendKeys("Adarsh");
	WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
	
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	Actions act=new Actions(driver);

	act.doubleClick(button).perform();
	
	field2.getAttribute("value");
	}

}
