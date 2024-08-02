package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DWSLoginPOM;

public class DwsLoginP {
@Test
public void main() {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	DWSLoginPOM ref = new DWSLoginPOM(driver);
	
	ref.login_link.click();
	
	ref.username.sendKeys("admin01@gmail.com");
	
	ref.password.sendKeys("admin01");
	
	ref.login_button.click();
	
}

}
