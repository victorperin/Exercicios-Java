/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
import java.util.Scanner;

public class Professor extends Pessoa{
	private String disciplina;

	//construtor
	public Funcionario(String nome, String sobrenome,String disciplina){
		super(nome,sobrenome);
		this.disciplina = disciplina;
	}

	//gets
	public double getDisciplina(){
		return this.disciplina;
	}

	//sets
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
}
