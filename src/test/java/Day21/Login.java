package Day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/*
 1)lunch brwoser
 2)open url-https://www.demoblaze.com/
 3)click on login
 4)enter password & username
 5)click on login button
 6)validate logout link present on home page
 7)validate the user name displayed oon the home page
 8)close the brwoser
 */
public class Login {

	public static void main(String[] args) throws InterruptedException {
		

		//1)lunch brwoser
		//ChromeDriver driver=new ChromeDriver();
		System.out.println("Enter Browser name Chrome/Edge/Firefox:");
		Scanner sc=new Scanner(System.in);
		String Brwoser_name=sc.next();
		

		WebDriver driver=null;
		switch(Brwoser_name)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "Firefox":driver=new FirefoxDriver();break;
		default :driver=new ChromeDriver();
		
		}
		//2)open url-https://www.demoblaze.com/
			driver.get("https://www.demoblaze.com/");
			//max the window
			driver.manage().window().maximize();
			 //3)click on login
			driver.findElement(By.id("login2")).click();//web element
			//4)enter password & username
			Thread.sleep(3000);
			driver.findElement(By.id("loginusername")).sendKeys("ADARSHA");
			driver.findElement(By.id("loginpassword")).sendKeys("password");
			
			 //5)click on login button
		driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
		//6)validate logout link present on home page
		boolean status=driver.findElement(By.id("logout2")).isDisplayed();
		
		if (status=true) 
		{
				System.out.println("test is passed");
				}
		else
		{
			System.out.println("test is failed");
		}
		//7)validate the user name displayed on the home page
		Thread.sleep(4000);
		String tc=driver.findElement(By.id("nameofuser")).getText();//welcomeADARSHA
		
		System.out.println(tc);
		if(tc.contains("Welcome"))
		{
			System.out.println("name is displayed");
		}
		else
		{
			System.out.println("name is not displayed");
		}
		driver.quit();
		
		}

}
