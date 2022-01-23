package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReporterStepUP extends BaseClass {
	public static ExtentSparkReporter sparksReporter;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	public static ExtentReports extentReportSetUp() {
		// location to store the report
		String reportname=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		sparksReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\"+reportname+".html");
		extent = new ExtentReports();
		extent.attachReporter(sparksReporter);
		return extent;
	}

	public static String getScreenshotFailed(WebDriver driver, String screenshotName) {
		String dateName = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/Jan2022FailedTestScreenshot/" + screenshotName + dateName+ ".jpg";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return destination;

	}


	public static String getScreenshotPassed(WebDriver driver,String screenshotName) {
		
		String dateName=new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String distination=System.getProperty("user.dir")+"/Jan20202PassedTestScreenshot/"+screenshotName+dateName+".jpg";
		
		try {
			FileUtils.copyFile(source, new File(distination));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return distination;
	}

}
