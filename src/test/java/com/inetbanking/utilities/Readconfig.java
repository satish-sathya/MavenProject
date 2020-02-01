package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig 
{
	Properties pro;
	public Readconfig()
	{
		File src = new File("./configurations/config.properties");
			
		try {
			FileInputStream fis = new FileInputStream(src);
		    pro = new Properties();
		    pro.load(fis);
            }
		catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String url= pro.getProperty("username");
		return url;
	}
	
	public String getpassword()
	{
		String url= pro.getProperty("password");
		return url;
	}
	
	public String getchromepath()
	{
		String url= pro.getProperty("chromepath");
		return url;
	}
	
	public String getfirefoxpath()
	{
		String url= pro.getProperty("firefoxpath");
		return url;
	}

}
