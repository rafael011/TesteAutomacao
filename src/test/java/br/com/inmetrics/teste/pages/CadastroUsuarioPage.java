package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.teste.support.BaseTest;

public class CadastroUsuarioPage extends BaseTest {
	
	public CadastroUsuarioPage() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name = "confirmpass")
	private WebElement campoConfirmaSenha;

	@FindBy(xpath = "//button[@class='login100-form-btn']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='p-t-10 p-b-1']//div[@style='color: red;']") 
	private WebElement msgErroCadastro;
	
		
	public WebElement getCampoConfirmaSenha() {
		return campoConfirmaSenha;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getMsgErroCadastro() {
		return msgErroCadastro;
	}

	



}
