package stepDefinition;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumProject {
	WebDriver driver;

@Given("elearning page")
public void elearning_page() {
	
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://elearningm1.upskills.in/"); //load url
	
	driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click(); //click on sign up
	
	driver.findElement(By.name("firstname")).sendKeys("abc");//enter firstname
	driver.findElement(By.name("lastname")).sendKeys("pqr");//enter lastname
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com"); //enter email if 
	driver.findElement(By.id("username")).sendKeys("shingvimayuri2302"); //enter username 
	driver.findElement(By.id("pass1")).sendKeys("password");//enter password
	driver.findElement(By.id("pass2")).sendKeys("password");//enter confirm password
	driver.findElement(By.name("submit")).click();
		
}

@When("susccessfull registration")
public void susccessfull_registration() {

	WebElement isVisible = driver.findElement(By.xpath("//fieldset//button[contains(text(),'Next')]"));//click on Next button
	System.out.println(isVisible.isDisplayed());//check if button is present
	isVisible.click();
	
	driver.findElement(By.xpath("//nav[@class=\"navbar navbar-default\"]//a[@class=\"dropdown-toggle\"]")).click();//click on profile
	driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='page-wrap']/div[@id='top_main_content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();//click on Message
	
	driver.findElement(By.xpath("//body/div[@id='page-wrap']/div[@id='top_main_content']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();//click on compose email

}

@Then("send an email")
public void send_an_email() {
driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")).sendKeys("testName testName2");//sendto field
	
	driver.findElement(By.xpath("//body/div[@id='page-wrap']/div[@id='top_main_content']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/input[1]")).sendKeys("Imp mail");//subject feild
	
	driver.switchTo().frame(0);//switch to frame 0
	driver.findElement(By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]//p")).click();//message body
	driver.findElement(By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]//p")).sendKeys("Message body");

	driver. switchTo(). defaultContent();// switch to default content
	driver.findElement(By.cssSelector("body.section-social-network:nth-child(2) div.container:nth-child(3) div.row div.col-xs-12.col-md-12 div.row:nth-child(2) div.col-md-9 div.row div.col-md-12:nth-child(2) form.form-horizontal fieldset:nth-child(1) div.form-group:nth-child(6) div.col-sm-8:nth-child(2) > button.btn.btn-primary")).click();//send button
}

}
