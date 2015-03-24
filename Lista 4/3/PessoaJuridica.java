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
	public String getCnpj(){
		return this.cnpj;
	}
	public String getNomeFantasia(){
		return this.nomeFantasia;
	}

	//sets
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	public void setNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}

	//toString
	public void ImprimirDados(){
		System.out.println("Pessoa Física:\n\tNome: "+this.nome+"\n\tEndereço: "+this.endereco+"\n\tTelefone: "+this.telefone+"\n\tCNPJ: "+this.cnpj+"\n\tNome Fantasia: "+this.nomeFantasia);
	}
}
