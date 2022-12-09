package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ArmadaConstant.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	// public static WebDriver driver; static WebDriver is not used in case of
	// parallel execution
	public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public void setDriver(WebDriver driver) {
		this.driver.set(driver);

	}

	public WebDriver getDriver() {
		return driver.get();
	}

	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			setDriver(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			setDriver(new InternetExplorerDriver());
		}

		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			setDriver(new EdgeDriver());
		}

		getDriver().manage().window().maximize();
		getDriver().get(Constant.URL);

		System.out.println("Browser setup is completed");
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			getDriver().quit();
		}

	}
}
