 package com.Lime_Test;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import com.Base_class.Methods;
import com.Pom.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Gayu\\eclipse-workspace\\Lime_Road\\src\\test\\java\\com\\feature\\lime.feature",
                 glue="com.stepdef",
                // monochrome= true,
                 //dryRun= false,
                // strict = true,
                 tags= "@Smoketest",
                 plugin= {"pretty",
                		  "json:report/lr.json",
                		  "html:report/cucumber"}
                		 // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 )
public class Runner extends Methods {//4.8.0
	@BeforeClass	 
	 public static void browserlaunch() {
		 Setup("Chrome");
		 }	
}
