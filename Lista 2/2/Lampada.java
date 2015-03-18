/*******************************************************************************
* 2. Implementar uma classe Lampada que deve possuir como características tipo
* (led, fluorescente,...), voltagem, cor, marca, preço, potência,
* status(boolean). Nesta classe devem ser implementados os métodos construtores,
* getters, setters, toString, ascender e apagar. Em uma outra classe chamada
* LampadaTeste devem ser criados dois objetos do tipo Lampada, atribuir valores
* e exibir os dados deste objeto. O programa deverá informar também qual das
* duas lâmpadas possui maior potência e também qual das lâmpadas é a mais cara.
*******************************************************************************/

import java.util.Scanner;

public class Lampada {
	private String tipo,cor,marca;
	private int voltagem,potencia;
	private double preco;
	private boolean status;

	//Métodos construtores
	public Lampada() {}
	public Lampada(String tipo,int voltagem,String cor,String marca,double preco, int potencia,boolean status){
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.status = status;
	}

	//Métodos getters
	public String getTipo(){
		return this.tipo;
	}
	public int getVoltagem(){
		return this.voltagem;
	}
	public String getCor(){
		return this.cor;
	}
	public String getMarca(){
		return this.marca;
	}
	public double getPreco(){
		return this.preco;
	}
	public int getPotencia(){
		return this.potencia;
	}
	public boolean getStatus(){
		return this.status;
	}

	//Métodos setters
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public void setStatus(boolean status){
		this.status = status;
	}

	//Método toString
	public String toString(){
		String retorno="";

		retorno += "Objeto lâmpada:\n";
		retorno += "\tTipo: "+this.tipo+"\n";
		retorno += "\tVoltagem: "+this.voltagem+"\n";
		retorno += "\tCor: "+this.cor+"\n";
		retorno += "\tMarca: "+this.marca+"\n";
		retorno += "\tPreço: "+this.preco+"\n";
		retorno += "\tPotência: "+this.potencia+"\n";
		if(this.status==true)	retorno += "\tStatus: ligado\n";
		else retorno+= "\tStatus: desligado\n";

		return retorno;
	}

	//Método ascender
	public void Ascender(){
		setStatus(true);
	}

	//Método apagar
	public void Apagar(){
		setStatus(false);
	}
}
