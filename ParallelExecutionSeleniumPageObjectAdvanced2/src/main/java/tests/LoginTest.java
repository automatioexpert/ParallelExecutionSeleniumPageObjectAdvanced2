package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase {
	public LoginPage loginPage;

	@BeforeClass
	public void classSetUp() {
		loginPage = new LoginPage(getDriver());
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
		
	}
 */
}
