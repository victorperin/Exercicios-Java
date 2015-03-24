/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
import java.util.Scanner;

public class PessoaFisica extends Cliente{
	private String cpf;

	//construtor
	public Aluno(String nome, String endereco,String telefone,String cpf){
		super(nome,endereco,telefone);
		this.cpf=cpf;
	}

	//gets
	public int getCpf(){
		return this.cpf;
	}

	//sets
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
}
