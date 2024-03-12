package Day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	public static void main(String[] args) {
		
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	List<WebElement> selenim_topics=driver.findElements(By.xpath("//*[@id='Wikipedia1_wikipedia-search-results']//a"));
	
	System.out.println(selenim_topics.size());
	
	for(WebElement topics:selenim_topics)
	{
		
		topics.click();
		//System.out.println(driver.getWindowHandle());
	}
	Set<String> windowids=driver.getWindowHandles();
	
	for(String window:windowids)
	{
		String title=driver.switchTo().window(window).getTitle();
		System.out.println(title);
		
		if(title.equals("Selenium - Wikipedia") || title.equals("Selenium dioxide - Wikipedia") || title.equals("Automation Testing Practice"))
		{
		driver.close();
		}
	}

		
	}

}
