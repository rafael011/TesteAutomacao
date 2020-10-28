package br.com.inmetrics.teste.support;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseTest baseTest = new BaseTest();
	private WebDriver driver;
	
	@Before(value = "@web")
	public void beforeWeb() {
		baseTest.getChrome("http://www.inmrobo.tk/accounts/login/");
	}

	@After(value = "@web")
	public void afterWeb() {
		baseTest.tearDown();
	}
	

}