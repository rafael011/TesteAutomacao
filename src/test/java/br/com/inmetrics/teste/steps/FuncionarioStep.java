package br.com.inmetrics.teste.steps;

import br.com.inmetrics.teste.funcionalidades.FuncionarioFuncionalidade;
import br.com.inmetrics.teste.support.MassaDeDados;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class FuncionarioStep {
	private FuncionarioFuncionalidade funcionarioFunc;
	private MassaDeDados massaExcel;
	
	public FuncionarioStep() {
		this.funcionarioFunc = new FuncionarioFuncionalidade();
	}
	
	//ct05
	@Quando("eu realizo o cadastro de um novo funcionario")
	public void euRealizoOCadastroDeUmNovoFuncionario() throws Exception {
		massaExcel = new MassaDeDados();
		funcionarioFunc.cadastrarFuncionario(massaExcel.getNome(), massaExcel.getCargo(), "870.905.680-75", "500000", "10112020");
	}

	@Então("valido que o funcionario foi cadastrado")
	public void validoQueOFuncionarioFoiCadastrado() {
		funcionarioFunc.validarMsgSucesso("SUCESSO! Usuário cadastrado com sucesso\n×");
	}

	//ct06
	@Quando("eu realizo a edicao de um funcionario cadastrado")
	public void euRealizoAEdicaoDeUmFuncionarioCadastrado() {
		funcionarioFunc.editarFuncionario("Analista 2","650000");
	}

	@Então("valido que as informacoes do funcionario foram editadas")
	public void validoQueAsInformacoesDoFuncionarioForamEditadas() {
		funcionarioFunc.validarMsgSucesso("SUCESSO! Informações atualizadas com sucesso\n×");
	}

	//ct07
	@Quando("eu realizo a exclusao de um funcionario cadastrado")
	public void euRealizoAExclusaoDeUmFuncionarioCadastrado() {
	    funcionarioFunc.excluirFuncionario();
	}

	@Então("valido que o funcionario excluido nao esta mais na lista de funcionarios")
	public void validoQueOFuncionarioExcluidoNaoEstaMaisNaListaDeFuncionarios() {
		funcionarioFunc.validarMsgSucesso("SUCESSO! Funcionário removido com sucesso\n×");
	}


}
