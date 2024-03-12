package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		/*driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//for mouseOver and keyboard actions we have to create object for Actions class
		
		Actions act=new Actions(driver);
		
		WebElement double_click=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//DobuleClick() 
		act.doubleClick(double_click).build().perform();
		
		String text1=driver.findElement(By.xpath("//input[@id='field1']")).getText();
		String text2=driver.findElement(By.xpath("//input[@id='field2']")).getText();
		driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
		System.out.println(text2);
		if(text1.equals(text2))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		//build() -- will create the action 
		//perform() -- create and complete the action
		
		WebElement SourceEle=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement TargatEle=driver.findElement(By.id("droppable"));
		//DragAndDrop()
		act.dragAndDrop(SourceEle, TargatEle).perform();
		*/
		
		//Rightclick
		/*driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Action rtclick=act.contextClick(Rightclick).build();
		
		rtclick.perform();
		*/
		//MouseOver
		
		driver.get("https://demo.opencart.com/");
		
		WebElement dekstop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));	
		//act.moveToElement(dekstop).moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"))).click().perform();
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		act.moveToElement(dekstop).moveToElement(mac).click().perform();
		
		WebElement options=driver.findElement(By.xpath("//select[@id='input-sort']"));
		
		
		Select optionsentry=new Select(options);
		optionsentry.selectByIndex(1);//name(a-z)
		
		
	}

}
