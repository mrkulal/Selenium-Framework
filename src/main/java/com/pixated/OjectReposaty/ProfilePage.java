package com.pixated.OjectReposaty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this holds all Profile page elements and methods
 * @author manju
 *
 */

public class ProfilePage {
	@FindBy(xpath="//button[.='Update Picture']")private WebElement UpdateEdit;
	@FindBy(xpath="//input[@type='file']")private WebElement chooseEdit;
	@FindBy(xpath="//input[@value='save']")private WebElement saveEdit;
	@FindBy(xpath="//button[.='Edit Profile']")private WebElement editprofileEdit;
	@FindBy(xpath="//input[@name='firstname']")private WebElement firstnameclear;
	@FindBy(xpath="//input[@name='firstname']")private WebElement firstnameEdit;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastnameclear;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastnameEdit;
	@FindBy(xpath="//input[@name='username']")private WebElement usernameclear;
	@FindBy(xpath="//input[@name='username']")private WebElement usernameEdit;
	@FindBy(xpath="//button[@type='submit']")private WebElement saveid;
	
	/**
	 * this method use to initialize all web elements

	 * @param driver
	 */
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * this method used to update profile photo
	 * @param path
	 */
	public void UpdateProfilepic(String photo) {
	UpdateEdit.click();
	chooseEdit.sendKeys(photo);
	saveEdit.click();
		
	}
	/**
	 * this method used to click on editprofile
	 * @param path
	 */
	public void clickoneditprofilebutton() {
	 editprofileEdit.click();
		
	}

	/**
	 * this method used to clearfirstname textfield
	 * @param path
	 */
public void clearfirstname() {
	 firstnameclear.clear();
}
/**
 * this method used to editfirstname textfield
 * @param path
 */

public void editfirstname(String firstname ) {
	 firstnameEdit.sendKeys(firstname);
}
/**
 * this method used to clearlastname textfield
 * @param path
 */
public void clearlaststname() {
	lastnameclear.clear();
}
/**
 * this method used to editlastname textfield
 * @param path
 */

public void editlastname(String Lastname) {
	lastnameEdit.sendKeys(Lastname);
	/**
	 * this method used to clearusername textfield
	 * @param path
	 */
}
public void clearusername() {
 usernameclear.clear();
}
/**
 * this method used to editusername textfield
 * @param path
 */

public void editusername(String username) {
 usernameEdit.sendKeys(username);
}
/**
 * this method used to click save button
 * @param path
 */
public void savebutton() {
	saveid.click();
}

}
