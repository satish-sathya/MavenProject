package com.inetbanking.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		logger.info("entered username");
		
		lp.setPassword(password);
		logger.info("entered password");
		
		lp.clickButton();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}
		else
		{
			captureScreenshot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test fail");
		}
		
	}

}
