package Project.NewMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
	public void verify()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
	}

}
