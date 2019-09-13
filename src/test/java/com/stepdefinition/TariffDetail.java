package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.sl.In;
import io.cucumber.datatable.DataTable;

public class TariffDetail {

	static WebDriver driver;
	
	@Given("User should be in home page")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanna RM\\eclipse-workspace\\CucumberDemo\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("User click on add tariff plan page")
	public void user_click_on_add_tariff_plan_page() {
	    
		 driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		
	}

	@When("User enter all the details from tariff plan page")
	public void user_enter_all_the_details_from_tariff_plan_page() {
		
		
		driver.findElement(By.id("rental1")).sendKeys("15000");
		
		driver.findElement(By.id("local_minutes")).sendKeys("123");
		
		driver.findElement(By.id("inter_minutes")).sendKeys("456");
		
		driver.findElement(By.id("sms_pack")).sendKeys("78");
		
		driver.findElement(By.id("minutes_charges")).sendKeys("130");
		
		//id=inter_charges;
		
		driver.findElement(By.id("inter_charges")).sendKeys("96");
		
		driver.findElement(By.id("sms_charges")).sendKeys("130");
		

	    
	}
	
	@When("User enter all the detail from tariff plan page")
	public void user_enter_all_the_detail_from_tariff_plan_page(DataTable trarifPlan) {
		
		List<List<String>> da =  trarifPlan.asLists(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(da.get(0).get(0));
		
		driver.findElement(By.id("local_minutes")).sendKeys(da.get(0).get(1));
		
		driver.findElement(By.id("inter_minutes")).sendKeys(da.get(0).get(2));
		
		driver.findElement(By.id("sms_pack")).sendKeys(da.get(0).get(3));
		
		driver.findElement(By.id("minutes_charges")).sendKeys(da.get(0).get(4));
		
		driver.findElement(By.id("inter_charges")).sendKeys(da.get(0).get(5));
		
		driver.findElement(By.id("sms_charges")).sendKeys(da.get(0).get(6));
		
	    
	}

	@When("User enter all the detailss from tariff plan page")
	public void user_enter_all_the_detailss_from_tariff_plan_page(DataTable trarifPlann) {
		
		List<Map<String, String>> data =  trarifPlann.asMaps(String.class,String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(data.get(0).get("rent"));
		
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(0).get("mins"));
		
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(0).get("Inter"));
		
		driver.findElement(By.id("sms_pack")).sendKeys(data.get(0).get("sms"));
		
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(0).get("local"));
		
		driver.findElement(By.id("inter_charges")).sendKeys(data.get(0).get("inters"));
		
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(0).get("charge"));
	    
		
	}
	
	@When("User enter all the detailss from tariff plan page {string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_all_the_detailss_from_tariff_plan_page(String rent, String mins, String Inter, String sms, String local, String inters, String charge) {
	    
		driver.findElement(By.id("rental1")).sendKeys(rent);
		
		driver.findElement(By.id("local_minutes")).sendKeys(mins);
		
		driver.findElement(By.id("inter_minutes")).sendKeys(Inter);
		
		driver.findElement(By.id("sms_pack")).sendKeys(sms);
		
		driver.findElement(By.id("minutes_charges")).sendKeys(local);
		
		driver.findElement(By.id("inter_charges")).sendKeys(inters);
		
		driver.findElement(By.id("sms_charges")).sendKeys(charge);
		
	}


	@When("user click the submit button")
	public void user_click_the_submit_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
	    
	}

	@Then("User getting the message")
	public void user_getting_the_message() {
	   
	}


	
}
