package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
@FindBy(name="uid")
WebElement txtUserName;

@FindBy(name="password")
WebElement txtPassword;

@FindBy(name="btnLogin")
WebElement btnLogin;

public void setUsername(String uname)
{
	txtUserName.sendKeys(uname);
}

public void setPasssword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

public void LoginClick()
{
	btnLogin.click();
}

}

