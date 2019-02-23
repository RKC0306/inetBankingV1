package com.inetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);			
		}
		catch (Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String UserName = pro.getProperty("usename");
		return UserName;
	}	
	
	public String getPassword()
	{
		String Password = pro.getProperty("password");
		return Password;
	}
	
	public String getChromePath()
	{
		String ChromePath = pro.getProperty("chromepath");
		return ChromePath;
	}
	
	public String getIEPath()
	{
		String IEpath = pro.getProperty("iepath");
		return IEpath;
	}	
	public String getFirefoxPath()
	{
		String FirefoxPath = pro.getProperty("firefoxpath");
		return FirefoxPath;
	}


}
