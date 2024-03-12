package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutusingSwitchCMD_sudingExplicitmethod {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}

}
