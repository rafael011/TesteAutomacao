package br.com.inmetrics.teste.funcionalidades;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.inmetrics.teste.pages.FuncionarioPage;
import br.com.inmetrics.teste.support.BaseTest;

public class FuncionarioFuncionalidade extends BaseTest {
	private FuncionarioPage funcionarioPage;

	public FuncionarioFuncionalidade() {
		this.funcionarioPage = new FuncionarioPage();
	}

	public void cadastrarFuncionario(String nome, String cargo, String cpf, String salario, String admissao) {
		funcionarioPage.getBtnNovoFuncionario().click();
		funcionarioPage.getCampoNome().sendKeys(nome);
		funcionarioPage.getCampoCargo().sendKeys(cargo);
		funcionarioPage.getCampoCpf().sendKeys(cpf);
		funcionarioPage.getCampoSalario().sendKeys(salario);
		selecionarGenero("Masculino");
		funcionarioPage.getCheckboxClt().click();
		funcionarioPage.getCampoAdmissao().sendKeys(admissao);
		funcionarioPage.getBtnEnviar().click();
	}

	private void selecionarGenero(String sexo) {
		WebElement opcaoGenero = funcionarioPage.getSelecionarGenero();
        new Select(opcaoGenero).selectByVisibleText(sexo); 
		
	}

	public void validarMsgSucesso(String msgEsperada) {
		String msgSucesso = funcionarioPage.getMsgSucessoCadastro().getText();
		assertEquals(msgEsperada, msgSucesso);
	}

	public void editarFuncionario(String novoCargo, String novoSalario) {
		funcionarioPage.getCampoPesquisar().sendKeys("Rgc");
		funcionarioPage.getBtnEditar().click();
		funcionarioPage.getCampoCargo().clear();
		funcionarioPage.getCampoCargo().sendKeys(novoCargo);
		funcionarioPage.getCampoSalario().clear();
		funcionarioPage.getCampoSalario().sendKeys(novoSalario);
		funcionarioPage.getBtnEnviar().click();

	}
	
	public void excluirFuncionario() {
		funcionarioPage.getCampoPesquisar().sendKeys("Rgc");
		funcionarioPage.getBtnExcluir().click();
	}

}
