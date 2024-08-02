package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard {
	
	public GiftCard (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement gC;
	
	private @FindBy(xpath="//input[@value='Add to cart']")
	WebElement add;
	
	private @FindBy(className="recipient-name")
	WebElement rname;
	
	private @FindBy(className="recipient-email")
	WebElement rmail;
	
	private @FindBy(className="sender-name")
	WebElement yname;
	
	private @FindBy(className="sender-email")
	WebElement ymail;
	
	private @FindBy(id="giftcard_1_Message")
	WebElement  msg;

	
	private @FindBy(xpath="//input[@id='addtocart_1_EnteredQuantity']")
	WebElement quan;

	
	private @FindBy(className="button-1 add-to-cart-button")
	WebElement addcart;
	
	
	public void gC() {
		gC.click();
		
		}
	
	public void add() {
		add.click();
	}
	
	public void rname(String rec) {
		rname.sendKeys(rec);
	}
	
	public void rmail(String mail) {
		rmail.sendKeys(mail);
	}
	
	public void yname(String send) {
		yname.sendKeys(send);
	}
	
	public void ymail(String smail) {
		ymail.sendKeys(smail);
	}
	
	public void msg(String message) {
		msg.sendKeys(message);
	}
	
	public void quan(String quantity) {
		quan.sendKeys(quantity);
	}
	
	
	public void addcart() {
		addcart.click();
	}

}
