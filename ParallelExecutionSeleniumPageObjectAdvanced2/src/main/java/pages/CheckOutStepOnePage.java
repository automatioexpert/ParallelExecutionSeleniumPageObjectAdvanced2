package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage {

	private WebDriver driver;

	public CheckOutStepOnePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input#first-name")
	private WebElement firstName;

	@FindBy(css = "input#last-name")
	private WebElement lastName;

	@FindBy(css = "input#postal-code")
	private WebElement postalCode;

	@FindBy(css = "#continue")
	private WebElement continueBtn;

	public void enterCustomerDetails(String fName, String lName, String pCode) {

		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		postalCode.sendKeys(pCode);
		System.out.println("enterCustomerDetails enterered : fName: " + fName + " lName: " + lName + " pCode:" + pCode);

	}

	public CheckOutStepTwoPage getContinueBtn() {
		continueBtn.click();
		return new CheckOutStepTwoPage(driver);
	}
	
	
	
}
