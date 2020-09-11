package resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;


	@BeforeClass(alwaysRun = true)
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		switch (browserName) {

			case "chrome":
				System.setProperty("webdriver.chrome.driver", "driver/chromedriver 8");
				driver = new ChromeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
				driver = new FirefoxDriver();
				break;

			case "IE":
				System.setProperty("webdriver.chrome.driver", "driver/IEdriver");
				driver = new InternetExplorerDriver();
				break;

			default:
				throw new IllegalStateException("Unexpected value:");

		}

		driver.navigate()
				.to(prop.getProperty("url"));
		driver.manage()
				.window()
				.maximize();
		driver.manage()
				.timeouts()
				.implicitlyWait(10, TimeUnit.SECONDS);
		return driver;


	}

	@AfterClass(alwaysRun = true)
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screenshot/" + result + "screenshot.png"));

	}


}
