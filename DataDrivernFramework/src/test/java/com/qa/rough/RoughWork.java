package com.qa.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoughWork {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.gecko.driver", "C:\\Users\\tsipl0741\\Downloads\\Workspace\\DataDrivernFramework\\src\\test\\resources\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://uranus.tetrasoft.in/");
		
	}

}
