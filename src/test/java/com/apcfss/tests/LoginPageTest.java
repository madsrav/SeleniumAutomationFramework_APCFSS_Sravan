package com.apcfss.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.apcfss.driver.DriverManager;

public class LoginPageTest extends BaseTest {
	
	//class or interface --> CamelCase
	//Final constant values --> Capital and can use '_'
	//Method name --> Starting small and then CamelCase
	//package name--> all small letters
	
	private LoginPageTest() {
	}
	
	@Test
	public void test1()
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("SeleniumAutomationFramework", Keys.ENTER);
	}
}