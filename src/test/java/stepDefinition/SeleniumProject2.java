package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumProject2 {
	WebDriver driver;

	@Given("enter {string} {string} and {string} and then calculate it")
	public void enter_and_and_then_calculate_it(String string, String string2, String string3) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net"); //load url
		
		String getTitleOfPage = driver.getTitle();//get title
		System.out.println("Title of page is "+getTitleOfPage);//print title
		if(getTitleOfPage.equals("Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science"))//check if both title are same or not
				System.out.println("Title of page is same");
		else
		System.out.println("Title of page is not same");		
		
		driver.findElement(By.xpath("//a[contains(text(),'BMI Calculator')]")).click();//click on BMI Calculator link
		String getTitleOfPage2 = driver.getTitle();//get title
		System.out.println("Title of page is "+getTitleOfPage2);//print title
		if(getTitleOfPage2.equals("BMI Calculator"))//check if both title are same or not
			System.out.println("Title of page is same");
		else
		System.out.println("Title of page is not same");
		
		driver.findElement(By.id("cage")).clear(); 
		driver.findElement(By.id("cage")).sendKeys(string);//enter age
		driver.findElement(By.id("cheightfeet")).clear();  
		driver.findElement(By.id("cheightfeet")).sendKeys(string2);//enter height
		driver.findElement(By.id("cheightinch")).clear();
		driver.findElement(By.id("cheightinch")).sendKeys("12"); //enter inch
		driver.findElement(By.id("cpound")).clear();
		driver.findElement(By.id("cpound")).sendKeys(string3);//enter weight 
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]")).click();//click on calculate button
		
		
		
  	}

	@When("Capture result and print for user")
	public void capture_result_and_print_for_user() {
		WebElement BMI = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[4]/div[1]/b[1]"));//find the BMI text
		System.out.println("BMI is: "+BMI.getText());//print BMI
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();//close the browser
	}
}
