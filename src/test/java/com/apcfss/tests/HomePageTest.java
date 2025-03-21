package com.apcfss.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apcfss.driver.DriverManager;

public class HomePageTest extends BaseTest {
	
	/*
	 * Validating whether the title is containing Google search or google search.
	 * Validate whether the title is not null and length of the title is greater than 15 and less than 100
	 * Check for the links in the page --> Testing mini bytes 
	 * Validate whether the number of links displayed is exactly 10 or 15.
	 */
	
	private HomePageTest() {
    }
	
	@Test
	public void test1() throws InterruptedException
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes", Keys.ENTER);
		Thread.sleep(20000);
		String title =DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(title), "Title is null");
		Assert.assertTrue(title.toLowerCase().contains("google search"));	
				//OR
		Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"google search")); //using regular expressions	
		Assert.assertTrue(title.length()>15);
		Assert.assertTrue(title.length()<100);
		List<WebElement> linkelements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		assertThat(linkelements.size()).isBetween(0, 12);		
		boolean isElementPresent = false;
		for(WebElement element:linkelements)
		{
			if(element.getText().equalsIgnoreCase("Testing Mini Bytes"))
			
			{
				isElementPresent=true;
				break;
			}
		}
		Assert.assertTrue(isElementPresent , "Testing Mini Bytes not found");
	}
}