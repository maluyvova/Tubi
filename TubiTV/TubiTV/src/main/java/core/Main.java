package core;
import org.apache.bcel.generic.Select;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;
public class Main {
	static WebDriver driver;
	WebDriverWait wait = new WebDriverWait (driver,15);
	public  static void main(String args[]) throws InterruptedException {
    Main.FireFox();
    Main.TestCase01_17
    ();
	
		
	}
		
		
	/*public static void URL() throws InterruptedException {
	Main.FireFox();
	Thread.sleep(4000);
	WebDriverWait wait = new WebDriverWait (driver,15);
	String v=driver.getCurrentUrl();
	System.out.println(v);
	*/
		
		
		
		

		public static void FireFox() {
			String Url = "https://tubitv.com";
			Logger.getLogger("").setLevel(Level.OFF);
			
		       String driverPath=""; 
		        if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/geckodriver.sh";
		        else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Url);
	}
		
		
		
		
		
		public static void TestCase01_0() {
			String expectedResult=driver.getCurrentUrl(); 
			System.out.println(expectedResult);
			
		}
		
		
		
		
		
		
		
		
		
		public static void TestCase01_02() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait (driver,15);
			String name = "Vlad";
			String lastname="Anthon";
			String email="loh@amail.club";
			String password="1234567";
			String Month = "02";
			String Day = "01";
			String Year = "1989";
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gender"))).click(); !! How to choose gender
			Thread.sleep(4000);
			String expected_result =driver.getCurrentUrl();
			System.out.println(expected_result);}

			
		
		public static void TestCase1_02_1() {}
		
		
		
		
		
		
			public static void TestCase01_03() throws InterruptedException {
				WebDriverWait wait = new WebDriverWait (driver,15);
				String name = "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv";
				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
				String expected_result=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[1]"))).getText();
				
				System.out.println(expected_result);}
			
			
			
			
			
			
			
			
				public static void TestCase01_04() throws InterruptedException {
					WebDriverWait wait = new WebDriverWait (driver,15);
					String name = "Vlad";
					String lastname="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
					
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
					String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[2]"))).getText();
					String expected_result =driver.getCurrentUrl();
					System.out.println(expected_result);
					System.out.println(expected_result1);
				}
					
					
					
					
					

				
				
					public static void TestCase01_05() throws InterruptedException {
						WebDriverWait wait = new WebDriverWait (driver,15);
						String name = "Vlad";
						String lastname="Anthon";
						String email="v.com";
						String password="1234567";
						String Month = "02";
						String Day = "01";
						String Year = "1989";
						
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
						Thread.sleep(4000);
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).click();
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
						String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[3]"))).getText();
						Thread.sleep(4000);
						String expected_result =driver.getCurrentUrl();
						System.out.println(expected_result);
						System.out.println(expected_result1);}


					
						
						
						public static void TestCase01_06() throws InterruptedException {
							WebDriverWait wait = new WebDriverWait (driver,15);
							String name = "Vlad";
							String lastname="Anthon";
							String email="@f.com";
							String password="1234567";
							String Month = "02";
							String Day = "01";
							String Year = "1989";
							
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
							Thread.sleep(4000);
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).click();
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
							String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[3]"))).getText();
							Thread.sleep(4000);
							String expected_result =driver.getCurrentUrl();
							System.out.println(expected_result);
							System.out.println(expected_result1);}


							
							

							public static void TestCase01_07 () throws InterruptedException {
								WebDriverWait wait = new WebDriverWait (driver,15);
								String name = "Vlad";
								String lastname="Anthon";
								String email="@.com";
								String password="1234567";
								String Month = "02";
								String Day = "01";
								String Year = "1989";
								
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								Thread.sleep(4000);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[3]"))).getText();
								Thread.sleep(4000);
								String expected_result =driver.getCurrentUrl();
								System.out.println(expected_result);
								System.out.println(expected_result1);}
							
							
							
							
							
							
							public static void TestCase01_08 () throws InterruptedException {
								WebDriverWait wait = new WebDriverWait (driver,15);
								String name = "Vlad";
								String lastname="Anthon";
								String email="vburian@tubi.tv";
								String password="1234567";
								String Month = "02";
								String Day = "01";
								String Year = "1989";
								
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								Thread.sleep(4000);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]"))).getText();
								Thread.sleep(4000);
								String expected_result =driver.getCurrentUrl();
								System.out.println(expected_result);
								System.out.println(expected_result1);}
							
							
							
							public static void TestCase01_09 () throws InterruptedException {
								WebDriverWait wait = new WebDriverWait (driver,15);
								String name = "Vlad";
								String lastname="Anthon";
								String email="vb@amail.club";
								String password="123";
								String Month = "02";
								String Day = "01";
								String Year = "1989";
								
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								Thread.sleep(4000);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]"))).getText();
								Thread.sleep(4000);
								String expected_result =driver.getCurrentUrl();
								System.out.println(expected_result);
								System.out.println(expected_result1);}
							
			

								
								
								
								
								public static void TestCase01_10 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="1111111111111111111111111111111111";
									String Month = "02";
									String Day = "01";
									String Year = "1989";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]"))).getText();
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);}
								
								
								
								public static void TestCase01_11 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="Hello";
									String password1="1234";
									String Month = "02";
									String Day = "01";
									String Year = "1989";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password1);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[4]"))).getText();
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);}
								
								
								

								public static void TestCase01_12 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="HelloM";
									String password1="HelloM";
									String Month = "22";
									String Day = "01";
									String Year = "1989";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password1);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]"))).getText();
									String expected_result2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).getText();
									
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);
									System.out.println(expected_result2);
									}
								
								
								
								public static void TestCase01_13 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="HelloM";
									String password1="HelloM";
									String Month = "02";
									String Day = "35";
									String Year = "1989";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password1);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).getText();
									String expected_result2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]"))).getText();
									
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);
									System.out.println(expected_result2);}
						
								
								
								public static void TestCase01_14 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="HelloM";
									String password1="HelloM";
									String Month = "02";
									String Day = "25";
									String Year = "2020";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password1);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).getText();
									
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);
								}
						
									
								public static void TestCase01_15 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									String name = "Vlad";
									String lastname="Anthon";
									String email="vb@amail.club";
									String password="HelloM";
									String password1="HelloM";
									String Month = "02";
									String Day = "25";
									String Year = "3567";
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password1);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									Thread.sleep(4000);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									String expected_result1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]"))).getText();
									
									Thread.sleep(4000);
									String expected_result =driver.getCurrentUrl();
									System.out.println(expected_result);
									System.out.println(expected_result1);
									}
									
								
								public static void TestCase01_16 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
								String name = "Vlad";
								String lastname="Anthon";
								String email="mova@amail.club";
								String password="1234567";
								String Month = "02";
								String Day = "01";
								String Year = "1989";
								
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys(Month);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys(Day);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys(Year);
								wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
								//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gender"))).click(); !! How to choose gender
								Thread.sleep(4000);
								String expected_result =driver.getCurrentUrl();
								System.out.println(expected_result);}
							
								
								
								
								
								public static void TestCase01_17 () throws InterruptedException{
									WebDriverWait wait = new WebDriverWait(driver,15);
									String email = "vburian@tubi.tv";
									String password = "tubitv";
									
									
						
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/header/div/div[2]/div/ul/li[1]/a/button/div[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/a/button"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginbutton"))).click();
									Thread.sleep(4000);
									String expected_result= driver.getCurrentUrl();
									System.out.println(expected_result);
								
								
								}
								
								
								
								
								
								
								
								
								
								
								/*	public static void TestCase16 () throws InterruptedException {
									WebDriverWait wait = new WebDriverWait (driver,15);
									
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/ul/li[1]/a/button"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/form/div[4]/p/a[2]"))).click();
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[1]/input"))).sendKeys(name);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[2]/input"))).sendKeys(lastname);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[3]/input"))).sendKeys(email);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[4]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[5]/input"))).sendKeys(password);
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[1]/input"))).sendKeys("03");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[2]/input"))).sendKeys("03");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div/div/form/div[6]/div[1]/div[3]/input"))).sendKeys("1983");
									wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div/div/form/div[7]/button"))).click();
									//System.out.println(expected_result+" "+expected_result2);
									String expected_result=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/header/div/div[2]/div/div/div[1]/span"))).getText();
									System.out.println(expected_result);
		*/




}
		
		
	