package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class SelectClassMethods extends BaseClass {

	public static void selectDropDownvalue(WebElement wb,String value) {	
		Select sel = new Select(wb);		
		sel.selectByVisibleText(value);
	}
	
	
	
}
