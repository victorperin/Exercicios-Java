/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/

import java.util.Scanner;

public class Cliente{
	String nome,endereco,telefone;

	//construtor
	public Cliente(String nome, String endereco,String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public String getTelefone(){
		return this.telefone;
	}
	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
}
