package core;
import org.apache.bcel.generic.Select;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;
public class Browsers {
	static WebDriver driver;
	String name;

	//public  static void main(String args[]) throws InterruptedException {
		//Browsers.movie();
		Browsers.registerEmail();
		//Browsers.signIn();
		//Browsers.changePassword();
		//Browsers.queue();
		//Browsers.Checker();
	}
		
		
	
	/*public static void Chrome() throws InterruptedException {
	Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		String url = "http://tubitv.com";
		String driverPath = "";


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
	         driver.get(url);		
	}
		
	public static void registerEmail() throws InterruptedException {
		Browsers.Chrome();
		WebDriverWait wait = new WebDriverWait (driver,15);
		//String url = "http://tubitv.com";
		String name = "Vova";
		String lastname="Burian";
		String email="lovae@amail.club";
		String password="vovalab";
		//driver.get(url);
		String title = driver.getTitle();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input")).sendKeys("03");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input")).sendKeys("03");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input")).sendKeys("1983");
		//driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[7]/button/div[2]")).click();
		Thread.sleep(4000);
		String expected_result =driver.getCurrentUrl();
		System.out.println(expected_result);
		//driver.close();
		}
	public static void signIn() throws InterruptedException {
		String email="lovae@amail.club";
		String password="vovalab";
		Browsers.Chrome();
		WebDriverWait wait = new WebDriverWait (driver,15);
		String url = "http://tubitv.com";
		//Thread.sleep(4000)}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/form/div[1]/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/form/div[3]/div[2]/button/div[2]")).click();
		Thread.sleep(4000);
		String expected_result=driver.getCurrentUrl();
		System.out.println(expected_result);
		
	}
	public static void movie () throws InterruptedException {
		Browsers.signIn();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/section/form/input")).sendKeys("lo");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[3]/div/div/div[1]/div/div/div[1]/div")).click();
		Thread.sleep(4000);
		String expected_result=driver.getCurrentUrl();
		System.out.println(expected_result);
		
		//*[@id="app"]/div[2]/div/div[1]/div[1]/div[2]/section/div[1]/div[2]/div/div[2]/div[2]/div[2]/span[3]/svg/path
		//*[@id="app"]/div[2]/div/div[1]/div[1]/div[2]/section/div[1]/div[2]/div/div[2]/div[2]/div[2]/span[3]/svg
	}
	public static void changePassword() throws InterruptedException {
		String password="vovalab2";
		String newp ="vovalab";
		Browsers.signIn();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[1]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[2]/input")).sendKeys(newp);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[3]/input")).sendKeys(newp);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/form/div[4]/button/div[2]")).click();
		Thread.sleep(4000);
		String expectedResult=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div")).getText();
		System.out.println(expectedResult);}
	public static void queue() throws InterruptedException {
		Browsers.signIn();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/section/form/input")).sendKeys("brooks");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div/section/div/h3/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[1]/div[3]/div/div/div/div[1]/div/div[2]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/div/div[2]/a[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]/ul/li[2]")).click();
		}
	
	public static boolean isPresent(By by) throws InterruptedException {
		Browsers.Chrome();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			if(!driver.findElements(by).isEmpty()) return true;
			else return false;}
			
	
	public static void Checker() throws InterruptedException {
		Browsers.Chrome();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[1]/div[1]/a")).click();
	
    By Tubilogo = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[1]/div[1]/a");
	/*By Company = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[1]/ul/lh");
	By Careers = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[1]/ul/li[1]/a");
	By News = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[1]/ul/li[2]");
	By Suport = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[2]/ul/lh");
	By HelpCenter = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[2]/ul/li[1]/a");
	By SupportedDevices = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[2]/ul/li[2]/a");
	By ContactSupport = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[2]/ul/li[3]/a");
	By Partners = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[3]/ul/lh");
	By AdvertiseWithUs = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[3]/ul/li[1]/a");
	By ContentPartnerships = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[3]/ul/li[2]/a");
	By Connect = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[4]/ul/lh");
	By ContactUs = By.xpath("//*[@id=\"app\"]/div[2]/div/div[5]/div/div[3]/div[4]/ul/li/a");
			
			
			System.out.println("01.Element[Tubilogo]:"+(isPresent(Tubilogo)?"Exists":"Not exists"));
			//System.out.println("02.Element[Company]:"+(isPresent(Company)?"Exists":"Not exists"));
			/*System.out.println("02.Element[Careers]:"+(isPresent(Careers)?"Exists":"Not exists"));
			System.out.println("02.Element[News]:"+(isPresent(News)?"Exists":"Not exists"));
			System.out.println("02.Element[Support]:"+(isPresent(Suport)?"Exists":"Not exists"));
			System.out.println("02.Element[helpCenter]:"+(isPresent(HelpCenter)?"Exists":"Not exists"));
			System.out.println("02.Element[ContactSupport]:"+(isPresent(ContactSupport)?"Exists":"Not exists"));
			System.out.println("02.Element[Partners]:"+(isPresent(Partners)?"Exists":"Not exists"));
			System.out.println("02.Element[AdvertiseWithUs]:"+(isPresent(AdvertiseWithUs)?"Exists":"Not exists"));
			System.out.println("02.Element[ContentPartnerships]:"+(isPresent(ContentPartnerships)?"Exists":"Not exists"));
			System.out.println("02.Element[Connect]:"+(isPresent(Connect)?"Exists":"Not exists"));
			System.out.println("02.Element[ContactUs]:"+(isPresent(ContactUs)?"Exists":"Not exists"));*/
			
		}
	
		
	}



	
	
	
	
	
	
