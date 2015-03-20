/*******************************************************************************
2. Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTesteVetor
deverá ser criado um vetor para armazenar 30 objetos do tipo Lampada. O programa deverá exibir o seguinte
menu para o usuário:
1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair

*******************************************************************************/
public class Lampada{
	private String tipo,  cor, marca;
	private int voltagem;
	private double preco,potencia;
	private boolean status;

	public void Lampada(){}
	public void Lampada(String tipo, int voltagem, String cor, String marca, double preco, double potencia, boolean status){
		this.tipo=tipo;
		this.voltagem=voltagem;
		this.cor=cor;
		this.marca=marca;
		this.preco=preco;
		this.potencia=potencia;
		this.status=status;
	}

	//getters
	public String getTipo(){
		return this.tipo;
	}
	public String getVoltagem(){
		return this.voltagem;
	}	
	public String getCor(){
		return this.cor;
	}
	public String getMarca(){
		return this.marca;
	}
	public String getPreco(){
		return this.preco;
	}
	public String getPotencia(){
		return this.potencia;
	}
	public String getStatus(){
		return this.status;
	}
}




