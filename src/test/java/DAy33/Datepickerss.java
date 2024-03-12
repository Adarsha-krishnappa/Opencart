package DAy33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerss {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String year="2024";
		String month="March";
		String day="10";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
		
	WebElement Currentmoonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	WebElement Currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
	WebElement forword_button=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	WebElement backword_button=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		
		if(Currentmoonth.equals(month) && Currentyear.equals(year))
		{
			break;
		}
		forword_button.click();
		
		}

	}

}
