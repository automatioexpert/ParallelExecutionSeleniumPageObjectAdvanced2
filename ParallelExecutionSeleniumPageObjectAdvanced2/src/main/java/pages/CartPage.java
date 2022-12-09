package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	private WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button.btn.btn_action.btn_medium.checkout_button")
	private WebElement checkOutButton;

	public CheckOutStepOnePage getCheckButton() {
		checkOutButton.click();
		return new CheckOutStepOnePage(driver);
	}
	
	
	

}
