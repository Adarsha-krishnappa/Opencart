package Day35;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Scrollingwebpage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;//type casting
		
		//ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//1) scroll down page by pixel number
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("retrun window.pageYoffset;"));

	}

}
