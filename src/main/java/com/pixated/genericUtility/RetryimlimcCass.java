package com.pixated.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryimlimcCass implements IRetryAnalyzer{
	int counter=0;
	int retrylimit=5;

	public boolean retry(ITestResult result) {
		if(counter<retrylimit) {
			counter++;
			return true;
		}
		return false;
	}

}
