package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	//Object Repository with the help of @FindBy annotation
	//we create OR with the help of @FindBy annotation then we have to store in webElement
	@FindBy(id="txtUsername")
	private WebElement Username;
	
	@FindBy(name="txtPassword")
	private WebElement Password;
	
	@FindBy(name="Submit")
	private WebElement LoginButton;
	
	//how to Initlize the OR in current class
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void typeUsername(String uname) {
		Username.sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
	
}
