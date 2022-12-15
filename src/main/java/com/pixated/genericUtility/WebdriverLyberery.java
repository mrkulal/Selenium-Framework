package com.pixated.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverLyberery {
	public WebDriver LanchApplication(String browser,long timeout,String url) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			BaseClass1.Sdriver=driver;
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			BaseClass1.Sdriver=driver;
		}
		else {
			System.out.println("plese enter valid broser name");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

}
