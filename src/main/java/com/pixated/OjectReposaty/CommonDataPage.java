package com.pixated.OjectReposaty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this holds all common page elements and methods
 * @author manju
 *
 */

public class CommonDataPage {
@FindBy(xpath="//label[.='Photos']")private WebElement PhotoEdit;
	
	@FindBy(xpath="//a[.='Home']")private WebElement HomeEdit;
	
	
	@FindBy(xpath="//label[.='Profile']")private WebElement ProfileEdit;
	
	@FindBy(xpath="//a[@href='timeline.php']")private WebElement userEdit;
	
	@FindBy(xpath="//button[.='Log out']")private WebElement signoutEdit;
	@FindBy(xpath="//a[.='biobook']")private WebElement BiobookEdit;
	
	/**
	 * this method use to initialize all webelements

	 * @param driver
	 */
	
	public CommonDataPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
/**
 * this method used click on getbiobook
 * @return
 */

	public WebElement getBiobookEdit() {
		return BiobookEdit;
	}
	
	
	/**
	 * this method used click photo module
	 * @return
	 */


	public void clickOnPhotoButton() {
	 PhotoEdit.click();;
	}
	
	/**
	 * this method used click on HomeButton
	 * @return
	 */


	public void clickOnHomeButton() {
	 HomeEdit.click();
	}
	/**
	 * this method used click profileButton
	 * @return
	 */

	public void clickonProfilebutton() {
		ProfileEdit.click();
		
	}
	/**
	 * this method used click on userBUtton
	 * @return
	 */

	public WebElement getUserEdit() {
		return userEdit;
	}


	public WebElement getSignoutEdit() {
		return signoutEdit;
	}

	

}
