package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DWSLoginPOM;
import pom.DWSLoginPOMEn;

public class DWSLoginPEn {
@Test
public void main() {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	DWSLoginPOMEn ref = new DWSLoginPOMEn(driver);
	
	ref.login_link();
	ref.username("admin01@gmail.com");
	ref.password("admin01");
	ref.login_button();
	
	
	
	
	
}

}
