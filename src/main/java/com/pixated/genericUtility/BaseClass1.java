package com.pixated.genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pixated.OjectReposaty.CommonDataPage;
import com.pixated.OjectReposaty.HomePage;
import com.pixated.OjectReposaty.LoginPage;
import com.pixated.OjectReposaty.PhotoModulePage;
import com.pixated.OjectReposaty.ProfilePage;
import com.pixated.OjectReposaty.Uploadstatus;

public class BaseClass1 {
	protected WebdriverLyberery wl;
	protected PropertyFileLybrery pf;
	protected ExcelUtility ex;
	protected WebDriver driver;
	protected static WebDriver Sdriver;
	protected String browser;
	protected long longTimeout;
	protected String url;
	protected String email;
	protected String psw;

	protected LoginPage login;
	protected CommonDataPage da;
	protected HomePage hp;
	protected ProfilePage ns;
	protected Uploadstatus uploadstatus;
	protected PhotoModulePage ph;
	@BeforeClass

	public void configBC() 
	{

		
		pf=new PropertyFileLybrery();
		ex=new ExcelUtility();
		wl=new WebdriverLyberery();
		ThreadSafe.setWebdriverLyberery(wl);

		browser = pf.getDataFromPropetryFile(iConstantPath.PROPERTY_FILE_PATH, PropertyFilekeys.BROWSER.convertToString());
		String timeout = pf.getDataFromPropetryFile(iConstantPath.PROPERTY_FILE_PATH, PropertyFilekeys.TIMEOUT.convertToString());
		longTimeout = Long.parseLong(timeout);
		url = pf.getDataFromPropetryFile(iConstantPath.PROPERTY_FILE_PATH, PropertyFilekeys.URL.convertToString());
		driver = wl.LanchApplication(browser, longTimeout, url);
	}
	@BeforeMethod
	public void configBM() {
		email = pf.getDataFromPropetryFile(iConstantPath.PROPERTY_FILE_PATH, PropertyFilekeys.EMAIL.convertToString());
		psw = pf.getDataFromPropetryFile(iConstantPath.PROPERTY_FILE_PATH, PropertyFilekeys.PSW.convertToString());



		login=new LoginPage(driver);
		da=new CommonDataPage(driver);
		ph=new PhotoModulePage (driver);
		hp=new HomePage(driver);
		ns= new ProfilePage(driver);
		uploadstatus=new Uploadstatus(driver);


	}
	@AfterMethod
	public void configAC() {
		pf.closePropetryFile();
		ex.closeExcel();
		driver.close();
	}
}


