package com.cucumbertestrunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.AdactinBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\feature\\AdactinFeature.feature",
glue = "com.stepdefinition",
plugin = {"pretty",	
		"html:Report/Cucumber_Html_Report",
		"json:Report/Cucumber_Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_report.html"}, monochrome = true)

//dryRun = true, strict = true
//"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_report.html"},

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		driver = AdactinBaseClass.browserLaunch("chrome");
	}

	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		//Thread.sleep(5000);
		AdactinBaseClass.quitBrowser();
	}

}
