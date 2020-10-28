package br.com.inmetrics.teste.support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseTest baseTest = new BaseTest();
	
	@Before(value = "@web")
	public void beforeWeb() {
		baseTest.getChrome("http://www.inmrobo.tk/accounts/login/");
	}

	@After(value = "@web")
	public void afterWeb() {
		baseTest.tearDown();
	}

}