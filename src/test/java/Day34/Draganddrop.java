package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	
	WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act=new Actions(driver);

	act.dragAndDrop(source, destination).perform();

	}

}
