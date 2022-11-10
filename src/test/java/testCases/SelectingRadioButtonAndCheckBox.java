package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingRadioButtonAndCheckBox {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-7-1")).click();
		driver.findElement(By.id("vfb-6-0")).click();
		
		
		}
}
