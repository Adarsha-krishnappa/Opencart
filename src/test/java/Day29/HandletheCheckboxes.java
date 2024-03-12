package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletheCheckboxes {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	
		//select single check box
		//driver.findElement(By.id("monday")).click();
		
		//select multiple check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		System.out.println(checkboxes.size());
		/*
		for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}	*/
		
		//select last 3 checkboxes
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		//unselect the selected check boxes
		//method 1
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chkbx:checkboxes)
		{
			if(chkbx.isSelected())
			{
				chkbx.click();
			}
		}*/
		
		for(int i=4;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
			
		}
	
	
	}

}
