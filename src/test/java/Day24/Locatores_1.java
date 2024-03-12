package Day24;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;


public class Locatores_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//locator is an address that can identify the web elements on web page
		/*
		 *****************************
		 1.id,
		 2.name,
		 3.linktext,
		 4.partial link text
		 above four locarors are identifying single element on webpage.
		 5.class name
		 6.tagname
		 above two locators are identifying multipule web elements on web page
		 
		****************************
		 and we have custmized loctors those are CSS selector and Xpath
		 CSS selector
		 tag#id
		 tag.class
		 tag[attribute='value']
		 tag.class[attribute='value']
		
		Xpath--defined an XML path
		by using xpath we can find the web elements on WebPage using HTML DOM structure
		 */
		

		//choosing the browser deatils
		System.out.println("Enter the browser name:");
		Scanner sc=new Scanner(System.in);
		String browse_name=sc.next();
				
		WebDriver driver=null;
		switch (browse_name)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		}
		//open the URL
		driver.get("https://www.facebook.com/");
		//max the window
		driver.manage().window().maximize();
		
		//Identifing the elemnts using locators and performing the action
		
		//using id
		driver.findElement(By.id("email")).sendKeys("9739389744");
		//2.name
		driver.findElement(By.name("pass")).sendKeys("pavagada1");
		Thread.sleep(3000);
		//3.linktext,
		//boolean status=driver.findElement(By.linkText("Facebook helps you connect and share with the people in your life.")).isDisplayed();
		//System.out.println(status);
		//4.partial link text
		boolean status1=driver.findElement(By.partialLinkText("Facebook")).isDisplayed();
		if(status1=true) 
		{
		System.out.println("displayed --Facebook helps you connect and share with the people in your life.");
		}
		else
			System.out.println("Not displayed");
		
		
		Thread.sleep(4000);
		//Relative Xpath
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		//handling the pops
		//driver.switchTo().alert().accept();
		//6.tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(links);
		System.out.println(images.size());
		System.out.println(links.size());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
