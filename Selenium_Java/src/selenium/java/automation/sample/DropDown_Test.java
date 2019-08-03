package selenium.java.automation.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Test {
	
	WebDriver driver;
	
	public void dropDownTest() {
	try {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		//locate a web element
		
		//driver.findElement(By.id("month")).click();
		
		//Select objSelect = new Select(driver.findElement(By.id("month")));
		//objSelect.selectByVisibleText("Feb");
		
		List<WebElement> list = driver.findElements(By.xpath("//option[text()='Month']/following-sibling::*"));
		System.out.println(list.size());
				
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	                     
	}
	
	

	public static void main(String[] args) {
    
		DropDown_Test obj1 = new DropDown_Test();
		obj1.dropDownTest();

	}

}
