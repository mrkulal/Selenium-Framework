package com.pixated.genericUtility;

public enum ExcelSheetName {
	SHEET1("Sheet1"); 
	private String excelSheetName;
	
	private ExcelSheetName( String  excelSheetName) {
		this.excelSheetName=excelSheetName;
	}
	
	public String convertToString() {
		return excelSheetName.toString();
	}
	

}
