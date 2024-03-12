package Day22;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DiffBTW_elementVSelements {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//findelement finds single WebElement and return type is WebElement
		//findelements finds multipule WebElements and return type is List<WebElement>
		
		//scenario 1:locator is matching with single weelement
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//scenario 1:locator is matching with single weelement
		//driver.findElement(By.id("loc") --signle webelement  and return type is WebElement
		//driver.findElement(By.className("loc"))----signle webelement  and return type is List<WebElement>
		
		//scenario 2:locator is matching with multiple weelement
		//driver.findElement(By.id("loc") --1st webelement  and return type is WebElement
		//driver.findElement(By.className("loc"))----multipule webelement  and return type is List<WebElement>
		
		//scenario 2:locator is not matching with weelement
		//driver.findElement(By.id("loc") --Noelementfind exception
		//driver.findElement(By.className("loc"))----returns 0
		
		

	}

}
