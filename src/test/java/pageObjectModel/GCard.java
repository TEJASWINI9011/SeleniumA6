package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.GiftCard;

public class GCard {
@Test

public void Tej() {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	GiftCard gc =new GiftCard(driver);
	
	gc.gC();
	gc.add();
	gc.rname("ajay");
	gc.rmail("ajay01@gmail.com");
	gc.yname("akshay");
	gc.ymail("akashy01@gmail.com");
	gc.msg("I like your gift");
	gc.quan("5");
	gc.addcart();
}
	

}
