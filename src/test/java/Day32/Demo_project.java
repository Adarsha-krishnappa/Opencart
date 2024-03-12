package Day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_project {

	public static void main(String[] args) {
		//1
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		//select departure
		//2
		WebElement departure=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depart=new Select(departure);
		depart.selectByValue("Mexico City");//using by value attaribute
		
		//3
		//select destination
		WebElement destination=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destin=new Select(destination);
		destin.selectByVisibleText("London");//using text
		//click on find flights 
		//4
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//5
		int row=driver.findElements(By.xpath("//table[@class='table']//tbody/tr")).size();
		System.out.println("No of row :"+row);
		int column=driver.findElements(By.xpath("//table[@class='table']//th")).size();
		System.out.println("No of cloumns :"+column);
		
		/*
		//selecting single element
		WebElement Airline=driver.findElement(By.xpath("//table[@class='table']//tr[1]/td[3]"));
		System.out.println(Airline.getText());
		System.out.print("Choose"+"/t"+"Flight"+"/t"+"Airline"+"\t"+"Departs"+"\t"+"Arrives"+"\t"+"Price");
	//select all the values
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=column;c++)
			{
				WebElement values=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]/td["+c+"]"));
			System.out.println(values.getText());
			}
			
		}
		*/
		for(int r=1;r<=row;r++)
		{
			String value=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]/td[6]")).getText();
			System.out.println(value);//only price column(//$472.56$432.98$200.98$765.32$233.98)
		}
			/*spliting string
			String st[]=null;
			st=value.split('$');
			/*String value1="$472.56$432.98$200.98$765.32$233.98";
			String s[]=value1.split(value1)		*/

		//6 - capture prices then store in array
			
			String pricesArr[]=new String[row];   //0-4
			
			for(int r=1;r<=row;r++)
			{
				String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
				pricesArr[r-1]=price; //adding price into array
			}
			
		//7- Sort prices then find lower price value
			
			for(String arrvalue:pricesArr)
			{
				System.out.println(arrvalue);
			}
			
			Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
			String lowestPrice=pricesArr[0];
			System.out.println("Lower price:"+lowestPrice);
			
		//8- Find record in table having lower price
			
			for(int r=1;r<=row;r++)
			{
				String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
				
				if(price.equals(lowestPrice))
				{
					driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
					break;
				}

			}
			

	}

}
