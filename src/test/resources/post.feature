#language:pt
#Author: renata.zanin@gmail.com

@executa
Funcionalidade: validar operacao 
 Eu como usuario quero validar operacao para envio api
 
 Contexto: acessar api post
 	Dado acessar api 
 
  Cenario: Validar status code
  Quando escolho operacao pix
  Entao valido status sucesso 200
  
  Cenario: Validar status code
  Quando operacao vazia
  Entao valido status code insucesso 400
    
