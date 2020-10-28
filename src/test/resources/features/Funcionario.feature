#language: pt
#Author: Rafael Carmignotto

@web @funcionario
Funcionalidade: Gerenciar funcionarios

  @ct05
  Cenario: Cadastrar Funcionario
    Dado que eu insira usuario e senha validos
    Quando eu realizo o cadastro de um novo funcionario
    Então valido que o funcionario foi cadastrado

  @ct06
  Cenario: Editar Funcionario
     Dado que eu insira usuario e senha validos
     Quando eu realizo a edicao de um funcionario cadastrado
     Então valido que as informacoes do funcionario foram editadas
   
  @ct07
  Cenario: Excluir Funcionario
    Dado que eu insira usuario e senha validos
    Quando eu realizo a exclusao de um funcionario cadastrado
    Então valido que o funcionario excluido nao esta mais na lista de funcionarios 
 