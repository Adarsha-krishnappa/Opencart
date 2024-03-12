package Day37;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		ChromeOptions Options=new ChromeOptions();
		Options.setAcceptInsecureCerts(true);
		ChromeDriver driver=new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		
		System.out.println("title of the page:"+driver.getTitle()); //Privacy error
		
	}

}
