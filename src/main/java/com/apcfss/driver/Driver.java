package com.apcfss.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.apcfss.utilities.ReadPropertyFile;

/*
 *Here we are using 'final' to avoid others to extend this class
 */
public final class Driver {

	//We used 'private constructor' to avoid others to creating instances/objects
	private Driver() {
	}


	public static void initDriver() throws Exception
	{
		//Here we are using If condition to avoid multiple driver instances. So if we get the driver null then it will use below driver
		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(ReadPropertyFile.get("url"));

			DriverManager.getDriver().manage().window().maximize();
		}}

	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver())){
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}