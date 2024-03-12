package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor_example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','john')", name);// sendkeys aletername method using javascript menthod
		
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='female']"));

		js.executeScript("arguments[0].click();", female_rd);//alertnative way of click method using JSExceutor
		
	}

}
