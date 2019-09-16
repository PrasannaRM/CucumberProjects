package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {
	
	public AddCustomerPage() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindAll({
		@FindBy(xpath="//label[text()='Done']"),
		@FindBy(id="donebtn")
	})
	private WebElement doneButton;
	
	@FindBy(id="fname")
	private WebElement firstName;
	
	@FindBy(id="lname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(xpath="//textarea[@placeholder='Enter your address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='telephoneno']")
	private WebElement phno;
	
	

	@FindBy(name="submit")
	private WebElement submitButton;

	public WebElement getDoneButton() {
		return doneButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	

}
