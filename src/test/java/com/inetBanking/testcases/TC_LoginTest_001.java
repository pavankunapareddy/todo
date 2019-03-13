package com.inetBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.loginpage;

public class TC_LoginTest_001 extends BaseClass {

	@Test ()
	public void loginTest() {
		driver.get(baseUrl);
		loginpage lp = new loginpage(driver);
		
		//lp.setUsername(userName);
		//lp.setPasssword(password);
		//lp.LoginClick();
		
		
		if(driver.getTitle().equals("AngularJS • TodoMVC")) {
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
		
	}
	 
	

	}
