package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//a[@href='http://www.orangehrm.com/']")
	WebElement logo;
	
	@FindBy(xpath="//b[text()='Admin']")
	WebElement AdminLink;
	
	@FindBy(xpath="//b[text()='PIM']")
	WebElement PIMLink;
	
	@FindBy(xpath="//b[text()='Leave']")
	WebElement LeaveLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logoStatus() {
		boolean actualLogoStatus =logo.isDisplayed();
		return actualLogoStatus;
		//return logo.isDisplayed();
	}
	
	public String checkTitle() {
		String actualTitle=driver.getTitle();
		return actualTitle;
	}
	
	
	public String checkUrl() {
		String actualUrl=driver.getCurrentUrl();
		return actualUrl;
	}
	
	public void clickOnAdminLink() {
		AdminLink.click();
	}
	
	public void clickOnPIMLink() {
		PIMLink.click();
	}
	
	public void clickOnLeaveLink() {
		LeaveLink.click();
	}
	
	
	
	
}
