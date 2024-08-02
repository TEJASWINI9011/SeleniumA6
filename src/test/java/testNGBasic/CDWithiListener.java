package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.ReportWithMultiTestCase.class)
public class CDWithiListener {
@Test
public void dominos() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://pizzaonline.dominos.co.in/");
	Reporter.log("My stomach is Hungry", true);
	
}

@Test(timeOut=1000)
public void rcb() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalchallengers.com/");
	Reporter.log("rcb hungry for cup", true);
	
}

@Test(dependsOnMethods ="rcb")
public void csk() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.chennaisuperkings.com/");
	Reporter.log("csk is good team", true);
	
}

}
