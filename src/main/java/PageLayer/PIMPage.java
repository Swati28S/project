package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.SelectClassMethods;

public class PIMPage extends BaseClass {

	private String oldday="20";
	
	@FindBy(id ="btnAdd")
	WebElement AddButtonInPIMPage;
	
	@FindBy(name="firstName")
	WebElement FirstNameInPIMPage;
	
	@FindBy(name="middleName")
	WebElement MiddleNameInPIMPage;
	
	@FindBy(name="lastName")
	WebElement LastNameInPIMPage;
	
	
	@FindBy(id="employeeId")
	WebElement EmployeeIDInPIMPage;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement SaveButtonInPIMPage;
	
	@FindBy(id="btnSave")
	WebElement EditAndsaveButtonInPIMPage;
	
	@FindBy(id="personal_txtLicExpDate")
	WebElement ExpDateInPIMPage;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement monthDPInPIMPage;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement yearDPInPIMPage;
	
	By dayPickInPIMPage =By.xpath("//a[text()='"+oldday+"']");
	
	@FindBy(id="personal_optGender_2")
	WebElement femaleRadionButtonInPIMPage;
	
	@FindBy(id="personal_cmbNa")
	WebElement NationalityDropDownInPIMPage;
	
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnAddButton() {
		AddButtonInPIMPage.click();
	}
	
	
	


	public void enterFNInPIMPage(String fn) {
		FirstNameInPIMPage.sendKeys(fn);
	}
	
	public void enterMNInPIMPage(String mn) {
		MiddleNameInPIMPage.sendKeys(mn);
	}
	
	public void enterLNInPIMPage(String ln) {
		LastNameInPIMPage.sendKeys(ln);
	}
	
	public void enterEmployeeIdInPIMPage(String id) {
		EmployeeIDInPIMPage.sendKeys(id);
	}
	
	public void clickOnsaveButton() {
		SaveButtonInPIMPage.click();
	}
	
	
	public void clickOnEditORSaveButton() {
		EditAndsaveButtonInPIMPage.click();
	}
	
	
	public void clickOnExpcalendar() {
		ExpDateInPIMPage.click();
	}
	
	public void selectMonthvalue(String month) {
		SelectClassMethods.selectDropDownvalue(monthDPInPIMPage, month);
		
	}
	
	public void selectYearValue(String year) {
		SelectClassMethods.selectDropDownvalue(yearDPInPIMPage, year);
	}
	
	public void selectDate(String newday) {
		setOldday(newday);
		WebElement dayValue=driver.findElement(dayPickInPIMPage);
		dayValue.click();
	}
	
	public String getOldday() {
		return oldday;
	}


	public void setOldday(String oldday) {
		this.oldday = oldday;
	}
	
	public void selectFemaleRadioButton() {
		femaleRadionButtonInPIMPage.click();
	}
	
	
	public void selectNationalitInDP(String nationality) {
		SelectClassMethods.selectDropDownvalue(NationalityDropDownInPIMPage, nationality);
	}
	
	

}
