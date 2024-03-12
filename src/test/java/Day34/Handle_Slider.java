package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handle_Slider {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions act=new Actions(driver);
	WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
	System.out.println("before moving:"+slider.getLocation());//(x,y)/(639, 1095)
	act.dragAndDropBy(slider, 10, 1095).perform();
	System.out.println("after moving :"+slider.getLocation());
	
	
	}

}
