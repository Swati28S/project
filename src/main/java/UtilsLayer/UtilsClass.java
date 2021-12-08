package UtilsLayer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	
	public static void TakeScreenShotAttheEnd() {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File("C:\\Users\\l470\\eclipse-workspace\\New folder\\OrangeHRMHybriydFramework\\screenshot\\abc.png");
		try {
			FileUtils.copyFile(f, dist);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public static void elementBorderByJs(WebElement wb) {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].style.border='3px solid red';", wb);
		

		
	}
	
	
}
