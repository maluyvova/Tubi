package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
	static WebDriver driver;

	public static void Chrome()  {
		Logger logger = Logger.getLogger("");
			logger.setLevel(Level.OFF);
			//String url = "http://tubitv.com";
			String driverPath = "";
			String Url = "tubitv.com";

			     if (System.getProperty("os.name").toUpperCase().contains("MAC"))      driverPath = "./resources/webdrivers/mac/chromedriver";
			else throw new IllegalArgumentException("Unknown OS");
				
				System.setProperty("webdriver.chrome.driver", driverPath);
				System.setProperty("webdriver.chrome.silentOutput", "true");
				ChromeOptions option = new ChromeOptions();
				option.addArguments("disable-infobars"); 
				option.addArguments("--disable-notifications");
				if (System.getProperty("os.name").toUpperCase().contains("MAC"))
					option.addArguments("-start-fullscreen");
				else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
					option.addArguments("--start-maximized");
				else throw new IllegalArgumentException("Unknown OS");
				driver = new ChromeDriver(option);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get(Url);
}

	/*public static void FireFox() {
		String Url = "https://tubitv.com";
		Logger.getLogger("").setLevel(Level.OFF);
		
	       String driverPath=""; 
	        if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/geckodriver.sh";
	        else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);*/
	
	public static void Safari () {
		String Url = "https://tubitv.com";
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
		
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
	
	
	
}
	
	
	
	
	
	