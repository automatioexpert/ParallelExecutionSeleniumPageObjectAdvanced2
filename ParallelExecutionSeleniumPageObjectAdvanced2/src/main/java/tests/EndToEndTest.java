package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutStepOnePage;
import pages.CheckOutStepTwoPage;
import pages.CheckoutCompletePage;
import pages.InventoryPage;
import pages.LoginPage;

public class EndToEndTest extends TestBase {
	/*
	 * This test covers complete End to End test From login till CheckOut
	 */

	public LoginPage loginPage;
	public InventoryPage inventory;
	public CartPage cart;
	public CheckOutStepOnePage checkOutStepOne;
	public CheckOutStepTwoPage checkOutStepTwo;
	public CheckoutCompletePage checkOutComplete;

	@BeforeClass
	public void classSetUp() {
		loginPage = new LoginPage(getDriver());
		inventory = new InventoryPage(getDriver());
		cart = new CartPage(getDriver());
		checkOutStepOne = new CheckOutStepOnePage(getDriver());
		checkOutStepTwo = new CheckOutStepTwoPage(getDriver());
		checkOutComplete = new CheckoutCompletePage(getDriver());

	}
/*
	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		loginPage.getUserName().sendKeys("standard_user");
		loginPage.getPassword().sendKeys("secret_sauce");
		loginPage.getLoginButton().click();
		Thread.sleep(3000);

		String expectedText = "PRODUCTS";
		String actualText = getDriver().findElement(By.cssSelector("span.title")).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Login Test Passed");

	} */
	
	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		loginPage.getUserName().sendKeys("standard_user");
		loginPage.getPassword().sendKeys("secret_sauce");
		//InventoryPage inventory=loginPage.getLoginButton();
		loginPage.getLoginButton();
		Thread.sleep(3000);
		String expectedText = "PRODUCTS";
		String actualText = getDriver().findElement(By.cssSelector("span.title")).getText();
		System.out.println("Actual text is : "+actualText);
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Login Test Passed");

	}

	/*
	@Test(priority = 1)
	public void selectProductAndCheckOutTest() {
		inventory.getAddTshirtButton().click();
		CartPage cart=inventory.getGoToShoppingCartButton();
		CheckOutStepOnePage checkStep1=cart.getCheckButton();
		checkStep1.enterCustomerDetails("user47778", "Smith", "+1-12399230");
		CheckOutStepTwoPage checkStep2=checkStep1.getContinueBtn();
		CheckoutCompletePage checkOutComplete=checkStep2.getFinishButton();
		checkOutComplete.getBackToHomeButton();

		System.out.println("End to End Test Execution completed...Test Passed");
	} */


	@Test(priority = 1)
	public void selectProductAndCheckOutTest() {
		inventory.getAddTshirtButton().click();
		CheckOutStepOnePage checkStep1=inventory.getGoToShoppingCartButton().getCheckButton();
		//CheckOutStepOnePage checkStep1=cart.getCheckButton();
		checkStep1.enterCustomerDetails("user47778", "Smith", "+1-12399230");
		CheckoutCompletePage checkStep2=checkStep1.getContinueBtn().getFinishButton();
		//CheckoutCompletePage checkOutComplete=checkStep2.getFinishButton();
		checkStep2.getBackToHomeButton();

		System.out.println("End to End Test Execution completed...Test Passed");
	}
}
