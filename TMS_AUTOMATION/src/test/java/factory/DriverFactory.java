package factory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver;

	public static void invokeBrowser(String browserName) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		File name = new File("C:\\Users\\a\\Downloads\\Buster-Captcha.crx");
		options.addExtensions(name);
		options.addArguments("--disable-blink-features=AutomationControlled");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("fireFox")) {
			driver = new FirefoxDriver();
		}
	}

	public static WebDriver getdriver() {
		return driver;
	}
}
