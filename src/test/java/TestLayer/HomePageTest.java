package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class HomePageTest extends BaseClass {
	HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.intilization();
		homepage= new HomePage();
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
	public void validateHomePageLogo() {
		
		boolean actualLogoStatus= homepage.logoStatus();
		Assert.assertEquals(actualLogoStatus, true);
	}
	
	@Test(priority=3)
	public void validateTitle() throws InterruptedException {
		Thread.sleep(2000);
		String actualtitle =homepage.checkTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualtitle, expectedTitle);
	}
	
	@Test(priority=4)
	public void validateUrl() {
		String actualUrl =homepage.checkUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority=5)
	public void validateAdminLink() throws InterruptedException {
		Thread.sleep(2000);
		homepage.clickOnAdminLink();
	}
	
	
	@Test(priority=6)
	public void validatePIMLink() throws InterruptedException {
		Thread.sleep(2000);
		homepage.clickOnPIMLink();
	}
	
	
	@Test(priority=7)
	public void validateLeaveLink() throws InterruptedException {
		Thread.sleep(2000);
		homepage.clickOnPIMLink();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
	
	
}
