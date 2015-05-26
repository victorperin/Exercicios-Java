/*******************************************************************************
Exercício 5)
Escreva uma classe VeiculoAVenda que represente informações básicas sobre um veículo genérico que esteja à venda, como tipo (podendo ser representado por uma String), ano e precoDeVenda.
• Escreva uma classe AutomovelAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor constante "Automóvel",
• Escreva uma classe MotocicletaAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor "Motocicleta".
• Escreva também um programa que demonstre o uso destas classes usando Polimorfismo.
*******************************************************************************/
public class VeiculoAVenda{
  private String tipo;
  private int ano;
  private float precoDeVenda;

  public VeiculoAVenda(String tipo, int ano, float precoDeVenda){
    this.tipo = tipo;
    this.ano = ano;
    this.precoDeVenda = precoDeVenda;
  }
  protected VeiculoAVenda(){}

  //getters
  public String getTipo(){
    return this.tipo;
  }
  public int getAno(){
    return this.ano;
  }
  public float getPrecoDeVenda(){
    return this.precoDeVenda;
  }

  //setters
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public void setAno(int ano){
    this.ano = ano;
  }
  public void setPercodeVenda(float precoDeVenda){
    this.precoDeVenda = precoDeVenda;
  }

  //toString
  public String toString(){
    String retorno = "Tipo: "+this.tipo;
    retorno += "\nAno: "+this.ano;
    retorno += "\nPreço: "+this.precoDeVenda+"\n";
    return retorno;
  }
}
