package selenium.java.automation.sample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.concurrent.

public class launchbrowser {
	
	
	WebDriver driver;
	public void invokeBrowser()
	{
					
		try {
			System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver() ;
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			
			//Open the web app
			//driver.navigate().to("https://amazon.in");
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			
			//locate a web element
			//driver.findElement(By.linkText("Your Amazon.in")).click();
			//driver.navigate().back();
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.findElement(By.className("_2aUbKa")).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		                     
		
	}
	
	public void invokefacebook() {
		try {
			System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver() ;
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			
			//Open the web app
			driver.navigate().to("https://facebook.com");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
				
			driver.findElement(By.cssSelector("input#email")).sendKeys("abc@facebook.com");
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void closeBrowser()
		{		
		try {
			driver.close();

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	
	public static void main(String[] args) {
		launchbrowser obj1 = new launchbrowser();
		obj1.invokeBrowser();
		obj1.closeBrowser();
		obj1.invokefacebook();

			
				
	}

	
} 


