package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample11 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		/*
		//click specific checkbox
		//driver.findElement(By.xpath("//input[@id='friday']")).click();
		
		//clcik all 7 week check boxes
		List<WebElement> days=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println(days.size());
		
		for(WebElement day:days)
		{
			day.click();
		}
		for(int i=5;i<days.size();i++)
		{
			days.get(i).click();		}

	*/
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//normal alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		driver.switchTo().alert().accept();//click ok
		//driver.switchTo().alert().dismiss();//click cancel
		
		
		//using alert calss
		/*Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();*/
		
		//using expelict wait
		//mywait.until(ExpectedConditions.alertIsPresent()).accept();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Welcome");
		alert.accept();
		
		
		
	}
}
