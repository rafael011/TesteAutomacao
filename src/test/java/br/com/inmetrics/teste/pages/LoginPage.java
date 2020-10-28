package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.teste.support.BaseTest;

public class LoginPage extends BaseTest {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div/a[@href='/accounts/signup/']")
	private WebElement btnCadastreSe;

	@FindBy(name = "username")
	private WebElement campoUsuario;

	@FindBy(name = "pass")
	private WebElement campoSenha;

	@FindBy(xpath = "//span[@class='login100-form-title p-b-1']")
	private WebElement telaLogin;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible fade show']")
	private WebElement msgErroLogin;

	public WebElement getBtnCadastreSe() {
		return btnCadastreSe;
	}

	public WebElement getCampoUsuario() {
		return campoUsuario;
	}

	public WebElement getCampoSenha() {
		return campoSenha;
	}

	public WebElement getTelaLogin() {
		return telaLogin;
	}

	public WebElement getMsgErroLogin() {
		return msgErroLogin;
	}
}
