package UtilsLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReporterStepUP implements ITestListener {

	public void onFinish(ITestContext result) {
		extent.flush();
	}

	public void onStart(ITestContext result) {
		extent=ExtentReporterStepUP.extentReportSetUp();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test Cases is Fail:"+result.getMethod().getMethodName());
		
		extentTest.log(Status.FAIL, result.getThrowable());
		
		try {
			extentTest.addScreenCaptureFromPath(ExtentReporterStepUP.getScreenshotFailed(driver, result.getMethod().getMethodName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test case is skip "+result.getMethod().getMethodName());
		
		
		
	}

	public void onTestStart(ITestResult result) {
		extentTest=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test case is Passes :::"+ result.getMethod().getMethodName());
		try {
			extentTest.addScreenCaptureFromPath(ExtentReporterStepUP.getScreenshotPassed(driver, result.getMethod().getMethodName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
