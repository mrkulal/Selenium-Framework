package com.pixated.testcase;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pixated.OjectReposaty.CommonDataPage;
import com.pixated.OjectReposaty.HomePage;
import com.pixated.OjectReposaty.LoginPage;
import com.pixated.OjectReposaty.PhotoModulePage;

import com.pixated.genericUtility.BaseClass1;
import com.pixated.genericUtility.ExcelSheetName;
import com.pixated.genericUtility.ExcelUtility;
import com.pixated.genericUtility.PropertyFileLybrery;
import com.pixated.genericUtility.PropertyFilekeys;
import com.pixated.genericUtility.WebdriverLyberery;
import com.pixated.genericUtility.iConstantPath;
@Listeners(com.pixated.genericUtility.LisImpClass.class)

public class UplodepostInPhotoModuleTestcase extends BaseClass1
{
@Test
	public void RunTestScript() throws InterruptedException
{
String expectedphoto = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 1);

        login.LoginAction(email, psw);
		da.clickOnPhotoButton();
		ph.Getabsolutepath(expectedphoto);
		Thread.sleep(1000);
		ph.Photoaction(expectedphoto);
		da.clickOnHomeButton();
		Assert.fail();
		hp.getPersonaledit();
		da.clickOnPhotoButton();
		ph.varifyUplodePhotoIsSameAsSelected(expectedphoto);

	}


}


