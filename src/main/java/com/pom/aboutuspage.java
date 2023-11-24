package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class aboutuspage extends BaseClass {
	public aboutuspage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://www.rbi.com/English/about-us/overview/default.aspx'])[4]")
	private WebElement aboutustab;
	
	@FindBy(xpath = "(//a[text()='Overview'])[2]")
	private WebElement overview;
	
	@FindBy(xpath = "//a[@title='Menu title Terms and Conditions']")
	private WebElement termsandconditions;

	public WebElement getAboutustab() {
		return aboutustab;
	}

	public WebElement getOverview() {
		return overview;
	}

	public WebElement getTermsandconditions() {
		return termsandconditions;
	}

}
