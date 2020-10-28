#language: pt
#Author: Rafael Carmignotto

@web @login
Funcionalidade: Login
  
  @ct01
  Cenario: Realizar Login valido
    Dado que eu insira usuario e senha validos
    Então valido que sou direcionado para a pagina de funcionarios

  @ct02
  Cenario: Realizar Login invalido
    Dado que eu insira usuario e senha invalidos
    Então valido mensagem de usuario ou senha invalida
