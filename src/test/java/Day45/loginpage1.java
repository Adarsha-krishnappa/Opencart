package Day45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage1 {
	//without using page factory
	WebDriver driver;
	//constructor
	loginpage1(WebDriver driver)
	{
		this.driver=driver;
	}

	//locators
	By txt_username_loc =By.xpath("//input[@placeholder='Username']");
	By txt_password_loc =By.xpath("//input[@placeholder='Password']");
	By btn_login_loc =By.xpath("//button[normalize-space()='Login']");
	//By links_loc=By.tagName("a");
	List<WebElement> links;
	//Action methods
	public void setusername(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	public void setpassword(String pswd)
	{
		driver.findElement(txt_password_loc).sendKeys(pswd);
	}
	public void clicklogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	/*public int getlinks()
	{
		return  links.size();
	}*/
}
