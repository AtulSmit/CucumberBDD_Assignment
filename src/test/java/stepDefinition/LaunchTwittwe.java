package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchTwittwe {
	WebDriver driver;
	
		@Given("Twitter website is launched enter username")
	public void twitter_website_is_launched_enter_username() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver = new ChromeDriver();
	    driver.get("https://twitter.com/i/flow/login");
	}

	@When("enter password")
	public void enter_password() {
//		driver.findElement(By.cssSelector("div(class=[css-901oao r-1awozwy r-6koalj r-37j5jr r-1inkyih r-16dba41 r-135wba7 r-bcqeeo r-13qz1uu r-qvutc0])"));
//		driver.findElement(By.tagName("input")).sendKeys("8421002302");
//	    
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/label[1]/div[1]/div[2]/div[1]"));
	    
	    
	    
	    
	}

	@Then("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
		
		

}
