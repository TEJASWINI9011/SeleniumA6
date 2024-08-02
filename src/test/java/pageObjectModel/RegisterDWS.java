package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsRegister;

public class RegisterDWS {
@Test
public void Main() {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	DwsRegister ref = new DwsRegister(driver);
	
	ref.register();
	ref.gender();
	ref.first_name("Tejaswini");
	ref.last_name("patil");
	ref.email("tej0102@gmail.com");
	ref.password("teju0102");
	ref.confirm_password("teju0102");
	ref.regi_click();
	
}

}
