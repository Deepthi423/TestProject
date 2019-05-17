package com.cl.flights.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.cl.utils.AppUtils;
import com.cl.utils.BrowserUtils;
import com.cl.utils.ConstantUtils;

public class TestSuite1 {
	public WebDriver driver;
	public static Properties prop;

	@Before
	public void setUp() throws Exception, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(ConstantUtils.configPath));
		driver = BrowserUtils.intailizeBrowser(prop, driver);
		AppUtils.invokeApplication(prop, driver);
	}

	@After
	public void tearDown() {
		BrowserUtils.closeAppAndBrowser(driver);
	}

	@Test
	public void test1() throws Exception {
		System.out.println("THis is test1 method");
	}
	@Test
	public void test2() throws Exception {
		System.out.println("THis is test2 method");
	}
	@Test
	public void test3() throws Exception {
		System.out.println("THis is test3 method");

	}

}
