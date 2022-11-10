package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClassScript {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
