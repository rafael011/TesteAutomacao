package br.com.inmetrics.teste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.inmetrics.teste.support.BaseTest;

public class FuncionarioPage extends BaseTest {
	
	public FuncionarioPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "inputNome")
	private WebElement campoNome;

	@FindBy(id = "inputCargo")
	private WebElement campoCargo;

	@FindBy(id = "cpf")
	private WebElement campoCpf;

	@FindBy(id = "dinheiro")
	private WebElement campoSalario;

	@FindBy(id = "inputAdmissao")
	private WebElement campoAdmissao;

	@FindBy(xpath = "//div[@class='radio-button']/input[@id='clt']")
	private WebElement checkboxClt;

	@FindBy(xpath = "//select[@id='slctSexo']")
	private WebElement selecionarGenero;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnEnviar;

	@FindBy(xpath = "//a[text()='Novo Funcionário']")
	private WebElement btnNovoFuncionario;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
	private WebElement msgSucessoCadastro;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement campoPesquisar;

	@FindBy(xpath = "//span[@class='fa fa-pencil']")
	private WebElement btnEditar;
	
	@FindBy(xpath = "//span[@class='fa fa-trash']")
	private WebElement btnExcluir;
	
	@FindBy(xpath = "//a[text()='Funcionários']")
	private WebElement homeFuncionarios;

	public WebElement getMsgSucessoCadastro() {
		return msgSucessoCadastro;
	}

	public WebElement getCampoNome() {
		return campoNome;
	}

	public WebElement getCampoCargo() {
		return campoCargo;
	}

	public WebElement getCampoCpf() {
		return campoCpf;
	}

	public WebElement getCampoSalario() {
		return campoSalario;
	}

	public WebElement getCampoAdmissao() {
		return campoAdmissao;
	}

	public WebElement getCheckboxClt() {
		return checkboxClt;
	}

	public WebElement getSelecionarGenero() {
		return selecionarGenero;
	}

	public WebElement getBtnEnviar() {
		return btnEnviar;
	}

	public WebElement getBtnNovoFuncionario() {
		return btnNovoFuncionario;
	}

	public WebElement getCampoPesquisar() {
		return campoPesquisar;
	}

	public WebElement getBtnEditar() {
		return btnEditar;
	}

	public WebElement getBtnExcluir() {
		return btnExcluir;
	}
	
	public WebElement getHomeFuncionarios() {
		return homeFuncionarios;
	}

}
