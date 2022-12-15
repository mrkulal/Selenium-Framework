package com.pixated.testcase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pixated.OjectReposaty.CommonDataPage;
import com.pixated.OjectReposaty.LoginPage;
import com.pixated.OjectReposaty.ProfilePage;
import com.pixated.genericUtility.BaseClass1;
import com.pixated.genericUtility.ExcelSheetName;
import com.pixated.genericUtility.ExcelUtility;
import com.pixated.genericUtility.PropertyFileLybrery;
import com.pixated.genericUtility.PropertyFilekeys;
import com.pixated.genericUtility.WebdriverLyberery;
import com.pixated.genericUtility.iConstantPath;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.pixated.genericUtility.LisImpClass.class)
public class EditprofileDetailsTestcase extends BaseClass1{

	@Test(retryAnalyzer  =com.pixated.genericUtility.RetryimlimcCass.class)
	public void RunAction()
	{


		String Exceptedstatusphoto = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 1);
		String Firstname = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 4, 1);
		String LastName = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 5, 1);
		String username = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 6, 1);


		login.LoginAction(email, psw);
		da.clickonProfilebutton();
		ns.UpdateProfilepic(Exceptedstatusphoto);
		da.clickonProfilebutton();
		ns.clickoneditprofilebutton();
		ns.clearfirstname();
		ns.editfirstname(Firstname);
		ns.clearlaststname();
		ns.editlastname(LastName);
		
		ns.clearusername();
		ns.editusername(username);
		ns.savebutton();
		Assert.fail();
		
		





	}



}
