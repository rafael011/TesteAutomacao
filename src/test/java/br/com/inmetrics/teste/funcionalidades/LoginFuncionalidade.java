package br.com.inmetrics.teste.funcionalidades;

import static org.junit.Assert.assertEquals;

import br.com.inmetrics.teste.pages.CadastroUsuarioPage;
import br.com.inmetrics.teste.pages.FuncionarioPage;
import br.com.inmetrics.teste.pages.LoginPage;

public class LoginFuncionalidade {
	
	private CadastroUsuarioPage cadastroPage;
	private LoginPage loginPage;
	private FuncionarioPage funcionarioPage;
	
	public LoginFuncionalidade() {
		this.cadastroPage = new CadastroUsuarioPage();
		this.loginPage = new LoginPage();
		this.funcionarioPage = new FuncionarioPage();
	}
	
	public void acessarPaginaCadastro() {
		this.loginPage.getBtnCadastreSe().click();
	}
	
	public void validarAreaLogada() {
		String validacao = funcionarioPage.getHomeFuncionarios().getText();
		assertEquals("FUNCIONÁRIOS", validacao);
	}
	
	public void realizarLogin(String user, String senha) {
		loginPage.getCampoUsuario().sendKeys(user);
		loginPage.getCampoSenha().sendKeys(senha);
		cadastroPage.getBtnSubmit().click();
	}
	
	public void validarMsgErroLogin(String msgEsperada) {
		String msgErro = loginPage.getMsgErroLogin().getText();
		assertEquals(msgEsperada, msgErro);
	}
	
	
}
