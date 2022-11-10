package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchingFB_TestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void LoadURl()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Mayuri\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void TestMethod()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
