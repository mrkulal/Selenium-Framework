package com.pixated.testcase;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pixated.OjectReposaty.CommonDataPage;
import com.pixated.OjectReposaty.HomePage;
import com.pixated.OjectReposaty.LoginPage;
import com.pixated.OjectReposaty.PhotoModulePage;
import com.pixated.OjectReposaty.ProfilePage;
import com.pixated.OjectReposaty.Uploadstatus;
import com.pixated.genericUtility.BaseClass1;
import com.pixated.genericUtility.ExcelSheetName;
import com.pixated.genericUtility.ExcelUtility;
import com.pixated.genericUtility.PropertyFileLybrery;
import com.pixated.genericUtility.PropertyFilekeys;
import com.pixated.genericUtility.WebdriverLyberery;
import com.pixated.genericUtility.iConstantPath;

public class EditProfileDetailswithInvalidDataTestcase extends BaseClass1{
	@Test
	
public void performAction() throws InterruptedException
	{

        String expectedphoto = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 1);
		String chosephoto = ex.getDatafromExcel(iConstantPath.EXCEL_PATH, ExcelSheetName.SHEET1.convertToString(), 2, 1);


		login.LoginAction(email, psw);
		da.clickOnPhotoButton();
		ph.Getabsolutepath(expectedphoto);
		Thread.sleep(1000);
		ph.Photoaction(expectedphoto);
		da.clickOnHomeButton();
		hp.getPersonaledit();
		da.clickOnPhotoButton();
		ph.varifyUplodePhotoIsSameAsSelected(expectedphoto);
		da.clickOnPhotoButton();
		ph.Getabsolutepath(expectedphoto);
		Thread.sleep(1000);
		ph.Photoaction(expectedphoto);
		da.clickOnHomeButton();
		hp.getPersonaledit();
		da.clickOnPhotoButton();
		ph.varifyUplodePhotoIsSameAsSelected(chosephoto);
		da.clickonProfilebutton();
		ns.clickoneditprofilebutton();
		ns.clearfirstname();
		ns.clearlaststname();
		ns.clearusername();
		ns.savebutton();

		

	}
}

