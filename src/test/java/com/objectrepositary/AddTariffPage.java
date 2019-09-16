package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibraryNew;

public class AddTariffPage extends FunctionalLibraryNew {

	public AddTariffPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="rental1")
	private WebElement rent;
	
	@FindBy(id="local_minutes")
	private WebElement local;
	
	@FindBy(id="inter_minutes")
	private WebElement inter;
	
	@FindBy(id="sms_pack")
	private WebElement sms;
	
	@FindBy(id="minutes_charges")
	private WebElement min;
	
	@FindBy(id="inter_charges")
	private WebElement charge;
	
	@FindBy(id="sms_charges")
	private WebElement smscharge;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;

	public WebElement getRent() {
		return rent;
	}

	public WebElement getLocal() {
		return local;
	}

	public WebElement getInter() {
		return inter;
	}

	public WebElement getSms() {
		return sms;
	}

	public WebElement getMin() {
		return min;
	}

	public WebElement getCharge() {
		return charge;
	}

	
	
	public WebElement getSmscharge() {
		return smscharge;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	
}
