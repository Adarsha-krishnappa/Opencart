package DAy33;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class demodatepick  {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

}
