package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletheALERTS {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//driver.switchTo().alert().accept();//select the OK 
		/*
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		//alert.accept();//select OK
		alert.dismiss();//select the cancel
		//alert.getText();//retruns the text msg
		*/
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Welcome");
		alert.accept();
		

	}

}
