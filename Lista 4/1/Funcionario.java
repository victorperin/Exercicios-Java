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

public class Funcionario extends Pessoa{
	private double salario;
	private String funcao;

	//construtor
	public Funcionario(String nome, String rg, double salario,String funcao){
		super(nome,rg);
		this.salario = salario;
		this.funcao = funcao;
	}

	//gets
	public double getSalario(){
		return this.salario;
	}
	public String getFuncao(){
		return this.funcao;
	}

	//sets
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
}
