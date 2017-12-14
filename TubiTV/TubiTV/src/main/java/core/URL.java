package core;
import org.apache.bcel.generic.Select;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;
public class URL {
	static WebDriver driver;
	
	public static void URLs() {
		WebDriverWait wait = new WebDriverWait (driver,15);
	 String friends = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div[5]/div/div[5]"))).getText();
  
}}

	
	
	
	
