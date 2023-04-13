defmodule Cadastro do
  IO.puts "Dados do Usuario"

  def name(name, sobrenome) do
    IO.puts ("Nome: " <> name <> " ") <> (sobrenome)
  end

  def idade(idade, datanascimento) do
    IO.puts "Data de nascimento: " <> datanascimento
    IO.puts "Idade: " <> idade
  end

  def cpf(cpf) do
    IO.puts "CPF: " <> cpf
  end

  def endereco(endereco \\ "Nao informado") do
    IO.puts "Endereco: " <> endereco
  end
end

Cadastro.name("Lucas", "Ramalho")
Cadastro.idade("18", "23/12/2004")
Cadastro.cpf("132.246.934.91")
Cadastro.endereco("Lagoa-Seca")
