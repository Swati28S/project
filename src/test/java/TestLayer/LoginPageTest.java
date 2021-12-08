package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	@BeforeClass
	public void setUp() {
		BaseClass.intilization();
	}
	
	@Test
	public void validateLoginFunctionality() {
		LoginPage loginpage =new LoginPage();
		
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		
		loginpage.clickOnLoginButton();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	
	
}
