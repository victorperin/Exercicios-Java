/*******************************************************************************
(Texto muito grande, melhor ver no PDF)

3. Implementar uma classe Apolice com os seguintes atributos nome do segurado, idade do segurado e valor do
prêmio da apólice. Nesta classe Apolice devem ser implementados os métodos:
  *imprimir () - este método não retorna valor e deverá mostrar na tela todos os atributos da classe Apolice. Para
      imprimir em java usa-se o comando [System.out.println(nome do atributo);]
  *calcularPremioApolice() - este método não retorna valor e deverá calcular o valor do prêmio seguindo as
      seguintes regras:
        caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use a formula
          valorPremio+=(valorPremio*20)/100.
        Quando a idade for superior a 25 e menor ou igual a 26, use a formula
          valorPremio+=(valorPremio*15)/100.
        Quando a idade for superior a 36 use a formula
          valorPremio+=(valorPremio*10)/100.
  *oferecerDesconto() - este método não retorna valor, mas recebe o parâmetro cidade, que irá conter o nome da
    cidade para o cálculo do desconto. Caso a cidade seja Curitiba, dê um desconto de no valor do premio de 20%,
    caso seja Rio de Janeiro, dê um desconto no valor do premio de 15%, caso seja São Paulo dê um desconto no
    valor do premio de 10% e se for Belo Horizonte dê um desconto no valor do premio de 5%.
    Logo após implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequência de
    instruções para testar as funcionalidades da classe Apolice.
Para entrada de dados em java, temos que instanciar um objeto da Classe Scanner, como no exemplo.
  import java.util.Scanner;
  public class ApoliceTeste{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.print("Para capturar uma string: ");
      String n = input.nextLine();
      System.out.print("Para capturar um numero inteiro (int): ");
      int id = input.nextInt();
      System.out.print("Para capturar um valor real (double): ");
      double vap = input.nextDouble();
    }
  }
*******************************************************************************/

public class Apolice {
	private String nome;
	private int idade;
	private double valorPremio;

	//Métodos construtores
	public Apolice(String nome,int idade,double valorPremio){
		this.nome = nome;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}
	public void imprimir(){
		System.out.println("Apólice:\n\tNome do Segurado: "+this.nome+"\n\tIdade do Segurado: "+this.idade+"\n\tValor do Premio da Apólice: "+valorPremio);
	}
	public void calcularPremioApolice(){
		if(idade>=18&&idade<=25) valorPremio+=(valorPremio*20)/100;
		else if(idade>25&&idade<=36) valorPremio+=(valorPremio*15)/100; //parti do principio de que o professor escreveu errado...
		else if(idade>36) valorPremio+=(valorPremio*10)/100;
	}
	public void oferecerDesconto(String cidade){
		switch(cidade){
			case "Rio de Janeiro":
				valorPremio-=valorPremio*0.15;
				break;
			case "São Paulo":
				valorPremio-=valorPremio*0.1;
				break;
			case "Belo Horizonte":
				valorPremio-=valorPremio*0.05;
				break;
			default:
		}
	}

}
