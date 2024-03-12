package Automation_practice.HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//15205
/*
1) Open the browser
2) Enter the URL “http://practice.automationtesting.in/”
3) Click on Shop Menu
4) Now click on Home menu button
5) Test whether the Home page has Three Sliders only
6) The Home page must contains only three sliders

 */
public class Test1 {
	WebDriver driver;
	@Test(priority=1)
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=2)
	void openUrl()
	{
		driver.get("https://practice.automationtesting.in/");
	}
	@Test(priority=3)
	void Shopmenu()
	{
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
	}
	@Test(priority=4)
	void homepage()
	{
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}

}
