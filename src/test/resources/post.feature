#language: pt
#Author: renata.zanin@gmail.com

Funcionalidade: Realizar deposito e conta ativa
  Como usuario quero verificar comportamento de funcionalidade via Api


  Contexto: Acessar api
  Quando acessar api
  
  Cenario: validar status code 
  Dado conta invalida
  Entao valido status code de retorno 400
  
  Cenario: validar status code
  Dado operacao preenchida Pix
  Entao valido o nome "Pix"
