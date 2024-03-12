package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		//using select class
		WebElement countryoptions=driver.findElement(By.id("country-list"));
		
		Select dropdown=new Select(countryoptions);
		//dropdown.selectByValue("4");
		//dropdown.selectByVisibleText("USA");
		dropdown.selectByIndex(4);
		List<WebElement> options1=dropdown.getOptions();
		
		for(WebElement option:options1)
		{
			System.out.println(option.getText());
		}
		
		
		WebElement option1=driver.findElement(By.name("state"));
		
		Select mys=new Select(option1);
		mys.selectByVisibleText("Delhi");
		
		*/
		//hiden dropdown
		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		
		List<WebElement> status=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(status.size());

	for(WebElement option:status)
	{
		String Sataustext=option.getText();
		if(Sataustext.equals("Freelance"))
		{
			option.click();
		}
	}
	}

}
