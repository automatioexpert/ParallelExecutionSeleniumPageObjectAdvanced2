package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	/*
	 * getDriver().findElement(By.cssSelector("input#user-name")).sendKeys(
	 * "standard_user");
	 * getDriver().findElement(By.cssSelector("input#password")).sendKeys(
	 * "secret_sauce"); getDriver().findElement(By.name("login-button")).click();
	 * Thread.sleep(3000); String expectedText = "PRODUCTS"; String actualText =
	 * getDriver().findElement(By.cssSelector("span.title")).getText();
	 */

	@FindBy(css = "input#user-name")
	private WebElement username;

	@FindBy(css = "input#password")
	private WebElement password;

	@FindBy(name = "login-button")
	private WebElement loginBtn;

	// Get all the Web Elements

	public WebElement getUserName() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public InventoryPage getLoginButton() {
		loginBtn.click();
		return new InventoryPage(driver);
	}

}
