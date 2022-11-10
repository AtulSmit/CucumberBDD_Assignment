package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalorieCalculator {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/calorie-calculator.html");
		
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("25");
		driver.findElement(By.id("cheightfeet")).clear();
		driver.findElement(By.id("cheightfeet")).sendKeys("5");
		driver.findElement(By.id("cheightinch")).clear();
		driver.findElement(By.id("cheightinch")).sendKeys("4");
		driver.findElement(By.id("cpound")).clear();
		driver.findElement(By.id("cpound")).sendKeys("170");
		
		
		
		}
	

}
