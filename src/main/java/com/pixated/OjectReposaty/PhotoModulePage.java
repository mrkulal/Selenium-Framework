package com.pixated.OjectReposaty;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this holds all PhotoPage elements and methods
 * @author manju
 *
 */
public class PhotoModulePage {
	@FindBy(xpath="//input[@name='image']")private WebElement imgeEdit;
	@FindBy(name="Submit")private WebElement submitok;
	@FindBy(xpath="//div[@id=\"right-nav\"]/div/center/img")private WebElement realEdit;
	/**
	 * this method use to initialize all web elements

	 * @param driver
	 */
	
	
	
	public PhotoModulePage  (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * this method used to upload photo
	 * @param path
	 */
	public void Photoaction(String path) {
		imgeEdit.sendKeys(path);
		submitok.click();
		
		
	}
	/**
	 * this method used varify uplode and expectedphoto
	 * @param expectedphoto
	 */
	public void varifyUplodePhotoIsSameAsSelected(String expectedphoto) {
		String data = realEdit.getText();
		if(expectedphoto.contains(data)) {
			System.out.println("testcase is pass");
	}
		else {
			System.out.println();
		}

	
		

		
		
		
	}
	public void Getabsolutepath(String expectedphoto ) {
		File f= new File(expectedphoto);
		String abspath = f.getAbsolutePath();
		
	}
	

}
