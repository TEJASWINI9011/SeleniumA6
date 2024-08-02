package testNGBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Task1Dws;

public class Task1 extends Task1Dws
{
	String rssurl ="https://demowebshop.tricentis.com/news/rss/1";
	String fburl = "";
	
	public void testCase() throws InterruptedException
	{
	String given_url = "";
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url))
	{
		System.out.println("I am in dws page");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		List<WebElement> links=	driver.findElements(By.xpath("//div[@class=\"column follow-us\"]/ul/li/a"));
		
		for(WebElement web : links) 
		{
			String currenturl = driver.getCurrentUrl();
			
			if(rssurl.equals(currenturl)) 
			{
				driver.navigate().back();
				
				Thread.sleep(2000);
			}
			web.click();
			
			if(fburl.equals(current_url))
			{
		       String fbhandle = driver.getWindowHandle();
				driver.switchToWindow(fbhandle);
		        
			}
	}
	}
}
