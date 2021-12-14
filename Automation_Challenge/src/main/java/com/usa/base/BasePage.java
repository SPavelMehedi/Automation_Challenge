package com.usa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasePage {
	
	public static Logger logger;
	public static WebDriver driver;
	public static Properties prop;

	public BasePage() {
		logger = Logger.getLogger("QA Pavel"); // Added logger
		PropertyConfigurator.configure("Log4j.properties");// Added logger

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/usa/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally { // Must executed
			System.out.println("The finally statement is executed file not found");
		}

	}

	public static void initialization() { // setUP();
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			logger.info("******** I am a chrome browser*********");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("windows"));
			driver = new ChromeDriver();

		} else if (browserName.equals("chrome")) {
			logger.info("******** I am a chrome browser*********");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("windows"));
			driver = new ChromeDriver();

		}

		else if (browserName.equals("headless")) {
			logger.info("******** I am a headless mode chrome browser*********");
			String chromeDriverPath = prop.getProperty("windows");
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
					"--ignore-certificate-errors", "--silent");
			driver = new ChromeDriver(options);

		} else if (browserName.equals("ie")) {
			logger.info("******** I am a ie browser*********");
			System.setProperty("webdriver.ie.driver", prop.getProperty("windows"));
			driver = new InternetExplorerDriver();

		} else if (browserName.equals("edge")) {
			logger.info("******** I am a edge browser*********");
			System.setProperty("webdriver.edge.driver", prop.getProperty("windows"));
			driver = new EdgeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", prop.getProperty("windows"));
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("safari")) {
			System.setProperty("webdriver.safari.driver", prop.getProperty("windows"));
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}


}
