/**
 * 
 */
package com.pixated.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author manju
 *
 */
public class GetdatafromfromusingArry {
	@Test(dataProvider="getdata")
	public void method(String username,String password) {
		
		System.out.println(username+"-------------"+password);
	}
	
	@DataProvider
	public static String[][] getdata() throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");
	int lastRownumber = sheet.getLastRowNum();
	int Lastcellnumber = sheet.getRow(0).getLastCellNum();
	String[][]arry=new String [lastRownumber][Lastcellnumber];
	for(int i=0;i<lastRownumber;i++) {
		for(int j=0;j<Lastcellnumber;j++) {
		
	arry[i][j]=sheet.getRow(i+1).getCell(j).toString();
		
		}
		
		
		
		
	}
	return arry;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
