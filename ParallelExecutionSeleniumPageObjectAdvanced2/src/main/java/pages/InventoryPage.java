package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	private WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Define all the WebElements

	@FindBy(css = "button#add-to-cart-sauce-labs-onesie")
	private WebElement addTshirt;

	@FindBy(css = "a.shopping_cart_link")
	private WebElement goToShoppingCart;

	public WebElement getAddTshirtButton() {

		return addTshirt;

	}

	public CartPage getGoToShoppingCartButton() {
		goToShoppingCart.click();
		return new CartPage(driver) ;

	}

}
