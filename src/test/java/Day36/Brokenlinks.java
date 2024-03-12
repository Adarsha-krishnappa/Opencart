package Day36;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		int brokenlinks=0;
		int notbrokenlinks=0;
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link_href:links)
		{
		String hrefatrribute=link_href.getAttribute("href");
		if(hrefatrribute=="null" || hrefatrribute.isEmpty())
		{
			System.out.println("Href attribute value is null or empty. So not possible to check broken link");
			continue;
		}
		
		URL url=new URL(hrefatrribute);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		con.connect();
		
		if(con.getResponseCode()>=400)
		{
			System.out.println(hrefatrribute+"===Broken link");
			brokenlinks++;
		}
		else 
		{
			System.out.println(hrefatrribute+"=== not Broken link");
			notbrokenlinks++;
		}
		System.out.println("total num of brokenlinks:" +brokenlinks);
        System.out.println("total num of notbrokenlinks:" +notbrokenlinks);
		}
		
		

	}

}
