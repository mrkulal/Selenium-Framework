package com.pixated.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * this class contains reusable methods of property file
 * @author manju
 *
 */


public class PropertyFileLybrery {
	private FileInputStream fis;
	public String getDataFromPropetryFile(String proprtryPath,String key) 
	{
	try {
		fis = new FileInputStream(proprtryPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties pr = new Properties();
	try {
		pr.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String value = pr.getProperty(key).trim();
	return value;
		
	}
	/**
	 * this method is used to close the property file
	 * @throws IOException
	 * 
	 */
	public void  closePropetryFile() {
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
