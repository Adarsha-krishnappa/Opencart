package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethods {

	public static void main(String[] args) throws InterruptedException {
		// can access through the webelements and retruns the boolean value
		/*
		 isDisplayed()
		 isEnabled()
		 isSeleceted()
		 */

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*
		//isdisplayed
		Boolean logo_status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo_status);
		
		//isenable
		System.out.println(driver.findElement(By.xpath("//a[@title='Show products in category Electronics'][normalize-space()='Electronics']")).isEnabled());
		*/
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("before selection.............");
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//false
		
		
		System.out.println("After selecting male..........");
		male_rd.click();
		Thread.sleep(3000);
		System.out.println(male_rd.isSelected());//true
		System.out.println(female_rd.isSelected());//false
		
		
		System.out.println("After selecting female..........");
		female_rd.click();
		Thread.sleep(3000);
		System.out.println(male_rd.isSelected());//false
		System.out.println(female_rd.isSelected());//true
		
		
	}

}
