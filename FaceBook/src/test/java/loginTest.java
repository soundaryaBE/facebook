import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
@Test

public void login()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("soundaryaraj62@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Kanishk6$");
	driver.findElement(By.name("login")).click();
	Reporter.log("logged in successfully",true);
}
}
