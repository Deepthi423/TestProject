package com.cl.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class Trains {
	By text_FromLocation=By.id("from_station");
	By text_ToLocation=By.id("to_station");
	By list_TrainClass=By.id("trainClass");
	By datePicker_DepartDate=By.id("dpt_date");
	By list_Adults=By.id("train_adults");
	By list_Childerns=By.id("train_children");
	By list_SeniourMen=By.id("train_male_seniors");
	By list_SeniourWomen=By.id("train_female_seniors");
	By button_Search=By.id("trainFormButton");
	
	public void enterFromLocation(WebDriver driver)throws Exception{
		ElementUtils.type(driver, text_FromLocation, "Hyd");
	}
	
	public void enterToLocation(WebDriver driver)throws Exception{
		ElementUtils.type(driver, text_ToLocation, "Mum");
	}
	
	public void selectTrainClass(WebDriver driver)throws Exception{
		ElementUtils.selectValueFromDropdown(driver, list_TrainClass, "Sleeper (SL)");
	}
	
	public void searchFlights(WebDriver driver)throws Exception{
		ElementUtils.click(driver, button_Search);
	}
	
	

}
