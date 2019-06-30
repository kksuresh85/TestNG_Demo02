package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Method {
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		System.out.println("In @Before method");
	}

	@Test
	public void test() {
		System.setProperty("webdriver.ie.driver", "C:\\Automation\\WorkSpace\\Demo_PageObjectModel\\src\\drivers\\IEDriverServer1.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println("Successfully invoked the browser");
	}
	
	@AfterClass
	public void teardown(){
		  System.out.println("In @After method");
		  driver.close();
	  }
}
