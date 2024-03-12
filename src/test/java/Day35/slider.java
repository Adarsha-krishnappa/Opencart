package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//span[@tabindex='0']"));

		System.out.println("location of the slider:  " +slider.getLocation());//(639, 1095)
		
		act.dragAndDropBy(slider, 30, 1095).perform();
		
		System.out.println("after moving location of the slider:  " +slider.getLocation());
		
	}

}



