package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static WebDriver setup() {
		ConfigsClass.readProperties(
				System.getProperty("user.dir") + "/src/test/resources/Configs/congifuration.properties");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		String headless = ConfigsClass.getProperty("headless");

		switch (ConfigsClass.getProperty("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions = new ChromeOptions();
			if (headless.equalsIgnoreCase("true")) {
				cOptions.setHeadless(true);
				driver = new ChromeDriver(cOptions);
			} else {
				driver = new ChromeDriver(cOptions);
			}

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			throw new RuntimeException("Browser is not found or not supported");
		}

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		    driver.manage().window().maximize();
		driver.get(ConfigsClass.getProperty("url"));
		return driver;

	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
