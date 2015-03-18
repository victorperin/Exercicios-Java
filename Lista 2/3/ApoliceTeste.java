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

import java.util.Scanner;
public class ApoliceTeste{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    String nome = input.nextLine();
    System.out.print("Digite a idade: ");
    int idade = Integer.parseInt(input.nextLine());
    System.out.print("Digite o Valor do Premio da Apólice: ");
    double valorPremio = Double.parseDouble(input.nextLine());


    Apolice bacon = new Apolice(nome,idade,valorPremio);
    bacon.imprimir();


    bacon.calcularPremioApolice();

    System.out.print("Digite a cidade: ");
    String cidade = input.nextLine();
    bacon.oferecerDesconto(cidade);

    bacon.imprimir();
  }
}
