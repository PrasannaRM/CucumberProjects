package org.runnerclass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DetailPage {
	
	static WebDriver driver;
	
	@Given("User is on demo telecom site")
	public void user_is_on_demo_telecom_site() {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna RM\\eclipse-workspace\\CucumberDemo\\Driver\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/telecom/index.html");
		
	}

	@When("User enter to add customer")
	public void user_enter_to_add_customer() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("Fill all the details in that page")
	public void fill_all_the_details_in_that_page() {

		driver.findElement(By.xpath("//label[text()='Done']")).click();
		
		driver.findElement(By.id("fname")).sendKeys("Prasanna");
		
		driver.findElement(By.id("lname")).sendKeys("Mothilal");
		
		driver.findElement(By.id("email")).sendKeys("p@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9876543210");
			
		
		
	}

	@When("Click the submit button")
	public void click_the_submit_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User getting the custumer code")
	public void user_getting_the_custumer_code() {
		
		Assert.assertTrue(driver.findElement(By.id("(//td[@align='center'])[1]")).isDisplayed());
	    
	}


}
