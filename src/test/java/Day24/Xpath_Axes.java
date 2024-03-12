package Day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		//Xpath axes is used to serach for multipule node/elements on HTML Document
		//mainly used when the webElemts is not identified with the help of id,name,classname,linktext,CSS selector
		/*
		 Self
		 parent
		 child
		 ancestor
		 Descedante
		 preceding
		 preceding-sibling
		 following
		 following-sibling
		 */
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//self  -  selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'LKP Finance Ltd.')]/self::a")).getText();
		System.out.println(text);
		//parent  --  selects the parent node
		String text1=driver.findElement(By.xpath("//a[contains(text(),'LKP Finance Ltd.')]//parent::td")).getText();
		System.out.println(text1);
		
		//child  -  selects the child node
		List<WebElement> child_elements=driver.findElements(By.xpath("//a[contains(text(),'LKP Finance Ltd.')]//ancestor::tr/child::td"));
		System.out.println(child_elements.size());//no of child elements
		
		//ancestor   -  selects the parent,grandparent node
		String childtext=driver.findElement(By.xpath("//a[contains(text(),'LKP Finance Ltd.')]/ancestor::tr")).getText();
		System.out.println(childtext);
		
		//descendant   -  selects the child,grandchild node
		List<WebElement>Descendant_elements=driver.findElements(By.xpath("//a[contains(text(),'LKP Finance Ltd.')]/ancestor::tr/descendant::*"));
		System.out.println(Descendant_elements.size());
		
		driver.quit();
	}

}
