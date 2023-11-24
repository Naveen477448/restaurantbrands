package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Investorstab extends BaseClass {
	public Investorstab(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Investors'])[2]")
	private WebElement Investorstabb;
	
	@FindBy(xpath = "(//a[text()='Investor Home'])[2]")
	private WebElement investorshome;
	
	@FindBy(xpath = "//a[text()='Privacy']")
	private WebElement privacytab;

	public WebElement getInvestorstabb() {
		return Investorstabb;
	}

	public WebElement getInvestorshome() {
		return investorshome;
	}

	public WebElement getPrivacytab() {
		return privacytab;
	}
	
	
	
	

}
