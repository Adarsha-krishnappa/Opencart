package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable {

	public static void main(String[] args) {
		//static table are fix table same no of rows and columns
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		int colums=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns present in the table:"+colums);//4
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows present in the table:"+rows);//7
		//driver.findElement(By.tagName("tr"))//it will count multiple table trs so if we have single table we can use this
		
		//redaing single element from the table
		//WebElement singlerecord=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]"));
		//System.out.println(singlerecord.getText());
		
		//table index always strts from 1,2,3.........
		//read all the dat from table
		//System.out.println(Book name+"\t"+dhd);
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=colums;c++)
			{
				String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(values+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}

