/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
import java.util.Scanner;

public class PessoaFisica extends Cliente{
	private String cpf;

	//construtor
	public PessoaFisica(String nome, String endereco,String telefone,String cpf){
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

	//toString
	public String imprimirDados(){
		System.out.println("Pessoa Física:\n\Nome: "+this.nome+"\n\tEndereço: "+this.endereco+"\n\tTelefone: "+this.telefone+"\n\tCPF: "+this.cpf);
	}
}
