package br.com.inmetrics.teste.funcionalidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import br.com.inmetrics.teste.pages.CadastroUsuarioPage;
import br.com.inmetrics.teste.pages.LoginPage;
import br.com.inmetrics.teste.support.BaseTest;

public class CadastroUsuarioFuncionalidade extends BaseTest {
	private CadastroUsuarioPage cadastroPage;
	private LoginPage loginPage;

	public CadastroUsuarioFuncionalidade() {
		this.cadastroPage = new CadastroUsuarioPage();
		this.loginPage = new LoginPage();
	}

	public void realizarCadastro(String usuario, String senha, String confirmaSenha) {
		loginPage.getCampoUsuario().sendKeys(usuario);
		loginPage.getCampoSenha().sendKeys(senha);
		cadastroPage.getCampoConfirmaSenha().sendKeys(confirmaSenha);
		cadastroPage.getBtnSubmit().click();
	}

	public void validarTelaInicialLogin() {
		assertTrue(loginPage.getTelaLogin().isDisplayed());
	}
	
	public void validarMsgErroCadastro(String msgEsperada) {
		String msgErro = cadastroPage.getMsgErroCadastro().getText();
		assertEquals(msgEsperada, msgErro);
	}

}
