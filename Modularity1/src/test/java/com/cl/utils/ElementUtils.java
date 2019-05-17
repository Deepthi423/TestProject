package com.cl.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {

	public static void click(WebDriver driver, By locator) throws Exception {
		findObject(driver, locator).click();
	}

	public static void type(WebDriver driver, By locator, String text) throws Exception {
		findObject(driver, locator).sendKeys(text);
	}

	public static void clear(WebDriver driver, By locator) throws Exception {
		findObject(driver, locator).clear();
	}

	public static void selectValueFromDropdown(WebDriver driver, By locator, String text) throws Exception {
		new Select(findObject(driver, locator)).selectByVisibleText(text);
	}

	public static void selectValueFromListBox(WebDriver driver, By locator, String text[]) throws Exception {
		for (int i = 0; i < text.length; i++) {
			new Select(findObject(driver, locator)).selectByVisibleText(text[i]);
		}
	}
	
	public static int countNoOfOptionsFromListbox(WebDriver driver,By locator) throws Exception{
		return new Select(findObject(driver, locator)).getOptions().size();
	}
	
	public static void defaultValueOfDropdown(WebDriver driver,By locator) throws Exception{
		new Select(findObject(driver, locator)).getFirstSelectedOption();
	}
	
	public static String captureText(WebDriver driver,By locator)throws Exception{
		return findObject(driver, locator).getText();
	}
	
	public static String captureAttribute(WebDriver driver,By locator,String attribute)throws Exception{
		return findObject(driver, locator).getAttribute(attribute);
	}
	
	public static ArrayList<String> getValuesFromDropDown(WebDriver driver,By locator)throws Exception{
		ArrayList<String> list=new ArrayList<String>();
		List<WebElement> option=new Select(findObject(driver, locator)).getOptions();
		//Select s=new Select(findObject(driver, locator));
		//java.util.List<WebElement> list1 =s.getOptions();
		for (WebElement ele:option){
			list.add(ele.getText());
		}
		return list;
	}
	
	public void deselectValueFromListBox(WebDriver driver,By locator,String values[])throws Exception{
		for (int i=0;i<values.length;i++){
		new Select(findObject(driver, locator)).deselectByVisibleText(values[i]);
		}
	}
		

	private static WebElement findObject(WebDriver driver, By locator) throws Exception {
		WebElement ele = null;
		for (int i = 0; i < 10; i++) {
			try {
				ele = driver.findElement(locator);
				break;
			} catch (Exception e) {
				Thread.sleep(500);
			}
		}
		return ele;
	}

}
