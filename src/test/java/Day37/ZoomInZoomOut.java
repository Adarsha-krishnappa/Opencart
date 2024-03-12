package Day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//JavascriptExecutor js=driver;
		//js.executeAsyncScript("document.body.style.zoom='30%'");//zoom out
		
		JavascriptExecutor js=driver;
		js.executeAsyncScript("document.body.style.zoom='140%'");//zoom in

	}

}
