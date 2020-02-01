package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
    @CacheLookup
	WebElement txtusername;
	
	@FindBy(xpath="//input[@name='password']")
    @CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
    @CacheLookup
	WebElement txtbtnlogin;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
    @CacheLookup
	WebElement clickonlogout;
	
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String upswd)
	{
		txtpassword.sendKeys(upswd);
	}
	
	public void clickButton()
	{
		txtbtnlogin.click();
	}
	
	public void logoutlink()
	{
		clickonlogout.click();
	}

}
