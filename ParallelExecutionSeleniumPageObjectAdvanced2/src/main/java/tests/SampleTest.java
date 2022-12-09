package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class SampleTest extends TestBase {

	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		getDriver().findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		getDriver().findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		getDriver().findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		String expectedText = "PRODUCTS";
		String actualText = getDriver().findElement(By.cssSelector("span.title")).getText();
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Login Test Passed");

	}

	@Test(priority = 1)
	public void addProductTillCheckOutTest() {

		getDriver().findElement(By.cssSelector("button#add-to-cart-sauce-labs-onesie")).click();
		getDriver().findElement(By.cssSelector("a.shopping_cart_link")).click();
		getDriver().findElement(By.cssSelector("button[name='checkout']")).click();
		getDriver().findElement(By.cssSelector("input#first-name")).sendKeys("St Simon 433479374");
		getDriver().findElement(By.cssSelector("input[name='lastName']")).sendKeys("smith34893473");
		getDriver().findElement(By.cssSelector("input[name='postalCode']")).sendKeys("34839374734");
		getDriver().findElement(By.cssSelector("input[name='continue']")).click();
		getDriver().findElement(By.cssSelector("button#finish")).click();
		System.out.println(getDriver().findElement(By.cssSelector("span.title")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("h2.complete-header")).getText());

		System.out.println("addProductTillCheckOutTest Passed");
	}

}
