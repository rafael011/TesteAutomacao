package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.funcionalidades.CadastroUsuarioFuncionalidade;
import br.com.inmetrics.teste.funcionalidades.LoginFuncionalidade;
import br.com.inmetrics.teste.support.MassaDeDados;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroUsuarioStep {
	private CadastroUsuarioFuncionalidade cadastroFunc;
	private LoginFuncionalidade loginFunc;
	

	public CadastroUsuarioStep() {
		this.cadastroFunc = new CadastroUsuarioFuncionalidade();
		this.loginFunc = new LoginFuncionalidade();
	}
	
	//ct03
	@Dado("que eu acesso a página de cadastro")
	public void queEuAcessoAPáginaDeCadastro() {
		loginFunc.acessarPaginaCadastro();
	}

	@Quando("eu submeto o meu cadastro com os dados solicitados")
	public void euSubmetoOMeuCadastroComOsDadosSolicitados() {
		cadastroFunc.realizarCadastro("Rafaee012","123456","123456");
	}

	@Então("valido que sou direcionado para a página de login")
	public void validoQueSouDirecionadoParaAPáginaDeLogin() {
		cadastroFunc.validarTelaInicialLogin();
	}
	
	//ct04
	@Quando("eu submeto o meu cadastro com dados de um usuario ja cadastrado")
	public void euSubmetoOMeuCadastroComDadosDeUmUsuarioJaCadastrado() {
		cadastroFunc.realizarCadastro("Rafael055","123456","123456");
	}

	@Então("valido que mensagem de usuario ja cadastrado")
	public void validoQueMensagemDeUsuarioJaCadastrado() {
	    cadastroFunc.validarMsgErroCadastro("Usuário já cadastrado");
	}
	
}
