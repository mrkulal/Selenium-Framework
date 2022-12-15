package com.pixated.genericUtility;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

public class LisImpClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println("failure");

		DateTimeFormatter dff=DateTimeFormatter.ofPattern("dd-MM-yyyy_HH mm ss");
		LocalDateTime da = LocalDateTime.now();
		String dateAndTime = dff.format(da);
		//or
		//SimpleDateFormat sm= new SimpleDateFormat("dd-MM-yyyy_HH mm ss");
		//Date currentdate=new Date();
		//String date = sm.format(currentdate);
		
		
		
		
		String name = result.getName();


		EventFiringWebDriver Edriver=new EventFiringWebDriver(BaseClass1.Sdriver);
		File src = Edriver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+name+"_"+dateAndTime+".png");
		try {
			FileUtils.copyFile(src,dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}








