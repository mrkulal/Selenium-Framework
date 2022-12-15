package com.pixated.testcase;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pixated.OjectReposaty.CommonDataPage;
import com.pixated.OjectReposaty.LoginPage;
import com.pixated.OjectReposaty.Uploadstatus;
import com.pixated.genericUtility.BaseClass1;
import com.pixated.genericUtility.ExcelSheetName;
import com.pixated.genericUtility.ExcelUtility;
import com.pixated.genericUtility.PropertyFileLybrery;
import com.pixated.genericUtility.PropertyFilekeys;
import com.pixated.genericUtility.WebdriverLyberery;
import com.pixated.genericUtility.iConstantPath;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PostCommentWithPhotoTestcase extends BaseClass1{
	//static WebDriver driver;
	public void Runscrpt() throws InterruptedException 

	{  



		String ExceptedstatusText = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 3, 1);
		String Exceptedstatusphoto = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 1);
		String commentforpost = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 2);


		login.LoginAction(email, psw);
		uploadstatus.shareThepost(ExceptedstatusText, Exceptedstatusphoto);	
		uploadstatus.commenttopost(ExceptedstatusText, Exceptedstatusphoto, commentforpost);
		uploadstatus.verifythepost(ExceptedstatusText);
		uploadstatus.deletethepost(ExceptedstatusText);
		uploadstatus.verifythepost(ExceptedstatusText);
		uploadstatus.deleteallpost(10);





	}



}
