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
import java.util.Scanner;
public class CanetaTesteVetor{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    Caneta[] canetas = new Caneta[50];
    int opcoes,quantidadeCanetas=0;
    do{
      System.out.println("Digite uma das seguntes opções:\n\t1–Cadastrar caneta\n\t2–Exibir todas as canetas\n\t3–Exibir quantidade de canetas cadastradas\n\t4–Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)\n\t0-Sair");
      opcoes = Integer.parseInt(entrada.nextLine());
      switch(opcoes){

        default: System.out.println("Você digitou a opção errada, tente novamente.");
      }
    } while(opcoes!=0);
  }
}
