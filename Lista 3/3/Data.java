/*******************************************************************************
3. Implementar uma classe Data que deve possuir como características os atributos dia, mês e ano (todas do
tipo inteiro). Nesta classe além dos métodos construtores, getters, setters e toString, deverá ser
implementado o método validarData (int, int, int): boolean que deverá verificar se as informações passadas
por parâmetros é verdadeira ou não. Este método deverá inclusive verificar se é ano bissexto. O método
toString deverá retornar uma string no seguinte formato “dia/mês/ano”, como por exemplo
“05/março/2015”

*******************************************************************************/
public class Data{
	private int dia, mes, ano;

	public Lampada(){}
	public Lampada(int dia, int mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

	//getters
	public String getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public String getAno(){
		return this.ano;
	}

	//setters
	public void setDia(String dia){
		this.dia=dia;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public void setAno(String ano){
		this.ano=ano;
	}


	//toString
	public String toString(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}

}
