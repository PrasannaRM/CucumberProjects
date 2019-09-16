package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepositary.AddCustomerPage;
import com.objectrepositary.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DetailPage extends FunctionalLibrary {
	
//	static WebDriver driver;
//	
	@Given("User is on demo telecom site")
	public void user_is_on_demo_telecom_site() {
	 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna RM\\eclipse-workspace\\CucumberDemo\\Driver\\chromedriver.exe");
//	
//		driver = new ChromeDriver();
//		
//		driver.get("http://demo.guru99.com/telecom/index.html");
		
	}

	@When("User enter to add customer")
	public void user_enter_to_add_customer() {
	    HomePage page = new HomePage();
	    button(page.getAddcustomer());
	}

	@When("Fill all the details in that page")
	public void fill_all_the_details_in_that_page() {
		
		AddCustomerPage page = new AddCustomerPage();
		
		button(page.getDoneButton());
		type(page.getFirstName(), "Prasanna");
		type(page.getLastName(), "Mothilal");
		type(page.getMail(), "p@gmail.com");
		type(page.getAddress(), "madurai");
		type(page.getPhno(), "9638527410");
		
		
		
		

//		driver.findElement(By.xpath("//label[text()='Done']")).click();
//		
//		driver.findElement(By.id("fname")).sendKeys("Prasanna");
//		
//		driver.findElement(By.id("lname")).sendKeys("Mothilal");
//		
//		driver.findElement(By.id("email")).sendKeys("p@gmail.com");
//		
//		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("chennai");
//		
//		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9876543210");
			
		
		
	}
	
	@When("Fill all the details into that page")
	public void fill_all_the_details_into_that_page(DataTable customerDetails) {
		
		List<String> datas = customerDetails.asList(String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(datas.get(3));
		
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get(4));
	   
	}
	
	@When("Fill all the detailss into that page")
	public void fill_all_the_detailss_into_that_page(DataTable customerDetailMap) {
		
		Map<String,String> datas = customerDetailMap.asMap(String.class, String.class);
		
driver.findElement(By.xpath("//label[text()='Done']")).click();
		
		driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		
		driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		
		driver.findElement(By.id("email")).sendKeys(datas.get("email"));
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(datas.get("addr"));
		
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get("phone"));
		
		
	    
	}


	@When("Click the submit button")
	public void click_the_submit_button() {
		
		AddCustomerPage page = new AddCustomerPage();
		button(page.getSubmitButton());
	    
	}

	@Then("User getting the custumer code")
	public void user_getting_the_custumer_code() {
		
		WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		
		Assert.assertTrue(customerId.isDisplayed());
	    
	}


}
