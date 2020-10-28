#language: pt
#Author: Rafael Carmignotto

@web @cadastro
Funcionalidade: Cadastro de usuário

	@ct03
  Cenario: Cadastrar usuario com sucesso
    Dado que eu acesso a página de cadastro
    Quando eu submeto o meu cadastro com os dados solicitados
    Então valido que sou direcionado para a página de login

	@ct04
  Cenario: Cadastrar usuario sem sucesso
    Dado que eu acesso a página de cadastro
    Quando eu submeto o meu cadastro com dados de um usuario ja cadastrado
    Então valido que mensagem de usuario ja cadastrado