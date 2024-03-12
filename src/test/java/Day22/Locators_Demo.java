package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locator are the address that identifyes the WebElements unique
/*
 1.id
 2.name
 3.linktext
 4.parstiallinktext
 above locators are used to locate the single webelemet
 
 5.classname
 6.tagname
 above locators are used to locate the multiple webelemet
 */
public class Locators_Demo {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//id
		//driver.findElement(By.id("nav-hamburger-menu")).click();
		
		//name
		//driver.findElement(By.name("field-keywords")).sendKeys("boat");
		
		//linktext
		//driver.findElement(By.linkText("Best Sellers")).click();//here we are placing the text value(prefered)unique
		
		//parstiallinktext
		//driver.findElement(By.partialLinkText("Sellers")).click();//not prfered because if we take some part of text from one elemet that might be present in other elements so it locating more tha one elemet
		
		
		//tagname
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		for(WebElement link:links)
		{
			System.out.println(link);
		}
		System.out.println(links.size());
		/*for(WebElement imgae:images)
		{
			System.out.println(imgae);
		}
		System.out.println(links.size());

		
		System.out.println(images.size());*/
		
		//classname
	
		List<WebElement> headers=driver.findElements(By.className("landscape-image"));
	
		for(WebElement header:headers)
		{
			System.out.println("headers liks"+header);
		}
		System.out.println("Total no of header links"+headers.size());
				
		
		
		

	}

}
