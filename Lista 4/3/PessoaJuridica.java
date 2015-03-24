/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
import java.util.Scanner;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String nomeFantasia;

	//construtor
	public PessoaJuridica(String nome, String endereco,String telefone,String cnpj,String nomeFantasia){
		super(nome,endereco,telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	//gets
	public double getCnpj(){
		return this.cnpj;
	}

	//sets
	public void setNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}
}
