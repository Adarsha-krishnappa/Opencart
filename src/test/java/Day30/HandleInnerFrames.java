package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrames {

	public static void main(String[] args) {
		// three ways we switchto main page to frames
		//switch().frame(0)--use this method, if we have only one frame in page 
		//switch().frame("classname/idvalue")--use this method, if we have classname/idvalue for the frames in page 
		//switch().frame(webelement)--use this method, if we don't have classname/idvalue in the frames 
	 //store the frame in webelement then pass throuth switchmethod 3rd method
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));//finding the path for the frame1 and stored that in frame1 
		driver.switchTo().frame(frame1);//switching main page to frmae1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome to automation");
		driver.switchTo().defaultContent();//go back to mainpage
		
		//frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Enter the deatils below form");
		driver.switchTo().frame(0);//here we are using 0 index becaus we have only one inner frame
		//also we can dirclty swir=tch from frame to inner frame but we canot switch from frame to frame dirctly 
		WebElement ele=driver.findElement(By.xpath("//div[contains(@aria-label,'I am a human')]//div[contains(@class,'rseUEf nQOrEb')]"));
		//ElementNotInteractableException we can handle the exception by using JavascriptExecutor 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele );

	}

}
