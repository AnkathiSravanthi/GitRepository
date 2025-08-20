package com.QA.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
	
	
	public void teardown()
	{
		
		driver.quit();
		
	}

}
