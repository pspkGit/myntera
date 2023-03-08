package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static WebDriver driver;
	public static Properties configs;

	public static void configFileInitialize() {
		configs = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
			configs.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialize() {
		configFileInitialize();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(configs.getProperty("URL"));
	}

}
