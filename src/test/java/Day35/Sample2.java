package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {


		//WebDriver driver=new ChromeDriver();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		/*
		//1) scroll down the page certain pixels
		JavascriptExecutor js=driver;
		//js.executeScript("window.scrollBy(0,300)", "");
		//System.out.println(js.executeScript("retrun window.pageYoffset;"));


		//2 scroll the page until element is visible
		//js.executeScript("argumunts[0].scrollIntoView();", elemte);
		
		//3 soll till bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		System.out.println(js.executeScript("retrun window.pageYoffset;"));
		
		Thread.sleep(300);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight");
		System.out.println(js.executeScript("retrun window.pageYoffset;"));*/
		
		WebElement sourceelement=driver.findElement(By.xpath("//div[@id='slider']//span"));
		System.out.println(sourceelement.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(sourceelement, 40, 0).perform();
		System.out.println(sourceelement.getLocation());
	
		
	}

}
