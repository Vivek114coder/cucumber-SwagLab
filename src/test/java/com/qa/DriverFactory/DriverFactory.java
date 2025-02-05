package com.qa.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
public static WebDriver driver;

public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
public WebDriver init_driver(String browser) {
        
	    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		tlDriver.set(new ChromeDriver());  
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
       
}

public static synchronized WebDriver getDriver() {
	
return tlDriver.get();
    
}



}
