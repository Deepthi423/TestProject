package com.cl.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class Flights {
	By radio_Oneway= By.id("OneWay");
	By radio_RoundTrip = By.id("RoundTrip");
	By radio_MultiCity= By.id("MultiCity");
	By text_FromLocation=By.id("FromTag");
	By text_ToLocation=By.id("ToTag");
	By datePicket_DepartDate=By.id("DepartDate");
	By list_Adults=By.id("Adults");
	By list_Childrens=By.id("Childrens");
	By list_Infants=By.id("Infants");
	By button_Search=By.id("SearchBtn");
	
	public void selectOnewayradio(WebDriver driver) throws Exception{
		ElementUtils.click(driver, radio_Oneway);
	}
	
	public void selectRoundTrip(WebDriver driver)throws Exception{
		ElementUtils.click(driver, radio_RoundTrip);
	}
	
	public void selectMultiCity(WebDriver driver) throws Exception{
		ElementUtils.click(driver, radio_MultiCity);
	}
	
	public void enterFromLocation(WebDriver driver)throws Exception{
		ElementUtils.type(driver, text_FromLocation, "Hyd");
	}
	
	public void enterToLocation(WebDriver driver)throws Exception{
		ElementUtils.type(driver, text_ToLocation, "Mum");
	}
	
	public void searchFlights(WebDriver driver)throws Exception{
		ElementUtils.click(driver, button_Search);
	}

}
