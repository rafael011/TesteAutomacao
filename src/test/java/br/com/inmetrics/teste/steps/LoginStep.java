package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.funcionalidades.LoginFuncionalidade;
import br.com.inmetrics.teste.support.MassaDeDados;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class LoginStep {

	private LoginFuncionalidade loginPage;
	private MassaDeDados massaExcel;
	
	public LoginStep() {
		this.loginPage = new LoginFuncionalidade();
	}
	

	//ct01
	@Dado("que eu insira usuario e senha validos")
	public void queEuInsiraUsuarioESenhaValidos() throws Exception {
		massaExcel = new MassaDeDados();
		loginPage.realizarLogin(massaExcel.getUsuario(), massaExcel.getSenha());
	}
	
	@Então("valido que sou direcionado para a pagina de funcionarios")
	public void validoQueSouDirecionadoParaAPaginaDeFuncionarios() {
		loginPage.validarAreaLogada();
	}

	//ct02
	@Dado("que eu insira usuario e senha invalidos")
	public void queEuInsiraUsuarioESenhaInvalidos() throws Exception {
		loginPage.realizarLogin("usuarioInvalido", "senhaInvalida");
	}

	@Então("valido mensagem de usuario ou senha invalida")
	public void validoMensagemDeUsuarioOuSenhaInvalida() {
		loginPage.validarMsgErroLogin("ERRO! Usuário ou Senha inválidos\n×");
	}

}
