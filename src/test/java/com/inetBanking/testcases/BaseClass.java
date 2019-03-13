package com.inetBanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseUrl = "http://todomvc.com/examples/angularjs/#/";
	public String userName ="mngr178501";
	public String password ="urAnubU";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver = new ChromeDriver();	
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}

