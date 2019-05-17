package com.cl.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class Hotels {
	By text_Location=By.id("Tags");
	By datePicker_CheckInDate=By.id("CheckInDate");
	By datePicker_CheckOutDate=By.id("CheckOutDate");
	By list_Travellers=By.id("travellersOnhome");
	By button_Search=By.id("SearchHotelsButton");
	
	public void selectLocation(WebDriver driver)throws Exception{
		ElementUtils.type(driver, text_Location, "Hyd");
	}
	
	public void searchHotels(WebDriver driver)throws Exception{
		ElementUtils.click(driver, button_Search);
	}

}
