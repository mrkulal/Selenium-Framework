package com.pixated.genericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main(String[] args) {

		ExtentSparkReporter spark= new ExtentSparkReporter("extenReport/canara.html");
		spark.config().setDocumentTitle("canara");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Automation test report");
		
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("oparatig ssystem","windows11");
		report.setSystemInfo("browser","chrome");
		ExtentTest test1 = report.createTest("testcase1");
		test1.pass("pass");
		
		ExtentTest test2 = report.createTest("testcase2");
		test2.fail("fail");
		
		ExtentTest test3 = report.createTest("testcase3");
		test3.skip("skip");
		
		System.out.println("end");
		report.flush();

	}

}
