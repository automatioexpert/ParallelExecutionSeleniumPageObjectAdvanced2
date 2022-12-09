package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPage {

	private WebDriver driver;

	public CheckOutStepTwoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	@FindBy(name = "finish")
	private WebElement finishBtn;

	public CheckoutCompletePage getFinishButton() {
		finishBtn.click();
		return new CheckoutCompletePage(driver);
	}

	
}
