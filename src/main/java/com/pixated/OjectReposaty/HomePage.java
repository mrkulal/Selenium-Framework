package com.pixated.OjectReposaty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * in this holds all Home page elements and methods
 * @author manju
 *
 */

public class HomePage {
	@FindBy(xpath="//div[@id='left-nav1']")private WebElement personaledit;
	@FindBy(className="btn-share")private WebElement Submitedit;
	/**
	 * this method use to initialize all web elements

	 * @param driver
	 */
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * this method used to fetch the personal data present in home page
	 */

	public void getPersonaledit() {
	String ABC = personaledit.getText();
	System.out.println(ABC);
	 
	

	
	 
	}
	/**
	 * this method is used click on submit
	 * @return
	 */

	public WebElement getSubmitedit() {
		return Submitedit;
	}
	
	

	}


