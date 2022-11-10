package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebbokFeature {

	WebDriver driver;
	
	@Given("facebook website is launched")
	public void facebook_website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	
	

	@Then("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}
	
	
	


}
