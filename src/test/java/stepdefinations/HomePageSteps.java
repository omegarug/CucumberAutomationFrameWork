package stepdefinations;

import java.util.Properties;

import org.testng.Assert;

import base.BasePage;
import io.cucumber.java.en.*;
import pages.HomePage;

// instead of having homepage test class we have homepagesteps class to test homepage with cucumber frame work//

public class HomePageSteps {
	private Properties prop;
	private HomePage homePage;
	private static String title;

	@Given("user is on home page")
	public void user_is_on_home_page() {

		BasePage.getDriver().get("https://demo.nopcommerce.com/");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = homePage.getPageTitle();

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String pageTitle) {

		Assert.assertEquals(pageTitle, title);

	}

	@Then("logo should present on the page")
	public void logo_should_present_on_the_page() {
		Assert.assertTrue(homePage.verifyPageLogo());

	}

	@Then("register link should be displayed")
	public void register_link_should_be_displayed() {

		Assert.assertTrue(homePage.verifyRegisterLink());
	}

	@Then("login link should be displayed")
	public void login_link_should_be_displayed() {
		Assert.assertTrue(homePage.verifyLoginLink());

	}
}