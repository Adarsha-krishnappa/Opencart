package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//frame 1
		driver.switchTo().frame("packageListFrame");//frame(class name or id value")
		boolean frame1stsus=driver.findElement(By.xpath("//h2[normalize-space()='Packages']")).isDisplayed();
		System.out.println("status of frame1:"+frame1stsus);
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();//it will goback to main page
		
		//frame2
		driver.switchTo().frame("packageFrame");//swiching to frame 2 from main page
		boolean frame2status=driver.findElement(By.xpath("//h2[normalize-space()='Interfaces']")).isDisplayed();
		System.out.println("status of frame2:"+frame2status);
		driver.findElement(By.xpath("//a[@href='WebDriver.html']")).click();
		driver.switchTo().defaultContent();
		
		//frame3
		driver.switchTo().frame("classFrame");
		boolean frame3status=driver.findElement(By.xpath("//h2[normalize-space()='Interface WebDriver']")).isDisplayed();
		System.out.println("Status of frame3:"+frame3status);
		driver.findElement(By.xpath("//div[@class='description']//dl//a[@title='interface in org.openqa.selenium'][normalize-space()='SearchContext']")).click();
		
		
	}

}
