package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement countryoption=driver.findElement(By.id("country"));//if it is slect tag we can use select class
		
		Select countryop=new Select(countryoption);
		/*
		 * selectbyvisible()
		 * selectbyindex()
		 * selectbyvalue()
		 */

		//countryop.selectByVisibleText("Germany");//here im passing text value
		//countryop.selectByValue("usa");//here im passing value="usa" of element
		countryop.selectByIndex(3);//index alway starts from 0
		List<WebElement>options=countryop.getOptions();
		System.out.println(options.size());//total no of options
		
		for(WebElement option:options)
		{
			String text=option.getText();
			System.out.println(text);
		}
		
		//Having 1.8+ year of experience in manual testing and automation testing.
		
		
	}

}
