package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	private WebDriver driver;

	public CheckoutCompletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "h2.complete-header")
	private WebElement thankYouMessage;

	@FindBy(css = "button#back-to-products")
	private WebElement backToHomeBtn;

	public WebElement getThankYouMessage() {

		return thankYouMessage;
	}

	public InventoryPage getBackToHomeButton() {
		return new InventoryPage(driver);
	}

}
