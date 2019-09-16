package com.stepdefinition;



import com.resources.FunctionalLibrary;
import com.resources.FunctionalLibraryNew;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibraryNew {
	
	@Before
	public void beforeBackground() {
		lunch("http://demo.guru99.com/telecom/");
		

	}
	
	@After
	public void afterScenario() {
		
		//driver.quit();

	}

}
