package com.apcfss.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.apcfss.driver.Driver;

public class BaseTest {
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quitDriver();
	}
}
