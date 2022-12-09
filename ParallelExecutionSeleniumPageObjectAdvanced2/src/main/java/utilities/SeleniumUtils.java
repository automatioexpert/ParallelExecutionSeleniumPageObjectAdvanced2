package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

	private WebDriver driver;

	public SeleniumUtils(WebDriver driver) {

		this.driver = driver;
	}

	// Click method

	public void click(String locator) {

		driver.findElement(By.xpath(locator)).click();

	}

	// Sendkeys method

	public void sendKeys(String locator, String value) {

		driver.findElement(By.xpath(locator)).sendKeys(value);

	}
	
	//Get Text
	
	public String getText(String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}

}
