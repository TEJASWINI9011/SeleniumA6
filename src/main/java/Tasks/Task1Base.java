package Tasks;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1Base {
	
	private @FindBy(className = "ico-register")
	WebElement register;
	
	private @FindBy(id ="gender-female")
	WebElement gender;
	
	private @FindBy(xpath ="//div[@class='inputs']/input")
	List<WebElement> text;
	
	private@FindBy(id = "register-button")
	WebElement reg_click;
	
	
	public Task1Base (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void register() {
		register.click();
	}
	
	public void gender() {
		gender.click();
	}
	
	public void text(String name, String surname, String email, String pass,String compass ) {
		
		List<WebElement> reg = text;
		reg.get(0).sendKeys(name);
		reg.get(1).sendKeys(surname);
		reg.get(2).sendKeys(email);
		reg.get(3).sendKeys(pass);
		reg.get(4).sendKeys(compass);
		
	}
	
	public void reg_click() {
		reg_click.click();
	}
	}
		
	


