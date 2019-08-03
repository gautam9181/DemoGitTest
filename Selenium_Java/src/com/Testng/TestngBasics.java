package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	//Pre conditions annotations
	@BeforeSuite
	public void setup() {
	System.out.println("set up property for chrome");
	}
	
	@BeforeTest
	public void login() {
	System.out.println("login to app");
	}
	
	@BeforeClass
	public void launchBrowser() {
	System.out.println("launch browser");
	}
	
		
	@BeforeMethod
	public void enterUrl() {
	System.out.println("enter url");
	}
	
	//Test case
	@Test
	public void googleTitleTest() {
	System.out.println("google title test");
	}
	
	@Test
	public void googleHome() {
	System.out.println("google home");
	}
	
	//Post conditions annotations
	
	@AfterMethod
	public void logout() {
	System.out.println("logout from app");
	}
			
	@AfterClass
	public void closeBrowser() {
	System.out.println("close chrome browser");
	}
	
	
	@AfterTest
	public void deleteAllCoookies() {
	System.out.println("Delete all cookies");
	}

	@AfterSuite
	public void generateReport() {
	System.out.println("generate Test report");
	}
}
