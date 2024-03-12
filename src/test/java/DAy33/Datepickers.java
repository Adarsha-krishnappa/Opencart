package DAy33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://testautomationpractice.blogspot.com/");

		//WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("12/12/2022");
	//	driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']"))
		*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String year="2024";
		String month="October";
		String day="28";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
		
	String Currentmoonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	String Currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	WebElement forword_button=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	WebElement backword_button=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		
		if(Currentmoonth.equals(month) && Currentyear.equals(year))
		{
			break;
		}
		forword_button.click();
				}
	
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}

	}

}
