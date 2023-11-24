package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class contactpage extends BaseClass {
	public contactpage(WebDriver driver1) {
		driver= driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Contact'])[2]")
	private WebElement contacttab;
	
	@FindBy(xpath = "(//a[text()='click here'])[1]")
	private WebElement timhortonsclickhere;
	
	@FindBy(xpath = "(//span[@class='radio-buttonstyled__IndicatorContainer-sc-11mvcbp-4 kkLJtu'])[3]")
	private WebElement usabutton;
	
	@FindBy(xpath = "(//button[text()='Apply'])[1]")
	private WebElement applybutton;
	
	@FindBy(xpath = "(//a[@class='linkth__InternalLink-sc-68fgr6-0 linkth__PaddedInternalLink-sc-68fgr6-6 jEWhyT fHfVTe'])[3]")
	private WebElement faqs;
	
	@FindBy(xpath = "//button[text()='What do I do if I receive a wrong order?']")
	private WebElement faq1;

	@FindBy(xpath = "(//div[@class='accordionWidget__AnimArrowDiv-bt8rin-0 cVFXLq'])[2]")
	private WebElement crossbutton;

	public WebElement getContacttab() {
		return contacttab;
	}

	public WebElement getTimhortonsclickhere() {
		return timhortonsclickhere;
	}

	public WebElement getUsabutton() {
		return usabutton;
	}

	public WebElement getApplybutton() {
		return applybutton;
	}

	public WebElement getFaqs() {
		return faqs;
	}

	public WebElement getFaq1() {
		return faq1;
	}

	public WebElement getCrossbutton() {
		return crossbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
}
