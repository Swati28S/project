package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.PIMPage;

public class PIMPageTest extends BaseClass {
	HomePage homepage;
	PIMPage pimpage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.intilization();
		homepage= new HomePage();
		pimpage=new PIMPage();
	}
	
	@Test(priority=1)
	public void validateLoginFunctionality() throws InterruptedException {
		LoginPage loginpage =new LoginPage();
		loginpage.typeUsername("Admin");
		loginpage.typePassword("admin123");
		Thread.sleep(2000);
		loginpage.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void validatePIMPageLink() {
		homepage.clickOnPIMLink();
	}
	
	@Test(priority=3)
	public void validateAddButtonInPIMPage() {
		pimpage.clickOnAddButton();

	}

	@Test(priority=4)
	public void validateAddEmployeeFunctionality() throws InterruptedException {
		pimpage.enterFNInPIMPage(prop.getProperty("firstName"));
		pimpage.enterMNInPIMPage("acba");
		pimpage.enterLNInPIMPage("pandita");
		pimpage.enterEmployeeIdInPIMPage("1234562");
		Thread.sleep(4000);
		pimpage.clickOnsaveButton();
		
	}
	
	@Test(priority=5)
	public void validayteEditButtonFunctionality() {
		pimpage.clickOnEditORSaveButton();
	}
	
	
	@Test(priority=6)
	public void validatePersonalDetail() throws InterruptedException {
		pimpage.clickOnExpcalendar();
		pimpage.selectMonthvalue("May");
		pimpage.selectYearValue("2010");
		Thread.sleep(2000);
		pimpage.selectDate("10");
		Thread.sleep(5000);
		pimpage.selectFemaleRadioButton();
		pimpage.selectNationalitInDP("Indian");
		
		Thread.sleep(5000);
		pimpage.clickOnEditORSaveButton();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	

}
