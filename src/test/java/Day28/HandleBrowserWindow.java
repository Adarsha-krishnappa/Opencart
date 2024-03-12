package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args)  {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
 		Set<String>Windowid =driver.getWindowHandles();
 		//1st method using collections
 		/*
 		//System.out.println(Windowid);
 		List<String> mywindow=new ArrayList(Windowid);//converting set to list
 		
 		String parentwindow=mywindow.get(0);
 		System.out.println("Parent window id:"+mywindow.get(0));
 		
 		String Childwindow=mywindow.get(1);
 		System.out.println("child window id:"+mywindow.get(1));
 		
 		
 		driver.switchTo().window(Childwindow);
 		System.out.println("Child:"+driver.getTitle());
 		
 		driver.switchTo().window(parentwindow);
 		System.out.println("parent:"+driver.getTitle());*/
 		
 		//2nd method using loopin statements
 		for(String winds:Windowid)
 		{
 			String Title=driver.switchTo().window(winds).getTitle();
 			System.out.println(Title);
 			if(Title.equals("OrangeHRM"))
 			{
 			 System.out.println("Parent window:"+driver.getWindowHandle());
 				driver.close();//it will close the parent window
 				//operations
 			}
 			if(Title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
 			{
 				System.out.println("child window:"+driver.getWindowHandle());
 				//operations
 			}
 		
 		}
	}

}
