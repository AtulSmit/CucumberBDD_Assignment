package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFeature {
	WebDriver driver;
	
	@Given("Google website is launched")
	public void google_website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
	}

	@When("Search bar is visible")
	public void search_bar_is_visible() {
	    System.out.println(driver.findElement(By.name("q")).isDisplayed());
	}

	@Then("Search text Mayuri")
	public void search_text_Mayuri() {
		driver.findElement(By.name("q")).sendKeys("Mayuri");
	}



}
