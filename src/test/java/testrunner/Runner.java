 package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./CucumberAutomationFrameWork/src/features/LoginPage.feature",
		glue = {"stepdefinations","cucumberhooks"},
		
		plugin = {"pretty"},
		monochrome = true,
		dryRun = false                   
		
		)


public class Runner {

}
