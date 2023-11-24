package com.stepdefinition;


import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	PageObjectManager pom  = new PageObjectManager(driver);
	@Given("user needs to launch the broswer")
	public void user_needs_to_launch_the_broswer() {
	    Browselaunch("https://www.rbi.com/English/corporate-profile/default.aspx");
	}
	@Given("User needs to Move to about us tab")
	public void user_needs_to_move_to_about_us_tab() {
		implicittwait();
	   Mouseactionmovetoelement(pom.getaup().getAboutustab());
	}
	@When("User needs to click overview")
	public void user_needs_to_click_overview() {
	    implicittwait();
	    clickonelement(pom.getaup().getOverview());
	}
	@Then("User needs to click Terms and conditions")
	public void user_needs_to_click_terms_and_conditions() {
	    executeJavaScriptt("arguments[0].scrollIntoView(true);",pom.getaup().getTermsandconditions());
	    clickonelement(pom.getaup().getTermsandconditions());
	    driver.quit();
	    
	}


@Given("User needs to move to investor tab")
public void user_needs_to_move_to_investor_tab() {
	implicittwait();
   Mouseactionmovetoelement(pom.getist().getInvestorstabb());
}
@When("User needs to click investor home")
public void user_needs_to_click_investor_home() {
   implicittwait();
   clickonelement(pom.getist().getInvestorshome());
}
@Then("User needs to click the privacy tab")
public void user_needs_to_click_the_privacy_tab() {
    executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.getist().getPrivacytab());
    clickonelement(pom.getist().getPrivacytab());
    driver.quit();
}

@Given("User needs to move to sustainability tab")
public void user_needs_to_move_to_sustainability_tab() {
	implicittwait();
    Mouseactionmovetoelement(pom.getsat().getSustaintabb());
}
@When("User needs to click on food safety")
public void user_needs_to_click_on_food_safety() {
   implicittwait();
   clickonelement(pom.getsat().getFoodsafety());
}
@Then("User needs to click on policy tab")
public void user_needs_to_click_on_policy_tab() {
    implicittwait();
    executeJavaScriptt("arguments[0].scrollIntoView(true);",pom.getsat().getPoliciestab());
    clickonelement(pom.getsat().getPoliciestab());
    driver.quit();
}

@Given("User needs to move to contact tab")
public void user_needs_to_move_to_contact_tab() {
	implicittwait();
   clickonelement(pom.getctp().getContacttab());
}
@When("USer needs to Click timehortons tab")
public void u_ser_needs_to_click_timehortons_tab() {
	implicittwait();
    clickonelement(pom.getctp().getTimhortonsclickhere());
}
@When("User needs to click USA button")
public void user_needs_to_click_usa_button() {
   implicittwait();
   windowswitch(1);
   implicittwait();
   clickonelement(pom.getctp().getUsabutton());
}
@When("User needs to Click apply button")
public void user_needs_to_click_apply_button() {
	implicittwait();
   clickonelement(pom.getctp().getApplybutton());
}
@When("User needs to click faqs")
public void user_needs_to_click_faqs() {
    implicittwait();
    executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.getctp().getFaqs());
    clickonelement(pom.getctp().getFaqs());
}
@When("User needs to click faq1")
public void user_needs_to_click_faq1() {
   implicittwait();
   executeJavaScriptt("arguments[0].scrollIntoView(true);", pom.getctp().getFaq1());
   clickonelement(pom.getctp().getFaq1());
}
@Then("User needs to click close button")
public void user_needs_to_click_close_button() {
	implicittwait();
	clickonelement(pom.getctp().getCrossbutton());
	driver.quit();
    
}





}
