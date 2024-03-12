package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/* we have custmized loctors those are CSS selector and Xpath
CSS selector
tag#id
tag.class
tag[attribute='value']
tag.class[attribute='value']

Xpath--defined an XML path
by using xpath we can find the web elements on WebPage using HTML DOM structure
*/
public class Locator_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//open te URL
		driver.get("https://www.demoblaze.com/");
		
		//finding the elemts on webpage using 
		//Abslute Xpath--direct method of finding the elemets also called Full Xpath
		//The disadvantage of the absolute XPath is that if there are any changes made in the path of the element then that XPath gets failed.
		//Strats from begining of the HTML DOM structure
		
		
		//Xpath with AND
		//tagname[@attribute='value'  and @attribute='value']
		//driver.findElement(By.xpath("//*[@id='itemc' and @class='list-group-item']")).click();
		
		//Xpath with OR
		//tagname[@attribute='value' or @attribute='value']
		//driver.findElement(By.xpath("//a[@id='signin2' or @style='display']")).click();
		
		//Xpath with contains
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		//Xpath with starts-with
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[starts-with(@id,'recipient-email')]")).sendKeys("kadarsha64@gmail.com");
		//Xpath with conatins
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@id,'recipient-name')]")).sendKeys("kadarsha64@gmail");
		//Xpath with AND
		driver.findElement(By.xpath("//*[@id='message-text' and @class='form-control']")).sendKeys("Feeling well");
		
		
		
		//xpath with text()='value'
		driver.findElement(By.xpath("//*[text()='Send message']")).click();
		//driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL' and @xpath='1']")).click();
		

		//hadling the pop message
		driver.switchTo().alert().accept();
		
		boolean status=driver.findElement(By.xpath("//*[text()='CATEGORIES']")).isDisplayed();
		if(status=true)
		{
			System.out.println("Displayed CATEGORIES");
		}
		else
		{
			System.out.println("No itmes");
		}
		//Chained Xpath
		driver.findElement(By.xpath("//li[@class='nav-item']//a[text()='Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
		//chained Xpath)
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
