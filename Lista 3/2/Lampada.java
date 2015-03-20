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

	public Lampada(){}
	public Lampada(String tipo, int voltagem, String cor, String marca, double preco, double potencia, boolean status){
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
	public double getPotencia(){
		return this.potencia;
	}
	public boolean getStatus(){
		return this.status;
	}

	//setters
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setVoltagem(int voltagem){
		this.voltagem=voltagem;
	}
	public void setCor(String cor){
		this.cor=cor;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setPreco(double preco){
		this.preco=preco;
	}
	public void setPotencia(double potencia){
		this.potencia=potencia;
	}
	public void setStatus(boolean status){
		this.status=status;
	}
	//toString
	public String toString(){
		String texto = "Lâmpada:";
		texto += "\n\tTipo: "+this.tipo;
		texto += "\n\tVoltagem: "+this.voltagem;
		texto += "\n\tCor: "+this.cor;
		texto += "\n\tMarca: "+this.marca;
		texto += "\n\tPreco: "+this.preco;
		texto += "\n\tPotência: "+this.potencia;
		texto += "\n\tStatus: "+this.status;
		return texto;
	}

	//ascender e apagar
	public void ascender(){
		setStatus(true);
	}
	public void apagar(){
		setStatus(false);
	}
}
