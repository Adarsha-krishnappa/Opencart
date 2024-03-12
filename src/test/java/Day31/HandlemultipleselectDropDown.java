package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlemultipleselectDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		//slect single option
		//driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		//selecting multple options
		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		System.out.println(options.size());//no of elements
		for(WebElement option:options)
		{
			String title=option.getText();
			System.out.println(title);
			if(title.equals("jQuery") || title.equals("Angular") || title.equals("Java"))
			{
				option.click();
			}
		}
	}

}
