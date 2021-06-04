package cucumberhooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.HomePage;
import utils.ConfigReaders;
// this is like basetest class but in bbd frame work its call Hook class//

public class Hooks {
	private BasePage basePage;
	private WebDriver driver;
	private ConfigReaders configReader;
	Properties prop;
	private HomePage homePage;
	
	@Before(order=0)
	public void getProperty() {  // this is  initilazing browser
		configReader = new ConfigReaders();
		prop = configReader.init_prop();
		
	}
	@Before(order = 1)
	public void lunchBrowser() {
	String browserType=	prop.getProperty("browser");
	basePage = new BasePage();
	driver = basePage.init_driver(browserType);
	}
	
	@After
	public void quiteBrowser() {
		driver.quit();
	}

}
