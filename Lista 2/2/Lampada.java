/*******************************************************************************
* 2. Implementar uma classe Lampada que deve possuir como características tipo
* (led, fluorescente,...), voltagem, cor, marca, preço, potência,
* status(boolean). Nesta classe devem ser implementados os métodos construtores,
* getters, setters, toString, ascender e apagar. Em uma outra classe chamada
* LampadaTeste devem ser criados dois objetos do tipo Lampada, atribuir valores
* e exibir os dados deste objeto. O programa deverá informar também qual das
* duas lâmpadas possui maior potência e * * também qual das lâmpadas é a mais
* cara.
*******************************************************************************/

import java.util.Scanner;

public class Lampada {
	private static String tipo,cor,marca;
	private static int voltagem,potencia;
	private static double preco;
	private static boolean status;

	//Métodos construtores
	public static void Lampada() {}
	public static void Lampada(String tipo,int voltagem,String cor,String marca,double preco, int potencia,boolean status){
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
		this.status = status;
	}

	//Métodos getters
	public static String getTipo(){
		return this.tipo;
	}
	public static int getVoltagem(){
		return this.voltagem;
	}
	public static String getCor(){
		return this.cor;
	}
	public static String getMarca(){
		return this.marca;
	}
	public static double getPreco(){
		return this.preco;
	}
	public static int getPotencia(){
		return this.potencia;
	}
	public static boolean getStatus(){
		return this.status;
	}

	//Métodos setters
	public static void setTipo(String tipo){
		this.tipo = tipo;
	}
	public static void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	public static void setCor(String cor){
		this.cor = cor;
	}
	public static void setMarca(String marca){
		this.marca = marca;
	}
	public static void setPreco(double preco){
		this.preco = preco;
	}
	public static void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public static void setStatus(boolean status){
		this.status = status;
	}

	//Método toString
	public static String toString(){
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
	public static void Ascender(){
		setStatus(true);
	}

	//Método apagar
	public static void Apagar(){
		setStatus(false);
	}
