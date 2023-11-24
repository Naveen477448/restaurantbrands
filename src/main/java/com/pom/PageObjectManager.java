package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageObjectManager extends BaseClass {
	public PageObjectManager(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	private aboutuspage aup;
	
	private Investorstab ist;
	
	private Sustainabilitytab sat;
	
	private contactpage ctp;
	
	public aboutuspage getaup() {
		aup = new aboutuspage(driver);
		return aup;
	}
	public Investorstab getist() {
		ist = new Investorstab(driver);
		return ist;
	}
	public Sustainabilitytab getsat() {
		sat = new Sustainabilitytab(driver);
		return sat;
	}
	
	public contactpage getctp() {
		ctp = new contactpage(driver);
		return ctp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
