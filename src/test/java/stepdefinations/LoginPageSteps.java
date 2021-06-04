package stepdefinations;

import org.junit.Assert;

import base.BasePage;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageSteps {
	
	private HomePage homePage = new HomePage(BasePage.getDriver());
	private LoginPage loginPage;
	private String LoginPageTitle;
	
	

@Given("user is application home page")
public void user_is_application_home_page() {
   BasePage.getDriver().get("https://demo.nopcommerce.com/");
}

@Given("user is navigated to login page")
public void user_is_navigated_to_login_page() {
  loginPage = homePage.gotoLoginPage();

}

@When("user get the login page title")
public void user_get_the_login_page_title() {
  LoginPageTitle =loginPage.getLoginPageName();
}
@Then("login page title should be {string}")
public void login_page_title_should_be(String pageTitle) {
	
    Assert.assertEquals(pageTitle, LoginPageTitle);
}



@Then("login button should present on the page")
public void login_button_should_present_on_the_page() {
    
}



@Then("register button should present on the page")
public void register_button_should_present_on_the_page() {
    
}

}
