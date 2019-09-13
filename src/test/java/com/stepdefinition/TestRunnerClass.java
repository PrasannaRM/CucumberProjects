package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature"},
                     glue = {"com.stepdefinition"},
                     plugin= {"html:target","rerun:src/test/resources/failed.txt"},
                     dryRun=false,
                     monochrome=true,
                     tags= {"@smoke"}
                     )
public class TestRunnerClass {

	
	
}
