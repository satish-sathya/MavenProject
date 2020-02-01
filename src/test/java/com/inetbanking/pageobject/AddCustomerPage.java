package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage 
{
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(linkText="New Customer") WebElement clickOnNewCustomerLink;
	
	@FindBy(name="name") WebElement enterCustomerName;
	
	@FindBy(name="rad1") WebElement selectRadioBut;
	
	@FindBy(xpath="//input[@id='dob']") WebElement enterDOB;
	
	@FindBy(name="addr") WebElement enterAddress;
	
	@FindBy(name="city") WebElement enterCity;
	
	@FindBy(name="state") WebElement enterState;
	
	@FindBy(name="pinno") WebElement enterPinCode;
	
	@FindBy(name="telephoneno") WebElement enterPhoneNumber;
	
	@FindBy(name="emailid") WebElement enterEmailid;
	
	@FindBy(name="password") WebElement enterPassword;
	
	@FindBy(name="sub") WebElement clickOnSubmitBut;
	
	

	public void clickAddNewCustomerLink()
	{
		clickOnNewCustomerLink.click();
	}
	
	public void enterCustName(String cname)
	{
		enterCustomerName.sendKeys(cname);
	}
	
	public void selectCustGender(String cgender)
	{
		selectRadioBut.click();
	}
	
	public void enterCustDob(String mm,String dd,String yy)
	{
		enterDOB.sendKeys(mm);
		enterDOB.sendKeys(dd);
		enterDOB.sendKeys(yy);
	}
	
	public void enterCustAddress(String caddress)
	{
		enterAddress.sendKeys(caddress);
	}
	
	public void enterCustCity(String ccity)
	{
		enterCity.sendKeys(ccity);
	}
	
	public void enterCustState(String cstate)
	{
		enterState.sendKeys(cstate);
	}
	
	public void enterCustPinCode(int cpincode)
	{
		enterPinCode.sendKeys(String.valueOf(cpincode));
	}
	
	public void enterCustPhoneNum(String cphnnum)
	{
		enterPhoneNumber.sendKeys(cphnnum);
	}
	
	public void enterCustEmailid(String cemailid)
	{
		enterEmailid.sendKeys(cemailid);
	}
	
	public void enterCustPassword(String cpassword)
	{
		enterPassword.sendKeys(cpassword);
	}
	
	public void clickOnSubmit()
	{
		clickOnSubmitBut.click();
	}
	
}
