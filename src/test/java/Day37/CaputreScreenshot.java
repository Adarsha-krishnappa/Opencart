package Day37;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaputreScreenshot {

	public static void main(String[] args) throws IOException {
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//full screenshot
		
	 TakesScreenshot ts=driver;
		File sorcefile= ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		FileUtils.copyFile(sorcefile, targetfile);
		
		
		/*//sreenshot of specific section of the page
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File sorcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\data.png");
		FileUtils.copyFile(sorcefile, targetfile);*/
	}

}
