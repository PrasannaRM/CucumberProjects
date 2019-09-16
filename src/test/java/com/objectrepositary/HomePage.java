package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;
import com.resources.FunctionalLibraryNew;

public class HomePage extends FunctionalLibraryNew {
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	public WebElement addCustomer;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
   	public WebElement addTariff;

	public WebElement getAddcustomer() {
		return addCustomer;
	}

	public WebElement getAddTariff() {
		return addTariff;
	}
	
	
}
