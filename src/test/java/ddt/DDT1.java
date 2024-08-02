package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DDT1 {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		Properties pop = new Properties();
		FileInputStream fis = new FileInputStream(".\\Configure\\loginfunctionproperties");
		
		pop.load(fis);
		
		String email = pop.getProperty("email");
		String password = pop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.className("ico-login")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']"));
	}    

	}


