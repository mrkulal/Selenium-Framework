package com.pixated.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
 private Workbook book;
private FileInputStream fisexcl;
	
public String getDatafromExcel(String excelPath,String sheetName,int Rownumber,int cellNumber)

{
	FileInputStream fisexcl = null;
	try {
		fisexcl = new FileInputStream(excelPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		book = WorkbookFactory.create(fisexcl);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 DataFormatter df=new DataFormatter();
  String data = df.formatCellValue(book.getSheet(sheetName).getRow(Rownumber).getCell(cellNumber));
          
return data;	
}
public void closeExcel()
{
try {
	book.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
	

	
