package Day29;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPOP {

	public static void main(String[] args) {
		
		
     ChromeDriver driver=new ChromeDriver();
   //  driver.get("http://the-internet.herokuapp.com/basic_auth");
     
     //http://username:password@the-internet.herokuapp.com/basic_auth
     //http://admin:admin@the-internet.herokuapp.com/basic_auth
     
     driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//here we are injecting password and username
     //because we can't inspet the AuthenticationPoP/Alert so we are by passing through the URL
	}

}
