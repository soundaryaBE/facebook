import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logoutTest {

@Test

public void logout()
{
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String URL=System.getProperty("url");
	driver.get(URL);
	System.out.println("loggedout Successfully");
	//hello all
}

}
