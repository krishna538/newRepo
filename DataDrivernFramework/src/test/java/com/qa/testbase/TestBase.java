package com.qa.testbase;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static FileInputStream fis = null;
	public static WebDriver driver;
	public void setup() throws IOException
	{	
		FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\qa\\config\\config.properties");
		prop = new Properties();
		prop.load(f);
		
		
		//initiating the browser based on the value in the properties file
		if (prop.getProperty("browser").equals("firefox")) {
			
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		};
			
	}
	
}
