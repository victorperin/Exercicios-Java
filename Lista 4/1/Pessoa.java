/*******************************************************************************
Exercício 1)
a) Criar uma classe data com os atributos dia, mes e ano, realizando os testes para saber se é uma data válida.
b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)
d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)
e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)
f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.

*******************************************************************************/
import java.util.Scanner;

public class Pessoa{
	String nome, rg;
	Data dataNascimento;

	//construtor
	public Pessoa(String nome, String rg,String dataString){
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = new Data(dataString);
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getRg(){
		return this.rg;
	}
	public String getData(){
		return this.dataNascimento.toString();
	}

	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
}
