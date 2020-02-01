package com.inetbanking.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.AddCustomerPage;
import com.inetbanking.pageobject.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickButton();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust =new AddCustomerPage(driver);
		addcust.clickAddNewCustomerLink();
		logger.info("providing customer details...");
		
		addcust.enterCustName("Satish");
		addcust.selectCustGender("male");
		addcust.enterCustDob("12", "30", "1997");
		Thread.sleep(3000);
		addcust.enterCustAddress("kphbroad");
		addcust.enterCustCity("Hyderabad");
		addcust.enterCustState("Telangana");
		addcust.enterCustPinCode(500081);
		addcust.enterCustPhoneNum("9829194519");
		
		String email =randomString()+"@gmail.com";
		addcust.enterCustEmailid(email);
		addcust.enterCustPassword("1234");
		addcust.clickOnSubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res==true)
		{
			Assert.assertTrue(true);
			logger.info("testcase passed");
		}
		else
		{
			logger.info("testcase failed");
			captureScreenshot(driver,"AddNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
	
	

}
