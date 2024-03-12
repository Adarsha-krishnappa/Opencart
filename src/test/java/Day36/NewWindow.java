package Day36;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Opens new tab on same window
		//driver.switchTo().newWindow(WindowType.TAB);
		//Opens new  window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("http://www.deadlinkcity.com/");
	}

}
