/*******************************************************************************
1. Implementar uma classe Caneta que deve possuir como características marca,
cor e tamanho. Nesta classedevem ser implementados os métodos construtores,
getters, setters e toString. Em uma outra classe chamada CanetaTesteVetor deverá
ser criado um vetor para armazenar no máximo 50 objetos do tipo Caneta.
O programa deverá exibir o seguinte menu para o usuário:
1–Cadastrar caneta
2–Exibir todas as canetas
3–Exibir quantidade de canetas cadastradas
4–Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)
0-Sair
*******************************************************************************/

public class Caneta{
  private String marca, cor;
  private int tamanho;

  public Caneta(){}
  public Caneta(String marca, String cor, int tamanho){
    this.marca = marca;
    this.cor = cor;
    this.tamanho = tamanho;
  }

  //getters
  public String getMarca(){
    return this.marca;
  }
  public String getCor(){
    return this.cor;
  }
  public int getTamanho(){
    return this.tamanho;
  }

  //setters
  public void setMarca(String marca){
    this.marca = marca;
  }
  public void setCor(String cor){
    this.cor = cor;
  }
  public void setTamanho(int tamanho){
    this.tamanho = tamanho;
  }

  //toString
  public String toString(){
    return "Caneta\n\tTamanho: "+this.tamanho+"\n\tCor: "+this.cor+"\n\tTamanho: "+this.tamanho+"\n";
  }

}
