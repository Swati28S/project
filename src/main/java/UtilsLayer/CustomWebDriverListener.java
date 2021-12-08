package UtilsLayer;

import java.beans.ExceptionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import BaseLayer.BaseClass;

public class CustomWebDriverListener extends BaseClass implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {

		System.out.println("Before Alert generate ");
	}

	public void afterAlertAccept(WebDriver driver) {
		
		System.out.println("After Alert Generate ");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		
		System.out.println("After Clicking on cancel button");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		
		System.out.println("Before Clicking on cancel button");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		
		System.out.println("Before Navigating to : "+url);
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		
		System.out.println("After Navigating to :"+url);	
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {

			
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Trying to Find Element By "+by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Element is Found By "+by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {


		System.out.println("Before Clicking on Elemenet" +element.toString());
		
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {

		System.out.println("Elemenet is clicked :" +element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("Before change the of element Value "+element.toString());
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("Element Value is changed "+element.toString());
		
		System.out.println("Element Value is :"+keysToSend.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		
		
		System.out.println("Exception occuring "+throwable.getMessage());
		
		UtilsClass.TakeScreenShotAttheEnd();
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {

		System.out.println("Before Getting Text :"+element.toString());
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After Getting Text :"+element.toString());
		
	}

}
