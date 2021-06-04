package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By logo = By.xpath("//img[@alt='nopCommerce demo store']");
	private By registerLink = By.xpath("//a[contains(@class,'ico-register')]");
	private By loginLink = By.xpath("//a[contains(@class,'ico-login')]");
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyPageLogo() {
		return driver.findElement(logo).isDisplayed();
	}
	public boolean verifyRegisterLink() {
		return driver.findElement(registerLink).isDisplayed();
	}
	public boolean verifyLoginLink() {
		return driver.findElement(loginLink).isDisplayed();
	}
	public LoginPage gotoLoginPage() {
		driver.findElement(loginLink).click();
		return new LoginPage(driver);
	}
}
