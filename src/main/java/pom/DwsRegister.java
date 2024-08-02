package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister {
	
	public DwsRegister(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	
	private @FindBy(className="ico-register")
	WebElement register;
	
	private @FindBy(id="gender-female")
	WebElement gender;
	
	private @FindBy(id="FirstName")
	WebElement first_name;
	
	private @FindBy(id="LastName")
	WebElement last_name;
	
	private @FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	
	private @FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	private @FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirm_password;
	
	private@FindBy(id="register-button")
	WebElement regi_click;
	
	
	public void register(){
		register.click();
	}
	
	public void gender() {
		gender.click();
	}
	
	public void first_name(String first) {
		first_name.sendKeys(first);
	}
	
	public void last_name(String last) {
		last_name.sendKeys(last);
	}
	
	public void email(String em) {
		email.sendKeys(em);
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void confirm_password(String confirm) {
		confirm_password.sendKeys(confirm);
	}
	
	public void regi_click() {
		regi_click.click();
	}
	
	
	
	


}
