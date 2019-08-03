package com.Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadProp {
	
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		//how to read properties file
		Properties prop1 = new Properties();
		
		//create object of fileInputStream class
		FileInputStream ip1 = new FileInputStream("C:\\Selenum - Automation\\Eclipse - Work Space\\Selenium_Java\\"
				+ "src\\com\\Testng\\Config.Properties");
		prop1.load(ip1);
		
		System.out.println(prop1.getProperty("browser"));
		System.out.println(prop1.getProperty("url"));
		System.out.println(prop1.getProperty("username"));
		System.out.println(prop1.getProperty("password"));
		
	}

}
