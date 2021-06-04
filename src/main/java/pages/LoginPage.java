package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By loginPageName = By.xpath("//div[@class='page-title']/h1");
	private By loginButton = By.xpath("//input[contains(@value,'Log in')]");
	private By registerButton = By.xpath("//input[contains(@value,'Register')]");
	
	public String getLoginPageName() {
		return driver.findElement(loginPageName).getText();
	}
	public boolean verifyLoginButton() {
		return driver.findElement(loginButton).isDisplayed();
	}
	public boolean verifyRegisterButton() {
		return driver.findElement(registerButton).isDisplayed();
	}

}
