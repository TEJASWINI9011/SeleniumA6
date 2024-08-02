package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigiDownload {
	
	public DigiDownload(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath="//a[contains(text(),'Digital downloads')]")
	WebElement digital;
	
	private @FindBy(xpath="//input[@value='Add to cart']")
	WebElement add;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement add1;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement add2;
	
	

}
