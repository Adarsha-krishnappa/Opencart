package Day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	/*	JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '40%'");
		*/
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome ");
		driver.switchTo().defaultContent();
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("to");
		driver.switchTo().defaultContent();
		
		//frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//innerframe
		driver.switchTo().frame(0);
		List<WebElement>checkbox=driver.findElements(By.xpath("//div[@class='uHMk6b fsHoPb']"));
		System.out.println(checkbox.size());
		for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		boolean iframe3staus=driver.findElement(By.xpath("//div[contains(text(),'Form Filling Demo Page')]")).isDisplayed();
		System.out.println("iframe3staus:"+iframe3staus);
		
		driver.switchTo().defaultContent();
		
		//frame 4
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Automation");
		driver.switchTo().defaultContent();
		
		
		//frame5
		//WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		//driver.switchTo().frame(frame5);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']")));
		WebElement link=driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",link );
		boolean iframe5staus=driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
	    System.out.println("iframe5staus:"+iframe5staus);
	
	}
}
