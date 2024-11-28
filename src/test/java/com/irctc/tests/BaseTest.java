package com.irctc.tests;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.irctc.driver.Driver;
import com.irctc.pages.BasePage;
import com.irctc.reports.ExtentReport;

public class BaseTest extends BasePage{
	protected BaseTest() {}
	
	@BeforeSuite
	public void initialize() throws Exception {
		ExtentReport.initReports();
	}
	
	@AfterSuite
	public void flush() {
		ExtentReport.flushReports();
	}
	
	@BeforeMethod
	protected void setUp(Method method) throws Exception {
		ExtentReport.createTest(method.getName());
		driver = Driver.initDriver();
	}
	
	@AfterMethod
	protected void tearDown() {
		Driver.quitDriver();
	}
	
}
