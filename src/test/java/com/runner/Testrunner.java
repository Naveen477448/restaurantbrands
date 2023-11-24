package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\navee\\eclipse-workspace\\Restaurant_brand_international\\src\\test\\java\\com\\feature\\Restaurants.feature",
                 glue = "com.stepdefinition",
                 plugin = {"pretty",
                		 "html:Reports/lime.html",
         				"json:Reports/lime.json",
         				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                                                                                                                                                       
		
		
		
		
		
		
		)

public class Testrunner {

}
