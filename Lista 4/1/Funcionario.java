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
	private Data dataAdmissao;

	//construtor
	public Funcionario(String nome, String rg,String dataNascimento, double salario,String funcao, String dataAdmissaoString){
		super(nome,rg,dataNascimento);
		this.salario = salario;
		this.funcao = funcao;
		this.dataAdmissao = new Data(dataAdmissaoString);
	}

	//gets
	public double getSalario(){
		return this.salario;
	}
	public String getFuncao(){
		return this.funcao;
	}
	public String getDataAdmissao(){
		return this.dataAdmissao.toString();
	}

	//sets
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	public void setDataAdimissao(String dataString){
		this.dataAdmissao.setData(dataString);
	}
}
