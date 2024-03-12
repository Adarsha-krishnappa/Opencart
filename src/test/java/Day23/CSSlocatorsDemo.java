package Day23;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*CSS-casecde style sheet, this is custumized locator
 1.tag and id(#)
 2.tag and class(.)
 3.tag anf attribute ([])
 4.tag,class and attribute(.[])
 */
public class CSSlocatorsDemo {

	public static void main(String arg[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		
		// 1.tag and id(#)
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobiles");
		
		//2.tag and class(.)
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
	
		//3.tag anf attribute ([attribute])
		//driver.findElement(By.cssSelector("input[name=q]")).sendKeys("Mobiles");
		//driver.findElement(By.cssSelector("[name=q]")).sendKeys("Mobiles");
		
		 //4.tag,class and attribute(.[])
		
		driver.findElement(By.cssSelector("input.search-box-text[name=q]")).sendKeys("laptops");
		driver.findElement(By.cssSelector(".search-box-text[name=q]")).sendKeys("T-shirts");
	
		driver.quit();
	}
}
