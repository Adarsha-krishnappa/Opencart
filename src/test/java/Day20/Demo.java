package Day20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Demo {

	public static void main(String[] args) {
		//lunch the browser
		//ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver=new FirefoxDriver();
		
		//open the URL
		driver.get("https://www.facebook.com/login/");
		
		
		String act_title=driver.getTitle();
		System.out.println(act_title);
		//Comparing actual title with expected title(Log in to Facebook)
		if (act_title.equals("Log in to Facebook"))
		{
			System.out.println("test is passed");
		}
		else 
		{
			System.out.println("test failed");
		}
		
		//close page
		driver.quit();
		
		

	}

}
