package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumProject3 {
	WebDriver driver;
	
	@Given("elearning page for registration")
	public void elearning_page_for_registration() {
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/"); //load url
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click(); //click on sign up
		
		driver.findElement(By.name("firstname")).sendKeys("abc");//enter firstname
		driver.findElement(By.name("lastname")).sendKeys("pqr");//enter lastname
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com"); //enter email if 
		driver.findElement(By.id("username")).sendKeys("usermayuri23"); //enter username 
		driver.findElement(By.id("pass1")).sendKeys("password");//enter password
		driver.findElement(By.id("pass2")).sendKeys("password");//enter confirm password
		driver.findElement(By.name("submit")).click();
			
	}
	
	
	
	@When("on susccessfull registration edit profile")
	public void on_susccessfull_registration_edit_profile() {

		WebElement isVisible = driver.findElement(By.xpath("//fieldset//button[contains(text(),'Next')]"));//click on Next button
		System.out.println(isVisible.isDisplayed());//check if button is present
		isVisible.click();
				
		driver.findElement(By.xpath("//nav[@class=\"navbar navbar-default\"]//a[@class=\"dropdown-toggle\"]")).click();//click on profile
		driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='page-wrap']/div[@id='top_main_content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();//click on edit profile
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Mayuri");//enter firstname
		
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Shingvi");//enter lastname
		
	}
	
	@Then("save settings")
	public void save_settings() {
		driver.findElement(By.xpath("//body/div[@id='page-wrap']/div[@id='top_main_content']/div[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[13]/div[1]/button[1]")).click();//Click on save save settings
	}

}
