package BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import UtilsLayer.CustomWebDriverListener;
import io.github.bonigarcia.wdm.WebDriverManager;

//Base is super parent class of all the classes in framework
public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static CustomWebDriverListener customerListener;
	
	

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\l470\\eclipse-workspace\\New folder\\OrangeHRMHybriydFramework\\src\\main\\java\\ConfigLayer\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void intilization() {

		String browser = prop.getProperty("browsername");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\l470\\Desktop\\25 Dec 2021 Automation Testing\\Selenium SetUp\\chromedriver_win32 (6)\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
		
		 e_driver =new EventFiringWebDriver(driver);
		
		customerListener =new CustomWebDriverListener();
		
		e_driver.register(customerListener);
		
		driver=e_driver;
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
