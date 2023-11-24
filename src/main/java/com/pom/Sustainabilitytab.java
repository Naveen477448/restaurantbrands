package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Sustainabilitytab extends BaseClass {
	public Sustainabilitytab(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Sustainability'])[2]")
	private WebElement sustaintabb;
	
	@FindBy(xpath = "(//a[text()='Food Safety'])[2]")
	private WebElement foodsafety;
	
	@FindBy(xpath = "//a[text()='Policies']")
	private WebElement policiestab;

	public WebElement getSustaintabb() {
		return sustaintabb;
	}

	public WebElement getFoodsafety() {
		return foodsafety;
	}

	public WebElement getPoliciestab() {
		return policiestab;
	}
	
	
	
	

}
