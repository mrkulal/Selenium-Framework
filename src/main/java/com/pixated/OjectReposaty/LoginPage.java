package com.pixated.OjectReposaty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this holds all login elements and methods
 * @author manju
 *
 */
public class LoginPage {

	@FindBy(name="email")private WebElement emailEdit;

	@FindBy(name="password")private WebElement passwordEdit;


	@FindBy(name="submit")private WebElement submitEdit;

	/**
	 * this method use to initialize all web elements

	 * @param driver
	 */

	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	/**
	 * this method used to perform login action
	 */

	public void LoginAction(String email,String psw)
	{
		emailEdit.sendKeys(email);
		passwordEdit.sendKeys(psw);
		submitEdit.click();
	}



}
